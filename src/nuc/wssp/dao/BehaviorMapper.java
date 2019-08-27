package nuc.wssp.dao;

import java.util.List;
import nuc.wssp.beans.Behavior;
import nuc.wssp.beans.BehaviorExample;
import org.apache.ibatis.annotations.Param;

public interface BehaviorMapper {
    int countByExample(BehaviorExample example);

    int deleteByExample(BehaviorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Behavior record);

    int insertSelective(Behavior record);

    List<Behavior> selectByExample(BehaviorExample example);

    Behavior selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Behavior record, @Param("example") BehaviorExample example);

    int updateByExample(@Param("record") Behavior record, @Param("example") BehaviorExample example);

    int updateByPrimaryKeySelective(Behavior record);

    int updateByPrimaryKey(Behavior record);
}