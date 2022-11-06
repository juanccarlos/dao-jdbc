package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = Daofactory.createSellerDao();
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
	}
}
