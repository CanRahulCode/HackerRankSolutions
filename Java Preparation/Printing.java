import java.io.*;
import java.util.*;

public class Printing {

    public static void main(String[] args) {
       System.out.println("1 Hello world");
       System.out.println("2 I am a file");
       System.out.println("3 Read me until end-of-file.");
    }
}

/*
 Question
 The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
Language
Java 8
More
1234567891011
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       System.out.println("1 Hello world");
       System.out.println("2 I am a file");
       System.out.println("3 Read me until end-of-file.");
    }
}
Line: 11 Col: 2

Test against custom input
Congratulations!

You have passed the sample test cases. Click the submit button to run your code against all the test cases.


Sample Test case 0
Input (stdin)
Hello world
I am a file
Read me until end-of-file.
Your Output (stdout)
1 Hello world
2 I am a file
3 Read me until end-of-file.
Expected Output
1 Hello world
2 I am a file
3 Read me until end-of-file.

 */