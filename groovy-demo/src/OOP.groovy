
class OOP {
	
	private int StudentID;
	private String StudentName;
	
	void setStudentID(int sID) {
		studentID = sID;
	}
	
	int getStudentID() {
		return this.StudentID;
	}
	
	void setStudentName(String sName) {
		studentName = sName;
	}
	
	String getStudentName() {
		return this.StudentName;
	}
	
	static void main(String[] args) {
		
		OOP st = new OOP();
		
		st.setStudentID(1);
		st.setStudentName("John");
		
		println(st.getStudentID());
		println(st.getStudentName());
	}
}
