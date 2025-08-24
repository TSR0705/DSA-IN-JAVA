/* 
 * A palindrome is a number that remains the same even after reversing it. 
 * For example: 1221 → reversed is also 1221. 
 *
 * Important point to notice in this problem: 
 * If we want to compare with the original number, 
 * we must create a duplicate copy of it first, 
 * because the while loop will modify the original number. 
 */


class CheckPalindrome {
    public static void main(String[]args){
        int reversenumber = 0;
        int number = 7789;
        int dupicateOfOriginal = number;
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
            reversenumber = (reversenumber*10)+lastdigit;
            System.out.println("reverse of the original number:"+reversenumber);
            
            if(reversenumber== dupicateOfOriginal){
                System.out.println("yes it is a palindrome");
            }
            else{
                System.out.println("no, it is not a palindrome");
            }
        }
    }
}