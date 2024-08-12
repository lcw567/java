package project2;

public class Class {
	private String className;
	private String professor;
	private int credits;
	
	public Class() {
		super();
	}

	public Class(String className, String professor, int credits) {
		super();
		this.className = className;
		this.professor = professor;
		this.credits = credits;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Class ["+ 
				"className=" + className + 
				", professor=" + professor + 
				", credits=" + credits 
				+ "]";
	}


	
	
	
}
