# java

Program 01
This program is a basic calculator implemented in Java. It takes an expression as input, such as "5 + 10", and calculates the result based on the provided operator and operands. 

Here's how it works:
1. The program prompts the user to enter an expression.
2. The expression is split into components using the space character as a delimiter.
3. The first component is parsed as a double and assigned to the variable num1.
4. The second component is assigned to the variable operator.
5. The third component is parsed as a double and assigned to the variable num2.
6. A switch statement is used to perform the appropriate calculation based on the operator.
7. The result is stored in the variable result.
8. The program then displays the expression and the calculated result.

For example, if you enter "5 + 10", the program will output "Result: 5.0 + 10.0 = 15.0".
 
Program 02
This program is written in Java and it calculates statistics for a group of students based on their names and scores. Here's a breakdown of how it works:

1. First, we have a string variable called studentData that contains the names and scores of the students. Each student's name and score are separated by a comma and a space.

2. We split the studentData string into an array called records using the split() method. This allows us to separate each student's record into individual elements in the array.

3. We create two arrays, names and scores, to store the names and scores of the students. The size of these arrays is determined by the number of records we have.

4. We loop through each record in the records array and split it further using the colon as a delimiter. This separates the name and score into separate elements.

5. We store the name in the names array and convert the score from a string to an integer using Integer.parseInt(), then store it in the scores array.

6. After populating the names and scores arrays, we calculate the statistics. We keep track of the total number of students, the total score, the highest score, the lowest score, and the names of the students who achieved these scores.

7. Finally, we calculate the average score by dividing the total score by the number of students.

8. We display the statistics by printing them to the console using System.out.println().
