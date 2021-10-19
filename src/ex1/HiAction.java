package ex1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiAction {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("str", "nice meet u");
		
		return "/ex1/page3.jsp";
	}

}
