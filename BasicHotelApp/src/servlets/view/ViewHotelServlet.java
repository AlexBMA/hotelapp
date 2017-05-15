package servlets.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Db;
import db.dao.HotelDAO;
import db.dao.impl.HotelDAOImpl;
import model.Hotel;
import services.general.PathCreatorPrefixAndSufix;
import services.general.PathCreatorPrefixAndSufixImpl;

/**
 * Servlet implementation class ViewHotelServlet
 */
@WebServlet("/ViewHotelServlet")
public class ViewHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewHotelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HotelDAO hotelDAO = new HotelDAOImpl();
		List<Hotel> list = hotelDAO.getAllHotels(Db.getConn());
		
		request.setAttribute("list", list);
		String pageName="Hotel";
		
		PathCreatorPrefixAndSufix pathCreator = new PathCreatorPrefixAndSufixImpl();
		
		RequestDispatcher requestDispatcher = pathCreator.createPathForDispatcher(request, pageName);
		requestDispatcher.forward(request, response);
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
