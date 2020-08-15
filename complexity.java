
public class Exercise3 
{
	public static void main(String[] args) 
	{
		int num = 6; 
		System.out.println(line(num));
	}
	static int line(int N) 
	{
		 int result = 1;
		 for (int i=1; i< N; i*=2) 
			 result+=2;
		 return result;
	}
}
