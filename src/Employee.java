
//��� �޿�����(�����ȣ, ����̸�, �޿�����)�� �����ϱ� ���� Ŭ����
// -> �޿��� ���� �����ʹ� ����� ���� �ٸ��� ���Ǿ� �� ���̴�.
// -> �޿� �����͸� ����ϱ� ���� ������ �����ϱ� ���� Ŭ���� ��� �޾ƾ� �ϴ� Ŭ���� 
// Employee Ŭ������ ������� Ŭ������ �����. (�߻� Ŭ����)
// -> �ν��Ͻ��� �ۼ����� ���ϵ���...
public abstract class Employee {
	private String empNum;
	private String empName;
	private int pay;
	private  static final double INCENTIVE_RATE = 2.5;

	// �μ�Ƽ���� �ʵ�� ������ֱ�
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empNum, String empName) {
		super();
		this.empNum = empNum;
		this.empName = empName;
	}

	public String getEmpNum() {
		return empNum;
	}

	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	// �޿��� ����ϴ� �޼ҵ带 �ݵ�� �ڽ� Ŭ�������� ���ϴ�
	// ������ �޼ҵ�� �����ϰ��� �� ��� �߻� �޼ҵ� ����
	// => �ڽ� Ŭ�������� �������̵� �������� ������ ������ �߻�
	// => �߻� �޼ҵ尡 ����� Ŭ������ ������ �߻� Ŭ������ �������ش�.
	public abstract void computePay();

	// ȸ��� ���� -> �޿��� 500���� �̻��� ��� ������� �μ�Ƽ�� ����
	// �μ�Ƽ��( �޿� * �μ�Ƽ����)�� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �μ�Ƽ������ 250%�� ����
	// �ڽ� Ŭ�������� �޼ҵ带 �������̵� �����Ͽ� ���� ����
	// => �ڽ� Ŭ�������� �޼ҵ带 �������̵� �������� ���ϰ� ����...
	// => final �޼ҵ� ����
	public final int computeIncentive() {
		int incentive = 0;

		if (pay >= 500) {
			incentive = (int) (pay * INCENTIVE_RATE);
		}
		return incentive;

	}

}
