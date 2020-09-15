package day3;
public class Command {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[0]);
		char Gender=args[1].charAt(0);
		float salary=Float.parseFloat(args[2]);
		System.out.println(age+"\n"+Gender);
		System.out.println(salary);
	}
}
