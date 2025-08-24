/* 
 * This program also teaches how to extract digits from a number.
 *
 * 👉 To get the last digit of a number:
 *    Use modulus operator (%).
 *    Example: 123 % 10 = 3 → last digit is 3
 *
 * 👉 To remove the last digit:
 *    Divide the number by 10.
 *    Example: 123 / 10 = 12
 *
 * 👉 Repeating these two steps inside a loop
 *    will give us all the digits one by one 
 *    (from rightmost to leftmost).
 */

class ExtractionOfANumber {
    public static void main(String[]args){
        int number = 7789;
        System.out.println("original number:"+number);
        while(number>0){
            int lastdigit = number % 10;
            System.out.println("last digit is:"+lastdigit);
            number = number/10;
            // System.out.println("new number:"+number);
            if(number==0){
                System.out.println("katam ho gya bhiaya kaamm");
            }
            else{
                 System.out.println("new number:"+number);
            }
        }
    }
}