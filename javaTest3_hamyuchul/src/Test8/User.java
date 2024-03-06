package Test8;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	public User() {
		super();
	}

		//얕은 복사
	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	//깊은 복사
	public User(User user) {
		super();
		this.id = user.getId();
		this.password = user.getPassword();
		this.name = user.getName();
		this.age = user.getAge();
		this.gender = user.getGender();
		this.phone = user.getPhone();
	}

	@Override
	public String toString() {
		return id + " " + password + "  " + name + " " + age + " " + gender + " " + phone;
	}

	@Override
	public boolean equals(Object obj) {
		User u1 = (User) obj;
		if (obj instanceof User) {

			if (password.equals(u1.getPassword()) && id.equals(u1.getId()) && name.equals(u1.getName())
					&& phone.equals(u1.getPhone()) && age == u1.getAge() && gender == u1.getGender()) {
				return true;
			}
			
			return false;
		} 
		else
			return false;

	}

	public Object clone() {
		//얕은 복사
		Object obj = new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
		
		Object obj2 = new User(this); //깊은 복사
		return obj;
	}

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
