package nuc.wssp.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Worktable;
import nuc.wssp.dao.GroupheaderMapper;
import nuc.wssp.dao.RelationMapper;
import nuc.wssp.dao.WorktableMapper;
import nuc.wssp.data.RelationDate;
import nuc.wssp.service.WebServer;

@Service
public class WebServerImpl implements WebServer {

	@Autowired
	private WorktableMapper worktableMapper;
	
	@Autowired
	private RelationMapper	relationMapper; 
	
	@Autowired
	private GroupheaderMapper groupheaderMapper;
	
	public void displayStudent() {
		 //TODO Auto-generated method stub
		//第一步、先根据worktable中的学号找到学生的信息，主要是拿到学生的宿舍号以及报岗方向
		List<Worktable> work_list = worktableMapper.selectByStudent();
		for (Worktable worktable : work_list) {
			System.out.println(worktable);
		}
//		
//		//第二步、将relation中的信息拿到，保存起来，然后将学生信息与数组中的内容进行匹配，从而减少操作数据库的次数
//		List<Relation> relation_list = relationMapper.selectByExample(null);
//		for (Relation relation : relation_list) {
//			System.out.println(relation);
//			HashMap<Long,Long> key = new HashMap<>();
//			key.put(relation.getDnumber(), relation.getBnumber());
//			RelationDate.RELATION_DROM_AREA.put(key, relation.getRelation());
////			RelationDate.RELATION_DROM_AREA[relation.getDnumber().intValue()][relation.getBnumber().intValue()] = relation.getRelation();
//		}
		
//		//第三步、在获得信息并保存到RelationDate之后，我们需要访问学生列表，保存当前的区域，进而保存到worktable中---这样，我们就完成了第一步
//		for (Worktable worktable : work_list) {
//			int sdrom =  worktable.getStudent().getDnumber().intValue();
//			int bnumber = worktable.getBnumber().intValue();
//			worktable.setAnumber(RelationDate.RELATION_DROM_AREA[sdrom][bnumber]);
//			System.out.println(worktable.getSid()+"宿舍"+worktable.getStudent().getDnumber()+"报岗方向:"+worktable.getBnumber()+"位置"+worktable.getAnumber());
//		}
		
//		//第四步、在得到信息并保存之后，我们就可以把内容放到worktable中了.
//		for (Worktable worktable : work_list) {
//			worktableMapper.updateByPrimaryKeySelective(worktable);
//		}
		
		/**
		 * 在保存到worktable中之后，我们就可以对其进行分配操作了，这里边有几个要注意的点
		 * 1、我们对学生能够上岗的区域进行区域分配，与组长对应的位置进行匹配。
		 * 2、这里没有对男女上岗条件进行限制。这个是报岗人数那边限制，或者后期添加算法来进行人数实现。（可以使用筛选来对人数进行划分）
		 * 3、有的情况下可能还会出现人数优先上岗位置。但是，在现在的实现过程中，我们考虑的基本都是人数满分配，因为报岗人数是受限制的。
		 * 4、在每一次分配上岗完成之后，我们应该将上岗信息中的区域改为与组长相对应的区域。这样一来，我们就实现了组长一对多的模式。（区域编号就是组长id）
		 * 5、组长完全是可以在前台进行添加的，这个在前台实现之后传入组长信息表中。
		 */
		
		//第五步、实现组长信息的读读取，以及保存组长的信息。
		List<Groupheader> groupheader_list = groupheaderMapper.selectByExample(null);
		for (Groupheader groupheader : groupheader_list) {
			System.out.println(groupheader.toString());
			RelationDate.TEAMLEADER_NUM.put(groupheader.getAnumber().intValue(), groupheader.getCount().intValue());
		}
		
		//第六步、组长信息以及人数限制保存之后，我们就可以对学生进行分配了
		for (Worktable worktable : work_list) {
			String[] s = worktable.getAnumber().split(",");
			int len = s.length;
			for(int i = 0; i < len; i++) {
				int num = Integer.parseInt(s[i]);
				//System.out.print(num+" 人数: "+RelationDate.TEAMLEADER_NUM[num]+"  ");
				if(RelationDate.TEAMLEADER_NUM.get(num) != 0) {
					worktable.setAnumber(num+"");
					//RelationDate.TEAMLEADER_NUM[num]--;
					int num1 = RelationDate.TEAMLEADER_NUM.get(num)-1;
					RelationDate.TEAMLEADER_NUM.replace(num, num1);
					break;
				}
			}
			//System.out.println();
		}
		
		for (Worktable worktable : work_list) {
			System.out.println(worktable);
		}
		
		//第七步、在对学生分配完成之后,我们需要将学生的信息重新保存到数据库中，并且要将组长的数量进行修改
		for (Worktable worktable : work_list) {
			worktableMapper.updateByPrimaryKeySelective(worktable);
		}
		
		//第八步、对组长信息保存
		for (Groupheader groupheader : groupheader_list) {
			Long count = (long) RelationDate.TEAMLEADER_NUM.get(groupheader.getAnumber().intValue());
			groupheader.setCount(count);
			groupheaderMapper.updateByPrimaryKeySelective(groupheader);
		}
		
	}

}
