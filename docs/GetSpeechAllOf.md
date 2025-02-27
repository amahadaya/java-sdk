

# GetSpeechAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionUrl** | **String** | When the caller has finished speaking or the command has timed out, FreeClimb will make a POST request to this URL. A PerCL response is expected to continue handling the call. | 
**grammarType** | **Integer** | The grammar file type to use for speech recognition. A value of &#39;URL&#39; indicates the grammarFile attribute specifies a URL that points to the grammar file. A value of &#x60;BUILTIN&#x60; indicates the grammarFile attribute specifies the name of one of the platform built-in grammar files. |  [optional]
**grammarFile** | **String** | The grammar file to use for speech recognition. If grammarType is set to URL, this attribute is specified as a download URL. | 
**grammarRule** | **Boolean** | The grammar rule within the specified grammar file to use for speech recognition. This attribute is optional if &#x60;grammarType&#x60; is &#x60;URL&#x60; and ignored if &#x60;grammarType&#x60; is &#x60;BUILTIN&#x60;. |  [optional]
**playBeep** | **String** | Indicates whether a beep should be played just before speech recognition is initiated so that the speaker can start to speak. |  [optional]
**prompts** | [**List&lt;PerclCommand&gt;**](PerclCommand.md) | The JSON array of PerCL commands to nest within the &#x60;GetSpeech&#x60; command. The &#x60;Say&#x60;, &#x60;Play&#x60;, and &#x60;Pause&#x60; commands can be used. The nested actions are executed while FreeClimb is waiting for input from the caller. This allows for playing menu options to the caller and to prompt for the expected input. These commands stop executing when the caller begins to input speech. |  [optional]
**noInputTimeoutMs** | **Integer** | When recognition is started and there is no speech detected for &#x60;noInputTimeoutMs&#x60; milliseconds, the recognizer will terminate the recognition operation. |  [optional]
**recognitionTimeoutMs** | **Integer** | When playback of prompts ends and there is no match for &#x60;recognitionTimeoutMs&#x60; milliseconds, the recognizer will terminate the recognition operation. |  [optional]
**confidenceThreshold** | **BigDecimal** | When a recognition resource recognizes a spoken phrase, it associates a confidence level with that match. Parameter &#x60;confidenceThreshold&#x60; specifies what confidence level is considered a successful match. Values are between 0.0 and 1.0. |  [optional]
**sensitivityLevel** | **BigDecimal** | The speech recognizer supports a variable level of sound sensitivity. The sensitivityLevel attribute allows for filtering out background noise, so it is not mistaken for speech. Values are between 0.0 and 1.0  |  [optional]
**speechCompleteTimeoutMs** | **Integer** | Parameter &#x60;speechCompleteTimeoutMs&#x60; specifies the length of silence required following user speech before the speech recognizer finalizes a result. This timeout applies when the recognizer currently has a complete match against an active grammar. Reasonable speech complete timeout values are typically in the range of 0.3 seconds to 1.0 seconds. |  [optional]
**speechIncompleteTimeoutMs** | **Integer** | Parameter &#x60;speechIncompleteTimeoutMs&#x60; specifies the length of silence following user speech after which a recognizer finalizes a result. This timeout applies when the speech prior to the silence is an incomplete match of all active grammars. Timeout &#x60;speechIncompleteTimeoutMs&#x60; is usually longer than &#x60;speechCompleteTimeoutMs&#x60; to allow users to pause mid-utterance. |  [optional]
**privacyMode** | **Boolean** | Parameter privacyMode will not log the &#x60;text&#x60; as required by PCI compliance. |  [optional]



