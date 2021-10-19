package ex3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex3.dao.EmpDAO;
import ex3.vo.EmpVO;

public class EmpAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// MyBatis를 활용하여 자원을 가져온다.
		EmpVO[] ar = EmpDAO.getList();
		
		// 받은 자원을 request에 저장
		request.setAttribute("ar", ar);
		
		return "/ex3/page5.jsp";
	}

}
