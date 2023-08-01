package com.test.question.q95;

class Employee {
	   private String name;
	   private String department;
	   private String position;
	   private String tel;
	   private Employee boss;


	   //getter, setter 구현

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (isValidName(name)) {
			this.name = name;
		}
	}

	private boolean isValidName(String name) {
		
		if (name.length() < 2 || name.length() > 5) {
			return false;
		}
		
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) < '가' || name.charAt(i) > '힣') {
				return false;
			}
		}
		
		return true;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		
		if (department.equals("영업부") || department.equals("기획부")
			|| department.equals("총무부") || department.equals("개발부")
			|| department.equals("홍보부")) {

			this.department = department;
		}
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		
		if (position.equals("부장") || position.equals("과장")
			|| position.equals("대리") || position.equals("사원")) {
			
			this.position = position;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (isValidTel(tel)) {
			this.tel = tel;
		}
	}

	private boolean isValidTel(String tel) {
		
		if (tel.length() != 13) {
			return false;
		}
		if (!tel.substring(0, 4).equals("010-")) {
			return false;
		}
		for (int i = 4; i < tel.length(); i++) {
			if (i == 8 && tel.charAt(i) != '-') {
				return false;
			}
			if (i != 8 && (tel.charAt(i) < '0' || tel.charAt(i) > '9')) {
				return false;
			}
		}
		return true;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
	}

	public void info() {
		System.out.printf("[%s]\n", this.name);
		System.out.printf("- 부서: %s\n", this.department);
		System.out.printf("- 직위: %s\n", this.position);
		System.out.printf("- 연락처: %s\n", this.tel);
		if (this.boss == null) {
			System.out.println("직속상사: 없음");
		} else {
			System.out.printf("직속상사: %s(%s %s)\n", this.boss.name, this.boss.department, this.boss.position);
		}
		
   }
}