import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Enter add/sub/mult/div ");
				String operation = reader.next();
				switch (operation) {
					case "add":	calc.add(Integer.valueOf(first), Integer.valueOf(second));
								break;
					case "sub":	calc.sub(Integer.valueOf(first), Integer.valueOf(second));
								break;
					case "mult":calc.mult(Integer.valueOf(first), Integer.valueOf(second));
								break;
					case "div":	calc.div(Integer.valueOf(first), Integer.valueOf(second));
								break;
					default: 	calc.add(Integer.valueOf(first), Integer.valueOf(second));
								System.out.println("you do not make a choice, we do addition");
								break;
				}
				System.out.println("Result of " +operation +" : " + calc.getResult());
				System.out.println("Do you want save result, or clear it? yes/no");
				String getCleanResult = reader.next();
				if (getCleanResult.equals("no")) calc.cleanResult();
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}