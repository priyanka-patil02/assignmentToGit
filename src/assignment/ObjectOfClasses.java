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
		ty.name="Doll";
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
