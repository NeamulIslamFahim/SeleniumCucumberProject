Feature: Facebook Login
	Scenario: Logo presence on Facebook home page
	Given I launch Chrome Browser
	When  I open facebook
	Then I verify that logo present on page
	And close Browser