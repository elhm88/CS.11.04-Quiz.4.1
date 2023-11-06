# CS.11.04-Quiz.4.1

Declare all methods as static.
1. Write a method called **numberOfVowels**.
   
   Given a string, **numberOfVowels** will return the number of vowels in that string. Consider a, e, i, o, u as vowels. 

2. Write a method called **notDivisibleBy235**.
   
   Given a number N, **notDivisibleBy235** will return the number of natural numbers not exceeding N that are not divisible by any of the numbers [2, 3, 5].

  Example

  Let's see what happens when N=5:

    1 - not divisible by 2, 3, or 5
    2 - divisible by 2
    3 - divisible by 3
    4 - divisible by 2
    5 - divisible by 5

  Answer: 1 (Of all the numbers from 1 to 5 inclusive, there is one number that isn't divisible by any of 2, 3, 5)


3. Write a method called **camelCaseMe**.
   
   Given a string, this method converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should always be capitalized.

  Examples
  
    "the-stealth-warrior" gets converted to "theStealthWarrior"

    "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

    "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

