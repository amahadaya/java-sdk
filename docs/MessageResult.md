

# MessageResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
**accountId** | **String** | String that uniquely identifies this account resource. |  [optional]
**messageId** | **String** | String that uniquely identifies this message resource |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the state of the message through the message lifecycle including: new, queued, rejected, sending, sent, failed, received, undelivered, expired, deleted, and unknown |  [optional]
**from** | **String** | Phone number in E.164 format that sent the message. |  [optional]
**to** | **String** | Phone number in E.164 format that received the message. |  [optional]
**text** | **String** | Message contents |  [optional]
**direction** | **String** | Noting whether the message was inbound or outbound |  [optional]
**notificationUrl** | **String** | URL invoked when message sent |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
NEW | &quot;new&quot;
QUEUED | &quot;queued&quot;
REJECTED | &quot;rejected&quot;
SENDING | &quot;sending&quot;
SENT | &quot;sent&quot;
FAILED | &quot;failed&quot;
RECEIVED | &quot;received&quot;
UNDELIVERED | &quot;undelivered&quot;
EXPIRED | &quot;expired&quot;
DELETED | &quot;deleted&quot;
UNKNOWN | &quot;unknown&quot;



