Feature: Patient Management

  Scenario: Verify Patient Management Workflow
    Given I am on the login page at "https://qa-refapp.openmrs.org/openmrs/login.htm"
    When I enter the username "Admin" and password "Admin123"
    And I pick a location and click on "Login"
    Then I verify that I am redirected to the dashboard page

    When I click on "Register a patient" menu
    And I enter patient demographics with:
      | Name        | Gender | Birthdate  |
      | John Doe    | Male   | 01/01/1990 |
    And I enter contact info with:
      | Address             | Phone Number  |
      | 123 Main St, City   | 123-456-7890  |
    And I navigate to the confirm page
    Then I verify the details are populated correctly:
      | Field          | Expected Value |
      | Name           | John Doe       |
      | Gender         | Male           |
      | Birthdate      | 01/01/1990     |
      | Address        | 123 Main St    |
      | Phone Number   | 123-456-7890   |

    When I click on "Confirm"
    Then I verify that I am redirected to the Patient details page
    And I verify that the age is calculated correctly

    When I click on "Start Visit" and confirm the visit
    And I click on "Attachment" and complete the upload process
    Then I verify a toaster message appears for successful attachment
    And I am redirected to the Patient details screen
    And I verify that the Attachment section has attachments
    And I verify that the Recent Visit has one entry for the current date with "Attachment Upload" tag

    When I click on the "End Visit" action at the right-hand side
    And I start a new visit
    And I click on "Capture Vitals" menu
    And I enter Height and Weight
    Then I verify that the displayed BMI is calculated correctly
    And I click on "Save Form" and "Save" button
    And I click on "End Visit" and I am redirected to the Patient details page
    And I verify that the Height and Weight are displayed correctly along with the calculated BMI
    And I verify that the Recent Visit has one more new entry for the current date with "Vitals" tag

    When I click on "Merge Visits"
    And I select the two visits and click on "Merge Selected Visits"
    And I am redirected to the patient details page by clicking on the "Return" button
    Then I verify that the Recent Visit has become one entry for the current date with "Vitals, Attachment Upload" tags

    When I click on "Add Past Visit" and verify the future date is not clickable in the date picker
    And I am redirected to the patient details page
    And I click on "Delete Patient" and provide the reason
    And I click on "Confirm" and verify the toaster message
    And I am redirected to the "Find Patient Record" menu
    Then I verify that the deleted patient is not listed in the table using search options
