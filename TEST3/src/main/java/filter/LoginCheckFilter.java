package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter {
	
	String viewPage;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 요청의 필터 처리 : request
		
		// 회원의 로그인 여부 확인: session이 있다 없다 -> session 속성의 회원 로그인 정보 확인
		
		// 1. Session 객체를  구한다. request.getSession(false)
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession(false);
			// getSession() : 현재 세션을 반환, 없다면 새로운 세션을 생성해서 반환
			// getSession(true) : 현재 세션은 리턴, 없다면 새로운 세션 생성해서 반환
			// getSession(false) : 세션 객체가 없다면 null 반환 -> 없으면 null이 나와야하므로 false 이용
		
		// 세션객체에 userName 속성이 있다면 원래 요청 처리를 진행
		// 없다면 로그인폼으로 이동
		if(session!=null && session.getAttribute("loginInfo") != null) {
			// session이 null이 아니며, name이라는 속성값을 가지고 있다면 ->
			// 로그인 상태임
			
			// 다음 필터를 실행, 현재 필터가 마지막 필터이면 실제 요청을 처리
			chain.doFilter(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
		// 필터를 이용한 응답 데이터 처리 : response	
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		ServletContext context = config.getServletContext();

		String loginFormUri = context.getInitParameter("loginFormUri");

		if (loginFormUri != null) {
			viewPage = loginFormUri;
		} else {
			viewPage = "/loginForm.jsp";
		}
	}

	@Override
	public void destroy() {
	}
	
}