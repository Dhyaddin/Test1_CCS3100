
public class Lab6_1 {
	public static void main (String args[]) {
		String s1 = "I love Java Programming";
		
		System.out.println(s1.substring(12));
		System.out.println("----------------------------------");
		String s2 = s1.substring(0,7) + "Python" + s1.substring(11);
		System.out.println(s2);
		System.out.println("----------------------------------");
		System.out.println(s2.concat(" Awesome"));
		System.out.println("----------------------------------");
			if (s2.contains("Java")) {
				System.out.println("Yes, Still have JAVA");	
			}
			else
				System.out.println("No, Not have JAVA");
		System.out.println("----------------------------------");
		String s3 = s2.toUpperCase();
		System.out.println(s3);
		System.out.println("----------------------------------");
		int count = 0;
		for(int x=0; x < s3.length(); x++) {
			if(s3.charAt(x) == 'A')
			count ++;
		}
		System.out.println("The letter 'A' occurs " + count + " times in the string : " + s3 );
		System.out.println("----------------------------------");
		if(s3.equalsIgnoreCase(s2))
			System.out.println("Have same content");
		else
			System.out.println("Not have same content");
		System.out.println("----------------------------------");
		}
}
