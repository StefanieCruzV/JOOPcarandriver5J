package com.stefanie.zoo;

public class TestMammal {

	public static void main(String[] args) {
		System.out.println("hello form Zoo");

		Mammal mammal1 = new Mammal("elephant");
		// mammal1.displayEnergy();
		System.out.println(mammal1.displayEnergy());
		Gorilla g1 = new Gorilla("gorilla1");
		System.out.println(g1.displayEnergy());
		g1.throwSomething();
		g1.displayEnergy();
		g1.eatBananas();
		g1.climb();
		Gorilla g2 = new Gorilla("gorilla2");
		System.out.println(g2.displayEnergy());
		g2.throwSomething();
		g2.throwSomething();
		g2.throwSomething();
		g2.eatBananas();
		g2.eatBananas();
		g2.climb();
		g2.displayEnergy();
		


	}

}
