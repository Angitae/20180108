
// 시간제 사원에 대한 급여 계산 정보를 저장하기 위한 클래스
// -> 시간제 사원의 급여 : 시급 * 근무 시간
// -> 사원 급여 클래스를 상속받아 작성

public class PartTimeEmployee extends Employee {
	private int moneyPerHour; // 시급
	private int workedHour; // 근무시간

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
	
	// 급여를 계산하는 메소드 
	@Override
	public void computePay(){
		setPay(moneyPerHour * workedHour);
	}
}
