package enumerado;

import java.util.Date;

import entities.Order;
import enumeradoa.Enumeroad;

public class PRograma {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), Enumeroad.PENDING_PAYMENT);

		System.out.println(order);
		
		Enumeroad os1 = Enumeroad.DELIVERED;
		Enumeroad os2 = Enumeroad.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
