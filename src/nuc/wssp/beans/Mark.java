package nuc.wssp.beans;

import java.util.List;

public class Mark {
    private Long id;

    private Long mark;

    private String position;

    private Long number;
    
    private long count;


    public long getCount() {
		return count;
	}


	public void setCount(long count) {
		this.count = count;
	}

	private List<Worktable> lwList;
    
    public List<Worktable> getLwList() {
		return lwList;
	}


	public void setLwList(List<Worktable> lwList) {
		this.lwList = lwList;
	}


	public Long getId() {
        return id;
    }


	public void setId(Long id) {
        this.id = id;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

	@Override
	public String toString() {
		return "Mark [id=" + id + ", mark=" + mark + ", position=" + position + ", number=" + number + "]";
	}
    
}