import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
                System.out.println("1 to 4, how many hours you worked");
                int hours=num.nextInt();
                switch(hours){
                     case 1:
		     System.out.println("you earned" + 1000);
                     break;
                     case 2:
		     System.out.println("you earned" + 2000);
                     break;
                     case 3:
		     System.out.println("you earned" + 3000);
                     break;
                     case 4:
		     System.out.println("you earned" + 4000);
                     break;
                }
         }
}