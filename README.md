# 🚀 Armstrong Number Checker in Java

This Java program checks whether a given number is an **Armstrong number** or not.

An **Armstrong number** (also known as a **narcissistic number**) is a number that is equal to the sum of its digits each raised to the power of the number of digits.

---

## 📌 What is an Armstrong Number?

An integer is called an Armstrong number if the sum of its digits raised to the power of the number of digits is equal to the number itself.

### Example:
- 153 is an Armstrong number because:  
  \( 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 \)
- 9474 is also an Armstrong number because:  
  \( 9^4 + 4^4 + 7^4 + 4^4 = 9474 \)

---

## 🧠 Program Logic

1. **Input the number** from the user.
2. **Count the number of digits** in the number.
3. **Extract each digit** and raise it to the power of the number of digits.
4. **Sum all the powered digits.**
5. Compare the result with the original number.
6. Print whether it is an Armstrong number or not.

---

## 🧾 Java Code

```java
package test_02_04_25;

import java.util.Scanner;

public class ArmStrongOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();     // User input
		int temp = num;            // Copy for counting digits
		int temp2 = num;           // Copy for calculation
		int count = 0;

		// Step 1: Count the number of digits
		while(temp > 0)
		{
			count++;
			temp /= 10;
		}

		int sum = 0;

		// Step 2: Calculate the sum of digits raised to 'count'
		while(temp2 > 0)
		{
			int ld = temp2 % 10;  // last digit
			int mul = 1;

			for(int i = 1; i <= count; i++)
			{
				mul *= ld;       // ld^count
			}

			sum += mul;
			temp2 /= 10;        // remove last digit
		}

		// Step 3: Check if the number is an Armstrong number
		if(num == sum)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not an ArmStrong Number");
	}
}
```
### ✅ Sample Output
```
Enter the Number
153
ArmStrong Number
```
```
Enter the Number
123
Not an ArmStrong Number
```

### 📚 How it Works
Let's take 9474 as an input:

Number of digits = 4

Digits: 9, 4, 7, 4

Sum = 9⁴ + 4⁴ + 7⁴ + 4⁴
= 6561 + 256 + 2401 + 256
= 9474 ✅

Hence, 9474 is an Armstrong number.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Number_ArmStrong_Or_Not.git
```
