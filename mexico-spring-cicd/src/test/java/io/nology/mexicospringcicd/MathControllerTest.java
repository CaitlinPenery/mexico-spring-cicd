package io.nology.mexicospringcicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathControllerTest {

//	Dependency Injection
	@Autowired
	private MathController controller;
	
	@Test
	public void rectangleAreaReturnsCorrectArea() {
		Integer height = 100;
		Integer width = 200;
		Integer result = controller.rectangleArea(height, width);
		Integer expected = 20000;
		assertEquals(expected, result);
	}
	
	// @Test
	// public void circlePerimeterReturnsCorrectResult() {
	// 	Double radius = 10.00;
	// 	Double expected = 62.83185307179586;
	// 	Double actual = this.controller.circlePerimeter(r);
	// 	assertEquals(expected, actual);
	// }
	
}
