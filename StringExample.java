import java.util.Iterator;

public class StringExample {

	public static void main(String[] args) {
	
		String name="Dog";
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==name.charAt(i+1))
			{
				System.out.println(i);
			}
		}
	
	}	
}
