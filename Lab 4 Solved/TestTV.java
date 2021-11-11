public class TestTV{
	public static void main(String[] args) {
		TV tv = new TV();
		tv.name = "Samsung";
		tv.changeChannel(800); //fails can only change between 1 to 100
		tv.changeChannel(80); // still fails, need tv to be on
		// none work without tv being on
		tv.channelIncrement();
		tv.channelDecrement();
		tv.display();

		// tv is on
		tv.switchOn();
		tv.changeChannel(80); // works
		tv.channelIncrement(); // 81
		tv.channelDecrement(); // 80
		tv.channelDecrement(); // 79
		tv.display(); // 79, volume autoset to 1 when object was created
		tv.setVolume(980); //fails, needs to be between 1 - 100
		tv.setVolume(75);
    }
}