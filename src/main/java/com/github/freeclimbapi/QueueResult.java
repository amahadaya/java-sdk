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
import com.github.freeclimbapi.MutableResourceModel;
import com.github.freeclimbapi.QueueResultAllOf;
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
 * QueueResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueueResult {
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

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private String queueId;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_MAX_SIZE = "maxSize";
  @SerializedName(SERIALIZED_NAME_MAX_SIZE)
  private Integer maxSize;

  public static final String SERIALIZED_NAME_CURRENT_SIZE = "currentSize";
  @SerializedName(SERIALIZED_NAME_CURRENT_SIZE)
  private Integer currentSize;

  public static final String SERIALIZED_NAME_AVERAGE_QUEUE_REMOVAL_TIME = "averageQueueRemovalTime";
  @SerializedName(SERIALIZED_NAME_AVERAGE_QUEUE_REMOVAL_TIME)
  private Integer averageQueueRemovalTime;

  public static final String SERIALIZED_NAME_SUBRESOURCE_URIS = "subresourceUris";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE_URIS)
  private Object subresourceUris;

  public QueueResult() { 
  }

  public QueueResult uri(String uri) {
    
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


  public QueueResult dateCreated(String dateCreated) {
    
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


  public QueueResult dateUpdated(String dateUpdated) {
    
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


  public QueueResult revision(Integer revision) {
    
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


  public QueueResult accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the account that created this Queue.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the account that created this Queue.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public QueueResult queueId(String queueId) {
    
    this.queueId = queueId;
    return this;
  }

   /**
   * A string that uniquely identifies this Queue resource.
   * @return queueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that uniquely identifies this Queue resource.")

  public String getQueueId() {
    return queueId;
  }


  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  public QueueResult alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * A description for this Queue.
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Queue.")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public QueueResult maxSize(Integer maxSize) {
    
    this.maxSize = maxSize;
    return this;
  }

   /**
   * The maximum number of Calls permitted in the Queue. Default is 100. Maximum is 1000.
   * @return maxSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of Calls permitted in the Queue. Default is 100. Maximum is 1000.")

  public Integer getMaxSize() {
    return maxSize;
  }


  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  public QueueResult currentSize(Integer currentSize) {
    
    this.currentSize = currentSize;
    return this;
  }

   /**
   * Count of Calls currently in the Queue.
   * @return currentSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of Calls currently in the Queue.")

  public Integer getCurrentSize() {
    return currentSize;
  }


  public void setCurrentSize(Integer currentSize) {
    this.currentSize = currentSize;
  }


  public QueueResult averageQueueRemovalTime(Integer averageQueueRemovalTime) {
    
    this.averageQueueRemovalTime = averageQueueRemovalTime;
    return this;
  }

   /**
   * The average amount of time (in seconds) for a call to be removed from the queue.
   * @return averageQueueRemovalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average amount of time (in seconds) for a call to be removed from the queue.")

  public Integer getAverageQueueRemovalTime() {
    return averageQueueRemovalTime;
  }


  public void setAverageQueueRemovalTime(Integer averageQueueRemovalTime) {
    this.averageQueueRemovalTime = averageQueueRemovalTime;
  }


  public QueueResult subresourceUris(Object subresourceUris) {
    
    this.subresourceUris = subresourceUris;
    return this;
  }

   /**
   * List of subresources for this Queue (which includes Queue members).
   * @return subresourceUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of subresources for this Queue (which includes Queue members).")

  public Object getSubresourceUris() {
    return subresourceUris;
  }


  public void setSubresourceUris(Object subresourceUris) {
    this.subresourceUris = subresourceUris;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueResult queueResult = (QueueResult) o;
    return Objects.equals(this.uri, queueResult.uri) &&
        Objects.equals(this.dateCreated, queueResult.dateCreated) &&
        Objects.equals(this.dateUpdated, queueResult.dateUpdated) &&
        Objects.equals(this.revision, queueResult.revision) &&
        Objects.equals(this.accountId, queueResult.accountId) &&
        Objects.equals(this.queueId, queueResult.queueId) &&
        Objects.equals(this.alias, queueResult.alias) &&
        Objects.equals(this.maxSize, queueResult.maxSize) &&
        Objects.equals(this.currentSize, queueResult.currentSize) &&
        Objects.equals(this.averageQueueRemovalTime, queueResult.averageQueueRemovalTime) &&
        Objects.equals(this.subresourceUris, queueResult.subresourceUris);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, dateCreated, dateUpdated, revision, accountId, queueId, alias, maxSize, currentSize, averageQueueRemovalTime, subresourceUris);
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
    sb.append("class QueueResult {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
    sb.append("    averageQueueRemovalTime: ").append(toIndentedString(averageQueueRemovalTime)).append("\n");
    sb.append("    subresourceUris: ").append(toIndentedString(subresourceUris)).append("\n");
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

