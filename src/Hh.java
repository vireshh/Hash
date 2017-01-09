
public class Hh {

	public Hh() {
		// TODO Auto-generated constructor stub
	}
	
	public static void ma(int []aa)
	{
		/*int temp = aa[4];*/
		int [] ee = aa;
		ee[0] = 5;
		/*aa[0] = temp;*/
	}

	public static void main(String [] args)
	{
		int [] ee = {12,45,89,63,55};
		ma(ee);
		for(int i=0;i<ee.length;i++)
		{
			System.out.println("The value is:"+ee[i]);
		}
	}
}
