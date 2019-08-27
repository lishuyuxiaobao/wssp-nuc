package nuc.wssp.dao;

import java.util.List;
import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.DlimitExample;
import org.apache.ibatis.annotations.Param;

public interface DlimitMapper {
    int countByExample(DlimitExample example);

    int deleteByExample(DlimitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dlimit record);

    int insertSelective(Dlimit record);

    List<Dlimit> selectByExample(DlimitExample example);
    
    List<Dlimit> selectByName();

    Dlimit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Dlimit record, @Param("example") DlimitExample example);

    int updateByExample(@Param("record") Dlimit record, @Param("example") DlimitExample example);

    int updateByPrimaryKeySelective(Dlimit record);

    int updateByPrimaryKey(Dlimit record);
}