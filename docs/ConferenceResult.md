

# ConferenceResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
**conferenceId** | **String** | A string that uniquely identifies this Conference resource. |  [optional]
**accountId** | **String** | ID of the account that created this Conference. |  [optional]
**alias** | **String** | A description for this Conference. |  [optional]
**playBeep** | [**PlayBeepEnum**](#PlayBeepEnum) | Setting that controls when a beep is played. One of: always, never, entryOnly, exitOnly. Defaults to always. |  [optional]
**record** | **Boolean** | Flag indicating whether recording is enabled for this Conference. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the Conference. One of: creating, empty, populated, inProgress, or terminated. |  [optional]
**waitUrl** | **String** | URL referencing the audio file to be used as default wait music for the Conference when it is in the populated state. |  [optional]
**actionUrl** | **String** | URL invoked once the Conference is successfully created. |  [optional]
**statusCallbackUrl** | **String** | URL to inform that the Conference status has changed. |  [optional]
**subresourceUris** | **Object** | The list of subresources for this Conference. This includes participants and/or recordings. |  [optional]



## Enum: PlayBeepEnum

Name | Value
---- | -----
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
ENTRY_ONLY | &quot;entryOnly&quot;
EXIT_ONLY | &quot;exitOnly&quot;



## Enum: StatusEnum

Name | Value
---- | -----
CREATING | &quot;creating&quot;
EMPTY | &quot;empty&quot;
POPULATED | &quot;populated&quot;
IN_PROGRESS | &quot;inProgress&quot;
TERMINATED | &quot;terminated&quot;



