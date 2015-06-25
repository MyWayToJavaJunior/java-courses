/**
* Класс реализует калькулятор
*/
public class Calculator {
	/**
	* Результат вычисления
	*/
	private int result;
	
	/**
	* Суммируем аргументы.
	* @param params Аргументы суммирования
	*/
	public void add(int... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	
	/**
	* Отнимаем аргументы.
	* @param params Аргументы отнятия 
	*/
	public void sub(int... params) {
		for (Integer param : params) {
			this.result -= param;
		}
	}
	
	/**
	* Умножаем аргументы.
	* @param params Аргументы умножения
	*/
	public void mult(int... params) {
		for (Integer param : params) {
			this.result *= param;
		}
	}
	
	/**
	* Делим аргументы.
	* @param params Аргументы деления
	*/
	public void div(int... params) {
		for (Integer param : params) {
			this.result /= param;
		}
	}
	
	/**
	* Возвращаем результат.
	* @return result Возвращаемый аргумент
	*/
	public int getResult() {
		return this.result;
	}
	
	/**
	* Обнуляем результат
	* @param result Обнуляемый аргумент
	*/
	public void cleanResult() {
		this.result = 0;
	}
}
