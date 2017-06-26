import java.util.Scanner;


public class Task2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        System.out.print("ax^2+bx+c=0 ");
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();
        double d=b*b-4*a*c;
        if (d>=0){
        	double x1=(-b+Math.sqrt(d))/2*a;
			double x2=(-b-Math.sqrt(d))/2*a;
			System.out.println(x1+" "+x2);
		        }
        else{
        	System.out.print("Корней нет");
        }
	}
}
