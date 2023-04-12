package String;

import java.util.Scanner;

public class StringReverse {

//	String reverse(String s) {
//		if(s.length()==0) {
//			return " ";
//		}
//		else
//			return s.charAt(s.length()-1)+ reverse(s.substring(0, s.length()-1));
//		
//	}
//	
//	
//	public static void main(String[] args) {
	// TODO Auto-generated method stub

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter");
//		String str=sc.nextLine();
//		String rev="";
//		
//		int length = str.length();

	// -------------------------------
//		for(int i=length-1;i>=0;i--) {
//			
//			rev+=str.charAt(i);
//		}

//		System.out.println(rev);
	// --------------------------------

//		char arr[]=str.toCharArray();
//		int len = arr.length;
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+arr[i];
//		}
//		
//		System.out.println(rev);

	// ------------------------------------

//		StringBuilder sb=new StringBuilder(str);
//		StringBuilder sbrev = sb.reverse();
//		System.out.println(sbrev);

	// -----------------------------------

//		StringReverse sr=new StringReverse();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter");
//		String str=sc.nextLine();
//		System.out.println("Reverse-->"+ sr.reverse(str));

	public static void main(String[] args) {

		String str = "Welcome To The World";
		// to store the separate words of string in an Array
		String[] strArray = str.split(" ");

		for (String temp : strArray) {

			System.out.print(temp + " ");
		}
		System.out.println();
		for (int i = 0; i < strArray.length; i++) {
			char[] s1 = strArray[i].toCharArray();
			for (int j = s1.length - 1; j >= 0; j--)
			{
                
				System.out.print(s1[j]);
			System.out.print("|<-");
				System.out.print(j+"|");
				
			}
			System.out.println("....Index of words"+i);
			System.out.print(" ");
		}
	}

}
