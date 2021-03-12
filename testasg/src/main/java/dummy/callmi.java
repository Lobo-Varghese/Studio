package dummy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class callmi implements methodB,interfaceA {

	public static void main(String[] args) {
	
callmi a=new callmi();
a.timestamp();
//a.methodB();
//a.pattern();
//a.lengthofstring();
//a.smallnuminarray();
//a.alphabetposition();
//String name="Deepa";
// name="Lobo";
//System.out.println(name.concat("lobo"));
//StringBuffer sb=new StringBuffer("Arya");
//System.out.println("Hi");
		
	
	}
	
	public void timestamp()
	{ 
		Date d=new Date();
		SimpleDateFormat sdp=new SimpleDateFormat("yyyyMMddHHmmss");
		String name=sdp.format(d);
		System.out.println(name);
//		String aftern=name.replaceAll(" ","").replaceAll("-","");
//		System.out.println(aftern);
		
	}
	
	public void alphabetposition()
	{
		System.out.println("Hi");
		Scanner sc= new Scanner(System.in);
		char c=sc.next().charAt(0);
	c=Character.toLowerCase(c);
	int a=(int)c;
	int position=a-96;
	System.out.println(position);
	
	//lowercase = -96
	//uppercase = -64
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void methodB()
	{
int a=1234;
int reverse=0;
while(a!=0)
{
	System.out.println("Hi");
reverse=reverse*10;
reverse=reverse+a%10;
a=a/10;
}
System.out.println(reverse);
		

	}
	
	public void pattern()
	{
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	
	
	public void lengthofstring()
	{
		int k=0;
		String s="LoboVarghese";
		char c[]=s.toCharArray();
		for(char c1:c)
		{
			k++;
		}
		System.out.println(k);
	}
	
	public void smallnuminarray()
	{
		int s[]= {14,35,67,89,24};
//		TreeSet<Integer> in=new TreeSet<Integer>();
//		for(int s1:s)
//		{
//			in.add(s1);
//			
//		}
//		System.out.println(in);
//		System.out.println(in.first());
//		for (int i = 0; i < s.length-1; i++) {
for(int s2:s) {
		if(s2==67)
			{
				System.out.println(s2+"Found");
			}
		}
		{
			
		}
	}
	
	
	
	
	
	
	

	public void methodA() {

//for (int i = 2; i <= 100; i++) {
//	for (int j = 2; j <=i; j++) {
//		if(j==i) {
//			System.out.println(i);
//		}
//		if(i%j==0)
//		{
//						break;
//		}
//		
//	}
//}
String s="Deepa";
//		char s1[]=s.toCharArray();
//		String s2[]=s.split(" ");
//		
//		for(int i=s2.length-1;i>=0;i--)
//		{
//			System.out.print(s2[i]);
//		}
StringBuffer sb=new StringBuffer();
sb.append(s);
sb.reverse();
System.out.println(sb);
	}
	

}
