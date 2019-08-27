package nuc.wssp.dao;

import java.util.List;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.GroupheaderExample;
import org.apache.ibatis.annotations.Param;

public interface GroupheaderMapper {
    int countByExample(GroupheaderExample example);

    int deleteByExample(GroupheaderExample example);

    int deleteByPrimaryKey(Long gid);

    int insert(Groupheader record);

    int insertSelective(Groupheader record);

    List<Groupheader> selectByExample(GroupheaderExample example);

    Groupheader selectByPrimaryKey(Long gid);

    int updateByExampleSelective(@Param("record") Groupheader record, @Param("example") GroupheaderExample example);

    int updateByExample(@Param("record") Groupheader record, @Param("example") GroupheaderExample example);

    int updateByPrimaryKeySelective(Groupheader record);

    int updateByPrimaryKey(Groupheader record);

	List<Groupheader> selectByStudent_One();
}