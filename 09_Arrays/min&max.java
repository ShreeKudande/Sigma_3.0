// Integer.MIN_VALUE = -2147483648 (most negative int possible)
// Integer.MAX_VALUE =  2147483647 (most positive int possible)
// Used as safe starting points when finding min/max in an array.

// WHY NOT just use arr[0] as the starting point?
// It works, but Integer.MIN_VALUE / MAX_VALUE is safer because:
// 1. You might not always have access to arr[0] upfront (e.g., streams, unknown input)
// 2. It avoids index-out-of-bounds if array is empty
// 3. It's a universal pattern — works even without seeing any element first

int max = Integer.MIN_VALUE; // any real number will be greater than this
int min = Integer.MAX_VALUE; // any real number will be smaller than this

for (int num : arr) {
    if (num > max) max = num;
    if (num < min) min = num;
}
