import java.util.Scanner;
public class Task6 {
	public static void main(String [] args){
		Scanner in=new Scanner (System.in);
		System.out.println("¬ведите число");
		int n=in.nextInt();
		String str=new String ();
		char buf;
		while(n>0){
			int m=n%16;
			switch (m){
			case 10:
				buf=(char)(65);
				break;
			case 11:
				buf=(char)(66);
				break;
			case 12:
				buf=(char)(67);
				break;
			case 13:
				buf=(char)(68);
				break;
			case 14:
				buf=(char)(69);
				break;
			case 15:
				buf=(char)(70);
				break;
			default:
				buf=(char)(m+48);
			}
			str=buf+str;
			n=n/16;
			}
		System.out.println("„исло в 16-ой системе: "+str);
		
	}

}
