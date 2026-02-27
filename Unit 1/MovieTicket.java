import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MovieTicket mt[]=new MovieTicket[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the Movie Details "+(i+1));
            String line = sc.nextLine();
            String arr[] = line.split("#");
            String a = arr[0];
            String b = arr[1];
            String c = arr[2];
            String d = arr[3];
            int e = Integer.parseInt(arr[4]);
            double f = Double.parseDouble(arr[5]);
            mt[i] = new MovieTicket(a,b,c,d,e,f);
        }
        System.out.println("Movie Ticket Details :");
        for(int i = 0;i<n;i++){
            mt[i].display();
        }
    }
}

class MovieTicket{
    String movie;
    String theatre;
    String language;
    String time;
    int seats;
    double price;
    MovieTicket(String a,String b,String c,String d,int e, double f){
        this.movie = a;
        this.theatre = b;
        this.language = c;
        this.time = d;
        this.seats = e;
        this.price = f;
    }
    void display(){
        System.out.println("Enter the Movie Name : "+movie);
        System.out.println("Enter the Theatre Name : "+theatre);
        System.out.println("Enter the language of the movie : "+language);
        System.out.println("Enter the Showtime : "+time);
        System.out.println("Number of seats available : "+seats);
        System.out.println("Enter the price of the ticket : "+price);
}
}
