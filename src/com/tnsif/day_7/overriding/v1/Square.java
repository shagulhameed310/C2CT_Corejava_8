package com.tnsif.day_7.overriding.v1;
public class Square extends Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}


	public void draw() {
		System.out.println("Drawing a square with side " + side);
	}


	public void erase() {
		System.out.println("Erasing a square with side " + side);
	}
}
