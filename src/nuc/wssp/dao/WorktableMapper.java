 package nuc.wssp.dao;

import java.util.List;
import nuc.wssp.beans.Worktable;
import nuc.wssp.beans.WorktableExample;
import org.apache.ibatis.annotations.Param;

public interface WorktableMapper {
    int countByExample(WorktableExample example);

    int deleteByExample(WorktableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Worktable record);

    int insertSelective(Worktable record);

    List<Worktable> selectByExample(WorktableExample example);

    Worktable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Worktable record, @Param("example") WorktableExample example);

    int updateByExample(@Param("record") Worktable record, @Param("example") WorktableExample example);

    int updateByPrimaryKeySelective(Worktable record);

    int updateByPrimaryKey(Worktable record);

	List<Worktable> selectByStudent();
}