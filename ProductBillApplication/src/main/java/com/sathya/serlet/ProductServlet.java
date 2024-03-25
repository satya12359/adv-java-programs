package com.sathya.serlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ProId=Integer.parseInt(request.getParameter("ProId"));
		String ProName=request.getParameter("ProName");
		Double ProPrice=Double.parseDouble(request.getParameter("ProPrice"));
		int ProQuantity=Integer.parseInt(request.getParameter("proQuantity"));
		double netPayPrice=0.0;
		double tBill=ProPrice*ProQuantity;
		double discount=0.0;
		if(tBill<1000) 
		{
			discount=0;
			netPayPrice=tBill-discount;
		}
		else if(tBill>=1000&& tBill<5000)
		{
		  discount=(double)(tBill*0.05);
		  netPayPrice=tBill-discount;
		 }
		else if(tBill>=5000&& tBill<10000)
		{
			  discount=(double)(tBill*0.10);
			  netPayPrice=tBill-discount;
		}
		else if(tBill>=1000)
		{
		 	 discount=(double)(tBill*0.15);
			  netPayPrice=tBill-discount;
		}
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=red>");
		writer.println("<br><br>");
		writer.println("Product Id="+ProId);
		writer.println("<br><br>");
		writer.println("Product Name="+ProName);
		writer.println("<br><br>");
		writer.println("Product Price="+ProPrice);
		writer.println("<br><br>");
		writer.println("Product Quantity="+ProQuantity);
		writer.println("<br><br>");
		writer.println("Product Bill="+tBill);
		writer.println("<br><br>");
		writer.println("Product Discount="+discount);
		writer.println("<br><br>");
		writer.println("net Payable Price="+netPayPrice);
		writer.println("<br><br>");
		writer.println("</body>");
		writer.println("</html>");
	
	}

}
