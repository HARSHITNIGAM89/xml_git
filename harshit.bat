set projectLocation=C:\Users\harshit.nigam\workspace_neon\jenkinsdemo_xml_git

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause