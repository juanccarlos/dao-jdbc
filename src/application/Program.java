package application;

import java.util.Date;

import model.entites.Departament;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		Departament obj = new Departament(1, "back");
		
		Seller seller = new Seller(51, "juan", "juan@gmail.com", new Date(), 1000.0, obj);
		System.out.println(seller);
	}

}
