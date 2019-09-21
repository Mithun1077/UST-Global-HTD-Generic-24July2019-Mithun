package java.lang.lamda;

public class Test {

	public static void main(String[] args) {
		Lamda v = (int num) -> 
			{
				for(int i = 1 ; i<=num;i++)
				{
					System.out.println(i);
				}
			};
			v.code(5);
		}

	}


