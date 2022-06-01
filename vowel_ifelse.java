package sasikumar;

import java.util.Scanner;

public class vowel_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("this is a vowel");
			
		}
		else
		{
			System.out.println("this is a constant");
		}
		sc.close();

	}

}
