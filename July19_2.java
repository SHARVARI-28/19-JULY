import java.util.Scanner;

public class July19_2
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a word with any random number");
	String w=sc.nextLine();
	String []s=w.split(",");
	String s1=s[0];
	int k=Integer.parseInt(s[1]);
	w=s1.substring(s1.length()-k);
	for(int i=0;i<k;i++)
	{
		System.out.println(w);
	}
	}
}