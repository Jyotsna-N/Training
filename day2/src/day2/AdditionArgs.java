package day2;

public class AdditionArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < args.length; i++) {
			int number1=Integer.parseInt(args[i]);
			System.out.println("\n");
			System.out.print(number1);
			System.out.print("+"+sum);
			sum=sum+number1;
			System.out.print("="+sum);
			
		}

	}

}
