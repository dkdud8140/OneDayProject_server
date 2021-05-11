package com.com.food.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.com.food.model.MyfoodsDTO;
import com.com.food.service.FoodService;
import com.com.food.service.impl.FoodImplV1;

@WebServlet("/dateSerch")
public class DateController extends HttpServlet {
	private static final long serialVersionUID = 4126168640333885757L;

	FoodService fSer;

	public DateController() {
		fSer = new FoodImplV1();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;cahrset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		String sYear = req.getParameter("sYear");
		String sMonth = req.getParameter("sMonth");
		String sDay = req.getParameter("sDay");
		String sDate = String.format(sYear+"-"+sMonth+"-"+sDay);
		
		String lYear = req.getParameter("lYear");
		String lMonth = req.getParameter("lMonth");
		String lDay = req.getParameter("lDay");
		String lDate = String.format(lYear+"-"+lMonth+"-"+lDay);

		System.out.println(sDate);
		System.out.println(lDate);
		List<MyfoodsDTO> mfList = fSer.selectDate(sDate, lDate);
		req.setAttribute("MFLIST", mfList);
		RequestDispatcher rDis = req.getRequestDispatcher("/WEB-INF/view/selectByDate.jsp");
		rDis.forward(req, resp);

	}

}
