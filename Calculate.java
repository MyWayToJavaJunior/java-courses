public class Calculate {
	/**
	* Выполняется сложение двух входящих аргументов указанных при старте программы, с выведением их в консоль
	* @author DK
	* @version 1.0.1
	* @date 25.06.2015
	* @param arg Массив входящих аргументов
	* @param first Первый входящий аргумент
	* @param second Второй входящий аргумент
	* @param summ Результат сложения входящий аргументов first и second
	*/
	public static void main(String[] arg) {
	
		System.out.println("Calculated .....");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		System.out.println("Summ of " +first +" and " +second +" is " +summ);
		
	}

}