Feature: FreeClimbClient

	Scenario: Need to make a FreeClimbClient
		Given a FreeClimbClient with accountId AC1234567890123456789012345678901234567890 and authtoken 1234567890123456789012345678901234567890
		Then verify a FreeClimbClient with accountId AC1234567890123456789012345678901234567890 and authtoken 1234567890123456789012345678901234567890

	Scenario: Need to make a FreeClimbClient that uses a different accountId in urls
		Given a FreeClimbClient with accountId AC1234567890123456789012345678901234567890 and authtoken 1234567890123456789012345678901234567890 but using accountId AC0987654321098765432109876543210987654321
		Then verify a FreeClimbClient with accountId AC1234567890123456789012345678901234567890 and authtoken 1234567890123456789012345678901234567890 but using accountId AC0987654321098765432109876543210987654321
