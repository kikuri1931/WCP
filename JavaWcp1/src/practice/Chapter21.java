package practice;

import java.math.BigDecimal;

public class Chapter21 {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> PeachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));

		appleBasket.printTotalPrice();
		PeachBasket.printTotalPrice();
	}
}
