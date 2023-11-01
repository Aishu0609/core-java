class PrinterStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting Printer in PrinterStarter");
		
		Printer Printer=new Printer();
		System.out.println("Printer brand is: "+Printer.brand);
		System.out.println("Printer type is: "+Printer.type);
		System.out.println("Printer noofsheets is: "+Printer.noofsheets);
		System.out.println("Printer cost is: "+Printer.cost);
		System.out.println("Printer warranty is: "+Printer.warranty);
		
		Printer Printer1=new Printer("Epson");
		System.out.println("Printer1 brand is: "+Printer1.brand);
		System.out.println("Printer1 type is: "+Printer1.type);
		System.out.println("Printer1 noofsheets is: "+Printer1.noofsheets);
		System.out.println("Printer1 cost is: "+Printer1.cost);
		System.out.println("Printer1 warranty is: "+Printer1.warranty);
		
		Printer Printer2=new Printer("Epson","Ink");
		System.out.println("Printer2 brand is: "+Printer2.brand);
		System.out.println("Printer2 type is: "+Printer2.type);
		System.out.println("Printer2 noofsheets is: "+Printer2.noofsheets);
		System.out.println("Printer2 cost is: "+Printer2.cost);
		System.out.println("Printer2 warranty is: "+Printer2.warranty);
		
		Printer Printer3=new Printer("Epson","Ink",200);
		System.out.println("Printer3 brand is: "+Printer3.brand);
		System.out.println("Printer3 type is: "+Printer3.type);
		System.out.println("Printer3 noofsheets is: "+Printer3.noofsheets);
		System.out.println("Printer3 cost is: "+Printer3.cost);
		System.out.println("Printer3 warranty is: "+Printer3.warranty);
		
		Printer Printer4=new Printer("Epson","Ink",200,1500);
		System.out.println("Printer4 brand is: "+Printer4.brand);
		System.out.println("Printer4 type is: "+Printer4.type);
		System.out.println("Printer4 noofsheets is: "+Printer4.noofsheets);
		System.out.println("Printer4 cost is: "+Printer4.cost);
		System.out.println("Printer4 warranty is: "+Printer4.warranty);
		
				
		Printer Printer5=new Printer("Epson","Ink",200,2000);
		System.out.println("Printer5 brand is: "+Printer5.brand);
		System.out.println("Printer5 type is: "+Printer5.type);
		System.out.println("Printer5 noofsheets is: "+Printer5.noofsheets);
		System.out.println("Printer5 cost is: "+Printer5.cost);
		System.out.println("Printer5 warranty is: "+Printer5.warranty);
		
		System.out.println("Ending Printer in PrinterStarter");
	}
}