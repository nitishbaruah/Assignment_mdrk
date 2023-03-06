> # Assignment_mdrk
## Perfect Number
A perfect number is a positive integer that is equal to the sum of its proper divisors
(excluding itself). Write a program that checks whether the input integer is perfect or not.
It should return true if the number is perfect. Otherwise it should return false. <br>
Sample Input 1: 8 <br>
Output: false <br>
Sample Input 2: 28 <br>
Output: true <br>

## Shortest Manhattan distance
The below image represents a grid having 11x11 nodes numbered from 0 to 10.  <br>
● Distance between one node to the next connected node is 1 unit. <br>
● One can go in any direction, each letter counts as 1 unit in each direction. <br>
● N North  <br>
● S South  <br>
● E East  <br>
● W West  <br>
The below graph shows the path of “NNNNEEENE” starting from (0,0) <br>
<img width="500" alt="Screenshot 2023-03-06 213619" src="https://user-images.githubusercontent.com/40658745/223165516-ee695c8f-876d-43b4-94ec-3904231e01b9.png">


Write a program to take <br>
● a start point as an array containing two elements as x and y coordinate, and <br>
● a string as input <br>
from the user and print the shortest distance between the start and end point. <br>
Sample Input 1 : [0, 0] <br>
NNNNEEENE <br>
Output <br>
6.4 [Hint : √((4-0)² + (5-0)²) = 6.4] <br>

## Swap MinMax <br>
You are given two lists a and b of n positive integers each. You can apply the following
swap operations to them any number of times. <br>
Select an index i (1 <= i <= n) and swap aᵢ with bᵢ (i.e. aᵢ becomes bᵢ and vice versa). <br>
Write a function minmax(a,b) which takes two lists a and b of size n as inputs and
returns an integer, which is the minimum possible value of max(a₁, a₂, …, a ) x max(b₁,
b₂, …, b ) you can get after applying the swap operation any number of times (possibly
zero). <br>
Example - Consider that the list starts with index 0 <br>
Consider the lists : a = [1, 2, 6, 5, 1, 2] and 
b = [3, 4, 3, 2, 2, 5] <br>
In this case, you can apply the swap operation at indices 1 (between 2 and 4) and
5 (between 2 and 5), <br>
then a = [1, 4, 6, 5, 1, 5] and b = [3, 2, 3, 2, 2, 2] <br>
and max(1, 4, 6, 5, 1, 5) x max (3, 2, 3, 2, 2, 2) = 6 x 3 = 18 <br>
Sample Input 1 <br>
[1, 2, 6, 5, 1, 2] <br>
[3, 4, 3, 2, 2, 5] <br>
Output <br>
18 <br>

## CombinationSort

Write a program that takes a list of unique strings as an argument, where each string is
a combination of a letter from a - z and a number from 0 - 99 , the initial character in
string being the letter. For example a23, d5, z0, q99 are some strings in this format. The
program should sort the list and return the lists L1 and L2 in the order mentioned below.  <br>
L1 : First list should contain all strings sorted in ascending order with respect to the first
character only. All the strings with the same initial character should be in the same order
as in the original list.  <br>
L2 : In the list L1 above, sort the strings starting with the same character, in descending
order with respect to the number formed by the remaining characters.  <br>
Sample Input 1  <br>
d34, g54, d12, b87, g1, c65, g40, g5, d77  <br>
Output  <br>
L1 : b87, c65, d34, d12, d77, g54, g1, g40, g5  <br>
L2 : b87, c65, d77, d34, d12, g54, g40, g5, g1   <br>



