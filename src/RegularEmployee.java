
// ������ ����� ���� �޿� ��� ������ �����ϱ� ���� Ŭ���� 
// -> ������ ����� �޿� : ���� / 12;
// -> ��� �޿� Ŭ������ ��� �޾� �ۼ�
public class RegularEmployee extends Employee{
	private int annualSalary; // ����
	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public RegularEmployee(String empNum, String empName, int annualSalary) {
		super(empNum, empName);
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	@Override
	public void computePay(){
			setPay(annualSalary/ 12); // Employee Ŭ������ �ִ� �޼ҵ� Ȱ��
	}
	
}
