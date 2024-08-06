
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name:");
       String s=sc.nextLine();
       for (int i=0;i<s.length();i++){
            char a=s.charAt(i);
            System.out.print("ASCII value for "+a+" is ");
            int b=(int)a;
            System.out.print(b+"\n");


        }


    }


}
