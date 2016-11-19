D-Case Editor Update Sites - http://dimensions-japan.org/dcase/eclipse/
Graphical Modeling Framework - Eclipse marketplace
Modeling package update for eclipse XXX(version of your eclipse IDE)
Under Modeling -> GMF Tooling
                  GMF runtime extension
                  GMF SDK

Epsilon http://download.eclipse.org/epsilon/interim/ 
The first four packages: Epsilon Core
                         Epsilon Core Development Tools
                         Epsilon EMF Integration
                         Epsilon GMF Integration

JAVA JDK 1.8 required 
Control panel -> System -> Advanced system settings -> Environment Variables -> 

add new environment variable with the name "JAVA_HOME" and the value your jdk directionary, 
for example "C:\Program Files\Java\jdk1.8.0_91" (should be your directionary).
Then add the value "%JAVA_HOME%\bin" to the environment variable "path".


For example in Windows 7:
Add "C:\Program Files\Java\jdk1.8.0_91"(should be your directionary) as "JAVA_HOME" variable. 
Then paste ";%JAVA_HOME%\bin" at the end of the path variable.
