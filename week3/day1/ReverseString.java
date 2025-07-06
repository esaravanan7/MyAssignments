package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Saravanan";
		char[] reverse = name.toCharArray();
		
		int len = reverse.length;
		for (int i=len-1; i>=0; i--)
		{
			System.out.print(reverse[i]);
		}
}
}
