import java.util.Scanner;
public class Task1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        System.out.print("¬ведите первое число: ");
       float x = in.nextFloat();
        System.out.print("¬ведите второе число: ");
        float y = in.nextFloat();
        if(x>10&y>10){
        	 if(10-x>10-y){
             	System.out.print("Ѕлижайшее к 10 число:"+x);
             	        }
             else {
             	System.out.print("Ѕлижайшее к 10 число:"+y);
             }
        }
        else{
        	if(10-x>10-y){
             	System.out.print("Ѕлижайшее к 10 число:"+y);
             	        }
             else {
             	System.out.print("Ѕлижайшее к 10 число:"+x);
             }
        }
       
        }
      
		
}
