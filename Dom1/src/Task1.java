import java.util.Scanner;
public class Task1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
       float x = in.nextFloat();
        System.out.print("������� ������ �����: ");
        float y = in.nextFloat();
        if(x>10&y>10){
        	 if(10-x>10-y){
             	System.out.print("��������� � 10 �����:"+x);
             	        }
             else {
             	System.out.print("��������� � 10 �����:"+y);
             }
        }
        else{
        	if(10-x>10-y){
             	System.out.print("��������� � 10 �����:"+y);
             	        }
             else {
             	System.out.print("��������� � 10 �����:"+x);
             }
        }
       
        }
      
		
}
