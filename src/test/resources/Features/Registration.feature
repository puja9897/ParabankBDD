Feature: User registration on Parabank site.

Scenario: Successful registration of user.

Given User is on Parabank Registration page

When User enters valid details 
| firstname | lastname | address | city | state | zipcode | phone | ssn | username | password | confirmPassword |
| Piya | Sharma | ABC Apartment | Mumbai | Maharashtra | 400001 | 9876543211 | 12345 | piya | pass1234 | pass1234 |

Then User should be successfully registered

