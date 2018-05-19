package practice;

public class Simulator {
Animal animal;
public void playSound(Animal animal){
	this.animal=animal;

}
public void showVoice(){
	animal.cry();
	System.out.println("动物的种类是："+animal.getAnimalName());
	
	
}

}

