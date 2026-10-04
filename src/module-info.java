/* so let's begin the learning of JAVA language today(30/9/2026)
 
What is JAVA?
1. Java is most famous programming language
2. It's most famous and strongest programming language
3. It's Known for "compile once and run anywhere" - means if you write in windows you can execute it in mac or linux 
without changing a single line of code 

When was it invented?
Java was created in 1995 by a man named James Gosling at a company called Sun Microsystems (which is now owned by Oracle). 
Originally, he named it "Oak" after an oak tree outside his office window, but they later changed it to Java—inspired by the Java 
coffee the developers drank!

Why not another language? Why only Java?
Other languages are absolutely great—Python is super easy to read, and C++ is incredibly fast—but Java is the "reliable workhorse" of the computer 
world. It has a special helper called the Java Virtual Machine (JVM). When you use other languages, you often have to rewrite 
parts of your code to make it work on different types of computers. Java does all that translation for you automatically.It is 
also incredibly secure and strictly organized, which is why big companies trust it with their most important data.

What are the limitations of Java?
Even the best tools have a catch:
1. It can be a little slow to wake up: Because Java has to load its special JVM helper before it runs, it can take a bit longer
to start up than languages like C++ or Rust.
2. It is "wordy": In Java, you often have to type out a lot of words to do something very simple. Python might take 2 lines of 
code for a task that takes Java 10 lines.
3. It eats more memory: Java programs tend to take up a bit more space in your computer's memory while they are running.

Why do we still need to learn Java?
Because it is everywhere! If you want to build Android apps, work at a major bank, or get hired by tech giants, Java is one of the most requested skills 
in the world. Also, because Java is so strictly organized, learning it first teaches you excellent programming habits. Once you understand the rules of 
Java, learning any other language feels like a breeze.

Requirements to start Java
1. Install JDK (latest version)
2. Install Eclipse, VSCode, IntelliJ (to do basic programming) for dvelopment we need to install Spring Tool Suite (it's requriments) 

Day 2-Data types(1/10/2026)
Data types are the classification of data which tells the compiler or interpreter how the programmer intends to use
1.string - used to store text, like words or sentences. For example, "Hello, World!" is a string.
2.int - used to store whole numbers, like 1, 42, or -7. For example, 10 is an int.
3.double - used to store numbers with decimal points, like 3.14 or -0.001. For example, 2.5 is a double.
4.float - used to store numbers with decimal points, but with less precision than double. For example, 3.14f is a float.
5.boolean - used to store true or false values. For example, true is a boolean.
6.char - used to store a single character, like 'a' or 'Z'. For example, 'A' is a char.
7.byte, long, int

Math operators : +,-,*,/,%
special one - % : Modulo (This is a special one. It gives you the "leftovers" or remainder after division. For example, 10 % 3 gives you 1, because 3 fits into 10 three times, with 1 left over).
some special operators : =,>=,<=,!=,&,| etc
if : only executes certain part of your code {......}-baically first part other wise else comes into pic
Java is very strict we can't use float as int 

Day 3:(2/10/2026)
so scanner is an built in java tool it's basically used to get user input
so the scanner is a class in Java that allows you to read input from various sources, such as the keyboard, files, or strings. It is part of the java.util package and provides methods to read different types of data, such as integers, doubles, and strings.
Scanner keyboardEar = new Scanner(System.in);
import java.util.Scanner; - this is used to import the Scanner class from the java.util package, which allows you to read input from the user in your Java program.

Random number = new Random();  - this is used to generate random numbers
the basic use of random is to generate random numbers for games, simulations, or any situation where you want unpredictability. 
import java.util.Random; - this is used to import the Random class from the java.util package, which allows you to create random numbers in your Java program.

Day 4:(3/10/2026)
Arrays - instead of making separate variable boxes, an array is like a single bookshelf that holds multiple items of the *exact same data type* in numbered slots. The most important rule: computers start counting these slots (called indexes) at 0!
for loop - unlike a while loop, a for loop is a counting machine designed to run an exact, specific number of times. 
Example: for (int i = 0; i < n; i++) 
Note: We can also count backwards by using the minus symbol (i--) instead of plus (i++).

Day 5:(4/10/2026)
void means return type 
int-int
int-boolean
string-boolean
int-nothing
boolean-nothing
*/
 