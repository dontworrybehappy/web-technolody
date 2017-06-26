
public class Task4 {
	public static void main(String[] args){
		int max=-100;
		int[ ][ ] x = new int[ 5 ][ 8 ];
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
			x[i][j]=((int)(Math.random()*199)-99);
			 if(max<x[i][j]){
				 max=x[i][j];
			 }
			System.out.print(x[i][j]+" "); 
			}
			System.out.println();
	}
		System.out.println(max);
	}
}
