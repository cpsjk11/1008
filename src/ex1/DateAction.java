package ex1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateAction {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 이 함수를 호출 하면 현재 날짜를 보내주자!
		//Calendar date = Calendar.getInstance();
		
		//LocalDate now = LocalDate.now();
		
		// 현재 날짜를 구하기 위해 객체생성
		/*Calendar now = Calendar.getInstance();
		int y = now.get(Calendar.YEAR);// 현재년도
		int m = now.get(Calendar.MONTH)+1; // 현재월
		int d = now.get(Calendar.DAY_OF_MONTH); //현재 날짜
		
		StringBuffer sb = new StringBuffer();
		sb.append(y);
		sb.append("-");
		sb.append(m);
		sb.append("-");
		sb.append(d);*/
		Date sb = new Date(System.currentTimeMillis());
		
		request.setAttribute("now", sb.toString());
		
		return "/ex1/page1.1.jsp";
	}
	
}
