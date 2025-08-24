
// 👉 What is an Armstrong number?
        // An Armstrong number is a number that is equal to the sum of 
        // its own digits each raised to the power of the number of digits.
        // Example: 153 = 1^3 + 5^3 + 3^3 = 153 → Armstrong number

        // 👉 Logic we used:
        // 1. Extract the last digit of the number using % 10
        // 2. Cube the digit and add it to the sum
        // 3. Remove the last digit by dividing the number by 10
        // 4. Repeat until number becomes 0
        // 5. Finally, compare sum with the original number


class CheckArmstrongNumber {
    public static void main(String[] args) {

        int sum = 0;
        int number = 153;
        int dupicateOfOriginal = number;
        System.out.println("original number:" + number);
        while (number > 0) {
            int lastdigit = number % 10;
            System.out.println("last digit is:" + lastdigit);
            sum = sum + (lastdigit * lastdigit * lastdigit);
            number = number / 10;

            if (number == 0) {
                System.out.println("katam ho gya bhiaya kaamm");
            } else {
                System.out.println("new number:" + number);
            }

        }
        System.out.println("sum of each digit cube is: " + sum);
        if (sum == dupicateOfOriginal) {
            System.out.println(sum + " is a Armstrong Number");
        } else {
            System.out.println(sum + " is NOT a Armstrong Number");
        }

    }
}