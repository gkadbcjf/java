package com.kh.employy;

/*
 * 실제 정보를 넘겨받아서 사원에대한 정보를 저장하거나
 * 반환해주는 역할
 * 
 */
public class EmployeeController {

	private int count;
	private Employee[] emList = new Employee[100];

	public EmployeeController() {
	count=3;
		emList[0] =new Employee("asd1024","감자",'m',"010-5333-1444");
		emList[1] =new Employee("ffff1024","여사원",'F',"010-4444-5555");
		emList[2] =new Employee("KRR2024","케로로",'m',"010-1234-5667");
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// insert => 사원을 배열에 추가해주는 메소드
	public void insert(String empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		emList[count++] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}

	public void print() {
		if (count != 0) {
			for (int i = 0; i < count; i++) {
				System.out.println(emList[i].toString()); //
			}
		} else
			System.out.println("사원이 없습니다. 사원을 채우세요..");
	}

	public void delete() {
		if (count != 0) {
			System.out.println("삭제된 사원 출력: " + emList[0]);

			for (int i = 0; i < count; i++) {
				if (i == 99) {
					emList[i] = null;
				}
				emList[i] = emList[i + 1];

			}
			count--;
		} else
			System.out.println("삭제할 사원이 없습니다..");

	}

	public void deleteEmpNo(String empNo) {
		int check=0;
		if (count != 0) {
			for (int i = 0; i < count; i++) {
				if (empNo.equals(emList[i].getEmpNo())) {
					check=1;
					if(i == 99) {
						emList[i] =null;
						break;
					}
					for (int j = i; j < count; j++) {
						emList[j] = emList[j + 1];
					}
				
				}
			}count--;
			if(check == 0)
				System.out.println(empNo+" 사원이 없습니다.");
		}
		else
			System.out.println("회사에 사원이 한 명도 존재하지 않습니다. 사원을 채워주세요.");
		
	}
	
	public void findEmpNo(String empNo) {
		int check=0;
		if(count != 0) {
			for(int i=0; i<count; i++) {
				if(empNo.equals(emList[i].getEmpNo())) {
					check=1;
					System.out.println("사원정보 : " + emList[i]);
				}				
					
			}
			if(check==0)
				System.out.println(empNo+"사원은 없습니다.");
			
		}
		else
			System.out.println("회사에 사원이 한 명도 존재하지 않습니다. 사원을 채워주세요.");
//		if(check != 1)
//				System.out.println("찾으시는 사원이 존재하지 않습니다!");
	}
}
