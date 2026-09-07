package Interface;

interface Printable {
	
	abstract void print();
}

class Document implements Printable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing Document...");
	}
	
	 
}


class Photo implements Printable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing Photo...");
	
	System.out.println("on for the requrimet....");
	}
	
	
	
}

public class TestInterface2 {
	public static void main(String[] args) {
		
		Printable ptble;
		
		ptble= new Document();
		ptble.print();
		
		ptble = new Photo();
		ptble.print();
		 
		 
		
	}

}
