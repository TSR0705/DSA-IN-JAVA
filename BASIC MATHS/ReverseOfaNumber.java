class ReverseOfaNumber {
    public static void main(String[]args){
        int reversenumber = 0;
        int number = 7789;
        System.out.println("original number:"+number);
        while(number>0){
            int lastdigit = number % 10;
            System.out.println("last digit is:"+lastdigit);
            number = number/10;
            // System.out.println("new number:"+number);
            if(number==0){
                System.out.println("---------------------------");
            }
            else{
                 System.out.println("new number:"+number);
            }
            reversenumber = (reversenumber*10)+lastdigit;
            System.out.println("reverse of the original number:"+reversenumber);
        }
    }
}