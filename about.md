For using Java Soap Web Service you should download and install the
below.

1.Download JDK 2.Netbeans IDE 3.Tomcat Server 4.SOAPUI
-------------------------------------------------------------------------
Creating Web Application

1.After Installing the above open the Netbeans and click the File and
New Project then Java Web and choose Web Application then next. 2.Write
project name as you want then click next.For example lets name TEST 3.In
the server field the Apache Tomcat should be selected and Java EE
Version should be selected. 4.No need change Context Path then click
next and finish. The web application will be created.
--------------------------------------------------------------------------
After creating Web application project we should create web service.

1.Right click on TEST web application project choose new and choose and
click web Service then give name to Web service.For example lets name
OurTEST 2.Package name you can write any name then click finish.lets
name TESTPackage 3.Click yes to question.
---------------------------------------------------------------------------

Creating calculator class

1.Find TESTPackage under Source Packages (Its under Web application
project) 2.Right click on TESTPackage choose new =\> Java Class and give
name to Class then click finish.Lets give Calculator name to the class.
3.You can copy the codes from Calculator.java file then paste to
Calculator class.

* * * * *

Find API link

1.Open your browser then copy paste
http://localhost:8084/TEST/Calculator 2.Copy WSDL link 3.Open your
SOAPUI and click to SOAP field. 4.Paste your WSDL link to initial WSDL
field and click OK. 5.Project will open then you will see the request
methods add,divide,multiply,substract 6.For example choose add and click
request under the add method.The request page will open 7.You will see
<arg0>?</arg0> and <arg1>?</arg1> 8.Replace the sign ? with any number
and click green submit button. You will see the returned result in the
page
