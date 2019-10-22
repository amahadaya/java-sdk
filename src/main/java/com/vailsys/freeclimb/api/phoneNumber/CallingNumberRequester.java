package com.vailsys.freeclimb.api.phoneNumber;

import com.google.gson.JsonSyntaxException;
import com.vailsys.freeclimb.api.APIAccountRequester;
import com.vailsys.freeclimb.api.FreeClimbException;
import com.vailsys.freeclimb.api.FreeClimbJSONException;

import java.util.HashMap;

import static com.vailsys.freeclimb.json.FreeClimbGson.gson;

/**
 * This class represents the set of wrappers around the FreeClimb CallingNumbers
 * API. It provides methods to handle all the operations supported by the
 * FreeClimb CallingNumbers API.
 */
public class CallingNumberRequester extends APIAccountRequester {

    private static final String pathHead = "CallingNumbers";
    /** The default path for the CallingNumbers endpoint. */
    private final String path;
    /** The accountId for the acting account. */
    private final String actingAccountId;

    /**
     * Creates a CallingNumberRequester. For most SDK users CallingNumberRequesters
     * will be created automatically by the
     * {@link com.vailsys.freeclimb.api.FreeClimbClient} but is available for more
     * advanced users who only require the features in this specific requester and
     * not the rest of the features of the
     * {@link com.vailsys.freeclimb.api.FreeClimbClient}.
     *
     * @param credAccountId   The accountId to use as authentication credentials in
     *                        the HTTP Basic Auth header for requests made by this
     *                        requester.
     * @param credAuthToken   The authToken to use as authentication credentials in
     *                        the HTTP Basic Auth header for requests made by this
     *                        requester.
     * @param actingAccountId The accountId to act as. This can be the same as
     *                        {@code credAccountId} or the accountId of a subaccount
     *                        of the {@code credAccountId}.
     */
    public CallingNumberRequester(String credAccountId, String credAuthToken, String actingAccountId) {
        super(credAccountId, credAuthToken);
        this.actingAccountId = actingAccountId;
        this.path = APIAccountRequester.constructPath(APIAccountRequester.rootPath, this.actingAccountId,
                this.pathHead);
    }

    /**
     * Retrieve the {@code path} value generated by the CallingNumberRequester. This
     * is the URL path used in requests to FreeClimb.
     *
     * @return The {@code path}.
     */
    public String getPath() {
        return path;
    }

    private String getCallingNumberPath(String callingNumberId) {
        return APIAccountRequester.constructPath(this.getPath(), callingNumberId);
    }

    /**
     * Retrieve the {@code actingAccountId}.
     *
     * @return The {@code actingAccountId}.
     */
    public String getActingAccountId() {
        return actingAccountId;
    }

    /**
     * Allows developers using the SDK to change which instance of the FreeClimb API
     * that the CallingNumberRequester points to.
     *
     * @param newUrl The new URL to use in place of the default
     *               APIRequester.FREECLIMB_URL
     */
    public void setFreeClimbUrl(String newUrl) {
        super.setFreeClimbUrl(newUrl);
    }

    /**
     * Create a new CallingNumber through the FreeClimb API. This function wraps an
     * HTTP POST request to the FreeClimb API's /Account/$accountId/CallingNumbers
     * endpoint. This creates a new calling number from the
     * {@code actingAccountId}'s account.
     *
     * @param options Required and optional arguments that can be provided when
     *                creating a calling number. See FreeClimb documentation for
     *                details.
     * @see com.vailsys.freeclimb.api.phoneNumber.CallingNumberCreateOptions
     * @return The {@link com.vailsys.freeclimb.api.phoneNumber.CallingNumber}
     *         object returned by FreeClimb that represents the calling number that
     *         was created.
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public CallingNumber create(CallingNumberCreateOptions options) throws FreeClimbException {
        return CallingNumber.fromJson(this.POST(this.getPath(), gson.toJson(options)));
    }

    /**
     * Delete a CallingNumber through the FreeClimb API. This function wraps an HTTP
     * DELETE request to the FreeClimb API's
     * /Account/$accountId/CallingNumbers/$callingNumberId endpoint.
     *
     * @param callingNumberId The {@code callingNumberId} of the calling number to
     *                        delete.
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public void delete(String callingNumberId) throws FreeClimbException {
        this.DELETE(this.getCallingNumberPath(callingNumberId));
    }

    /**
     * Retrieve a single calling number from FreeClimb.
     *
     * @param callingNumberId The {@code callingNumberId} of the desired calling
     *                        number.
     * @return The calling number matching the {@code callingNumberId} provided.
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public CallingNumber get(String callingNumberId) throws FreeClimbException {
        return CallingNumber.fromJson(this.GET(this.getCallingNumberPath(callingNumberId)));
    }

    /**
     * Update the existing calling number associated with the
     * {@code callingNumberId}. This wraps an HTTP POST to the FreeClimb API's
     * /Accounts/$accountId/CallingNumbers/$callingNumberId endpoint.
     *
     * @param callingNumberId The {@code callingNumberId} of the desired calling
     *                        number.
     * @param options         The {@code CallingNumberUpdateOptions} to change in
     *                        the target calling number.
     *
     * @see com.vailsys.freeclimb.api.phoneNumber.CallingNumberUpdateOptions
     * @return The calling number matching the {@code callingNumberId} provided.
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public CallingNumber update(String callingNumberId, CallingNumberUpdateOptions options) throws FreeClimbException {
        return CallingNumber.fromJson(this.POST(this.getCallingNumberPath(callingNumberId), gson.toJson(options)));
    }

    /**
     * Retrieve a list of calling numbers associated with the
     * {@code actingAccountId}. This wraps an HTTP GET request to the FreeClimb
     * API's /Accounts/$accountId/CallingNumbers endpoint. This will retrieve all
     * calling numbers for the acting account.
     *
     * @return An in-language representation of FreeClimb's paginated list response.
     *         This will be a paginated list of calling numbers as returned by the
     *         FreeClimb API.
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public CallingNumberList get() throws FreeClimbException {
        return new CallingNumberList(this.getCredentialAccountId(), this.getCredentialAuthToken(),
                this.GET(this.getPath()));
    }

    /**
     * Retrieve a list of calling numbers associated with the
     * {@code actingAccountId}. This wraps an HTTP GET request to the FreeClimb
     * API's /Accounts/$accountId/CallingNumbers endpoint. This will retrieve all
     * calling numbers for the acting account.
     *
     * @param filters an object containing a number of possible ways to filter the
     *                calling numbers returned by FreeClimb
     * @see com.vailsys.freeclimb.api.phoneNumber.CallingNumberSearchFilters
     *
     * @return An in-language representation of FreeClimb's paginated list response.
     *         This will be a paginated list of calling numbers as returned by the
     *         FreeClimb API.
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public CallingNumberList get(CallingNumberSearchFilters filters) throws FreeClimbException {
        HashMap<String, String> filtersMap;

        try {
            filtersMap = gson.fromJson(gson.toJson(filters), APIAccountRequester.GETMapType);
        } catch (JsonSyntaxException jse) {
            throw new FreeClimbJSONException(jse);
        }
        return new CallingNumberList(this.getCredentialAccountId(), this.getCredentialAuthToken(),
                this.GET(this.getPath(), filtersMap));
    }
}