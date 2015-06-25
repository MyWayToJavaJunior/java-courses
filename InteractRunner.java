import java.util.Scanner;
/**
* Класс производит операции над введенными с клавиатуры числами
* используя класс Calculator
* @author DK
* @date 25.06.2015
*/
public class InteractRunner {

	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			/**
			* @see Calculator
			*/
			Calculator calc = new Calculator();
			/**
			* @param exit Флаг для выхода из цикла
			*/
			String exit = "no";
			/**
			* Цикл повторяется пока переменная exit имеет значение no
			*/
			while (!exit.equals("yes")) {
				/**
				* Запрашиваем и получаем первый аргумент 
				* @param first Первый аргумент
				*/
				System.out.println("Enter first arg: ");
				String first = reader.next();
				/**
				* Запрашиваем и получаем второй аргумент 
				* @param second Второй аргумент
				*/
				System.out.println("Enter second arg: ");
				String second = reader.next();
				/**
				* Запрашиваем и получаем операцию которую будем использовать для обработки аргументов
				* @param operation операция обработки, варианты add/sub/mult/div
				*/
				System.out.println("Enter add/sub/mult/div: ");
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