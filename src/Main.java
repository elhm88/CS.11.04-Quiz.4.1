/*
*   Name: Emily
*   Section: 12
*
*   Academic Honesty Pledge:
*   "I have neither given nor received any unauthorized aid on this piece of work."
*
*   Signed: Emily  Date: Nov 16 2023
* */

public class Main {

    public static void main(String[] args) {
        System.out.println(camelCaseMe("hi-camel"));
    }

    /** 1. Write a method called numberOfVowels()
           Given a string, **numberOfVowels** will return the number of vowels in that string. 
           Consider a, e, i, o, u as vowels.
     **/

    public static int numberOfVowels(String str){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                count ++;
            }
        }
        return count;
    }
    

    /** 2. Write a method called notDivisibleBy235()
           Given a number N, **notDivisibleBy235** will return the number of natural numbers 
           from one to N that are not divisible by any of the factors [2, 3, 5].

     Let's take N=5 as an example:
        1 - not divisible by 2, 3, or 5
        2 - divisible by 2
        3 - divisible by 3
        4 - divisible by 2
        5 - divisible by 5
     Answer: 1 (only one number isn't divisible by any of 2, 3, 5) **/

    public static int notDivisibleBy235(int N){
        int count = 0;
        for (int i=1; i<=N; i++){
            if (i%2 != 0 && i%3 != 0 && i%5 != 0){
                count++;
            }
        }
        return count;
    }

    /** 3. Write a method called camelCaseMe()
           Given a string, this method converts dash/underscore delimited words into camel casing. 

     * The first word should be capitalized only if the original word was capitalized
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/

    public static String camelCaseMe(String str){
        String result = "";
        boolean nextIsCapital = false;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == '-' || str.charAt(i) == '_' ){
                nextIsCapital = true;
            }
            if (nextIsCapital){
                result += str.substring(i+1, i+2).toUpperCase();
                nextIsCapital = false;
            }
            else if(str.charAt(i) > 'z' ){
                result += "";
            }
            else {
                result += str.substring(i, i+1);
            }
        }
        return result;
    }
}
