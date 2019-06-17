package paymentsManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import beans.Location;
import beans.MyDate;
import beans.Payment;
import beans.Product;
import beans.Visa;

public class Main {
	
	public static void main(String[] args) throws IOException  {
		
	
		
		//Payment payment1 = new Visa();
		//  ( MyDate )  productName  price    type    name       (     location        )
		//  1/2/09 4:53	  Product1	 1200	 Visa	 Betina	   Parkville      MO	United States
		/*
		payment1.setTransaction_date( new MyDate(1, 2,2009));
		payment1.setProduct(new Product("product1"));
		payment1.setPrice(1200);
		//payment1.setType("Visa");
		payment1.setName("Batina");
		payment1.setLocation(new Location("Parkville","MO","United States"));
		/*
		//toString method
		
		//System.out.println(payment1.toString());
		
		/*
		PaymentController paymentController = new PaymentController();
		paymentController.addAPaymentRecord("1/4/09 12:56,Product2,3600,Visa,Gerd W ,Cahaba Heights, AL,United States");
		System.out.println(paymentController.payments.get(0).toString());
		*/
		
		BufferedReader br = new BufferedReader(
				new FileReader("Users⁩/⁨imran⁩/⁨Downloads/⁩SalesJan2009.csv"));
		
		
		/*
		String line = "";
		br.readLine();
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		*/
		
	}
}
