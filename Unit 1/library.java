import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number of books ");
        int n = sc.nextInt();
        sc.nextLine();
        Book s[]= new Book[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter the Book Details "+(i+1));
            String line = sc.nextLine();
            String arr[]= line.split(",");
            String a = arr[0];
            String b = arr[1];
            String c = arr[2];
            int d = Integer.parseInt(arr[3]);
            int e = Integer.parseInt(arr[4]);
            double f  = Double.parseDouble(arr[4]);
           
            s[i]= new Book(a,b,c,d,e,f);            
        }
        System.out.println("Library Book Details:");
        for(int i =0;i<n;i++){
            s[i].display();
        }
    }
}
class Book{
    String title;
    String author;
    String language;
    int edition;
    int pages;
    double price;
    
    Book(String a, String b, String c, int d, int e, double f){
        this.title = a;
        this.author = b;
        this.language = c;
        this.edition = d;
        this.pages = e;
        this.price = f;
    }
    void display(){
        System.out.println("Title of the book : "+title);
        System.out.println("Author of the book : "+author);
        System.out.println("Language of the book :"+language);
        System.out.println("Edition of the book : "+edition);
        System.out.println("number of pages of the book : "+pages);
        System.out.println("price of the book : "+price);
    }
}