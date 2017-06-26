import java.util.Scanner;
public class W2 {
	public static void main(String[] args){
		Scanner in=new Scanner (System.in);
		int[ ][ ] x = new int[ 5 ][ 5 ];
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
			x[i][j]=((int)(Math.random()*101));
			System.out.print(x[i][j]+" "); 
			}
			System.out.println();
	}
		System.out.println("¬ведите число от 0 до 100");
		int n=in.nextInt();
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
			if (x[i][j]==n){
				System.out.println(i+" "+j);
			}	
			}
			} 
		
	}
}
