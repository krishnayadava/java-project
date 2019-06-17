Feature: HangUp Widget
Background: launch browser
Given User is on Home Page
And login with correct username and password


Scenario: check hangup widget text
Given select created app
And select prompt Widget
When drag and drop hangup widget and give hangup name
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state[@type='hangup']/stateInfo/hangupCode/text()" and "automation"

Scenario: Rename widget name
Given select created app
When select Hangup widget
And Rename Hangup widget
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state[@type='hangup']/stateInfo/hangupCode/text()" and "automation"

Scenario: Delete hangup widget
Given select created app
When select Hangup widget
And close Hangup Widget
And save application
And publish application
Then Read xml
And compare count result "/application/callFlow/state" and "1"