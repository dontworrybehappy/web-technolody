
public class Task3 {
	public static void main(String[] args){
		int[ ][ ] x = new int[ 8 ][ 5 ];
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
			x[i][j]=((int)(Math.random()*90)+10);
			System.out.print(x[i][j]+" "); 
			}
			System.out.println();
	}
	}
}
