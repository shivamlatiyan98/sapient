package com.Servelet.demo;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Employee>allemployee=new Vector<Employee>();
	
	allemployee.add(new Employee("Shivam", "567"));
	allemployee.add(new Employee("vikas", "985"));
	allemployee.add(new Employee("ajay", "254"));
	
	
List<Customer>allcustomers=new Vector<Customer>();
	
	allcustomers.add(new Customer("Aman", "1233336"));
	allcustomers.add(new Customer("Akash", "123355555"));
	allcustomers.add(new Customer("Aviral", "123336666"));
	
	
	List<Product>allProducts=new Vector<Product>();
	
	allProducts.add(new Product("hairdryer", "500"));
	allProducts.add(new Product("Tv", "50000"));
	allProducts.add(new Product("wax", "6000"));
	
	
	
		
	String urlString=	request.getRequestURI();
	System.out.println(urlString);
	response.setContentType("text/html");
	
	PrintWriter out=response.getWriter();
	out.println("<div>hello</div>");
	
	
	  switch ( urlString) {
	  
	  
	  
	case "/getemployee": {
		out.println("<html><body>");
		String tempString="";
		for(Employee employee:allemployee) {
			tempString+=employee.getName()+" "+employee.getCode();
			tempString+="<br>";
		}
		
		out.println(tempString);
		  break;
	}
	case "/getcustomer": {
		out.println("<html><body>");
		String tempString="";
		for(Customer employee:allcustomers) {
			tempString+=employee.getCustomer_name()+" "+employee.getCustomer_id();
			tempString+="<br>";
		}
		
		out.println(tempString);
		
		
		  break;
	}
	case "/getproducts": {
		out.println("<html><body>");
		String tempString="";
		for(Product p:allProducts) {
			tempString+=p.productName+" "+p.productPrice;
			tempString+="<br>";
		}
		
		out.println(tempString);
		  break;
	}
	
	default  : {
		break;
	}
	
	
	
	
	
	
	  }
	
	
	
	  return;
	  
	
		
	}


	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
