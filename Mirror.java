class Mirror{
	static void handMirror(){
		System.out.println("This is HandMirror");
	}
	static void standardMirror(){
		System.out.println("This is StandardMirror");
	}
	static void reflectiveMirror(){
		System.out.println("This is RefelectiveMirror");
	}
	static void wallMirror(){
		System.out.println("This is WallMirror");
	}
	static void vehicleMirror(){
		System.out.println("This is VehicleMirror");
	}
	public static void main(String[] args){
		System.out.println("This is main Method");
		handMirror();
		standardMirror();
		reflectiveMirror();
		wallMirror();
		vehicleMirror();
	}
}