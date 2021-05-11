package com.com.food.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.com.food.model.FoodsDTO;
import com.com.food.model.MyFoodsVO;
import com.com.food.service.DBConnection;
import com.com.food.service.impl.FoodImplV1;



@WebServlet("/insert/*")
public class InsertController extends HttpServlet {

	private static final long serialVersionUID = -8552356740377606394L;

	public DBConnection dbConn;
	public FoodImplV1 fSer;

	public InsertController() {
		dbConn = new DBConnection();
		fSer = new FoodImplV1();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		String subPath = req.getPathInfo();

		if (subPath.equals("/selectName")) {
			
			RequestDispatcher rDis = req.getRequestDispatcher("/WEB-INF/view/selectName.jsp");
			rDis.forward(req, resp);
			
			
		} else if (subPath.equals("/selectByName")) {	
			
			List<FoodsDTO> fList = new ArrayList<FoodsDTO>();
			
			String name = req.getParameter("name");
			fList = fSer.selectName(name);
			
			req.setAttribute("FLIST", fList);
			
			RequestDispatcher rDis = req.getRequestDispatcher("/WEB-INF/view/selectByName.jsp");
			rDis.forward(req, resp);
			
			
		} else if (subPath.equals("/insert")) {

			String code = req.getParameter("code");
			req.setAttribute("CODE", code);
			RequestDispatcher rDis = req.getRequestDispatcher("/WEB-INF/view/insert.jsp");
			rDis.forward(req, resp);

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		String mf_date = String.format(year + "-"+month+"-"+day);
		String mf_code = req.getParameter("code");
		String strEat = req.getParameter("eat");

		Boolean bY = (year == null || year.equals(""));
		Boolean bM = (month == null || month.equals(""));
		Boolean bD = (day == null || day.equals(""));
		
		if (bY || bM || bD) {
			out.println("날짜는 반드시 입력해야 합니다.");
			out.close();
		} else if(mf_code == null || mf_code.equals("")){
			out.println("식품코드는 반드시 입력해야 합니다.");
			out.close();
		} else if(strEat == null || strEat.equals("")){
			out.println("섭취량은 반드시 입력해야 합니다.");
			out.close();
		} else {
//		String date = String.format("%s-%s-%s", year,month,day);
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date d = sd.parse(date);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("날짜 타입 오류");
//		}
		
		Integer mf_eat = Integer.valueOf(strEat);

		MyFoodsVO mfVO = new MyFoodsVO();

		mfVO.setMf_date(mf_date);
		mfVO.setMf_code(mf_code);
		mfVO.setMf_eat(mf_eat);
		int result = fSer.insert(mfVO);

		if (result > 0) {
			resp.sendRedirect("/diet");
		} else {
			out.println("입력값이 잘못되었습니다.");
			resp.sendRedirect("/diet");
		}

		}
	}

}
