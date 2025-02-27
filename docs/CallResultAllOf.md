

# CallResultAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callId** | **String** | String that uniquely identifies this Call resource. |  [optional]
**parentCallId** | **String** | ID of the Call that created this leg (child Call). |  [optional]
**accountId** | **String** | ID of the account that owns this Call. |  [optional]
**from** | **String** | Phone number that initiated this Call. |  [optional]
**to** | **String** | Phone number that received this Call. |  [optional]
**phoneNumberId** | **String** | If the Call was inbound, this is the ID of the IncomingPhoneNumber that received the Call (DNIS). If the Call was outbound, this is the ID of the phone number from which the Call was placed (ANI). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | * &#x60;queued&#x60; &amp;ndash; Call is ready and waiting in line before going out. * &#x60;ringing&#x60; &amp;ndash; Call is currently ringing. * &#x60;inProgress&#x60; &amp;ndash; Call was answered and is currently in progress. * &#x60;canceled&#x60; &amp;ndash; Call was hung up while it was queued or ringing. * &#x60;completed&#x60; &amp;ndash; Call was answered and has ended normally. * &#x60;busy&#x60; &amp;ndash; Caller received a busy signal. * &#x60;failed&#x60; &amp;ndash; Call could not be completed as dialed, most likely because the phone number was non-existent. * &#x60;noAnswer&#x60; &amp;ndash; Call ended without being answered. |  [optional]
**startTime** | **String** | Start time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed. |  [optional]
**connectTime** | **String** | Time the Call was answered (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed. |  [optional]
**endTime** | **String** | End time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call did not complete successfully. |  [optional]
**duration** | **Integer** | Total length of the Call in seconds. Measures time between startTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls. |  [optional]
**connectDuration** | **Integer** | Length of time that the Call was connected in seconds. Measures time between connectTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls. |  [optional]
**direction** | **String** | Direction of the Call. &#x60;inbound&#x60; for Calls into FreeClimb, &#x60;outboundAPI&#x60; for Calls initiated via the REST API,  &#x60;outboundDial&#x60; for Calls initiated by the &#x60;OutDial&#x60; PerCL command. |  [optional]
**answeredBy** | **String** | If this Call was initiated with answering machine detection, either &#x60;human&#x60; or &#x60;machine&#x60;. Empty otherwise. |  [optional]
**subresourceUris** | **Object** | The list of subresources for this Call. These include things like logs and recordings associated with the Call. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
RINGING | &quot;ringing&quot;
IN_PROGRESS | &quot;inProgress&quot;
CANCELED | &quot;canceled&quot;
COMPLETED | &quot;completed&quot;
BUSY | &quot;busy&quot;
FAILED | &quot;failed&quot;
NO_ANSWER | &quot;noAnswer&quot;



