class Reservation{
   String guestname,roomtype;
   int floor;
   double rate;
   public Reservation(){
       guestname="walk-in-guest";
       floor=0;
       rate=2000;
   }
   public Reservation(String guestname,String roomtype,int floor,double rate){
       this.guestname=guestname;
       this.roomtype=roomtype;
       this.floor=floor;
       this.rate=rate;
   }
   public Reservation(Reservation p){
       this.guestname=p.guestname;
       this.roomtype=p.roomtype;
       this.floor=p.floor;
       this.rate=p.rate;
}
   public void displayinfo(){
       System.out.println(guestname+roomtype+floor+rate);
   }
  
       public static void main(String[] args){
           Reservation r=new Reservation();
           r.displayinfo();
           Reservation r1=new Reservation("kk","deluxe",2,4000);
           r1.displayinfo();
           Reservation r2= new Reservation(r1);
           r2.displayinfo();

           
       }
 }      