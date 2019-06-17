Feature: Prompt Widget

Background: launch browser
Given User is on Home Page
And login with correct username and password

Scenario: Give prompt name
When User Navigate to create app page 
And drag and drop prompt widget
And Enter prompt name
And configure supported language
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/value/text()" and "demo"

Scenario: check default prompt path in GUI
Given select created app
And select prompt Widget
When select setting button
Then check default prompt path in GUI "App Prompt Base" 

Scenario: Check default prompt path in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/@promptBase" and "app_prompt_base"

Scenario: check default Play scheme in GUI
Given select created app
And select prompt Widget
When select setting button
Then check default Play scheme in GUI "Sequential All"


Scenario: check default play Scheme in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='playScheme']/@value" and "sequentialAll"

Scenario: check default Bargein in GUI
Given select created app
And select prompt Widget
When select setting button
Then check default Bargein in GUI "True"

Scenario: check default Bargein in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='bargein']/@value" and "true"

Scenario: Check default value of Nth Prompt
Given select created app
And select prompt Widget
When select setting button
Then check default value of Nth Prompt checkbox



Scenario: choose prompt base as content Base
Given select created app
And select prompt Widget
When select setting button
And select content base in prompt path
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/@promptBase" and "content_base"

Scenario: select prompt base as Standard prompt Base
Given select created app
And select prompt Widget
When select setting button
And select standard prompt base in prompt path
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/@promptBase" and "standard_prompt_base"

Scenario: select bargein as false
Given select created app
And select prompt Widget
When select setting button
And select bargein as false
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='bargein']/@value" and "false"

Scenario: select play scheme as Random
Given select created app
And select prompt Widget
When select setting button
And Select Play Scheme as Random
And save settings
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='playScheme']/@value" and "random_one"

Scenario: delete prompt widget
Given select created app
And select prompt Widget
And drag and drop second prompt widget
And save application
And delete prompt widget
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state[1]/@nextState" and ""

Scenario: Enable Nth prompt
Given select created app
And select prompt Widget
When select setting button
And select Nth Prompt checkbox
And provide N Value
And save settings
And Enter Before prompt
And Enter After prompt
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/@promptClass" and "nthPrompt"

Scenario: Check Before prompt
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/nthPrompt/@before" and "bfrPrompt"

Scenario: Check After prompt
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/nthPrompt/@after" and "aftrPrompt"

Scenario: check N value
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='nvalue']/@value" and "3"

Scenario: Add second prompt
Given select created app
And select prompt Widget
And Select add prompt button
And Enter second Before prompt
And Enter second After prompt
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/prompts/prompt/nthPrompt[2]/@after" and "aftrPrompt2"

Scenario: delete prompt
Given select created app
And select prompt Widget
And delete prompt
And save application
And publish application
Then Read xml
And compare count result "/application/callFlow/state/stateInfo/prompts/prompt/nthPrompt" and "1"

Scenario: Rename widget Name
Given select created app
And select prompt Widget
And Rename widget name as "test1"
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/@displayName" and "test1"