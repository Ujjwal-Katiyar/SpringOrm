package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.springframework.transaction.annotation.Transactional;
@Entity
@Table(name = "Student_details")
public class Student {
	@Id
	@Column(name = "Student_rollNo")
	private int rollNo;
	@Column(name = "Student_name")
	private String name;
	@Column(name = "Student_fatherName")
	private String fatherName;

	public Student(int rollNo, String name, String fatherName) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fatherName = fatherName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

}
