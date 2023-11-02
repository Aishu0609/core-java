class Placement{

    String POname;
    int noofplacements;
    String BName;
    double POnumber;
    String Colllegename;

    int noofstudents;

    String Companyname;
    String BCoordinator;

    double  PRecord;
    double SMNumber;

    int SUsn;

    String Saddress;







    Placement(  String POname,int noofplacements, String BName,double POnumber,String Colllegename,
                int noofstudents,String Companyname,String BCoordinator,double  PRecord,double SMNumber,
                int SUsn,String Saddress){
        this.POname=POname;
        this.noofplacements=noofplacements;
        this.BName=BName;
        this.POnumber=POnumber;
        this.Colllegename=Colllegename;
        this.noofstudents=noofstudents;
        this.Companyname=Companyname;
        this.BCoordinator=BCoordinator;
        this.PRecord=PRecord;
        this.SMNumber=SMNumber;
        this.SUsn=SUsn;
        this.Saddress=Saddress;

        System.out.println("Created Placement with String,int,String,double,String,int, String,String,double,double,int,String Constructor");
    }
    void displayInfo(){

        System.out.println("Starting displayInfo");
        System.out.println(this.POname=POname);
        System.out.println(this.noofplacements=noofplacements);
        System.out.println(this.BName=BName);
        System.out.println(this.POnumber=POnumber);
        System.out.println(this.Colllegename=Colllegename);
        System.out.println(this.noofstudents=noofstudents);
        System.out.println(this.Companyname=Companyname);
        System.out.println(this.BCoordinator=BCoordinator);
        System.out.println(this.PRecord=PRecord);
        System.out.println(this.SMNumber=SMNumber);
        System.out.println(this.SUsn=SUsn);
        System.out.println(this.Saddress=Saddress);



        System.out.println("Ending displayInfo");

    }
}