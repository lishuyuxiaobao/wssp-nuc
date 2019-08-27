package nuc.wssp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nuc.wssp.beans.Behavior;
import nuc.wssp.beans.Experience;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Salary;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;

@Service
public interface IGroupheaderService {
	
//	Student verifyStudent(long sid);
	
	Groupheader queryGroupheaderGid(long gid);
	
	List<Worktable> queryWorktableListAnumber(long anumber);
	
	List<Behavior> queryBehaviorSid(long sid);
	
	void insertBehavior(Behavior behavior);
	
	void insertBehaviorGrade(Behavior behavior);
	
	void insertSalary(Salary salary);
	
	Salary querySalarySid(long sid);
	
	List<Salary> querySalaryGid(long gid);
	
	Behavior queryBehaviorSidCount(long sid,long count);
	
	void updateSalarySid(Salary salary);
	
	void insertExperience(Experience experience);
	
	Experience queryExperienceSid(long sid);
	
	void updateExperienceSid(Experience experience);
}
