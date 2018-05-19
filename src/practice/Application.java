package practice;

public class Application {
	public static void main(String args[]) {

		Simulator simulator = new Simulator();

		simulator.playSound(new Dog());
		simulator.showVoice();

		simulator.playSound(new Cat());
		simulator.showVoice();
	}
}
