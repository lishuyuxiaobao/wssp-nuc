package nuc.wssp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Mark;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;

@Repository
public interface IStudentDao {

	Student verifyStudent(long sid);
	
	Worktable queryWorktableSid(long sid);
	
	List<Worktable> queryWorktableBnumber(long bnumber);
	
	void updateStudentInfo(Student student);
	
	Mark queryMarkSdepartment(String sdepartment);
	
	Mark queryMarkNumber(long number);
	
	List<Mark> queryMark(long mark);
	
	Dlimit queryDlimitYnumber(long ynumber);
	
	Groupheader queryGroupheaderAnumber(long anumber);
	
	Relation queryRelationDBnumber(long dnumber,long bnumber);
	
	void insertWorktable(Worktable worktable);
	
}
