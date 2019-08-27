package nuc.wssp.beans;

public class Dlimit {
    private Long id;

    private Long ynumber;

    private String arrbnumber;

    private String arrcount;

    private String name;
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
	public String toString() {
		return "Dlimit [id=" + id + ", ynumber=" + ynumber + ", arrbnumber=" + arrbnumber + ", arrcount=" + arrcount
				+ ", name=" + name + "]";
	}

	public Long getYnumber() {
        return ynumber;
    }

    public void setYnumber(Long ynumber) {
        this.ynumber = ynumber;
    }

    public String getArrbnumber() {
        return arrbnumber;
    }

    public void setArrbnumber(String arrbnumber) {
        this.arrbnumber = arrbnumber == null ? null : arrbnumber.trim();
    }

    public String getArrcount() {
        return arrcount;
    }

    public void setArrcount(String arrcount) {
        this.arrcount = arrcount == null ? null : arrcount.trim();
    }
}