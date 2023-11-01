class Bag{
	
	public static void main(String[] ethics){
		
		int bagCost[]={599,455,999,199,899,366,576,678,900,468};
		short numbers[]={56,95,35,78,48,39,90,24,99,100};
		long mobile[]={9283628912L,9463738292L,6573832921L,9849393020L,9883763362L,9546373838L,9373627281L,8736282902L,9384940382L,9384637829L};
		char vowels[]={'a','e','i','o','u'};
		double percentage[]={89,38,78D,99D,55D,67D,48D,90D,56D,15D};
		float cgpa[]={6.6f,7f,9.0f,4.5f,8.7f,5.8f,6f,5.1f,6.9f,9.4f};
		boolean passedstudents[]={true,true,false,false,true,true,false,true,true,false};
		byte regNo[]={1,2,3,4,5,6,7,8,9,10};
		String names[]={"Aishwarya","Prajwal","Sonu","Ammu","Chandu","Arvind","Sai","Pavan","Niharika","Ajay"};
		String course[]={"MCA","MCA","MBA","Mtech","MBA","Mtech","MCA","MBA","Mtech","MCA"};
		
		
		bagCost[4]=900;
		System.out.println("bagCost is re-assigned "+bagCost);
		bagCost[6]=400;
		System.out.println("bagCost is re-assigned "+bagCost);
		bagCost[8]=300;
		System.out.println("bagCost is re-assigned "+bagCost);
		bagCost[5]=600;
		System.out.println("bagCost is re-assigned "+bagCost);
		bagCost[9]=200;
		System.out.println("bagCost is re-assigned "+bagCost);
		
		numbers[3]=40;
		System.out.println("numbers is re-assigned "+numbers);
		numbers[5]=57;
		System.out.println("numbers is re-assigned "+numbers);
		numbers[7]=68;
		System.out.println("numbers is re-assigned "+numbers);
		numbers[6]=50;
		System.out.println("numbers is re-assigned "+numbers);
		numbers[9]=90;
		System.out.println("numbers is re-assigned "+numbers);
		
		mobile[3]=9282930302L;
		System.out.println("mobile is re-assigned "+mobile);
		mobile[5]=9245262829L;
		System.out.println("mobile is re-assigned "+mobile);
		mobile[7]=8293637489L;
		System.out.println("mobile is re-assigned "+mobile);
		mobile[8]=9958493021L;
		System.out.println("mobile is re-assigned "+mobile);
		mobile[9]=9273839492L;
		System.out.println("mobile is re-assigned "+mobile);
		
		vowels[1]='i';
		vowels[2]='u';
		vowels[3]='a';
		vowels[4]='o';
		vowels[0]='e';
		
		System.out.println("vowels is re-assigned "+vowels);
		
		percentage[2]=89.45;
		percentage[4]=72.03;
		percentage[5]=67.09;
		percentage[3]=90.30;
		percentage[1]=56.45;
		
		System.out.println("percentage is re-assigned "+percentage);
		
		cgpa[2]=7.7f;
		cgpa[4]=8.4f;
		cgpa[5]=6.9f;
		cgpa[7]=9.7f;
		cgpa[8]=7.0f;
		
		System.out.println("cgpa is re-assigned "+cgpa);
		
		passedstudents[6]=false;
		passedstudents[0]=false;
		passedstudents[4]=true;
		passedstudents[3]=false;
		passedstudents[2]=true;
		
		System.out.println("passedstudents is re-assigned "+passedstudents);
		
		regNo[4]=22;
		regNo[2]=45;
		regNo[7]=35;
		regNo[3]=78;
		regNo[1]=68;
		
		System.out.println("regNo is re-assigned "+regNo);
		
		names[5]="swathi";
		names[4]="rithu";
		names[7]="sonu";
		names[2]="manish";
		names[6]="bhavi";
		
		System.out.println("names is re-assigned "+names);
		
		course[4]="MCA";
		course[6]="MBA";
		course[8]="Mtech";
		course[3]="MCA";
		course[2]="MCA";
		
		System.out.println("course is re-assigned "+course);
		
		System.out.println("Starting of bagCost");
		for(int i=0;i<bagCost.length;i++){
			
			System.out.println("values of bagCost"+bagCost[i]);
		}
		for(int i=bagCost.length-1;i>0;i--){
			
			System.out.println("reversing of bagCost"+bagCost[i]);
		}
		for(int i=0;i<bagCost.length;i=i+2){
			
			System.out.println("Skipping element "+bagCost[i]);
		}
		for(int i=bagCost.length/2;i<bagCost.length;i++){
			
			System.out.println("from middle"+bagCost[i]);
		}
		for(int u=0;u<bagCost.length;u++){
			if(bagCost[u]%2==0){
				
	
			System.out.println(bagCost[u]);
			}
		}
		System.out.println("Ending of bagCost");
		
		System.out.println("Starting of numbers");
		for(int i=0;i<numbers.length;i++){
			
			System.out.println("values of numbers"+numbers[i]);
		}
		for(int i=numbers.length-1;i>0;i--){
			
			System.out.println("reversing of numbers"+numbers[i]);
		}
		for(int i=0;i<numbers.length;i=i+2){
			
			System.out.println("Skipping element "+numbers[i]);
		}
		for(int i=numbers.length/2;i<numbers.length;i++){
			
			System.out.println("from middle"+numbers[i]);
		}
		for(int u=0;u<numbers.length;u++){
			if(numbers[u]%2==0){
				
	
			System.out.println(numbers[u]);
			}
		}
		System.out.println("Ending of numbers");
		
		System.out.println("Starting of mobile");
		for(int i=0;i<mobile.length;i++){
			
			System.out.println("values of mobile"+mobile[i]);
		}
		for(int i=mobile.length-1;i>0;i--){
			
			System.out.println("reversing of mobile"+mobile[i]);
		}
		for(int i=0;i<mobile.length;i=i+2){
			
			System.out.println("Skipping element "+mobile[i]);
		}
		for(int i=mobile.length/2;i<mobile.length;i++){
			
			System.out.println("from middle"+mobile[i]);
		}
		for(int u=0;u<mobile.length;u++){
			if(mobile[u]%2==0){
				
	
			System.out.println(mobile[u]);
			}
		}
		System.out.println("Ending of mobile");
		
		System.out.println("Starting of vowels");
		for(int i=0;i<vowels.length;i++){
			
			System.out.println("values of vowels"+vowels[i]);
		}
		for(int i=vowels.length-1;i>0;i--){
			
			System.out.println("reversing of vowels"+vowels[i]);
		}
		for(int i=0;i<vowels.length;i=i+2){
			
			System.out.println("Skipping element "+vowels[i]);
		}
		for(int i=vowels.length/2;i<vowels.length;i++){
			
			System.out.println("from middle"+vowels[i]);
		}
		for(int u=0;u<vowels.length;u++){
			if(vowels[u]%2==0){
				
	
			System.out.println(vowels[u]);
			}
		}
		System.out.println("Ending of vowels");
		
		System.out.println("Starting of percentage");
		for(int i=0;i<percentage.length;i++){
			
			System.out.println("values of percentage"+percentage[i]);
		}
		for(int i=percentage.length-1;i>0;i--){
			
			System.out.println("reversing of percentage"+percentage[i]);
		}
		for(int i=0;i<percentage.length;i=i+2){
			
			System.out.println("Skipping element "+percentage[i]);
		}
		for(int i=percentage.length/2;i<percentage.length;i++){
			
			System.out.println("from middle"+percentage[i]);
		}
		for(int u=0;u<percentage.length;u++){
			if(percentage[u]%2==0){
				
	
			System.out.println(percentage[u]);
			}
		}
		System.out.println("Ending of percentage");
		
		System.out.println("Starting of cgpa");
		for(int i=0;i<cgpa.length;i++){
			
			System.out.println("values of cgpa"+cgpa[i]);
		}
		for(int i=cgpa.length-1;i>0;i--){
			
			System.out.println("reversing of cgpa"+cgpa[i]);
		}
		for(int i=0;i<cgpa.length;i=i+2){
			
			System.out.println("Skipping element "+cgpa[i]);
		}
		for(int i=cgpa.length/2;i<cgpa.length;i++){
			
			System.out.println("from middle"+cgpa[i]);
		}
		for(int u=0;u<cgpa.length;u++){
			if(cgpa[u]%2==0){
				
	
			System.out.println(cgpa[u]);
			}
		}
		System.out.println("Ending of cgpa");
		
		System.out.println("Starting of regNo");
		for(int i=0;i<regNo.length;i++){
			
			System.out.println("values of regNo"+regNo[i]);
		}
		for(int i=regNo.length-1;i>0;i--){
			
			System.out.println("reversing of regNo"+regNo[i]);
		}
		for(int i=0;i<regNo.length;i=i+2){
			
			System.out.println("Skipping element "+regNo[i]);
		}
		for(int i=regNo.length/2;i<regNo.length;i++){
			
			System.out.println("from middle"+regNo[i]);
		}
		for(int u=0;u<regNo.length;u++){
			if(regNo[u]%2==0){
				
	
			System.out.println(regNo[u]);
			}
		}
		System.out.println("Ending of regNo");
		

		
		System.out.println("Starting of names");
		for(int i=0;i<names.length;i++){
			
			System.out.println("values of bagCost"+names[i]);
		}
		for(int i=names.length-1;i>0;i--){
			
			System.out.println("reversing of names"+names[i]);
		}
		for(int i=0;i<names.length;i=i+2){
			
			System.out.println("Skipping element "+names[i]);
		}
		for(int i=names.length/2;i<names.length;i++){
			
			System.out.println("from middle"+names[i]);
		}
		for(int u=0;u<names.length;u++){
			
				System.out.println(names[u]);
			}
		
		System.out.println("Ending of names");
		
		System.out.println("Starting of course");
		for(int i=0;i<course.length;i++){
			
			System.out.println("values of course"+course[i]);
		}
		for(int i=course.length-1;i>0;i--){
			
			System.out.println("reversing of course"+course[i]);
		}
		for(int i=0;i<course.length;i=i+2){
			
			System.out.println("Skipping element "+course[i]);
		}
		for(int i=course.length/2;i<course.length;i++){
			
			System.out.println("from middle"+course[i]);
		}
		for(int u=0;u<course.length;u++){
				
	
			System.out.println(course[u]);
			}
		
			System.out.println("Ending of course");
			}
	}
		
		
		
		
		
	
	