Feature: Gmail Automation

Scenario: Verify that Gmail Automation using selenium
Given I launch Gmail
When I open Gmail Homepage
Then I verify that Compose button
And I add To and Subject
And I add Content
Then I click send button