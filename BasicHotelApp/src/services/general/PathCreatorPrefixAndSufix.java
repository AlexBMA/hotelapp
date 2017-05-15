package services.general;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

public interface PathCreatorPrefixAndSufix {
	
	
	public String createPath(String pageName);
	
	public RequestDispatcher createPathForDispatcher(HttpServletRequest request, String nextPage);
}
