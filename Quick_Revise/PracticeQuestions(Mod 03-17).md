# Practice Questions — Sigma Batch (Modules 03–17)

Tick a box only after you recode it (or re-predict the output) without looking.

---

## 03 — Variables and Data Types

- [ ] Print `Hey Shree!` using `print`, `println`, and `\n`
- [ ] Print this pattern using `println` only:
  ```
  ****
  ***
  **
  *
  ```
- [ ] Store two integers `a = 5`, `b = 10` and print their sum
- [ ] Take two integers as input and print their sum
- [ ] Take two integers as input and print their product
- [ ] Take radius as input and print area of a circle (`area = 3.14 * r * r`)
- [ ] Cast `float marks = 99.999f` to `int` and print the result
- [ ] Print ASCII value of `'a'` by storing it in an `int`
- [ ] Predict / print `b - a` for `char a = 'a'`, `char b = 'b'`
- [ ] Compute `byte bt = (byte)(short + byte + char)` and print it
- [ ] Compute `int + float + long + double` and print (type of result?)
- [ ] Fix and compute `byte a2 = (byte)(b2 * 2)` for `byte b2 = 5`
- [ ] **Q1.** Input 3 integers A, B, C. Print their average
- [ ] **Q2.** Input side of a square. Print its area
- [ ] **Q3.** Input prices of pencil, pen, eraser. Print total bill with 18% GST
- [ ] **Q4.** What is the type of `(f * b) + (i % c) - (d * s)` given `byte b`, `char c`, `short s`, `int i`, `float f`, `double d`?
- [ ] **Q5.** Will `int $ = 16;` compile? What does it print?

---

## 04 — Operators

- [ ] Print sum, difference, product, quotient, remainder of `A = 10`, `B = 5`
- [ ] Predict `x` and `y` for `int x = 10; int y = ++x;`
- [ ] Predict `a` and `b` for `int a = 10; int b = a++;`
- [ ] Print results of `== != > < >= <=` for `A = 15`, `B = 20`
- [ ] Print `&&`, `||`, `!` results for `(a < b)` and `(a == b)` with `a = 10`, `b = 20`
- [ ] Apply `+= -= *= /=` and print after each (A=10+=10, B=20-=5, C=5*=4, D=20/=4)
- [ ] **Q1.** For `x = 2`, `y = 5`, print `exp1 = (x * y / x)` and `exp2 = (x * (y / x))`
- [ ] **Q2.** For `x = 200`, `y = 50`, `z = 100`, which of these print? `"Hello"` / `"Java"` / `"Hello Java"`
- [ ] **Q3.** `x = y = z = 2`, then `x += y;` `y -= z;` `z /= (x + y);` Print `x y z`
- [ ] **Q4.** Evaluate: `4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y)` for `x=9, y=12, a=2, b=4, c=6`
- [ ] **Q5.** For `x = 10`, `y = 5`, print `exp1 = (y * (x / y + x / y))` and `exp2 = (y * x / y + y * x / y)`

---

## 05 — Conditional Statements

- [ ] If `age = 16`, print whether adult / teenager / not adult
- [ ] Input two numbers. Print which is greater (or equal)
- [ ] Input a number. Print Odd or Even
- [ ] Income tax: income `< 5L` → 0%, `5L–10L` → 20%, `> 10L` → 30%. Print tax
- [ ] Input 3 numbers. Print the largest
- [ ] Input a number. Print Even/Odd using ternary
- [ ] Input marks. Print PASS if `>= 33` else FAIL (ternary)
- [ ] Calculator: input `a`, `b`, and operator `+ - * / %`. Print result using `switch`
- [ ] **Q1.** Input an integer. Print POSITIVE or NEGATIVE
- [ ] **Q2.** If `temp = 103.5`, print whether the person has a fever (`temp > 100`)
- [ ] **Q3.** Input week number (1–7). Print the weekday. Invalid otherwise
- [ ] **Q4.** For `a = 63`, `b = 36`: `x = (a < b) ? true : false` and `y = (a > b) ? a : b`. Print `x` and `y`
- [ ] **Q5.** Input a year. Print whether it is a leap year

---

## 06 — Loops (Flow Control)

- [ ] Print `"Hello Shree!"` 100 times using `while`
- [ ] Print numbers from 1 to 10 using `while`
- [ ] Input `n`. Print numbers from 1 to n
- [ ] Input `n`. Print sum of first n natural numbers
- [ ] Print `"Hello World!"` 10 times using `for`
- [ ] Print a 4×4 square of `* * * *`
- [ ] Print reverse of a number (print digits only). Example: `5102005` → `5002015`
- [ ] Reverse a number and store it. Example: `10899` → `99801`
- [ ] Print `"Hello World!"` 100 times using `do-while`
- [ ] Print 1 to 5 but `break` when `i == 3`
- [ ] Keep taking numbers until the user enters a multiple of 10 (`break`)
- [ ] Print even numbers from 1 to 10 using `continue`
- [ ] Keep taking numbers; skip (do not print) multiples of 10 (`continue`)
- [ ] Input `n`. Check if it is prime
- [ ] **Q1.** How many times is `"Hello"` printed?
  ```java
  for(int i=0; i<5; i++) {
      System.out.println("Hello");
      i+=2;
  }
  ```
- [ ] **Q2.** Keep taking numbers until user chooses to stop. Print sum of even numbers and sum of odd numbers
- [ ] **Q3.** Input `n`. Print factorial of n
- [ ] **Q4.** Input `n`. Print its multiplication table
- [ ] **Q5.** Does this compile? If not, why? Fix it.
  ```java
  for(int i = 0; i <= 5; i++) {
      System.out.println("i = " + i);
  }
  System.out.println("i after the loop = " + i);
  ```

---

## 07 — Patterns

Print each pattern (nested loops).

- [ ] Star triangle
  ```
  *
  **
  ***
  ****
  ```
- [ ] Inverted star triangle
  ```
  ****
  ***
  **
  *
  ```
- [ ] Half pyramid of numbers
  ```
  1
  12
  123
  1234
  ```
- [ ] Character pattern
  ```
  A
  BC
  DEF
  GHIJ
  ```
- [ ] Hollow rectangle (`totRows`, `totCols`)
- [ ] Inverted & rotated half pyramid
  ```
     *
    **
   ***
  ****
  ```
- [ ] Inverted half pyramid with numbers
  ```
  12345
  1234
  123
  12
  1
  ```
- [ ] Floyd’s triangle
  ```
  1
  2 3
  4 5 6
  7 8 9 10
  ```
- [ ] 0-1 triangle
  ```
  1
  0 1
  1 0 1
  0 1 0 1
  ```
- [ ] Butterfly pattern
- [ ] Solid rhombus
- [ ] Hollow rhombus
- [ ] Diamond
- [ ] Number pyramid
  ```
      1
     2 2
    3 3 3
   4 4 4 4
  ```
- [ ] Palindromic number pattern
  ```
      1
     212
    32123
   4321234
  ```

---

## 08 — Functions & Methods

- [ ] Write a method `calculateSum(int a, int b)` that prints the sum
- [ ] Write `swap(int a, int b)`. Call it from `main`. Do original `a` and `b` change?
- [ ] Write `productOfa_b(int a, int b)` and return the product
- [ ] Write `factorial(int n)` and return `n!`
- [ ] Write `binomialCoefficient(int n, int r)` = `n! / (r! * (n-r)!)`
- [ ] Overload `add`: two ints, three ints, two doubles
- [ ] Write `isPrime(n)` (check up to `n-1`). Handle `n = 1`
- [ ] Write optimized `isPrime(n)` (check up to `√n`)
- [ ] Print all primes in range `[2, n]`
- [ ] Convert binary number to decimal. Example: `1010` → `10`
- [ ] Convert decimal number to binary. Example: `10` → `1010`
- [ ] **Q1.** Write a method that returns the average of 3 numbers
- [ ] **Q2.** Write a method `isEven(int n)` that returns true if n is even
- [ ] **Q3.** Write a method that returns true if a number is a palindrome
- [ ] **Q4.** Use `Math.min`, `Math.max`, `Math.sqrt`, `Math.pow`, `Math.abs`. Is there a `Math.avg()`?
- [ ] **Q5.** Write a method that returns the sum of digits of a number

---

## 09 — Arrays

- [ ] Create an array, take input, print it
- [ ] Pass an array and an `int` to a method that tries to change both. What changes in `main`?
- [ ] Linear search in an integer array. Example: `{2,4,6,8,10,12,14,16}`, key `10`
- [ ] Linear search in a String array. Example: menu `{"dosa","chole bhature","samosa","vada pav","momos"}`, key `"vada pav"`
- [ ] Find largest element in `{0, 2, 6, 3, 5}`
- [ ] Find smallest element in `{0, 2, 6, 3, 5}`
- [ ] Binary search. Example: `{2,4,6,8,10,12,14}`, key `10`
- [ ] Reverse an array in-place. Example: `{2,4,6,8,10}`
- [ ] Print all pairs in `{2,4,6,8,10}` and print total pairs
- [ ] Print all subarrays of `{2,4,6,8,10}`, their sums, total subarrays, max sum, min sum
- [ ] Max subarray sum — brute force. Example: `{1, -2, 6, -1, 3}`
- [ ] Max subarray sum — prefix sum. Same array
- [ ] Max subarray sum — Kadane. Example: `{-2,-3,4,-1,-2,1,5,-3}`
- [ ] Kadane on all-negative array `{-1,-2,-3,-4}`
- [ ] Trapping rainwater. Height = `{4, 2, 0, 6, 3, 2, 5}`
- [ ] Best time to buy and sell stock (one transaction). Prices = `{2, 4, 1}`
- [ ] **Q1.** Given `nums`, return true if any value appears at least twice. Example: `{1,2,3,1}` → true
- [ ] **Q2.** Search target in a rotated sorted array. Example: `{3,4,5,6,7,0,1,2}`, target `0`
- [ ] **Q3.** Best time to buy and sell stock — assignment version (LeetCode 121)
- [ ] **Q4.** Trapping rain water — assignment version (LeetCode 42)
- [ ] **Q5.** 3 Sum: return all unique triplets that add to 0 (LeetCode 15)

---

## 10 — Basic Sorting Algorithms

Use `{5, 4, 1, 3, 2}` unless stated otherwise.

- [ ] Bubble sort (ascending), with swap-flag optimization
- [ ] Selection sort (ascending)
- [ ] Insertion sort (ascending)
- [ ] Inbuilt sort: `Arrays.sort(arr)`
- [ ] Inbuilt sort a subarray: `Arrays.sort(arr, 0, 3)`
- [ ] Inbuilt reverse sort: `Arrays.sort(arr1, Collections.reverseOrder())`
- [ ] Counting sort (ascending). Example: `{1, 4, 1, 3, 2, 4, 3, 7}`
- [ ] **Assignment.** Sort `{3, 6, 2, 1, 8, 7, 4, 5, 3, 1}` in **descending** order using:
  - [ ] Bubble sort
  - [ ] Selection sort
  - [ ] Insertion sort
  - [ ] Counting sort

---

## 11 — 2D Arrays

- [ ] Create a 3×3 matrix, take input, print it
- [ ] Search a key in a 2D matrix. Print cell `(i,j)` if found
- [ ] Spiral print:
  ```
  1  2  3  4
  5  6  7  8
  9  10 11 12
  13 14 15 16
  ```
- [ ] Diagonal sum of
  ```
  1 2 3
  4 5 6
  7 8 9
  ```
  (do not double-count the center)
- [ ] Staircase search in a row-and-column sorted matrix. Key = `33`
  ```
  10 20 30 40
  15 25 35 45
  27 29 37 48
  32 33 39 50
  ```
- [ ] **Q1.** Count how many times key `8` appears in `{{4,7,8},{8,8,7}}`
- [ ] **Q2.** Print sum of row 1 (2nd row) of `{{1,4,9},{11,4,3},{2,2,3}}`
- [ ] **Q3.** Transpose
  ```
  1 2 3        1 4 7
  4 5 6   →    2 5 8
  7 8 9        3 6 9
  ```

---

## 12 — Strings

- [ ] Print every character of a string using `charAt`
- [ ] Check if a string is a palindrome. Examples: `"racecar"`, `"noon"`, `"madam"`
- [ ] Shortest path from origin given directions. Example: `"WNEENESENNN"`
- [ ] Compare using `==` vs `.equals()`:
  - `String s1 = "Shree"; String s2 = "Shree"; String s3 = new String("Shree");`
- [ ] Print substring of `"HelloWorld!"` from 0 to 4 (manual loop and `substring`)
- [ ] Find the largest string lexicographically in `{"apple","mango","banana"}`
- [ ] Append `'a'` to `'z'` using `StringBuilder` and print
- [ ] Convert first letter of each word to uppercase. Example: `"hi, i am shree "`
- [ ] Compress a string. Example: `"aaabbcccdd"` → `"a3b2c3d2"`
- [ ] **Q1.** Input a string. Count lowercase vowels (`a e i o u`)
- [ ] **Q2.** What is the output?
  ```java
  String str = "ShradhaDidi";
  String str1 = "ApnaCollege";
  String str2 = "ShradhaDidi";
  System.out.println(str.equals(str1) + " " + str.equals(str2));
  ```
- [ ] **Q3.** What is the output?
  ```java
  String str = "ApnaCollege".replace("l", "");
  System.out.println(str);
  ```
- [ ] **Q4.** Are `"earth"` and `"heart"` anagrams?
- [ ] **Q5.** Explain `String.intern()` and `StringBuffer` (vs `String` / `StringBuilder`)

---

## 13 — Bit Manipulation

- [ ] Print `5 & 6`, `5 | 6`, `5 ^ 6`, `~5`, `5 << 2`, `6 >> 1`
- [ ] Check if a number is odd or even using bits. Test `3`, `11`, `14`
- [ ] Get i-th bit. Example: n = `10`, i = `2`
- [ ] Set i-th bit. Example: n = `10`, i = `2`
- [ ] Clear i-th bit. Example: n = `10`, i = `1`
- [ ] Update i-th bit to `newBit`. Example: n = `10`, i = `2`, newBit = `1`
- [ ] Clear last i bits. Example: n = `15`, i = `2`
- [ ] Clear bits in range i to j. Example: n = `10`, i = `2`, j = `4`
- [ ] Check if a number is a power of 2. Example: `8`
- [ ] Count set bits. Example: `15`
- [ ] Fast exponentiation: compute `a^n`. Example: `5^3`
- [ ] Modular exponentiation: compute `(a^n) % mod`
- [ ] **Q1.** What is the value of `x ^ x`?
- [ ] **Q2.** Swap two numbers using XOR (no temp). Example: `x = 3`, `y = 4`
- [ ] **Q3.** Add 1 without `+`. Print `-~x` for `x = 6`, `-4`, `0`
- [ ] **Q4.** Convert `'A'`–`'Z'` to lowercase using `ch | ' '`
- [ ] **Q5.** Read bit-hack techniques (Stanford bithacks). Implement at least: isolate lowest set bit `n & -n`

---

## 14 — OOPs

### Code
- [ ] Create a `Pen` class (`color`, `tip`, setters). Create object `p1` and use it
- [ ] `BankAccount`: public `username`, private `password`, setter for password
- [ ] Getters and setters for `Pen` with `this`
- [ ] `Student` constructors: non-parameterized, parameterized, copy constructor
- [ ] Deep copy vs shallow copy of `int marks[]` in `Student`
- [ ] Inheritance: `Animal` → `Mammal`, `Fish`, `Bird` (or `Dog` / `Fish` / hierarchy you wrote)
- [ ] Method overloading in `Calculator` (`sum` of 2 ints vs 2 floats vs 3 ints)
- [ ] Method overriding: `Animal.eat` vs `Deer.eat`. Call via `Animal a = new Deer()`
- [ ] Abstract class `Animal` with `walk()`. Implement `Horse`, `Chicken`. Constructor chain `Mustang → Horse → Animal`
- [ ] Interface `ChessPlayer` with `moves()`. Implement `Queen`, `Rook`, `King`
- [ ] `super` keyword: call parent constructor / parent method
- [ ] **Q1.** Class `Complex`: add, subtract, multiply two complex numbers and display them

### Assignment MCQs (from your comments / notes)
- [ ] **Q2.** Output / correct option — electric car (you marked **B. Driving electric car**)
- [ ] **Q3.** Which access modifiers can be used — you marked **B. public and protected both**
- [ ] **Q4.** Predict output — you marked **C. 13245**
- [ ] **Q5.** Exception handling: `try` / `catch` / `finally` (W3Schools Java try-catch)

### PracticeQuestions.md MCQs
- [ ] How to set student name — you marked **C. `s.name = "aman"`**
- [ ] Which members are accessible — you marked **a. name & b. weight**
- [ ] Which modifiers — you marked **a. private & b. protected**
- [ ] Correct statements about the given code — **a, b & c**
- [ ] Print order of constructors — **Derived (Car) then Base (Vehicle)** wait: you wrote Derived/Car then Base/Vehicle
- [ ] Predict compile result — **Error**
- [ ] Has-a relationship type — **d. Aggregation**
- [ ] Predict output — **b. 0 2**
- [ ] Is there an error? — **No Error**
- [ ] Predict output — **40**

### Theory from your notes (answer in one line each)
- [ ] What is a class?
- [ ] What is an object?
- [ ] What is encapsulation?
- [ ] What is inheritance?
- [ ] What is polymorphism?
- [ ] What is abstraction?

---

## 15 — Recursion Basics

- [ ] **P1.** Print numbers from n to 1 (decreasing)
- [ ] **P2.** Print numbers from 1 to n (increasing)
- [ ] **P3.** Print factorial of n
- [ ] **P4.** Print sum of first n natural numbers
- [ ] **P5.** Print the n-th Fibonacci number
- [ ] **P6.** Check if an array is sorted. Example: `{1,2,3,4}`
- [ ] **P7.** First occurrence of a key in an array. Example: `{8,3,6,9,10,6,2,5,3}`, key `5`
- [ ] **P8.** Last occurrence of a key. Example: `{5,8,3,6,9,10,5,6,2,3}`, key `5`
- [ ] **P9.** Compute `x^n` (O(n))
- [ ] **P9b.** Compute `x^n` in O(log n). Example: `2^10`
- [ ] **P10.** Tiling problem: number of ways to tile a `2 × n` floor with `2 × 1` tiles. Example: n = 5
- [ ] **P11.** Remove duplicates from a string. Example: `"appnnacollege"`
- [ ] **P12.** Friends pairing problem. Example: n = 4
- [ ] **P13.** Print all binary strings of length n with no consecutive 1s. Example: n = 3
- [ ] **Q1.** Print all indices where key occurs. Array `{3,2,4,5,6,2,7,2,2}`, key `2`
- [ ] **Q2.** Convert number to English digits. Example: `2019` → `two zero one nine`
- [ ] **Q3.** Length of a string using recursion. Example: `"abcde"`
- [ ] **Q4.** Count contiguous substrings that start and end with the same character
- [ ] **Q5.** Tower of Hanoi — print moves for n disks

---

## 16 — Divide & Conquer

- [ ] Merge sort `{6, 3, 9, 5, 2, 8}`
- [ ] Quick sort `{6, 3, 9, 5, 2, 8}` (pivot = last element)
- [ ] Search in rotated sorted array (recursive). `{4,5,6,7,0,1,2}`, target `0`
- [ ] **Assignment Q1.** Merge-sort an array of strings (all lowercase)
- [ ] **Assignment Q2.** Majority element (appears more than n/2 times)
- [ ] **Assignment Q3.** Count inversions in an array (modify merge sort)

---

## 17 — Time & Space Complexity

Give Big-O (time, and space where asked).

- [ ] Simple loop `for i = 0..n-1` with O(1) work inside
- [ ] Nested: `i = 0..n-1`, `j = i+1..n-1`
- [ ] Nested: `i = 0..n-1`, `j = 0..i-1`
- [ ] Nested: `i` jumps by `k`, inner loop length `k` (`k < n`)
- [ ] Bubble sort
- [ ] Optimized bubble sort — best case and worst case
- [ ] Binary search
- [ ] Recursive factorial
- [ ] Recursive sum of n
- [ ] Recursive Fibonacci
- [ ] Merge sort (time and space)
- [ ] `power(a, n)` = `a * power(a, n-1)`
- [ ] `power2`: two recursive calls `power2(a, n/2) * power2(a, n/2)`
- [ ] `power3`: one recursive call, then square the half
- [ ] **Assignment (a)** — your answer: O(n log n)
- [ ] **Assignment (b)** — your answer: O(log_k n)
- [ ] **Assignment (c)** — your answer: False
- [ ] **Assignment (d)** — your answer: Time O(√n), Space O(1)
- [ ] **Assignment (e)** — your answer: Time O(n²), Space O(1)

(Open the module PDF and re-derive a–e; answers above are from your `PracticeSolutions.java` comments.)

---

## 18 — Backtracking (started)

- [ ] Change array: set `arr[i] = val`, recurse, then `arr[i] -= 2`. Array size 5, start val = 1
- [ ] Print all subsets of `"abc"` (include empty / `"null"`)

---

## Extra questions in your `Quick_Revise` notes (not in a lecture folder)

- [ ] GCD of two numbers
- [ ] Count digits of a number
- [ ] Armstrong number check
