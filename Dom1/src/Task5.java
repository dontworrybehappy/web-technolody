import java.util.Scanner;
public class Task5 {
	public static void main(String[] args){
		Scanner in=new Scanner (System.in);
		System.out.println("¬ведите первое число");
		short n1=in.nextShort();
		System.out.println("¬ведите первое число");
		short n2=in.nextShort();
		if(n1<n2){
			for (int i=n1;i<=n2;i++){
				System.out.println((char)i);
			}
		}
		else {
			for (int i=n2;i<=n1;i++){
				System.out.println((char)i);
			}
		}
	}

}
