package services.general;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class PathCreatorPrefixAndSufixImpl implements PathCreatorPrefixAndSufix{

	@Override
	public  String createPath(String pageName) {
		
		//"WEB-INF/view/ProfPage.jsp"
		
		String prefix="WEB-INF/view/";
		String sufix=".jsp";
		String rez =prefix+pageName+sufix;
		return rez;
	}

	@Override
	public  RequestDispatcher createPathForDispatcher(HttpServletRequest request, String nextPage) {
		String fullAddress =createPath(nextPage);
		
		request.getRequestDispatcher(fullAddress);
		return request.getRequestDispatcher(fullAddress);
	}

}
