package com.xworkz.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students_table")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "students_count")
    private int studentsCount;

    
    public Students(String schoolName, int studentsCount) {
		super();
		this.schoolName = schoolName;
		this.studentsCount = studentsCount;
	}
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", schoolName=" + schoolName + ", studentsCount=" + studentsCount + "]";
    }
}
