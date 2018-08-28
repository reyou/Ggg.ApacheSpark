@echo off

:: https://superuser.com/questions/279072/how-do-i-clear-all-environment-variables-from-a-windows-shell-session
:: How do I clear all environment variables from a Windows shell session?
rem if exist ".\backupenv.bat" del ".\backupenv.bat"
rem for /f "tokens=1* delims==" %%a in ('set') do (
rem echo set %%a=%%b>> .\backupenv.bat
rem set %%a=
rem )

set JAVA_HOME=D:\Program Files\Java\jdk1.8.0_121
echo GggMessage: JAVA_HOME: "%JAVA_HOME%"
echo.
echo GggMessage: Running Spark Below.
echo.
cmd /V /E /C "D:\Programs2\spark-2.1.1-bin-hadoop2.7\bin\spark-shell.cmd"
pause>nul