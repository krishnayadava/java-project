@jumpage
Feature: Jump to state widget
Background: launch browser
Given User is on Home Page
And login with correct username and password

Scenario: Test to verify widget name
Given select created app
And Select Jump to page widget
When Rename jump to page widget name as "test2"
And save application
And Select Jump to page widget
Then Verify widget name in jump to page is "test2"

Scenario: Test verify default value of state in GUI
Given select created app
And create new page with name "page2"
When save application
And Select Jump to page widget
Then verify value of page in GUI is "Select Page"



Scenario: Test verify default in xml
Given select created app
When save application
And publish application
And Select ignore all
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "tabs-Select Page"

Scenario: Test verify page1 in GUI
Given select created app
And Select Jump to page widget
When Select page1
And save application
And Select Jump to page widget
Then verify value of page in GUI is "Page1"


Scenario: Test verify page1 in xml
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "widget-dateInput-2"


Scenario: Test verify page2 in GUI
Given select created app
And Select Jump to page widget
When Select next avilable page in option
And save application
And Select Jump to page widget
Then verify value of page in GUI is "page2"

Scenario: Test verify page2 in GUI
Given select created app
When save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and "tabs-page2"

Scenario: Delete widget
Given select created app
And Select Jump to page widget
When delete jump to page
And save application
And publish application
Then Read xml
And compare result "/application/callFlow/state/settings/setting[@name='errorHandling']/maxerror/@nextState" and ""

