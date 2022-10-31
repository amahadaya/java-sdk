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
import com.github.freeclimbapi.MessageResult;
import com.github.freeclimbapi.MessagesListAllOf;
import com.github.freeclimbapi.PaginationModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * MessagesList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T17:12:48.532-05:00[America/Chicago]")
public class MessagesList {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_NUM_PAGES = "numPages";
  @SerializedName(SERIALIZED_NAME_NUM_PAGES)
  private Integer numPages;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_NEXT_PAGE_URI = "nextPageUri";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_URI)
  private String nextPageUri;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<MessageResult> messages = null;

  public MessagesList() { 
  }

  public MessagesList total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total amount of requested resource.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of requested resource.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public MessagesList start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Resource index at start of current page
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource index at start of current page")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public MessagesList end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Resource index at end of current page
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource index at end of current page")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public MessagesList page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Current page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current page")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public MessagesList numPages(Integer numPages) {
    
    this.numPages = numPages;
    return this;
  }

   /**
   * Total number of pages
   * @return numPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of pages")

  public Integer getNumPages() {
    return numPages;
  }


  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }


  public MessagesList pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of items per page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of items per page")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public MessagesList nextPageUri(String nextPageUri) {
    
    this.nextPageUri = nextPageUri;
    return this;
  }

   /**
   * Uri to retrieve the next page of items
   * @return nextPageUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uri to retrieve the next page of items")

  public String getNextPageUri() {
    return nextPageUri;
  }


  public void setNextPageUri(String nextPageUri) {
    this.nextPageUri = nextPageUri;
  }


  public MessagesList messages(List<MessageResult> messages) {
    
    this.messages = messages;
    return this;
  }

  public MessagesList addMessagesItem(MessageResult messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<MessageResult>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Array of messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of messages")

  public List<MessageResult> getMessages() {
    return messages;
  }


  public void setMessages(List<MessageResult> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagesList messagesList = (MessagesList) o;
    return Objects.equals(this.total, messagesList.total) &&
        Objects.equals(this.start, messagesList.start) &&
        Objects.equals(this.end, messagesList.end) &&
        Objects.equals(this.page, messagesList.page) &&
        Objects.equals(this.numPages, messagesList.numPages) &&
        Objects.equals(this.pageSize, messagesList.pageSize) &&
        Objects.equals(this.nextPageUri, messagesList.nextPageUri) &&
        Objects.equals(this.messages, messagesList.messages);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, start, end, page, numPages, pageSize, nextPageUri, messages);
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
    sb.append("class MessagesList {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    numPages: ").append(toIndentedString(numPages)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    nextPageUri: ").append(toIndentedString(nextPageUri)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

