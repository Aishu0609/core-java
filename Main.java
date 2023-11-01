class Main{
	
	public static void main(String[] ethics){
		System.out.println("Starting Main");
		System.out.println("---------------------");
		System.out.println("Starting train");
	    Train train=new Train();

		System.out.println(train.color);                             
		System.out.println(train.cost);
		System.out.println(train.compartment);
		System.out.println(train.passengerNames);
		System.out.println(train.ticketPrice);
		
        Train train1=new Train();
		
		System.out.println(train1.color);
		System.out.println(train1.cost);
		System.out.println(train1.compartment);
		System.out.println(train1.passengerNames);
		System.out.println(train1.ticketPrice);	
		System.out.println("ending train");
		System.out.println("\n");
		
		System.out.println("Starting pendrive");
		PenDrive pendrive=new PenDrive();
		System.out.println(pendrive.price);
		System.out.println(pendrive.size);
		System.out.println(pendrive.brand);
		System.out.println(pendrive.color);
		System.out.println(pendrive.storage);
		
		PenDrive pendrive1=new PenDrive();
		
		System.out.println(pendrive1.price);
		System.out.println(pendrive1.size);
		System.out.println(pendrive1.brand);
		System.out.println(pendrive1.color);
		System.out.println(pendrive1.storage);
		System.out.println("ending pendrive");
		System.out.println("\n");
		System.out.println("Starting perfume");
		Perfume perfume=new Perfume();
		System.out.println(perfume.brand);
		System.out.println(perfume.cost);
		System.out.println(perfume.types);
		System.out.println(perfume.grams);
		System.out.println(perfume.fragnance);
		
		Perfume perfume1=new Perfume();
		System.out.println(perfume1.brand);           
		System.out.println(perfume1.cost);
		System.out.println(perfume1.types);
		System.out.println(perfume1.grams);
		System.out.println(perfume1.fragnance);
		
		System.out.println("ending perfume");
		System.out.println("\n");
		System.out.println("Starting Ambulance");
		Ambulance ambulance=new Ambulance();
		System.out.println(ambulance.persons); 
		System.out.println(ambulance.noOfPatient);
		System.out.println(ambulance.kilometer);
		System.out.println(ambulance.phnnumber);
		System.out.println(ambulance.hospitals);
		
		Ambulance ambulance1=new Ambulance();
		System.out.println(ambulance1.persons);
		System.out.println(ambulance1.noOfPatient);
		System.out.println(ambulance1.kilometer);
		System.out.println(ambulance1.phnnumber);
		System.out.println(ambulance1.hospitals);
		
		System.out.println("ending Ambulance");
		System.out.println("\n");
		
		System.out.println("Starting Kidney");
		Kidney kidney=new Kidney();
		System.out.println(kidney.noOfKidney);
		System.out.println(kidney.parts);
		System.out.println(kidney.layers);
		System.out.println(kidney.disease);
		System.out.println(kidney.medicine);
		
		Kidney kidney1=new Kidney();
		System.out.println(kidney.noOfKidney);
		System.out.println(kidney.parts);
		System.out.println(kidney.layers);
		System.out.println(kidney.disease);
		System.out.println(kidney.medicine);
		System.out.println("ending Kidney");
		System.out.println("\n");
		System.out.println("Starting Hospital");
		Hospital hospital=new Hospital();
		System.out.println(hospital.surgeon); 
		System.out.println(hospital.bill);
		System.out.println(hospital.name);
		System.out.println(hospital.hospital);
		System.out.println(hospital.place);
		
		Hospital hospital1=new Hospital();
		System.out.println(hospital1.surgeon);
		System.out.println(hospital1.bill);
		System.out.println(hospital1.name);
		System.out.println(hospital1.hospital);
		System.out.println(hospital1.place);
		System.out.println("ending Hospital");
		System.out.println("\n");
		
		System.out.println("Starting mall");
		Mall mall=new Mall();
		System.out.println("shops"+mall.shops);  
		System.out.println("product"+mall.product);
		System.out.println("price"+mall.price);
		System.out.println("location"+mall.location);
		System.out.println("moovieTheatre"+mall.movieTheatre);
		
		Mall mall1=new Mall();
		System.out.println("shops"+mall1.shops);
		System.out.println("product"+mall1.product);
		System.out.println("price"+mall1.price);
		System.out.println("location"+mall1.location);
		System.out.println("moviTheatre"+mall1.movieTheatre);
		
		System.out.println("ending mall");
		System.out.println("\n");
		System.out.println("Starting Temple");
		Temple temple=new Temple();
		System.out.println("noOfPersons"+temple.noOfPersons);
		System.out.println("godName"+temple.godname);
		System.out.println("district"+temple.district);
		System.out.println("place"+temple.place);
		System.out.println("timing"+temple.timing);
		
		Temple temple1=new Temple();
		System.out.println("noOfPersons"+temple1.noOfPersons);
		System.out.println("godname"+temple1.godname);
		System.out.println("district"+temple1.district);
		System.out.println("piace"+temple1.place);
		System.out.println("timing"+temple1.timing);
		
		System.out.println("ending temple");
		System.out.println("\n");
		System.out.println("Starting SpaceStation");
		SpaceStation spacestation=new SpaceStation();
		System.out.println("network"+spacestation.network);
		System.out.println("noOfStations"+spacestation.noOfStations);
        System.out.println("speed"+spacestation.speed);
        System.out.println("lanched"+spacestation.lanched);
        System.out.println("center"+spacestation.center);		
		SpaceStation spacestation1=new SpaceStation();
		System.out.println("network"+spacestation.network);
		System.out.println("noOfStations"+spacestation.noOfStations);
		System.out.println("speed"+spacestation.speed);
		System.out.println("lanched"+spacestation.lanched);
		System.out.println("center"+spacestation.center);	
		
		System.out.println("ending SpaceStation");
		System.out.println("\n");
		System.out.println("Starting BusStand");
		BusStand busstand=new BusStand();
		System.out.println("type"+busstand.type);
		System.out.println("noOfBuses"+busstand.noOfBuses);
		System.out.println("color"+busstand.color);
		System.out.println("workers"+busstand.workers);
		System.out.println("seats"+busstand.seats);
		
		BusStand busstand1=new BusStand();
		System.out.println("type"+busstand1.type);
		System.out.println("noOfBuses"+busstand1.noOfBuses);
		System.out.println("color"+busstand1.color);
		System.out.println("workers"+busstand1.workers);
		System.out.println("seats"+busstand1.seats);
				
		System.out.println("ending BusStand");
		System.out.println("\n");
		System.out.println("Starting allstations");
		AllStations allstations=new AllStations();
		System.out.println("type"+allstations.type);
		System.out.println("address"+allstations.address);
		System.out.println("employes"+allstations.employes);
		System.out.println("availability"+allstations.availability);
		System.out.println("pincode"+allstations.pincode);
		AllStations allstations1=new AllStations();
		System.out.println("type"+allstations.type);
		System.out.println("address"+allstations.address);
		System.out.println("employes"+allstations.employes);
		System.out.println("availability"+allstations.availability);
		System.out.println("pincode"+allstations.pincode);
		System.out.println("ending allStation");
		System.out.println("\n");
		
		
		
		System.out.println("ending Main");
		
		
	}
}