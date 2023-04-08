
# Names In Style

"Names in Style" is a fascinating Java project that generates stylized versions of any input string consisting of only English alphabets and numbers. The project takes an input string and converts each character into a beautiful pattern made up of other characters. The patterns used for each character are carefully chosen to make the output visually appealing.
Support for other ASCII characters will be added in the future.


# Installation

This requires Java 1.8 or higher installed in your system. Visit https://openjdk.org/ and install Java.


# Usage


First step is to clone the project, then you can follow any of the below steps to run the application

There are two ways to run this application

### 1) Run by using an IDE such as Intellij

Download an IDE of your choice, such as Intellij, then import and run the application as shown below.

You can refer the below link to know how to import a project into Intellij

https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html#import-project

Once project is imported, Add program line arguments in Run Configuration and run the application. You can refer below link for the same

https://www.jetbrains.com/help/rider/Unreal_Engine__EzArgs.html

Then run your Application

### 2) Run using Command line arguments
Compile the Java code using below command in command line

```bash
javac -d ./out/ ./src/org/stylish/*.java

```
Then navigate to the out path using below command
```bash
cd out
```

Use this below command and pass your text in the command as shown below. Once compiled, this step can be used as many times as required with different text
```bash
java org.stylish.Runner "Names In Style 2023"

```

# Examples

Below are the few Examples

a) Running below command

```bash
java org.stylish.Runner Names In Style 2023

```

Output of above run


                                        N       N       A A A       M M   M M     E E E E E       S S S S
                                        N       N     A       A     M   M   M     E             S
                                        N N     N     A       A     M       M     E             S
                                        N   N   N     A A A A A     M       M     E E E E         S S S
                                        N     N N     A       A     M       M     E                     S
                                        N       N     A       A     M       M     E E E E E     S S S S


                                                        I I I I I     N       N
                                                            I         N       N
                                                            I         N N     N
                                                            I         N   N   N
                                                            I         N     N N
                                                        I I I I I     N       N


                                          S S S S     T T T T T     Y       Y     L             E E E E E
                                        S                 T           Y   Y       L             E
                                        S                 T             Y         L             E
                                          S S S           T             Y         L             E E E E
                                                S         T             Y         L             E
                                        S S S S           T             Y         L L L L L     E E E E E


                                                  2 2 2         0 0 0         2 2 2       3 3 3 3       
                                                2       2     0       0     2       2             3     
                                                        2     0       0             2             3     
                                                  2 2 2       0       0       2 2 2         3 3 3 3     
                                                2             0       0     2                     3     
                                                2 2 2 2 2       0 0 0       2 2 2 2 2     3 3 3 3     



b) Running below command

```bash
java org.stylish.Runner "I am Yugesh"

```
Output of Run 2

                                        I I I I I               A A A       M M   M M             Y       Y     U       U       G G G       E E E E E       S S S S     H       H     
                                            I                 A       A     M   M   M               Y   Y       U       U     G       G     E             S             H       H     
                                            I                 A       A     M       M                 Y         U       U     G             E             S             H       H     
                                            I                 A A A A A     M       M                 Y         U       U     G     G G     E E E E         S S S       H H H H H     
                                            I                 A       A     M       M                 Y         U       U     G       G     E                     S     H       H     
                                        I I I I I             A       A     M       M                 Y           U U U         G G G       E E E E E     S S S S       H       H   

# Limitations
"Names in Style" currently only supports input strings consisting of English alphabets and numbers. Other characters, such as punctuation marks or non-English characters, will be ignored.


# Credits

Yugesh Reganti




