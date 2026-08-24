# Prime Number Logic & Optimization (Java)

## 1. The Methods
There are generally three ways to solve whether `n` is prime, ranging from slow to fast.

### Method 1: The Brute Force
* **Loop:** 2 to `n-1`
* **Logic:** Check every single number. If any divide `n`, it's not prime.
* **Time Complexity:** $O(n)$ (Slow for large numbers).
* **Verdict:** Good for understanding logic, bad for performance.

### Method 2: The Halfway Split
* **Loop:** 2 to `n/2`
* **Logic:** Math tells us no number can be divided by anything larger than half of itself (except itself).
* **Time Complexity:** $O(n)$ (Still linear, just 2x faster).
* **Verdict:** Better, but not the best.

### Method 3: The Square Root Optimization
* **Loop:** 2 to $\sqrt{n}$
* **Logic:** This is the industry standard. You only loop until the square root of `n`.
* **Time Complexity:** $O(\sqrt{n})$ (Very fast).
* **Verdict:** **The Best Method.**

---

## 2. The Theory: Why $\sqrt{n}$?

### The "Partner Theory"
Think of factors as **pairs** dancing together. To make the number $n$, you need two numbers multiplied together: $a \times b = n$.

Let's look at the factors of **36** ($\sqrt{36} = 6$):

| Small Partner ($a$) | Big Partner ($b$) | Product ($n$) |
| :--- | :--- | :--- |
| 1 | 36 | 36 |
| 2 | 18 | 36 |
| 3 | 12 | 36 |
| 4 | 9 | 36 |
| **6** | **6** | **36 (The Middle / Root)** |
| 9 | 4 | *Repeat* |
| 12 | 3 | *Repeat* |

### The "Mirror" Effect
Notice what happens at **6** (the square root)? The numbers flip.
* **Before 6:** The left number is small, the right is big.
* **After 6:** The left number becomes the big one.

**The Logic:**
If a number like 36 has a "Big Partner" (like 18), it **must** have a "Small Partner" (like 2).
* You don't need to search all the way to 18 to find the factor.
* You will find its partner (2) much earlier!

### Visual Summary
Imagine checking if **100** is prime:
1.  **Method 1 ($n-1$):** Checks 2... to 99. (98 checks)
2.  **Method 2 ($n/2$):** Checks 2... to 50. (49 checks)
3.  **Method 3 ($\sqrt{n}$):** Checks 2... to **10**. (9 checks)

**Conclusion:** If you haven't found a factor by 10 ($\sqrt{100}$), you will never find one. Any factor bigger than 10 would need a partner smaller than 10, which you would have already caught.

---

## 3. Final Optimized Code

Use `i * i <= n` instead of `Math.sqrt(n)` for better performance.

```java
public static boolean isPrime(int n) {
    // 0 and 1 are not prime
    if (n <= 1) {
        return false;
    }

    // Check from 2 to sqrt(n)
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false; // Found a factor, not prime
        }
    }
    
    return true; // No factors found, it is prime
}

```

## 4. Deep Dive: The Logic of `i * i <= n`

You might wonder why we write `i * i <= n` instead of `i <= Math.sqrt(n)`. Here is the breakdown.

### 1. The Translation
The code `i * i <= n` is just algebra.
* **Math:** $i^2 \le n$
* **English:** "Keep looping as long as $i$ squared is less than or equal to $n$."

If you take the square root of both sides, it becomes:
$$i \le \sqrt{n}$$

So, mathematically, it is **identical** to calculating the square root.

### 2. Visual Walkthrough (Dry Run)
Let's trace the loop with **$n = 10$**. We know $\sqrt{10} \approx 3.16$.

1.  **Iteration 1 ($i = 2$):**
    * Check: Is $2 \times 2 \le 10$?
    * $4 \le 10$ is **True**.
    * *Action: Enter loop.*
2.  **Iteration 2 ($i = 3$):**
    * Check: Is $3 \times 3 \le 10$?
    * $9 \le 10$ is **True**.
    * *Action: Enter loop.*
3.  **Iteration 3 ($i = 4$):**
    * Check: Is $4 \times 4 \le 10$?
    * $16 \le 10$ is **False**.
    * *Action: Stop looping.*

**Result:** The loop stops exactly after 3. It didn't need to calculate `3.1622...` to know that 4 was too big.

### 3. Why is this better than `Math.sqrt()`?
1.  **Performance:** Computers can multiply integers (`i * i`) incredibly fast. Calculating a square root is a complex operation that takes more processing power.
2.  **Precision:** `Math.sqrt()` returns a decimal (double). Sometimes, due to tiny computer errors, `Math.sqrt(25)` might return `4.999999`, which could mess up your loop logic. Integers are always exact.
3.  **Simplicity:** You avoid mixing data types (Integers vs. Doubles).

## 5. Dry Run (Step-by-Step)

### Case 1: Checking n = 9 (Not Prime)
| i | Condition (i*i <= 9) | Divisibility Check (9 % i) | Result |
| :--- | :--- | :--- | :--- |
| 2 | True (4 <= 9) | False (Rem: 1) | Continue |
| 3 | True (9 <= 9) | **True (Rem: 0)** | **Return False** (Found factor) |

### Case 2: Checking n = 7 (Prime)
| i | Condition (i*i <= 7) | Divisibility Check (7 % i) | Result |
| :--- | :--- | :--- | :--- |
| 2 | True (4 <= 7) | False (Rem: 1) | Continue |
| 3 | **False (9 > 7)** | - | **Loop Ends** |
| - | - | - | **Return True** (No factors found) |
