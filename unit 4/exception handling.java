import java.util.*;
class SeatNotAvailableException extends Exception{
 public SeatNotAvailableException(String message){
 super(message);
 }
}
public class Main{
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Movie Name: ");
 String movieName = sc.nextLine();
 System.out.println("Enter the Total Seats: ");
 int totalSeats = sc.nextInt();
 System.out.println("Enter the Ticket Price: ");
 int ticketPrice = sc.nextInt();
 sc.nextLine();

 System.out.println("Movie Name :"+movieName);
 System.out.println("Total Seats :"+totalSeats);
 System.out.println("Ticket Price : Rs."+ticketPrice);
 System.out.println("Enter customer name: ");
 String customerName = sc.nextLine();
 System.out.println("Enter seat number to book: ");
 int seatNumber = sc.nextInt();

 try{
 if(seatNumber <= 0 || seatNumber > totalSeats){
 throw new SeatNotAvailableException("Seat not available.Please choose
a valid seat.");
 }
 else{
 System.out.println("Booking Successful!");
 System.out.println("Customer: "+customerName);
 System.out.println("Movie: "+movieName);
 System.out.println("Seat Number: "+seatNumber);
 System.out.println("Total Amount: Rs."+ticketPrice);
 }
 }
 catch (SeatNotAvailableException e){
 System.out.println("Exception: "+e.getMessage());
 }
 finally{
 System.out.println("End of Ticket Booking Process.");
 }

 }
}