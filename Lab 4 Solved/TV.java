public class TV{
	public String name;
	private int channel = 1;
	private boolean isTurnedOn;
	private int volume = 1;

	public void switchOn(){
		if(this.isTurnedOn){
			System.out.println("Tv is already on");
		}else{
			this.isTurnedOn = true;
			System.out.println("Tv was turned on");
		}
	}

	public void changeChannel(int channelNum){
		if(!this.isTurnedOn){
			System.out.println("Switch on tv");
			return;
		}
		if(channelNum < 0 || channelNum > 100){
			System.out.println("Enter a channel between 1 to 100");
		}else {
			this.channel = channelNum;
			System.out.println("Channel changed to "+channelNum);
		}
	}

	public void channelIncrement(){
		if(!this.isTurnedOn){
			System.out.println("Switch on tv");
			return;
		}
		if(this.channel == 100){
			System.out.println("You're on channel 100, can't go higher");
		}else{
			this.channel++;
			System.out.println("Channel changed to "+this.channel);
		}
	}

	public void channelDecrement(){
		if(!this.isTurnedOn){
			System.out.println("Switch on tv");
			return;
		}
		if( this.channel == 1){
			System.out.println("You're on channel 1, can't go lower");
		}else{
			this.channel--;
			System.out.println("Channel changed to "+this.channel);
		}
	}

	public void display(){
		if(!this.isTurnedOn){
			System.out.println("Switch on tv");
			return;
		}
		System.out.println(this.channel + " " + this.volume);
	}

	public void setVolume(int volume){
		if(!this.isTurnedOn){
			System.out.println("Switch on tv");
			return;
		}
		if(volume < 0 || volume > 100){
			System.out.println("Enter a volume between 1 to 100");
		}else {
			this.volume = volume;
			System.out.println("Volume changed to "+volume);
		}
    }
}