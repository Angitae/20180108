
//사원 급여정보(사원번호, 사원이름, 급여정보)를 저장하기 위한 클래스
// -> 급여에 대한 데이터는 사원에 따라 다르게 계산되어 질 것이다.
// -> 급여 데이터를 계산하기 위한 정보를 저장하기 위한 클래스 상속 받아야 하는 클래스 
// Employee 클래스를 상속전용 클래스로 만든다. (추상 클래스)
// -> 인스턴스를 작성하지 못하도록...
public abstract class Employee {
	private String empNum;
	private String empName;
	private int pay;
	private  static final double INCENTIVE_RATE = 2.5;

	// 인센티브율 필드로 만들어주기
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

	// 급여를 계산하는 메소드를 반드시 자식 클래스에서 원하는
	// 형식의 메소드로 선언하고자 할 경우 추상 메소드 선언
	// => 자식 클래스에서 오버라이드 선언하지 않으면 에러가 발생
	// => 추상 메소드가 선언된 클래스는 무조건 추상 클래스로 선언해준다.
	public abstract void computePay();

	// 회장님 지시 -> 급여가 500만원 이상인 모든 사원에게 인센티브 지급
	// 인센티브( 급여 * 인센티브율)를 계산하여 반환하는 메소드
	// => 인센티브율은 250%로 설정
	// 자식 클래스에서 메소드를 오버라이드 선언하여 변경 가능
	// => 자식 클래스에서 메소드를 오버라이드 선언하지 못하게 선언...
	// => final 메소드 선언
	public final int computeIncentive() {
		int incentive = 0;

		if (pay >= 500) {
			incentive = (int) (pay * INCENTIVE_RATE);
		}
		return incentive;

	}

}
