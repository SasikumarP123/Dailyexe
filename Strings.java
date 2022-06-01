package sasikumar;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello world";
		String b="Welcome to java class";
		System.out.println("String A : "+a);
		System.out.println("String B : "+b);
		System.out.println("String A HasCode : "+a.hashCode());
		System.out.println("String b HasCode : "+b.hashCode());
		System.out.println("A Equal To B : "+a.equals(b));
		System.out.println("Equals Ignore Case : "+a.equalsIgnoreCase(b));
		System.out.println("String A Length : "+a.length());
		System.out.println("String B Length : "+b.length());
		System.out.println("CharAt : "+a.charAt(6));
		System.out.println("UpperCase : "+a.toUpperCase());
		System.out.println("UpperCase : "+b.toUpperCase());
		System.out.println("LowerCase : "+a.toLowerCase());
		System.out.println("LowerCase : "+b.toLowerCase());
		System.out.println("UpperCase : "+a.toUpperCase());
		System.out.println("replace : "+a.replace("world","java"));
		System.out.println("replaceall : "+a.replaceAll("l","e" ));
		System.out.println("contains : "+a.contains("world"));
		System.out.println("Empty : "+a.isEmpty());
		System.out.println("CompareTo : "+a.compareTo(b));
		System.out.println("EndWith : "+a.endsWith("ld"));
		System.out.println("StartWith : "+a.startsWith("he"));
		System.out.println("Substring : "+a.substring(6));
		System.out.println("Substring : "+a.substring(0,6));
		char [] arr = a.toCharArray();
		for(char c:arr)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		String c=" S ";
		System.out.println("Trim : "+c.trim());
		System.out.println("Trim Length : "+c.trim().length());
		
		
		

	}

}
