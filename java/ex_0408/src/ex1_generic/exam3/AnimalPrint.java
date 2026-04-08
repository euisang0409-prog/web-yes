package ex1_generic.exam3;

import java.util.List;

public class AnimalPrint {
	
	public void printAnimals(List<? extends Animal> list) {
		for(Animal a : list) {
			System.out.println(a);
		}
	}
	
}
