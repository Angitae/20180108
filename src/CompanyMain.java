
public class CompanyMain {

	public static void main(String[] args) {
		// 추상 클래스는 인스턴스 생성은 불가능 하지만,
		// reference 변수는 생성 가능하다.
		// 모든 사원 정보를 저장할 수 있는 배열 생성
		Employee empl[] = { new RegularEmployee("emp1","홍길동", 6000), new RegularEmployee("emp2","이기동",4000), new PartTimeEmployee("emp3","장길산",7000,200), new PartTimeEmployee("emp4","전우치",7000,600)};

		for(Employee emp : empl){
			emp.computePay(); // 이거 없으면 호출이 안돼서 getPay()메소드 호출 시 0으로 초기화 된다.
			// 자식클래스의 오버라이드 메소드 호출 ( 다형성 )
			System.out.println("사원번호 =" +emp.getEmpNum());
			System.out.println("사원이름 =" +emp.getEmpName());
			System.out.println("급여 = "+ emp.getPay());
			System.out.println("===============");
		}
		
	}

}
