@jump
Feature: Jump to state widget
Background: launch browser
Given User is on Home Page
And login with correct username and password
Scenario: Test to verify widget name
Given select created app
And Select Jump to state widget
When Rename jump to state widget name as "test2"
And save application
And Select Jump to state widget
Then Verify jump name is "test2"

Scenario: Test verify default value of state in GUI
Given select created app
And Select Jump to state widget
Then verify value of state in GUI is "Select State"



Scenario: Test verify previous state in xml
Given select created app
When save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "Select State"

Scenario: Test verify previous state in GUI
Given select created app
And Select Jump to state widget
When Select previous state
And save application
And Select Jump to state widget
Then verify value of state in GUI is "previousState"


Scenario: Test verify previous state in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "previousState"


Scenario: Test verify previous recognize state in GUI
Given select created app
And Select Jump to state widget
When Select next avilable state in option
And save application
And Select Jump to state widget
Then verify value of state in GUI is "previousRecognitionState"

Scenario: Test verify previous recognize state in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "previousRecognitionState"

Scenario: Test verify simple menu state in GUI
Given select created app
And Select Jump to state widget
When Select next avilable state in option
And save application
And Select Jump to state widget
Then verify value of state in GUI is "Page1,simpleMenu1"

Scenario: Test verify simple menu state in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "widget-simpleMenu-2"

Scenario: Test to verify delete Jump to state widget
Given select created app
And Select Jump to state widget
When Delete jump to state
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/stateInfo/input/choice/@nextState" and ""