import java.util.Scanner;
//import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
//		int x = 123; //intialization
//		long y = 123456789102345L;
//		byte a = 100;
//		short b = 200;
//		float c= 123.03f;
//		double d = 2.2222;
//		boolean z = true;
//		char system = '@';
//		String name = "Bro";
//		System.out.println("My number is: " + x);
//		System.out.println(y);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(z);
//		System.out.println(system);
//		System.out.println("Hello " +name);
//	}
		
//		String x = "water";
//		String y = "Kool-Aid";
//		String temp;
//		temp = x;
//		x = y;
//		y= temp;
//		
//		
//		System.out.println("x: "+ x);
//		System.out.println("y: "+ y);
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("What is your name? ");
//		String name = scanner.nextLine();
//		System.out.println("How old are you? ");
//		int age = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("What is your favorite food? ");
//		String food = scanner.nextLine();
//		
//		System.out.println("Hello "+name);
//		System.out.println("You are "+age+ " years old");
//		System.out.println("You like "+ food);
		
		// expression = operands & operators
		// operands = values, variables,numbers,quantity
		// operators = + - * / %
		
//		int friends = 10;
//		
//		friends-- ;
//		
//		System.out.println(friends);
		
//		String name = JOptionPane.showInputDialog("Enter your name");
//		JOptionPane.showMessageDialog(null ,"Hello "+name);
//		
//		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
//		JOptionPane.showMessageDialog(null ,"You are  "+age+ " years old");
//		
//		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age "));
//		JOptionPane.showMessageDialog(null ,"You are  "+height+ " cm tall");
		
//		double x = 3.14;
//		double y = -10;
//		
//		double z = Math.sqrt(y);
//		double b = Math.round(x);
//		double a = Math.min(x, y);
//		
//		
//		System.out.println(z);
//		System.out.println(a);
//		System.out.println(b);
		
		
		// Hypotenuse
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+ (y*y));
		
		System.out.println("The hypotenuse is: "+ z);
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
//				
		
		
	}
}
