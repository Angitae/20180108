
// 정규직 사원에 대한 급여 계산 정보를 저장하기 위한 클래스 
// -> 정규직 사원의 급여 : 연봉 / 12;
// -> 사원 급여 클래스를 상속 받아 작성
public class RegularEmployee extends Employee{
	private int annualSalary; // 연봉
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
			setPay(annualSalary/ 12); // Employee 클래스에 있는 메소드 활용
	}
//	@Override
//	public int computeIncentive(){
//		return 10000000;
//	}
	// final 메소드를 오버라이드 선언할 경우 에러 발생한다. 
	// 부모 메소드에서만 사용 가능하다 .
}
