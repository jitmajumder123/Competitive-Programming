class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        // Start from the last digit and add one
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add one and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, it becomes 0 and we carry over 1
            digits[i] = 0;
        }
        
        // If we exit the loop, it means we had a carry from the most significant digit
        // We need to create a new array with an extra digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // Set the first digit to 1
        return newNumber; // The rest will be 0s by default
    }
}