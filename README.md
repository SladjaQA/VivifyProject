# VivifyProject
QA task

For the first part of the task there is pdf document named „GalleryApp Test Plan“ with the test plan.

In the excell document named „GalleryApp Test Cases“, there are required test cases in the first sheet,
while bug reports are in the second sheet of the document. 
In the third sheet there are  data basis for the automation tests.
  
For the second part of the task (automation) I created Selenium project in Eclipse written in Java.

I created two packages. 
First one is pages and it consists of four classes (HomePage, LogInPage, CreatePage and MyGalleryPage).

In the second package named tests there are three classes. 
- Class ExcellReader is setup for reading data from the excell file. 
- TestBase consists of BeforeClass and AfterClass. 
- I decided to create only one class for executing four tests in TestSuit 
(validCredentialsLogIn, createGallery, findingMyGallery and Logout).