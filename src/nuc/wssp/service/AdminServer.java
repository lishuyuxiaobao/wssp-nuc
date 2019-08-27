package nuc.wssp.service;

import java.util.List;

import nuc.wssp.beans.Behavior;
import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Mark;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Salary;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;

public interface AdminServer {
	
	//获得工作表
	public List<Worktable> getListWorkTable();
	
	//获得标记
	public List<Mark> getMarkList();
	//添加标记
	public void addMark(Mark mark);
	
	//获得关系表
	public List<Relation> getRelationList();
	//添加关系
	public void addRelation(Relation relation);
	//修改关联关系
	public void updateRelation(Relation relation);
	
	//获得组长表
	public List<Groupheader> getGroupHeader();
	//添加组长负责区域信息
	public void addGroupHeader(Groupheader groupheader);
	//删除组长信息
	public void deleteGrounpHeader(Groupheader groupheader);
	
	
	//获得学生表
	public List<Student> getStudent();
	
	//获得所有院的限制情况
	public List<Dlimit> getDlimit();
	//为学院添加限制情况
	public void addDlimit(Dlimit dlimit);
	//修改学院限制情况
	public void updateDlimit(Dlimit dlimit);
	
	//获取学生信息
	public Student verifyStudent(long sid);
	
	//获取具体位置信息
	public Mark queryMarkNumber(long number);
	
	//获取全部成员工资表
	public List<Salary> getSalary();
	
	//获取全部成员日常表现
	public List<Behavior> getBehavior();
}
