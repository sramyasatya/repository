package hotelmanagement;
import java.util.Scanner;
public class Hotel1 {
	static Scanner sc = new Scanner(System.in);
	static int choice =0;
	static String str="n";
	static int c;
	public static void main(String[] args)throws RoomAlreadyBookedException
	{
		do {
			System.out.println("Enter your choice :\n" + "1.Display room details\n" +"2.Display room availability \n" + "3. Book\n" +
					"4.Order food\n" + "5.Checkout\n" + "6.Exit\n" +"");
			choice = sc.nextInt();
		switch(choice)
		{
		case 1:rooms(choice);
		System.out.println("Continue : (y/n)");
	   	str=sc.next();
	   	break;
       case 2:rooms(choice);
  		System.out.println("Continue give : (y/n)");
  		str=sc.next();   
  		break;
        case 3:rooms(choice);
		System.out.println("Continue give: (y/n)");
		str=sc.next(); 
		break;
        case 4:orderfood();
		System.out.println("Continue give: (y/n)");
		str=sc.next(); 
	    break;
        case 5:System.out.println("Thanks");
		System.out.println("Continue : (y/n)");
		str=sc.next(); 
	    break;
        case 6: System.out.println("Exit");
		System.out.println("Continue : (y/n)");
	 	str=sc.next(); 
	    break;
		}
}while(str.equals("y"));
	}
public static void rooms(int choice) throws RoomAlreadyBookedException
{
	System.out.println("Choose room type \n" + "1. Luxury Double Room \n" + "2.Deluxe Double Room \r\n" + 
"3. Luxury Single Room \r\n" + "4.Deluxe Single Room\r\n" );
	switch(choice) {
	case 1:c=sc.nextInt();
	System.out.println("Number of double beds : 1\n" + "AC : Yes\n" + "Free breakfast : Yes\n" + "Charge per day:4000 \n");
	break;
	case 2: 
		System.out.println("Number of rooms available : 20");
		break;
	case 3:
		System.out.println("Choose room number from :\n" + "1,2,3,4,5,6,7,8,9,10\n" ); 
			System.out.println("Enter room number: \n" );
			int room=sc.nextInt();
			while(room==10 || room==17) {
					throw new RoomAlreadyBookedException("Room already Booked select some other room");	
			}
			room=sc.nextInt();
			
			System.out.println("customer name: \n" );
			sc.next();
			System.out.println("contact number: \n" );
			sc.nextLong();
			break;
		
	}
	
}

public static void orderfood() {
	System.out.println("Menu:"+"1. Sandwich Rs.50\n" + "2. Pasta Rs.60\n" + "3. Noodles Rs.70\n" + "4. Coke Rs.30\n" );
	System.out.println("Enter your choice:\r\n " );
	int menu=sc.nextInt();
	System.out.println("food");
}
}

