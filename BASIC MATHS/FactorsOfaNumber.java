import java.util.Scanner;


class FactorsOfaNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number u want to find the factors:");
        
        int number = sc.nextInt();
       
        
        System.out.println("original number:"+number);
       
        for(int i =1;i<=number;i++){
           if(number % i==0){
               System.out.println(i);
           }
        }
    }
}