import java.util.Scanner;
class Reverse {
  public static void main(String[] args) {
     
     Scanner input=new Scanner(System.in);
    int num, reversed = 0;
    num=input.nextInt();
    
    System.out.println("Original Number: " + num);

    
    while(num != 0) {
    
      
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}