import java.io.Serializable;
import java.util.Objects;

public class Students implements Serializable{
	private int studentid;
	private String studentname;
	private String email;
	
	public Students(int studentid, String studentname, String email) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.email = email;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, studentid, studentname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(email, other.email) && studentid == other.studentid
				&& Objects.equals(studentname, other.studentname);
	}

	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", studentname=" + studentname + ", email=" + email + "]";
	}
	
	
}
