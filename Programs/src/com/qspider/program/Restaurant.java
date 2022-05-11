package com.qspider.program;

public class Restaurant {

	public static void main(String[] args) {
		      //Finalize method to delete dereferenced object
		  //Assign null into an object reference variable.
            TestRestaurant test1= new TestRestaurant(25,"PavBhaji","Pune",411016);
             System.out.println(test1.getName());
             test1.setName("Masala Dosa");
             System.out.println(test1.getName());
             test1=null;
             System.gc();
            
            //Assign 2 different object
             TestRestaurant test2 = new TestRestaurant(25,"Gulabjamum","Mumbai",411015);
             TestRestaurant test3= new TestRestaurant(25,"Vadapav","Pune",411017);
             System.out.println( );
             test2.display();
             test3.address();
             test2=test3;
             System.gc();
             
             //create dereferenced object
          new TestRestaurant(25,"Noodles","chinese",234576);
          System.gc();
   	}

}
