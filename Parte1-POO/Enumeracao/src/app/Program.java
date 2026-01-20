package app;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus s01 = OrderStatus.DELIVERED;
		OrderStatus s02 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(s01);
		System.out.println(s02);
		

	}

}
