import java.util.Arrays;
import java.util.Scanner;


public class Task7 {
	public static void main(String[] args){
		Scanner in=new Scanner (System.in);
		String [] array=new String [4];
		for (int i = 0; i < array.length; i++) {
			array [i]=in.next();
			}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
