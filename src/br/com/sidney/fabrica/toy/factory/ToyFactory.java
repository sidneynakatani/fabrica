package br.com.sidney.fabrica.toy.factory;



import br.com.sidney.fabrica.toy.Toy;
import br.com.sidney.fabrica.toy.enumeration.ToyEnum;
import br.com.sidney.fabrica.toy.impl.Ball;
import br.com.sidney.fabrica.toy.impl.Doll;
import br.com.sidney.fabrica.toy.impl.MiniCar;

public class ToyFactory {
	
	public Toy make(ToyEnum toyType) {
		
		Toy toy = null;
		
		switch (toyType) {
		
		case ball:
			toy = new Ball();
			return toy;
			
		case minicar:
			toy = new MiniCar();
			return toy;
			
		case doll:
			toy = new Doll();
			return toy;
			
		}
		
			
		return toy;
	}

}
