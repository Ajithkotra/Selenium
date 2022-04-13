# Amazon Website Automation Suite Information

### To run the Amazon Automation Suite from command Line in the project Folder

### Packages Description

-com.SeleniumAssignment.Pages: Defining all the pages and respective object repository.

-com.SeleniumAssignment.utils: Defining all utilities needed for the tests.

-com.SeleniumAssignment.test: Defining all the pages tests and asserts.

###Test.java files description

***AmazonPayTest: 
-To verify the Amazon Pay

***BaseTest:The main class 
- @BeforeTest - to open the extent report
- @BeforeMethod - to open the browser and get the name of the test
- @AfterMethod - to quite the browser
- @AfterTest- to close the extent report

***BuyPrimeTest: 
- To verify Amazon prime

***CustomerSericeTest:
- To verify Customer Service
- To verify all the help service

***Drivers:
- It contains various browsers and open different browser which need the user

***FlightBookinginAmazonTest:
- To verify flight booking in amazon website 

***NewReleaseTest:
- To verify and displayed new released product on the page

***RegisterTest:
- To verify the register WEbsite with security

***SearchProductTest:
- To Verify search product and displayed which is user searched

***SetLocationTest:
- To verify the Location and valid pincode

***SigninTest:
- To verify the user login

###Other files description

- BrowserUtility.java: defines all the utilities functions
- ExtentReport.java: defines function for extent reporting
- ReadProperties.java: To read the properties from config.properties
- Screenshots.java: defines function to take screenshots

###Reports and Screenshots

- Extent report gets generated after the run under\src\test\Report\Report.html

- TestNG report as "emailable-report.html" gets generated under \test-output

- Screenshots gets placed under\Screenshots folder with test name and date and time