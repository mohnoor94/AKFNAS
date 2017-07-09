# AKAS-N (Abukhleif Automation System - Native)
* Includes the (native) basic java-driven application to generate and execute
XML-based test cases, the test cases can be manually written as xml files or
automatically generated by convert java codes to xml files.
* Each test file will generate a report after executing it.

## Run and Testing:
* Project includes many test files (under xml folder) which can be used as a reference or a guide
to help you write your own files.
* Project also includes the Java classes (under src/test folder) which used to generate the test files,
 you can also use them as a guide if you prefer to write your test files using
 Java instead of XML, and adding one command will take the responsibility of
 converting your Java code to XML file.
* ExecuterTester Class (under src/test folder) is an example of how can the files tests
executed, you can create your own class or just use it as is.

## Samples:
* Test Files (XML) samples can be found inside the project under xml folder.
* Java Classes which used to generate XML files can be found under (src/test)
folder.
* Java Class (ExecuterTEster) which used to execute the tests can be found under (src/test)
folder.


## User Guide:
* Will be available soon, you can use the information in run and testing
section (above) at the moment.

## Change Log:
#### V N2.9:
* Multiple Browsers Support:
    * Chrome [Tested]
    * FireFox
    * IE
    * HeadLess [Tested]

#### V N2.8:
* New (and better) **design** for reports.
* Reports titled with help of xml file name which used to run the test in addition
to the date and time of the execution.
* **Click** and **Submit** actions appears in the final report.
* Other minor changes and bug fixing.
* In Pages and Forms, if both of url and relative attributes values are null 
(no values) resulting in staying at the same page or form and use all actions
of the unit (page or form). This can help in execute the scenarios in more
logical (natural) way, and generates more readable and natural reports.
* Other minor changes and bugs fixing.

#### V 2.0, V1.9.2, V1.9.1:
* Minor changes and bugs fixing.

#### V1.9:
* **ChromeDriver** using **Maven** instead of include it in the project package.
* Other minor changes and bugs fixing.

#### V1.8:
* Changes in reports design.
* Other minor changes and bugs fixing.

#### V1.7.1:
* Minor changes and bugs fixing.

#### V1.7:
* Adding any action to an instance of Writer class results in adding it directly,
**no need for committing each group of actions** separately.
* Other minor changes and bugs fixing.

#### V1.6:
* Fix FillElement action reading process from stored data.
* Add **VerifyAlert** and **RespondAlert** actions which helps in dealing with
popup alerts from websites.
* Form **Submit** action supports both submitting by the submit method via any
form element, or via clicking a button.
* Rename actions: (Text --> **VerifyText**, NotText --> **VerifyNotText**).
* **Reporter** (renamed from Reportable) class can be used by any class without
the need to extend it, all classes will accesses one shared copy of the
Reporter instance.
* Add **WriterTester** and **ExecuterTester** to help in generate and execute
XML files via Java code.
* Other minor changes and bugs fixing.

#### V1.5:
* New (and better) **design** for reports.
* Add Form **Submit** as a new action, this will help in execute other actions
and/or verifications either before or after the form submit action.
* **Header** and **Footers** added to the **reports**, for entering the main site, and for
each page and form, so the QA can easily read the results (from the report) in its natural order
including the actions resulting in each group of verification results.
* **Relative** attribute added to both of **Page** and **Form**, setting this
 attribute to "yes" results in combine the main site URL, the slash sign (/),
 and current page or form url. On the other hand, the QA still have the ability
 to use static URLs via setting this attribute to "no".
* **CSS** is now the only used way to design report rows, instead of some
deprecated html tags.
* Other minor changes and bugs fixing.

#### V1.4:
* Add **Click** action.
* Add **ClickCheckbox** action.
* Add **FillElement** action, to fill text input fields.
* Add **Store** action, this action help the user (QA) to store any data from
the web page/form and use it anywhere during the test.
* Add **ManualStore** action, this action help the user (QA) to store any
useful data and use it anywhere during the test.
* Update **Data** class to store data via Store and ManualStore actions, 
in addition to other data.
* Add **Text** action, this action verifies if the page contain this text.
* Add **NotText** action, this action verifies if the page does not contain
this text, useful for error messages discovering.
* Add **Select** action, to select any option from a dropDown (or dropUp) menu.
* A new **DriverUtils** class added and used in find web elements in all possible
ways using single attribute (id).
* Reports redesign.
* Add **Form** unit. All actions can completely work with forms as pages. 
* Add **Unit** class which the Form and Page classes extend to apply
 polymorphism principles.
* Update **Site** scope class, and add name and url properties to it.
* Other minor changes and bugs fixing.

#### V1.3:
* Add **Data** to store data, both the data stored by the user, and some
other needed data like the main site url.
* Other minor changes and bugs fixing.

#### V1.2:
* Add **Action** abstract class, all actions extend this class, each page now
has only to have a list of actions, not a list for each action type,
 this also help in conserve the natural order of actions and applying polymorphism. 
* Add **Scope** abstract class, all scopes extend this class.
* Delete Action and Scope interfaces due to incompatibility between Selenium WebDriver
and Interfaces!
* Update **Page** unit, and add **Parse** method to execute all children
actions of the page.
* Update **Scenario** scope class.
* Add Main **Site** scope class.
* Other minor changes and bugs fixing.

#### V1.1:
* Add **Reportable** class.
* Update **Base** Framework.
* Update **Page** unit.
* Add **Action Interface**.
* All Actions added but not yet implemented.
* Add **Page** unit.
* Add **Scenario** scope.
* Add **Scope** interface.
* Other minor changes and bugs fixing.

##### V1.0:
* Initial Release.

