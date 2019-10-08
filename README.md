
# Automated QA for the mobile app

Download the JDK ---JDK version 1.8

Clone the project into your local machine

Navigate to the project folder from the command line
```
mvn clean
```
```
mvn install -DskipTests
```
> Make sure build is success without any issues
> Create a "src/reports" folder

## Getting started locally

**To run a single feature file**
```
mvn test "-Dplatform=android" -Dcucumber.options="--tags @Login"
```

**To run a single scenario **
``` 
mvn test -Dcucumber.options=”feature file path” + “line number of the scenario”
```
Eg:
```
mvn test -Dcucumber.options=src/test/resources/features/Login.features:10
```


## Getting started on Browserstack(CI)

**To run a single feature file**
```
mvn test  "-Denv=ci" "-Dtestrailrunid=<testrailrunid>" "-Dplatform=android" -Dcucumber.options="--tags @Login" 
```

> testrailrunid: This will report the test outcome to the Testrail run. Eg: For Testrail R16, the id is 16.



All the available feature tags :
- @Login
- @Article
- @Bookings
- @BookingTab
- @EditMyProfile
- @MyProfile
- @NewUserRegistration
- @Profile
- @ProfileFunctionalities
- @ProfileSettings
- @SavedStyleTab
- @UploadStyle
- @EditStyle
                    
                 
Application structure:

- feature files: src/test/resources/features
- step files: src/test/java/steps
- runner file: src/test/java/runner
- driver setup: src/main/java/utilities
