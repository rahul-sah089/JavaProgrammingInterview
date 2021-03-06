package creational.abstractFactory;

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		// get shapeFactory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get object of shape circle
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		// get object of shape rectangle
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		// get object of shape square
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();

		// get colorFactory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// get object of color Red
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		// get object of color Blue
		Color color2 = colorFactory.getColor("BLUE");
		// get object of color Green
		Color color3 = colorFactory.getColor("GREEN");
	}
}
