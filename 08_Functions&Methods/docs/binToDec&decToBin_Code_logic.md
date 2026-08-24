## 1. Binary to Decimal Conversion

### The Concept
Binary is a base-2 number system, meaning it only uses the digits `0` and `1`. Each position in a binary number represents a power of 2, starting from $2^0$ on the far right and increasing as you move left. 

To convert binary `1010` to decimal:
1. Multiply each digit by its corresponding power of 2.
2. Sum the results.

$1010 = (1 \times 2^3) + (0 \times 2^2) + (1 \times 2^1) + (0 \times 2^0)$
$1010 = (1 \times 8) + (0 \times 4) + (1 \times 2) + (0 \times 1)$
$1010 = 8 + 0 + 2 + 0 = 10$

### How the Code Works
The `binaryToDecimal` method processes the integer `1010` exactly like the mathematical formula, peeling off one digit at a time from right to left.

* `binNum % 10` extracts the rightmost digit.
* `binNum / 10` removes that rightmost digit for the next cycle.
* `Math.pow(2, pow)` calculates the positional weight ($2^0, 2^1, 2^2$, etc.).

**Execution Trace for `binaryToDecimal(1010)`:**

| Iteration | `binNum` (Start) | `lastDigit` (`binNum % 10`) | `decNum` Calculation (`lastDigit * 2^pow`) | `decNum` (End) | `pow` | `binNum` (End) |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **1** | 1010 | 0 | 0 + $(0 \times 2^0)$ | 0 | 1 | 101 |
| **2** | 101 | 1 | 0 + $(1 \times 2^1)$ | 2 | 2 | 10 |
| **3** | 10 | 0 | 2 + $(0 \times 2^2)$ | 2 | 3 | 1 |
| **4** | 1 | 1 | 2 + $(1 \times 2^3)$ | 10 | 4 | 0 |

The loop ends because `binNum` is now `0`. The final `decNum` is **10**.

---

## 2. Decimal to Binary Conversion

### The Concept
Decimal is a base-10 system. To convert a decimal number to binary, you repeatedly divide the number by 2 and record the remainders. The binary number is formed by reading the remainders from bottom to top (last remainder to first).



For the decimal number `10`:
1. $10 \div 2 = 5$, Remainder **0**
2. $5 \div 2 = 2$, Remainder **1**
3. $2 \div 2 = 1$, Remainder **0**
4. $1 \div 2 = 0$, Remainder **1**

Reading the remainders backwards gives **1010**.

### How the Code Works
The `decimalToBinary` method mirrors this repeated division process. 

* `decNum % 2` captures the remainder (which will always be a binary 0 or 1).
* `decNum / 2` prepares the number for the next division.
* The trickiest part is `binNum = binNum + (rem * (int)Math.pow(10, pow))`. Because you are storing the binary result inside a standard base-10 integer variable, you multiply the remainder by powers of 10 ($10^0, 10^1, 10^2$) to push the 0s and 1s into the correct visual positions (units, tens, hundreds).

**Execution Trace for `decimalToBinary(10)`:**

| Iteration | `decNum` (Start) | `rem` (`decNum % 2`) | `binNum` Calculation (`rem * 10^pow`) | `binNum` (End) | `pow` | `decNum` (End) |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **1** | 10 | 0 | 0 + $(0 \times 10^0)$ | 0 | 1 | 5 |
| **2** | 5 | 1 | 0 + $(1 \times 10^1)$ | 10 | 2 | 2 |
| **3** | 2 | 0 | 10 + $(0 \times 10^2)$ | 10 | 3 | 1 |
| **4** | 1 | 1 | 10 + $(1 \times 10^3)$ | 1010 | 4 | 0 |

The loop ends because `decNum` is now `0`. The final `binNum` is **1010**.
