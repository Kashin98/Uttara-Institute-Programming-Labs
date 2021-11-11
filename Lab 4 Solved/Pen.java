public class Pen{
	public String color = "red";
	public int inkQty = 1;

	public void refill(int addInkQty){
		if(addInkQty < 1 || addInkQty > 100){
			System.out.println("Add correct value");
			return;
		}
		if(this.inkQty + addInkQty > 100){
			System.out.println("Ink Qty is 100, returned leftover Ink: "+ ((this.inkQty + addInkQty) - 100));
			this.inkQty = 100;
			return;
		}
		this.inkQty += addInkQty;

	}

	public void write(String text){
		if(inkQty > 1 ){
			System.out.println(text);
			inkQty--;
		} else{
			System.out.println("No Ink");
		}
	}

}