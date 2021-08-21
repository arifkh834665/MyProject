package jdbcpackage;

public class Student {
	private int studentId;
	private String StudentName;
	private String StudentPhone;
	private String StudentCity;
	public Student(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentPhone() {
		return StudentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
				+ ", StudentCity=" + StudentCity + "]";
	}

	
}