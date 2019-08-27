package nuc.wssp.beans;

import java.util.List;

public class Groupheader {
    private Long gid;

    private String area;

    private Long anumber;

    private Long count;

    private List<Student> list;
    
    private Student student;
    
    
    
    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Long getAnumber() {
        return anumber;
    }

    public void setAnumber(Long anumber) {
        this.anumber = anumber;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

	@Override
	public String toString() {
		return "Groupheader [gid=" + gid + ", area=" + area + ", anumber=" + anumber + ", count=" + count + ", list="
				+ list + ", student=" + student + "]";
	}
    
}