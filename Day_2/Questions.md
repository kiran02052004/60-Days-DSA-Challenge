# 📅 Day 2 - Math & Logic + Intermediate

Today’s focus: **Math Logical and Algorithams**.

---

## 🔹 Question 1: Greatest of Three Numbers

**Description:**  
Given three numbers, print the greatest one.

**Input :**

```bash
15 8 22
```

**Output:**

```bash
22
```

---

## 🔹 Question 2: Leap Year Check

**Description:**  
Check if a given year is a leap year.

**Input :**

```bash
2024
```

**Output:**

```bash
Leap Year
```

---

## 🔹 Question 3: Fibonacci Series up to N terms

**Description:**  
Print the Fibonacci sequence up to n terms.
**Input :**

```bash
6
```

**Output:**

```bash
0 1 1 2 3 5
```

---

## 🔹 Question 4: Nth Fibonacci number modulo M

**Description:**  
Given 2 non negative integers n and m, find the nth Fibonacci number modulo m.<br>

The nth Fibonacci number Fn = Fn-1 + Fn-2 (n > 1), where F0 = 0 and F1 = 1.<br>

The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …....

**Input Format:**

<pre>
First line of input will contain an integer T denoting the number of testcases.
Each of next T lines will contain two space separated integers denoting n and m respectively.</pre>

**Output Format:**

<pre>Print the value of (nth Fibonacci number) % m. </pre>

**Constraints**

<pre>
1 <= T <= 10
0 <= n <= 150
1 <= m <= (10^9)+7
</pre>

**Input and Outputs**

<pre>
Sample Input 1
2    // Testcases
4 8  // n m (testcase 1)
7 6  // n m (testcase 2)

Sample Output 1
3
1
</pre>
<pre>
Explation: 

F4 = 3, therefore 3 % 8 = 3
F7 = 13, therefore 13 % 6 = 1
</pre>

---

## 🔹 Question 5: Second Maximum in an Array

**Description:**  
Write a program to find the 2nd maximum element in an array.
<br>
Note: Print 0, if all the values are same.

**Input Format:**

<pre>
The first line of input contains an integer N, denoting the size of array.
The second line contains N space separated integers, denoting the array elements.</pre>

**Output Format:**

<pre>For each test case, print the 2ed maximum element in the array.</pre>

**Constraints**

<pre>
1 <= N <= 10^5
-1000 <= arr[i] <= 1000
</pre>

**Input and Outputs**

<pre>
Sample Input 1
5
30 210 100 40 70

Sample Output 1
100

</pre>
<pre>
Sample Input 2

5
40 -20 50 40 10
Sample Output 2

40
</pre>
