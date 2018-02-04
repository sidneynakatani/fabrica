package br.com.sidney.fabrica.toy.main;



import br.com.sidney.fabrica.toy.Toy;
import br.com.sidney.fabrica.toy.enumeration.ToyEnum;
import br.com.sidney.fabrica.toy.factory.ToyFactory;

public class FactoryMethodDemo {
	
	public static void main(String[] args) {
		
		ToyFactory factory = new ToyFactory();
		
		Toy doll = factory.make(ToyEnum.doll);
		Toy miniCar = factory.make(ToyEnum.minicar);
		Toy ball = factory.make(ToyEnum.ball);
		
		doll.info();
		miniCar.info();
		ball.info();
		
	}

}
