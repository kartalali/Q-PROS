Feature: check the listed Categories has Items

  Background:
    * user clicks login from header
    * user fills username
    * user fills password
    * user clicks login button

  @melisaras
  Scenario: user should be able to see tabs and able to verify categories has an items or not
    *  verify all the tabs

      |CATEGORIES|Phones|Laptops|Monitors|

    * click on phone tab
    * verify any item exist on phone page
    * click on laptop tab
    * verify any item exist on laptop page
    * click on monitor tab
    * verify any item exist on monitor page