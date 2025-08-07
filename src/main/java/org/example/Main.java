package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // EXERCISE 1:
    //Prediction: 14
    String greeting = "Hello, Cadets!";
    int length = greeting.length();
    System.out.println("The length of the string is: " + length);
    //Actual Output: 14

    //EXERCISE 2:
    //Prediction: l
    String message = "Keep learning!";
    char character = message.charAt(5);
    System.out.println("The character at index 5 is: " + character);
    //Actual Output: l

    //EXERCISE 3:
    //Prediction: is
    String statement = "Java is powerful.";
    String part = statement.substring(5,7);
    System.out.println("The extracted substring is: "+ part);
    //Actual Output: is


    /*
    EXERCISE 4:
    Prediction:
    Uppercase: THIS IS A TEST
    Lowercase: this is a test
    */
    String mixedCase = "This Is A Test";
    String upper = mixedCase.toUpperCase();
    String lower = mixedCase.toLowerCase();

    System.out.println("Uppercase: " + upper);
    System.out.println("Lowercase: " + lower);

    /*
    Actual Output:
    Uppercase: THIS IS A TEST
    Lowercase: this is a test
    */


    /*
    EXERCISE 5:
    Prediction:
    index of 'fox': 16
    index of 'z': 37
    index of 'cat': -1 (because it does not exist)
    */

    String sentence = "The quick brown fox jumps over the lazy dog.";
    int indexOfFox = sentence.indexOf("fox");
    int indexOfZ = sentence.indexOf('z');
    int indexOfCat = sentence.indexOf("cat");

    System.out.println("Index of 'fox': " + indexOfFox);
    System.out.println("Index of 'z': " + indexOfZ);
    System.out.println("Index of 'cat': " + indexOfCat);
    /*
     Actual Output:
     Index of 'fox': 16
     Index of 'z': 37
     Index of 'cat': -1
     */


    /*
     EXERCISE 6:
     Prediction:
     false
     true
     true
    */

    String str1 = "Java";
    String str2 = "java";
    String str3 = "Java";

    boolean isEqual1 = str1.equals(str2);
    boolean isEqual2 = str1.equals(str3);
    boolean isEqual3 = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqual3);

    /*
    * Actual Output:
    * false
    * true
    * true
    * */


    /*
     EXERCISE 7
     Prediction:
     Original: I like cats. Cats are cute.
     Replaced: I like dogs. Cats are cute.
     */

    String original = "I like cats. Cats are cute.";
    String replaced = original.replace("cats", "dogs");
    System.out.println("Original: " + original);
    System.out.println("Replaced: " + replaced);

    /*
    Actual Output:
    Original: I like cats. Cats are cute.
    Replaced: I like dogs. Cats are cute.
    */


    /*
    EXERCISE 8:
    Prediction:
    20
    'Lots of spaces'
    14
    */

    String padded = "   Lots of spaces   ";
    String trimmed = padded.trim();
        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());

    /*
    Actual Output:
    Padded string length: 20
    Trimmed string: 'Lots of spaces'
    Trimmed string length: 14
    */
    }
}