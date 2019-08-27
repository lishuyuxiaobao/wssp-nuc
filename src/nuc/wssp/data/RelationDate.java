package nuc.wssp.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nuc.wssp.beans.Mark;

public class RelationDate {
	
//	//负责保存实际关系中的一一对应关系---比较容易查找，后期可以改为Map来保存  a*x+b——>name
//	public static String[][] RELATION_DROM_AREA = new String[100][100];
	
	//负责保存每个组长的信息
//	public static int[] TEAMLEADER_NUM = new int[100];
	
//	//保存标志信息
//	public static String[] MARK_INFO = new String[1000];
	
	
	//
	public static HashMap<HashMap<Long,Long>,String> RELATION_DROM_AREA = new HashMap<>();
	
	public static HashMap<Integer, String> MARK_INFO = new HashMap<>();
	
	public static HashMap<Integer,Integer> TEAMLEADER_NUM = new HashMap<>();
	
	public static List<Mark> list1 = new ArrayList<Mark>();	//宿舍
	public static List<Mark> list2 = new ArrayList<Mark>(); //卫生队
	public static List<Mark> list3 = new ArrayList<Mark>();	//教学楼
	public static List<Mark> list4 = new ArrayList<Mark>();	//保洁队
	public static List<Mark> list5 = new ArrayList<Mark>();	//龙山岗
	public static List<Mark> list6 = new ArrayList<Mark>();	//大岗
	public static List<Mark> list7 = new ArrayList<Mark>();	//
	public static List<Mark> list8 = new ArrayList<Mark>();	//学院
	
}
