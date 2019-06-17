Feature: Digits input Widget

Background: launch browser
Given User is on Home Page
And login with correct username and password

Scenario: check Intro Prompt long
When User Navigate to create app page
And scroll basic widgt
And Drag and drop Digits input
And Enter intro prompt long in digits input is "longPrompt"
And configure supported language
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt[@type='introPrompt']/@value" and "longPrompt"

Scenario: check Intro Prompt short
Given select created app
And Select Digits input widget
When Enter intro prompt short in digits input is "shortPrompt"
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt[@type='shortIntro']/@value" and "shortPrompt"


Scenario: check min length
Given select created app
And Select Digits input widget
When Enter min length is "2"
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/minLength/text()" and "2"

Scenario: check min length
Given select created app
And Select Digits input widget
When Enter max length is "10"
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/maxLength/text()" and "10"

Scenario: check default prompt path in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then check default prompt path in GUI "App Prompt Base"

Scenario: Check default prompt path in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='promptBase']/@value" and "app_prompt_base"

Scenario: Test to verify default value of termination key in Gui
Given select created app
And Select Digits input widget
When Select settings of widget
Then verify default value of termination key in Gui is "#"

Scenario: Test to verify default value of termination key in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "#"

Scenario: check default Bargein in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then check default Bargein in GUI "True"

Scenario: check default Bargein in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='bargein']/@value" and "true"

Scenario: Test to verify default value of Inter Digit Timeout in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then verify default value of Inter Digit Timeout in GUI is "2000"

Scenario: Test to verify default value of Inter Digit Timeout in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='interDigitTimeout']/@value" and "2000"

Scenario: Test to verify default value of hotword in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='hotword']/@value" and "false"

Scenario: Test to verify default value of hotword in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then verify default value of hotword in GUI is "false"


Scenario: Test to verify default value of Disable Universal Grammar in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then verify default value of Disable Universal Grammar in GUI is "false"

Scenario: Test to verify default value of confirm input in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='confirmInput']/@value" and "false"

Scenario: Test to verify default value of confirm input in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then check default confirm input "false"


Scenario: Test to verify default value of Disable Universal Grammar in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='disableUG']/@value" and "false"


Scenario: Test to verify default value of Consent Logs in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then verify default value of Consent Logs in GUI is "true"

Scenario: Test to verify default value of Consent Logs in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='consentLogs']/@value" and "true"

Scenario: Test to verify default value of Default Error Handling in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then verify default value of Default Error Handling is "true"

Scenario: Test to verify default value of Add Custom Prop in GUI
Given select created app
And Select Digits input widget
When Select settings of widget
Then verify default value of Add Custom Prop is "false"

Scenario: Test to verify change inter digit timeout of simple Menu
Given select created app
And Select Digits input widget
When Select settings of widget
And change inter digit timeout "2345"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='interDigitTimeout']/@value" and "2345"

Scenario: Test to verify Enable Bargin Type Hotword of simple Menu
Given select created app
And Select Digits input widget
When Select settings of widget
And Enable Bargin Type Hotword
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='hotword']/@value" and "true"

Scenario: Test to verify select disable universal grammar of simple Menu
Given select created app
And Select Digits input widget
When Select settings of widget
And select disable universal grammar checkbox
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='disableUG']/@value" and "true"


Scenario: choose prompt base as content Base
Given select created app
And Select Digits input widget
When Select settings of widget
And select content base in prompt path
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='promptBase']/@value" and "content_base"

Scenario: select prompt base as Standard prompt Base
Given select created app
And Select Digits input widget
When Select settings of widget
And select standard prompt base in prompt path
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='promptBase']/@value" and "standard_prompt_base"

Scenario: Test to verify to disable consent logs of simple Menu
Given select created app
And Select Digits input widget
When Select settings of widget
And disable consent logs
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='consentLogs']/@value" and "false"

Scenario: select bargein as false
Given select created app
And Select Digits input widget
When Select settings of widget
And select bargein as false
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='bargein']/@value" and "false"

Scenario: select termination key as 1
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "1"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "1"

Scenario: select termination key as 2
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "2"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "2"

Scenario: select termination key as 3
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "3"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "3"

Scenario: select termination key as 4
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "4"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "4"

Scenario: select termination key as 5
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "5"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "5"

Scenario: select termination key as 6
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "6"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "6"

Scenario: select termination key as 7
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "7"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "7"

Scenario: select termination key as 8
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "8"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "8"

Scenario: select termination key as 9
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "9"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "9"

Scenario: select termination key as *
Given select created app
And Select Digits input widget
When Select settings of widget
And select termination key as "*"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='termChar']/@value" and "*"



Scenario: disable dfault error handling and verify max error count
Given select created app
And Select Digits input widget
When Select settings of widget
And scroll down setting page more
And disable Default Error Handling
And Enter NSP timeout as "2000"
And Max Error count as "2"
And save settings
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@count" and "2"

Scenario: disable dfault error handling and verify nsp
Given select created app
And Select Digits input widget
When Select settings of widget
And scroll down setting page more
And disable Default Error Handling
And Enter NSP timeout as "2000"
And Max Error count as "2"
And save settings
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/noinput/@timeOut" and "2000"

Scenario: Test to verify nsp prompt
Given select created app
And Select Digits input widget
When Select settings of widget
And scroll down setting page more
And disable Default Error Handling
And Enter NSP timeout as "2000"
And Max Error count as "2"
And save settings
And Enter nsp Prompt as "nspPrompt"
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt[@type='nspPrompt']/value/text()" and "nspPrompt"

@dateWid
Scenario: Test to verify Rejection prompt
Given select created app
And Select Digits input widget
When Select settings of widget
And scroll down setting page more
And disable Default Error Handling
And Enter NSP timeout as "2000"
And Max Error count as "2"
And save settings
And Enter nsp Prompt as "nspPrompt"
And Enter Rejection Prompt as "rejPrompt"
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt[@type='rejectionPrompt']/value/text()" and "rejPrompt"

Scenario: Test to verify custom Prop Name
Given select created app
And Select Digits input widget
When Select settings of widget
And scroll down setting page 
And Enable Custom props
And scroll down setting page more
And select add button of custom props
And enter custom prop name "MAS"
And Enter custom prop value "Testing"
And save settings 
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/customsettings/customsetting/@name" and "MAS"

Scenario: Test to verify custom Prop value
Given select created app
 And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/customsettings/customsetting/@value" and "Testing"

Scenario: Enable confirm input check box
Given select created app
And Select Digits input widget
When Select settings of widget
And Enable confirm input
And save settings
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='confirmInput']/@value" and "true"

Scenario: Verify pre-confirmation prompt
Given select created app
And Select Digits input widget
When Select settings of widget
And Enable confirm input
And save settings
And enter pre confirmation prompt is "prePromt"
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/preConfirmationPrompt/text()" and "prePromt"

Scenario: Verify confirmation prompt
Given select created app
And Select Digits input widget
When Select settings of widget
And Enable confirm input
And save settings
And enter confirmation prompt is "cnfPromt"
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/confirmationPrompt/text()" and "cnfPromt"


Scenario: Verify Re-enter Dtmf
Given select created app
And Select Digits input widget
When Select settings of widget
And Enable confirm input
And save settings
And enter Re-enter DTMF is "1"
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/reenterDtmf/text()" and "1"


Scenario: Verify confirm DTMF
Given select created app
And Select Digits input widget
When Select settings of widget
And Enable confirm input
And save settings
And enter confirm DTMF is "2"
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/confirmDtmf/text()" and "2"

Scenario: Verify Max Error connector
Given select created app
And Select Digits input widget
When drag and drop jump to page widget and connect to max error
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "tabs-Select Page"

Scenario: Verify skip DTMF connector
Given select created app
And Select Digits input widget
When drag and drop jump to state widget and connect to skip dtmf
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/choice/@nextState" and "Select State"

Scenario: Verify next state connector
Given select created app
And Select Digits input widget
When Drag and drop second Digits input
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/@nextState" and "widget-digitsInput-5"

Scenario: Delete Digit Input
Given select created app
And Select second Digit Input widget
When Delete second Digit Input widget
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/@nextState" and ""

