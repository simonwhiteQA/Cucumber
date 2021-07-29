# POM - Page Object Model
A design pattern for creating our selenium tests, its a design pattern for creating a singular CLASS per PAGE

BBCNews.java 
BBCHome.java
BBCSport.java 

seleniumTest.java

driver.get(BBCNews)
doTests();
assertTrue(tests);

driver.get(BBCHome)

Each page/object contains:
- All WebElements you'll need
- All Methods you'll need to test
- All Validations for parent level validation

BBCNews.checkTitle()
assertTrue(BBCNews.checkTitle().contains"String")

+ Reusability of pages and simpler test writing
+ Makes more sense for web development (as created out of seperate pages)