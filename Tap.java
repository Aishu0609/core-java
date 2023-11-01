class Tap{
	static void handTap(){
		System.out.println("This is HandTap");
	}
	static void gasTap(){
		System.out.println("This is GasTap");
	}
	static void masterTap(){
		System.out.println("This is MasterTap");
	}
	static void machineScrewTap(){
		System.out.println("This is MachineScrewTap");
	}
	static void extensionTap(){
		System.out.println("This is ExtentionTap");
	}
	public static void main(String[] args){
		System.out.println("This is main Method");
		handTap();
		gasTap();
		masterTap();
		machineScrewTap();
		extensionTap();
	}
}