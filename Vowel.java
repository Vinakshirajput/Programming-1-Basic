import java.util.Scanner;
class Vowel {
    public static void main(String[] args) {
        System.out.println("check a vowel or not ");
        Scanner obj = new Scanner(System.in);
         char c = obj.next().charAt(0);
       // char c = obj.nextChar();
        if(c=='a'||c == 'e'||c=='i'||c=='o'||c=='u'){
            System.out.println("it is a vowel");
        }
       else{
              System.out.println("it is not a vowel");
       } 
    
    }
    
}
