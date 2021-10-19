package ex3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex3.dao.EmpDAO;
import ex3.vo.EmpVO;

public class ResAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 각 파라미터들을 받자!
		String search = request.getParameter("search");
		
		String text = request.getParameter("text");
		
		EmpVO[]ar = EmpDAO.searchList(search, text);
		
		
		request.setAttribute("res", ar);
		
		return "/ex3/page6_res.jsp";
	}

}
