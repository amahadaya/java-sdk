package com.vailsys.freeclimb.api.phoneNumber;

import com.google.gson.JsonSyntaxException;
import com.vailsys.freeclimb.api.APIRequester;
import com.vailsys.freeclimb.api.FreeClimbException;
import com.vailsys.freeclimb.api.FreeClimbJSONException;

import java.util.HashMap;

import static com.vailsys.freeclimb.json.FreeClimbGson.gson;

/**
 * This class represents the set of wrappers around the FreeClimb
 * AvailablePhoneNumbers API. It provides methods to handle all the operations
 * supported by the FreeClimb AvailablePhoneNumbers API.
 */
public class AvailablePhoneNumberRequester extends APIRequester {
    private static final String pathHead = "AvailablePhoneNumbers";
    /** The default path for the AvailablePhoneNumber endpoint. */
    private final String path;
    /** The accountId for the acting account. */
    private final String actingAccountId;

    /**
     * Creates an AvailablePhoneNumberRequester. For most SDK users
     * AvailablePhoneNumberRequesters will be created automatically by the
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
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public AvailablePhoneNumberRequester(String credAccountId, String credAuthToken, String actingAccountId)
            throws FreeClimbException {
        super(credAccountId, credAuthToken);
        this.actingAccountId = actingAccountId;
        this.path = APIRequester.constructAbsolutePath(pathHead);
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
     * Retrieve the {@code path} value generated by the
     * AvailablePhoneNumberRequester. This is the URL path used in requests to
     * FreeClimb.
     *
     * @return The {@code path}.
     */
    public String getPath() {
        return path;
    }

    /**
     * Allows developers using the SDK to change which instance of the FreeClimb API
     * that the AvailablePhoneNumberRequester points to.
     *
     * @param newUrl The new URL to use in place of the default
     *               APIRequester.FREECLIMB_URL
     */
    public void setFreeClimbUrl(String newUrl) {
        super.setFreeClimbUrl(newUrl);
    }

    /**
     * Retrieve a list of AvailablePhoneNumbers for purchase. This wraps an HTTP GET
     * request to the FreeClimb API's /AvailablePhoneNumbers.
     *
     * @return An in-language representation of FreeClimb's paginated list response.
     *         This will be a paginated list of available phone numbers as returned
     *         by the FreeClimb API.
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public AvailablePhoneNumberList get() throws FreeClimbException {
        return new AvailablePhoneNumberList(this.getCredentialAccountId(), this.getCredentialAuthToken(),
                this.GET(this.getPath()));
    }

    /**
     * Retrieve a list of AvailablePhoneNumbers for purchase. This wraps an HTTP GET
     * request to the FreeClimb API's /AvailablePhoneNumbers.
     *
     * @param filters an object containing a number of possible ways to filter the
     *                available phone numbers returned by FreeClimb.
     * @return An in-language representation of FreeClimb's paginated list response.
     *         This will be a paginated list of available phone numbers as returned
     *         by the FreeClimb API.
     *
     * @see com.vailsys.freeclimb.api.phoneNumber.AvailablePhoneNumberSearchFilters
     * @throws FreeClimbException when the request fails or the JSON is invalid.
     */
    public AvailablePhoneNumberList get(AvailablePhoneNumberSearchFilters filters) throws FreeClimbException {
        HashMap<String, String> filtersMap;

        try {
            filtersMap = gson.fromJson(gson.toJson(filters), APIRequester.GETMapType);
        } catch (JsonSyntaxException jse) {
            throw new FreeClimbJSONException(jse);
        }

        return new AvailablePhoneNumberList(this.getCredentialAccountId(), this.getCredentialAuthToken(),
                this.GET(this.getPath(), filtersMap));
    }
}
