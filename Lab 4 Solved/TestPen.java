public class TestPen{
	public static void main(String[] args){
		Pen p = new Pen();
		p.write("Java is a OOPL");
		p.write("Java is a OOPL"); // inkQty by default was 1, after above pprint this should say no ink;

		p.refill(-2); // negative values and 0 should say values are incorrect.
		p.refill(2); // should refill and add to inkqty

		p.write("We can write again");
		p.write("Yay");
		p.write("This will fail"); // we only added 2 inkqty in our refill, this will fail as we used are ink on top.

		// EVERYTHING WORKS. Edge case no limit added to inkQty. We will overflow inkQty if user tries to add 2^31-1 when refilling. So we should add a limit to inkQty.

		p.refill(50);
		p.refill(Integer.MAX_VALUE); // fails, test case solved. New problem, how to stop user from adding inkQty 99 over again and again leading to eventual overflow.
		p.refill(99); // Current qty = 50. if addInkQty causes oveflows above 100, we return back ink leftover ink and set inkQty to 100;
		p.refill(20);
	}
}
