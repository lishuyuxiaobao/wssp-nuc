package nuc.wssp.beans;

public class Student {
    private Long sid;

    private String sname;

    private String spassword;

    private String sdepartment;

    private String sdorm;

    private Long dnumber;

    private Long bank;

    private Long phone;
    
    private long grade;

    public long getGrade() {
		return grade;
	}
	public void setGrade(long grade) {
		this.grade = grade;
	}
	public Long getSid() {
        return sid;
    }
    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getSdepartment() {
        return sdepartment;
    }

    public void setSdepartment(String sdepartment) {
        this.sdepartment = sdepartment == null ? null : sdepartment.trim();
    }

    public String getSdorm() {
        return sdorm;
    }

    public void setSdorm(String sdorm) {
        this.sdorm = sdorm == null ? null : sdorm.trim();
    }

    public Long getDnumber() {
        return dnumber;
    }

    public void setDnumber(Long dnumber) {
        this.dnumber = dnumber;
    }

    public Long getBank() {
        return bank;
    }

    public void setBank(Long bank) {
        this.bank = bank;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", spassword=" + spassword + ", sdepartment=" + sdepartment
				+ ", sdorm=" + sdorm + ", dnumber=" + dnumber + ", bank=" + bank + ", phone=" + phone + "]";
	}
    
    
}