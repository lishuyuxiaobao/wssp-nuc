package nuc.wssp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.wssp.beans.Behavior;
import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Mark;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Salary;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;
import nuc.wssp.dao.BehaviorMapper;
import nuc.wssp.dao.DlimitMapper;
import nuc.wssp.dao.GroupheaderMapper;
import nuc.wssp.dao.IStudentDao;
import nuc.wssp.dao.MarkMapper;
import nuc.wssp.dao.RelationMapper;
import nuc.wssp.dao.SalaryMapper;
import nuc.wssp.dao.StudentMapper;
import nuc.wssp.dao.WorktableMapper;
import nuc.wssp.service.AdminServer;

@Service
public class AdminServerImpl implements AdminServer {

	@Autowired
	private DlimitMapper dlimitMapper;
	
	@Autowired
	private MarkMapper markMapper;
	
	@Autowired
	private RelationMapper relationMapper;
	
	@Autowired
	private GroupheaderMapper groupheaderMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private WorktableMapper worktableMapper;
	
	@Autowired
	private SalaryMapper salaryMapper;
	
	@Autowired
	private BehaviorMapper behaviorMapper;
	
	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public List<Worktable> getListWorkTable() {
		// TODO Auto-generated method stub
		return worktableMapper.selectByExample(null);
	}

	@Override
	public List<Mark> getMarkList() {
		// TODO Auto-generated method stub
		return markMapper.selectByExample(null);
	}

	@Override
	public List<Relation> getRelationList() {
		// TODO Auto-generated method stub
		return relationMapper.selectByExample(null);
	}

	@Override
	public List<Groupheader> getGroupHeader() {
		// TODO Auto-generated method stub
		return groupheaderMapper.selectByStudent_One();
	}

	@Override
	public void addMark(Mark mark) {
		// TODO Auto-generated method stub
		markMapper.insert(mark);
	}

	@Override
	public void addRelation(Relation relation) {
		// TODO Auto-generated method stub
		relationMapper.insert(relation);
	}

	@Override
	public void addGroupHeader(Groupheader groupheader) {
		// TODO Auto-generated method stub
		groupheaderMapper.insertSelective(groupheader);
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentMapper.selectByExample(null);
	}

	@Override
	public void updateRelation(Relation relation) {
		// TODO Auto-generated method stub
		relationMapper.updateByPrimaryKey(relation);
	}

	@Override
	public void deleteGrounpHeader(Groupheader groupheader) {
		// TODO Auto-generated method stub
		groupheaderMapper.deleteByPrimaryKey(groupheader.getGid());
	}

	@Override
	public List<Dlimit> getDlimit() {
		// TODO Auto-generated method stub
		return dlimitMapper.selectByName();
	}

	@Override
	public void addDlimit(Dlimit dlimit) {
		// TODO Auto-generated method stub
		dlimitMapper.insertSelective(dlimit);
	}

	@Override
	public void updateDlimit(Dlimit dlimit) {
		// TODO Auto-generated method stub
		dlimitMapper.updateByPrimaryKeySelective(dlimit);
	}

	@Override
	public Student verifyStudent(long sid) {
		// TODO Auto-generated method stub
		return studentDao.verifyStudent(sid);
	}

	@Override
	public Mark queryMarkNumber(long number) {
		// TODO Auto-generated method stub
		return studentDao.queryMarkNumber(number);
	}

	@Override
	public List<Salary> getSalary() {
		// TODO Auto-generated method stub
		return salaryMapper.selectByExample(null);
	}

	@Override
	public List<Behavior> getBehavior() {
		// TODO Auto-generated method stub
		return behaviorMapper.selectByExample(null);
	}


}
