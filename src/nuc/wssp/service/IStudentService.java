package nuc.wssp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Mark;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;

@Service
public interface IStudentService {

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
