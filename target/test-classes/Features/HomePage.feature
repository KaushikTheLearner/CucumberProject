Feature: Verify Functionality on HomePage

@SmokeTest @RegressionTest
Scenario: Validate Orderbook
Given User is on HomePage
When User clicks on Orderbook
Then Orderbook should get open

@RegressionTest @SanityTest
Scenario: Validate Tradebook
Given User is on HomePage
When User clicks on Tradebook
Then Tradebook should get open

@SanityTest @SmokeTest
Scenario: Validate NetPosition
Given User is on HomePage
When User clicks on NetPosition
Then NetPosition should get open

@SmokeTest
Scenario: Validate Scanner
Given User is on HomePage
When User clicks on Scanner
Then Scanner should get open

@RegressionTest
Scenario: Validate Strategy
Given User is on HomePage
When User clicks on Strategy
Then Strategy should get open

@MobileTest
Scenario: Validate ExchangeMessage
Given User is on HomePage
When User clicks on ExchangeMessage
Then ExchangeMessage should get open

@MobileTest
Scenario: Validate Alerts
Given User is on HomePage
When User clicks on Alerts
Then Alerts should get open