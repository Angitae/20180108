
public class CompanyMain {

	public static void main(String[] args) {
		// �߻� Ŭ������ �ν��Ͻ� ������ �Ұ��� ������,
		// reference ������ ���� �����ϴ�.
		// ��� ��� ������ ������ �� �ִ� �迭 ����
		Employee empl[] = { new RegularEmployee("emp1","ȫ�浿", 6000), new RegularEmployee("emp2","�⵿̱",4000), new PartTimeEmployee("emp3","����",7000,200), new PartTimeEmployee("emp4","����ġ",7000,600)};

		for(Employee emp : empl){
			emp.computePay(); // �̰� ������ ȣ���� �ȵż� getPay()�޼ҵ� ȣ�� �� 0���� �ʱ�ȭ �ȴ�.
			// �ڽ�Ŭ������ �������̵� �޼ҵ� ȣ�� ( ������ )
			System.out.println("�����ȣ =" +emp.getEmpNum());
			System.out.println("����̸� =" +emp.getEmpName());
			System.out.println("�޿� = "+ emp.getPay());
			System.out.println("===============");
		}
		
	}

}
