public class Calculate {
	/**
	* ����������� �������� ���� �������� ���������� ��������� ��� ������ ���������, � ���������� �� � �������
	* @author DK
	* @version 1.0.1
	* @date 25.06.2015
	* @param arg ������ �������� ����������
	* @param first ������ �������� ��������
	* @param second ������ �������� ��������
	* @param summ ��������� �������� �������� ���������� first � second
	*/
	public static void main(String[] arg) {
	
		System.out.println("Calculated .....");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		System.out.println("Summ of " +first +" and " +second +" is " +summ);
		
	}

}