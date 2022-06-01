package sasikumar;

import java.util.Scanner;

public class switchwithoutbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		switch (ch)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("this is a vowel");
		System.exit(ch);
			default:
				
			System.out.println("this is a constant");
			
		}
		sc.close();

	}

}
