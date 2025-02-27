/*
 * FreeClimb API
 * FreeClimb is a cloud-based application programming interface (API) that puts the power of the Vail platform in your hands. FreeClimb simplifies the process of creating applications that can use a full range of telephony features without requiring specialized or on-site telephony equipment. Using the FreeClimb REST API to write applications is easy! You have the option to use the language of your choice or hit the API directly. Your application can execute a command by issuing a RESTful request to the FreeClimb API. The base URL to send HTTP requests to the FreeClimb REST API is: /apiserver. FreeClimb authenticates and processes your request.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@freeclimb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.freeclimbapi;

import java.util.Objects;
import java.util.Arrays;
import com.github.freeclimbapi.Capabilities;
import com.github.freeclimbapi.IncomingNumberResultAllOf;
import com.github.freeclimbapi.MutableResourceModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * IncomingNumberResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncomingNumberResult {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "dateUpdated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private String dateUpdated;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private Capabilities capabilities;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_ID = "phoneNumberId";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_ID)
  private String phoneNumberId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_VOICE_ENABLED = "voiceEnabled";
  @SerializedName(SERIALIZED_NAME_VOICE_ENABLED)
  private Boolean voiceEnabled;

  public static final String SERIALIZED_NAME_SMS_ENABLED = "smsEnabled";
  @SerializedName(SERIALIZED_NAME_SMS_ENABLED)
  private Boolean smsEnabled;

  public static final String SERIALIZED_NAME_OFFNET = "offnet";
  @SerializedName(SERIALIZED_NAME_OFFNET)
  private Boolean offnet;

  public IncomingNumberResult() { 
  }

  public IncomingNumberResult uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI for this resource, relative to /apiserver.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI for this resource, relative to /apiserver.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public IncomingNumberResult dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public IncomingNumberResult dateUpdated(String dateUpdated) {
    
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).")

  public String getDateUpdated() {
    return dateUpdated;
  }


  public void setDateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  public IncomingNumberResult revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated.
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated.")

  public Integer getRevision() {
    return revision;
  }


  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public IncomingNumberResult capabilities(Capabilities capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Capabilities getCapabilities() {
    return capabilities;
  }


  public void setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
  }


  public IncomingNumberResult campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The campaign ID generated by the campaign registry
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The campaign ID generated by the campaign registry")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public IncomingNumberResult phoneNumberId(String phoneNumberId) {
    
    this.phoneNumberId = phoneNumberId;
    return this;
  }

   /**
   * String that uniquely identifies this phone number resource.
   * @return phoneNumberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String that uniquely identifies this phone number resource.")

  public String getPhoneNumberId() {
    return phoneNumberId;
  }


  public void setPhoneNumberId(String phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
  }


  public IncomingNumberResult accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the account that owns this phone number.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the account that owns this phone number.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public IncomingNumberResult applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ID of the Application that FreeClimb should contact if a Call or SMS arrives for this phone number or a Call from this number is placed. An incoming phone number is not useful until associated with an applicationId.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Application that FreeClimb should contact if a Call or SMS arrives for this phone number or a Call from this number is placed. An incoming phone number is not useful until associated with an applicationId.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public IncomingNumberResult phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number in E.164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number in E.164 format.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public IncomingNumberResult alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Description for this phone number. Typically the conventionally-formatted version of the phone number.
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for this phone number. Typically the conventionally-formatted version of the phone number.")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public IncomingNumberResult region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * State or province of this phone number.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State or province of this phone number.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public IncomingNumberResult country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of this phone number.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of this phone number.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public IncomingNumberResult voiceEnabled(Boolean voiceEnabled) {
    
    this.voiceEnabled = voiceEnabled;
    return this;
  }

   /**
   * Indicates whether the phone number can handle Calls. Typically set to true for all numbers.
   * @return voiceEnabled
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the phone number can handle Calls. Typically set to true for all numbers.")

  public Boolean getVoiceEnabled() {
    return voiceEnabled;
  }


  public void setVoiceEnabled(Boolean voiceEnabled) {
    this.voiceEnabled = voiceEnabled;
  }


  public IncomingNumberResult smsEnabled(Boolean smsEnabled) {
    
    this.smsEnabled = smsEnabled;
    return this;
  }

   /**
   * Indication of whether the phone number can handle sending and receiving SMS messages. Typically set to true for all numbers.
   * @return smsEnabled
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indication of whether the phone number can handle sending and receiving SMS messages. Typically set to true for all numbers.")

  public Boolean getSmsEnabled() {
    return smsEnabled;
  }


  public void setSmsEnabled(Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
  }


  public IncomingNumberResult offnet(Boolean offnet) {
    
    this.offnet = offnet;
    return this;
  }

   /**
   * The offnet field is a boolean representing whether the number is offnet registered or not. This field will be rendered only for requests to the IncomingPhone number resource.
   * @return offnet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offnet field is a boolean representing whether the number is offnet registered or not. This field will be rendered only for requests to the IncomingPhone number resource.")

  public Boolean getOffnet() {
    return offnet;
  }


  public void setOffnet(Boolean offnet) {
    this.offnet = offnet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomingNumberResult incomingNumberResult = (IncomingNumberResult) o;
    return Objects.equals(this.uri, incomingNumberResult.uri) &&
        Objects.equals(this.dateCreated, incomingNumberResult.dateCreated) &&
        Objects.equals(this.dateUpdated, incomingNumberResult.dateUpdated) &&
        Objects.equals(this.revision, incomingNumberResult.revision) &&
        Objects.equals(this.capabilities, incomingNumberResult.capabilities) &&
        Objects.equals(this.campaignId, incomingNumberResult.campaignId) &&
        Objects.equals(this.phoneNumberId, incomingNumberResult.phoneNumberId) &&
        Objects.equals(this.accountId, incomingNumberResult.accountId) &&
        Objects.equals(this.applicationId, incomingNumberResult.applicationId) &&
        Objects.equals(this.phoneNumber, incomingNumberResult.phoneNumber) &&
        Objects.equals(this.alias, incomingNumberResult.alias) &&
        Objects.equals(this.region, incomingNumberResult.region) &&
        Objects.equals(this.country, incomingNumberResult.country) &&
        Objects.equals(this.voiceEnabled, incomingNumberResult.voiceEnabled) &&
        Objects.equals(this.smsEnabled, incomingNumberResult.smsEnabled) &&
        Objects.equals(this.offnet, incomingNumberResult.offnet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, dateCreated, dateUpdated, revision, capabilities, campaignId, phoneNumberId, accountId, applicationId, phoneNumber, alias, region, country, voiceEnabled, smsEnabled, offnet);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomingNumberResult {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    phoneNumberId: ").append(toIndentedString(phoneNumberId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    voiceEnabled: ").append(toIndentedString(voiceEnabled)).append("\n");
    sb.append("    smsEnabled: ").append(toIndentedString(smsEnabled)).append("\n");
    sb.append("    offnet: ").append(toIndentedString(offnet)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

