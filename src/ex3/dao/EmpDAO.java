package ex3.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import ex3.service.FactoryService;
import ex3.vo.EmpVO;


public class EmpDAO {
	
	
	// 목록
	public static EmpVO[] getList() {
		EmpVO[] ar = null;
		
		// DB 연결준비!!
		SqlSession ss = FactoryService.getFactory().openSession();
		
		
		// 모든 정보를 DB와 연결하여 목록을 가져오자!
		List<EmpVO> list = ss.selectList("emp.total");
		
		if(list != null && !list.isEmpty()) {
			// list가 비어있지 않을때!!
			ar = new EmpVO[list.size()];
			list.toArray(ar);
		}
		
		ss.close();
		
		return ar;
	}
	
	// 검색한 사원들 목록 표현하기
	public static EmpVO[] searchList(String search, String text) {

		EmpVO[] ar = null;
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("search", search);
		map.put("text", text);
		
		// DB 연결준비!!
		SqlSession ss = FactoryService.getFactory().openSession();
		
		
		// 모든 정보를 DB와 연결하여 목록을 가져오자!
		List<EmpVO> list = ss.selectList("emp.search",map);
		
		if(list != null && !list.isEmpty()) {
			// list가 비어있지 않을때!!
			ar = new EmpVO[list.size()];
			list.toArray(ar);
		
	}
			
		ss.close();
		
		return ar;
	
		
	
	}
}
















