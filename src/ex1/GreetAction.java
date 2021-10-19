package ex1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetAction {
	
	// 현재 메서드는 컨트롤러에 의해서 호출되며, 인자로
	// request,response를 받는다.
	// 반환형은 도착하고자 하는 뷰 페이지의 경로로 String을 지정한다.
	public String execute(HttpServletRequest request, HttpServletResponse response) {// - 여기에 인자값을 서버가 주는 request,response를 받아야지 servlet안에 있는 내용들을 servlet안에서도 사용이 가능하다
		// 어제 컨트롤러에서 했던 request에 값을 저장한다.
		request.setAttribute("msg", "환영합니다."); // request에 저장하기 위해서는 서버로 부터 request와 response를 인자로 받아야지만 저장이 가능하다
								// 그래서 인자로 requset와 response를 서버로 부터 받은 것 이다.(그래서 호출하는 곳은 request와 response를 줘야한다.)
		// view의 경로를 반환한다.
		return "/ex1/page1.jsp";
	}
}
