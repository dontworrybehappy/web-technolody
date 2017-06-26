
public class W3 {

	public static void main(String[] args) {
		String str=new String();
	str=("Коту стало скучно. \n" + "Он решил погонять собаку. \n" + "Собаке это не понравилось. \n"+"Она его съела. \n");
		int n=0,p=0,e=0;
		for (int i = 0;i<str.length();i++)
		{
			if (str.charAt(i)==' '){
					p++;}
			if (str.charAt(i)=='\n')
				{
					n++;
					if (p>e){
						e= p;}
					p = 0;
				}

		}
		String[][] words = new String[n+1][e];
		String[] sentence = str.split("\n");
		for (int i=0; i<sentence.length;i++)
				words[i] = sentence[i].split(" ");
		for (int i=0; i<sentence.length; i++)
			{
			for (int j=0; j<words[i].length; j++)
				System.out.print(words[i][j]+" ");
			System.out.println();
			}
		System.out.println();
		for (int i=0; i<sentence.length; i++)
		{
		for (int j=0; j<words[i].length; j++)
			if (words[i][j].indexOf("с") != -1)
				System.out.print(words[i][j]+" ");
		}
		
		
		
	}

}
