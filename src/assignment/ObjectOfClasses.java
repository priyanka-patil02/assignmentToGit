package assignment;

public class ObjectOfClasses
{

	public static void main(String[] args) 
	{
		
		Notebook nb = new Notebook();
		nb.name= "Navneet";
		nb.length= 12;
		nb.pages=150;
		nb.size="A4";
		nb.colour= "Blue";
		
		nb.toWrite("Notebook is used to write notes.");
		System.out.println("Notebook Length = "+nb.length);
		System.out.println("Notebook Pages = "+nb.pages);
		System.out.println("Notebook Size = "+nb.size);
		System.out.println("Notebook Colour = "+nb.colour);
		
		System.out.println("*********************************** ");
		
		
		
		Sofa sf=new Sofa();
		sf.capacity=3;
		sf.name="Wooden";
		sf.length=3.5;
		sf.colour="Red";
		
		sf.toSeat("Sofa is used to sit");
		System.out.println("Sofa Colour = "+sf.colour);
		System.out.println("Sofa Length = "+sf.length);
		System.out.println("Sofa Capacity = "+sf.capacity);
		
		System.out.println("*********************************** ");
		
		
		
		
		Toys ty= new Toys();
		ty.name="Teddy bear";
		ty.material="Rubber";
		ty.weight=50;
		ty.colour="Pink";
		
		
		ty.toPlay("toy is used play.");
		System.out.println("Toy Colour = "+ty.colour);
		System.out.println("Toy Length = "+ty.weight);
		System.out.println("Toy Capacity = "+ty.material);
		
		System.out.println("*********************************** ");
		
		
		
		Table tb= new Table();
		tb.shape="Square";
		tb.length=60;
		tb.height=30;
		tb.weight=3;
		tb.colour="Black";
		
		tb.toWrite("table is ");
		System.out.println("Table length = "+tb.length);
		System.out.println("Table Height = "+tb.height);
		System.out.println("Table Weight = "+tb.weight);
		System.out.println("Table Colour = "+tb.colour);
		
		
		System.out.println("*********************************** ");
		
		
		
		
		Mouse ms = new Mouse();
		ms.colour="Black";
		ms.length=10;
		ms.height=2;
		ms.shape="Oval";
		ms.button=3;
		
		ms.toCick("mouse is beautiful");
		
		
		System.out.println("Mouse length = "+ms.length);
		System.out.println("Mouse Height = "+ms.height);
		System.out.println("Mouse shape = "+ms.shape);
		System.out.println("Mouse buttons = "+ms.button);
		
		
		System.out.println("*********************************** ");
		
		
		
		
		Books bk = new Books();
		
		bk.name="Novel";
		bk.weight=200;
		bk.pages=500;
		
		bk.toRead("is used to read.");
		System.out.println("Book weight = "+bk.weight);
		System.out.println("Book pages = "+bk.pages);
		
		System.out.println("*********************************** ");
		

	
		Clock clk = new Clock();
		
		clk.name="Titan";
		clk.material= "Glass";
		clk.shape="Round";
		clk.numbers=12;
		
		clk.toShowTime("is best clock company.");
		
		System.out.println("Watch material = "+clk.material);
		System.out.println("Watch shape = "+clk.shape);
		System.out.println("Watch numbers = "+clk.numbers);
		
		System.out.println("*********************************** ");
		
		
		
		Fan fn = new Fan();
		
		fn.name="Crompton";
		fn.material="Iron";
		fn.noOfBlades= 3;
		fn.weight=500;
		
		fn.circulateAir("has best celling fans");
		
		
		System.out.println("Fan material = "+fn.material);
		System.out.println("Fan blades = "+fn.noOfBlades);
		System.out.println("Fan weight = "+fn.weight);
		System.out.println("*********************************** ");
		
		
		Pen pn = new Pen();
		pn.name="Linc";
		pn.height=7;
		pn.width=1;
		pn.shape="Round";
		
		pn.toWrite("is good pen.");
		System.out.println("Pen height = "+pn.height);
		System.out.println("Pen width = "+pn.width);
		System.out.println("Pen shape = "+pn.shape);
		System.out.println("*********************************** ");
		
		
		Human hm = new Human();
		hm.height=5.7;
		hm.weight=61;
		hm.colour= "Fair";
		hm.name="Priyanka";
		hm.age=30;
		

		hm.toWalk("walks 2 km daily.");
		System.out.println("Human height = "+hm.height);
		System.out.println("Human weight = "+hm.weight);
		System.out.println("Human colour = "+hm.colour);
		System.out.println("Human Age = "+hm.age);
		System.out.println("*********************************** ");
		
		
		
	}

}
