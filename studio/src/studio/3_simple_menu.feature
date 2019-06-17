Feature: Simple Menu Widget

Background: launch browser
Given User is on Home Page
And login with correct username and password
@simple
Scenario: check Intro Prompt
When User Navigate to create app page
And drag and drop simple menu
And Enter Intro Prompt in simple Menu
And Enter Grammar in simple Menu
And Enter option Name in simple Menu
And configure supported language
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/value/text()" and "intro"

Scenario: Test to verify Rename Widget name and variable name
Given select created app
And select Simple Menu Widget
When Rename widget name and variable as "test1"
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/@displayName" and "test1"

Scenario: Test variable name changed in previous test case
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/@variable" and "test1"

Scenario: Check option in simple Menu
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/input/choice/@option" and "test"

Scenario: Check DTMF in Simple Menu
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/input/choice/@key" and "1"


Scenario: check default prompt path in GUI
Given select created app
And select Simple Menu Widget
When Select settings of widget
Then check default prompt path in GUI "App Prompt Base"

Scenario: Check default prompt path in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/@promptBase" and "app_prompt_base"

Scenario: check default Bargein in GUI
Given select created app
And select Simple Menu Widget
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
And select Simple Menu Widget
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
And select Simple Menu Widget
When Select settings of widget
Then verify default value of hotword in GUI is "false"


Scenario: Test to verify default value of Disable Universal Grammar in GUI
Given select created app
And select Simple Menu Widget
When Select settings of widget
Then verify default value of Disable Universal Grammar in GUI is "false"


Scenario: Test to verify default value of Disable Universal Grammar in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='disableUG']/@value" and "false"


Scenario: Test to verify default value of Consent Logs in GUI
Given select created app
And select Simple Menu Widget
When Select settings of widget
Then verify default value of Consent Logs in GUI is "true"

Scenario: Test to verify default value of Consent Logs in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='consentLogs']/@value" and "true"

Scenario: Test to verify default value of Repeat Intro on Error in GUI
Given select created app
And select Simple Menu Widget
When Select settings of widget
Then verify default value of Repeat Intro on Error is "true"

Scenario: Test to verify default value of Repeat Intro on Error in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='repeatIntroOnError']/@value" and "true"


Scenario: Test to verify default value of Default Error Handling in GUI
Given select created app
And select Simple Menu Widget
When Select settings of widget
Then verify default value of Default Error Handling is "true"

Scenario: Test to verify default value of Add Custom Prop in GUI
Given select created app
And select Simple Menu Widget
When Select settings of widget
Then verify default value of Add Custom Prop is "false"

Scenario: Test to verify change tag Name of simple Menu
Given select created app
And select Simple Menu Widget
When Select settings of widget
And change tag Name "tagtest"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='tagName']/@value" and "tagtest"





Scenario: Test to verify change inter digit timeout of simple Menu
Given select created app
And select Simple Menu Widget
When Select settings of widget
And change inter digit timeout "2345"
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='interDigitTimeout']/@value" and "2345"

Scenario: Test to verify Enable Bargin Type Hotword of simple Menu
Given select created app
And select Simple Menu Widget
When Select settings of widget
And Enable Bargin Type Hotword
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='hotword']/@value" and "true"

Scenario: Test to verify select disable universal grammar of simple Menu
Given select created app
And select Simple Menu Widget
When Select settings of widget
And select disable universal grammar checkbox
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='disableUG']/@value" and "true"


Scenario: choose prompt base as content Base
Given select created app
And select Simple Menu Widget
When Select settings of widget
And select content base in prompt path
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/@promptBase" and "content_base"

Scenario: select prompt base as Standard prompt Base
Given select created app
And select Simple Menu Widget
When Select settings of widget
And select standard prompt base in prompt path
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/@promptBase" and "standard_prompt_base"

Scenario: Test to verify to disable consent logs of simple Menu
Given select created app
And select Simple Menu Widget
When Select settings of widget
And disable consent logs
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='consentLogs']/@value" and "false"

Scenario: Test to verify to disable Repeat intro on error of simple Menu
Given select created app
And select Simple Menu Widget
When Select settings of widget
And disable Repeat intro on error
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='repeatIntroOnError']/@value" and "false"

Scenario: select bargein as false
Given select created app
And select Simple Menu Widget
When Select settings of widget
And select bargein as false
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='bargein']/@value" and "false"

Scenario: Add second option and verify option
Given select created app
And select Simple Menu Widget
When Select add choice button
And Enter second option as "test2"
And Enter second dtmf as "2"
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/input/choice[2]/@option" and "test2"


Scenario: Check second DTMF given in previous test case
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/input/choice[2]/@key" and "2"

Scenario: Test to verify Delete choice
Given select created app
And select Simple Menu Widget
When delete choice
And save application
And publish application
Then Read xml
And compare count result "/application/callFlow/state/stateInfo/input/choice" and "1"

@simple
Scenario: disable dfault error handling and verify max error count
Given select created app
And select Simple Menu Widget
When Select settings of widget
And scroll down setting page
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
And select Simple Menu Widget
When Select settings of widget
And scroll down setting page
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
And select Simple Menu Widget
When Select settings of widget
And scroll down setting page
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

@simple
Scenario: Test to verify Rejection prompt
Given select created app
And select Simple Menu Widget
When Select settings of widget
And scroll down setting page
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
And select Simple Menu Widget
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

Scenario: Test to verify option connector
Given select created app
And select Simple Menu Widget
When drag and drop second simple menu widget
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/stateInfo/input/choice/@nextState" and "widget-simpleMenu-3"

Scenario: Test to verify delete simple menu
Given select created app
When Delete simple menu
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/input/choice/@nextState" and ""
@simple
Scenario: Test to verify max err connector
Given select created app
And select Simple Menu Widget
When drag and drop jump to state widget
And save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "Select State"









