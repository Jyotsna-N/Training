package Employee;
import INFO.*;
public class data {
	public static void main(String[] args)
	{
		Details d=new Details();
		int[] Salr=new int[3];
		Salr=d.detailsofsal();
		for (int i = 0; i < Salr.length; i++) {
			Salr[i]=Salr[i]+100;
			System.out.println(Salr[i]);
		}
	}

}

