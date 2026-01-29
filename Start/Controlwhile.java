import java.util.*;
public class Controlwhile{
	public static void main(String[] args){
		double finalscore;
		Scanner marks=new Scanner(System.in);
		boolean result=true;
		while(result){
			System.out.println("enter maths marks:");
			int maths=marks.nextInt();
			System.out.println("enter phy marks:");
			int phy=marks.nextInt();
			System.out.println("enter chem marks:");
			int chem=marks.nextInt();
			finalscore=(maths+phy+chem)/3;
			if(finalscore>90){
				System.out.println("Excellent");
			}
			else if(finalscore>50 && finalscore<90){
				System.out.println("Good");
			}
			else{
				System.out.println("To improve");
			
			}
                        System.out.println("do you want to continue,true/false");
			result=marks.nextBoolean();
		}
	}
}
				