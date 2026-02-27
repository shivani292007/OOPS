import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student Details " + (i + 1));
            String line = sc.nextLine();

            String[] arr = line.split(",");

            String a = arr[0];
            String b = arr[1];
            String c = arr[2];
            String d = arr[3];
            int e = Integer.parseInt(arr[4]);
            long f = Long.parseLong(arr[5]);

            s[i] = new Student(a, b, c, d, e, f);
        }

        System.out.println("Student details");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
        sc.close();
    }
}

class Student {
    String name;
    String department;
    String gmail;
    String address;
    int age;
    long number;

    Student(String a, String b, String c, String d, int e, long f) {
        this.name = a;
        this.department = b;
        this.gmail = c;
        this.address = d;
        this.age = e;
        this.number = f;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Gmail: " + gmail);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
    }
}