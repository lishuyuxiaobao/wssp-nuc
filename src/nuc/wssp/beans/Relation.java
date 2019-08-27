package nuc.wssp.beans;
import java.util.Arrays;

public class Relation {
    private Long id;

    private Long dnumber;

    private Long bnumber;

    private String relation;

    private String[] list;
    
    private String name;
    
    private String name1;
    
    
    public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDnumber() {
        return dnumber;
    }

    public void setDnumber(Long dnumber) {
        this.dnumber = dnumber;
    }

    public Long getBnumber() {
        return bnumber;
    }

    public void setBnumber(Long bnumber) {
        this.bnumber = bnumber;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }
    
    

	public String[] getList() {
		return list;
	}

	public void setList(String[] list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Relation [id=" + id + ", dnumber=" + dnumber + ", bnumber=" + bnumber + ", relation=" + relation
				+ ", list=" + Arrays.toString(list) + ", name=" + name + ", name1=" + name1 + "]";
	}
    
    
}