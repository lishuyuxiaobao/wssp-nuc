package nuc.wssp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Mark;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;
import nuc.wssp.dao.IStudentDao;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}
	
	public Student verifyStudent(long sid) {
		return dao.verifyStudent(sid);
	}
	
	public List<Mark> queryMark(long mark) {
		return dao.queryMark(mark);
	}
	
	public Worktable queryWorktableSid(long sid) {
		return dao.queryWorktableSid(sid);
	}
	
	public void updateStudentInfo(Student student) {
		dao.updateStudentInfo(student);
	}
	
	public Mark queryMarkSdepartment(String sdepartment) {
		return dao.queryMarkSdepartment(sdepartment);
	}
	
	public Mark queryMarkNumber(long number) {
		return dao.queryMarkNumber(number);
	}
	
	
	public List<Worktable> queryWorktableBnumber(long bnumber) {
		return dao.queryWorktableBnumber(bnumber);
	}
	
	public Dlimit queryDlimitYnumber(long ynumber) {
		return dao.queryDlimitYnumber(ynumber);
	}
	
	public Groupheader queryGroupheaderAnumber(long anumber) {
		return dao.queryGroupheaderAnumber(anumber);
	}

	@Override
	public Relation queryRelationDBnumber(long dnumber, long bnumber) {
		// TODO Auto-generated method stub
		return dao.queryRelationDBnumber(dnumber, bnumber);
	}

	@Override
	public void insertWorktable(Worktable worktable) {
		// TODO Auto-generated method stub
		dao.insertWorktable(worktable);
	}
	
}
