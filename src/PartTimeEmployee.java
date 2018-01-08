
// �ð��� ����� ���� �޿� ��� ������ �����ϱ� ���� Ŭ����
// -> �ð��� ����� �޿� : �ñ� * �ٹ� �ð�
// -> ��� �޿� Ŭ������ ��ӹ޾� �ۼ�

public class PartTimeEmployee extends Employee {
	private int moneyPerHour; // �ñ�
	private int workedHour; // �ٹ��ð�

	public PartTimeEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(String empNum, String empName, int moneyPerHour, int workedHour) {
		super(empNum, empName);
		this.moneyPerHour = moneyPerHour;
		this.workedHour = workedHour;
	}

	public int getMoneyPerHour() {
		return moneyPerHour;
	}

	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}

	public int getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(int workedHour) {
		this.workedHour = workedHour;
	}
	
	// �޿��� ����ϴ� �޼ҵ� 
	@Override
	public void computePay(){
		setPay(moneyPerHour * workedHour);
	}
}
