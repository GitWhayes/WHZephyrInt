@Echo off
SET LOGFILE=C:\Users\graywa01\gitZephyrInt\wandaTestZephyr\batchlogfile.log
call :Logit >>%LOGFILE%
exit / b 0
:Logit
set projectpath=C:\Users\graywa01\gitZephyrInt\wandaTestZephyr
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\libs\*
java org.testng.TestNG %projectpath%\testng.xml
pause