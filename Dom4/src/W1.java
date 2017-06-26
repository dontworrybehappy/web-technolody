
public class W1 {
	public static void main (String[] args){
		String str="Доброе утро страна!";
		String what="о";
		int pos=0,i=0;
		for(;str.indexOf(what,pos)!=-1;i++){
			pos=str.indexOf(what,pos);
			pos++;
			
		}
		System.out.print(i);
		 String[] words=str.split(" ");
		 System.out.println(words);
		
	}
	}


