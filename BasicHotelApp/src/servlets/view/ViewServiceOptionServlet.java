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
import db.dao.MyCurrencyDAO;
import db.dao.ParticipantTypeDAO;
import db.dao.ServiceOptionDAO;
import db.dao.impl.MyCurrencyDaoImpl;
import db.dao.impl.ParticipantTypeDAOImpl;
import db.dao.impl.ServiceOptionDAOImpl;
import model.MyCurrency;
import model.ParticipanType;
import model.ServiceOption;
import services.general.PathCreatorPrefixAndSufix;
import services.general.PathCreatorPrefixAndSufixImpl;

/**
 * Servlet implementation class ViewServiceOptionServlet
 */
@WebServlet("/ViewServiceOptionServlet")
public class ViewServiceOptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServiceOptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServiceOptionDAO< ServiceOption> serviceOptionOP = new ServiceOptionDAOImpl();
		
		List<ServiceOption> listS = serviceOptionOP.getAll(Db.getConn());
		System.out.println(listS.toString());
		
		MyCurrencyDAO<MyCurrency> currencyService = new MyCurrencyDaoImpl();
		List<MyCurrency> listC = currencyService.getAll(Db.getConn());
		System.out.println(listC.toString());
		
		ParticipantTypeDAO<ParticipanType> ptSevice = new ParticipantTypeDAOImpl();
		List<ParticipanType> listPt = ptSevice.getAll(Db.getConn());
		System.out.println(listPt.toString());
		
		request.setAttribute("listS", listS);
		request.setAttribute("listC", listC);
		request.setAttribute("listP", listPt);
		
		String pageName="ServiceOption";
		
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
