package nuc.wssp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.wssp.beans.Behavior;
import nuc.wssp.beans.Experience;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Salary;
import nuc.wssp.beans.Worktable;
import nuc.wssp.dao.IGroupheaderDao;

@Service
public class GroupheaderServiceImpl implements IGroupheaderService{
	@Autowired
	private IGroupheaderDao dao;	
	
	@Override
	public Groupheader queryGroupheaderGid(long gid) {
		return dao.queryGroupheaderGid(gid);
	}
	@Override
	public List<Worktable> queryWorktableListAnumber(long anumber) {
		return dao.queryWorktableListAnumber(anumber);
	}
	@Override
	public List<Behavior> queryBehaviorSid(long sid) {
		return dao.queryBehaviorSid(sid);
	}
	@Override
	public void insertBehavior(Behavior behavior) {
		dao.insertBehavior(behavior);
	}
	@Override
	public void insertBehaviorGrade(Behavior behavior) {
		dao.insertBehaviorGrade(behavior);	
	}
	@Override
	public void insertSalary(Salary salary) {
		dao.insertSalary(salary);
	}
	@Override
	public Salary querySalarySid(long sid) {
		return dao.querySalarySid(sid);
	}
	@Override
	public List<Salary> querySalaryGid(long gid) {
		return dao.querySalaryGid(gid);
	}
	@Override
	public Behavior queryBehaviorSidCount(long sid, long count) {
		return dao.queryBehaviorSidCount(sid, count);
	}
	@Override
	public void updateSalarySid(Salary salary) {
		dao.updateSalarySid(salary);
	}
	@Override
	public void insertExperience(Experience experience) {
		// TODO Auto-generated method stub
		dao.insertExperience(experience);
	}
	@Override
	public Experience queryExperienceSid(long sid) {
		// TODO Auto-generated method stub
		return dao.queryExperienceSid(sid);
	}
	@Override
	public void updateExperienceSid(Experience experience) {
		// TODO Auto-generated method stub
		dao.updateExperienceSid(experience);
	}





	
}
