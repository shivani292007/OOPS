import java.util.*;

interface ICourseRecord{
    public  void displayCourseRecord();
}
class Course implements ICourseRecord{
    String name;
    String code;
    String faculty;
    int credits;
    int duration;
    Course(String name, String code, String faculty, int credits, int duration){
        this.name = name;
        this.code = code;
        this.faculty = faculty;
        this.credits = credits;
        this.duration = duration;
    }
    public void displayCourseRecord(){
        System.out.println("Course Name: "+name);
        System.out.println("Course Code: "+code);
        System.out.println("Faculty Name: "+faculty);
        System.out.println("Credits: "+credits);
        System.out.println("Course Duration(weeks): "+duration);
    }
}
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Course name:");
        String name = sc.nextLine();
        System.out.println("Enter the Course code:");
        String code = sc.nextLine();
        System.out.println("Enter the faculty name:");
        String faculty = sc.nextLine();
        System.out.println("Enter the Credits:");
        int credits = sc.nextInt();
        System.out.println("Enter the course duration(weeks):");
        int duration = sc.nextInt();
        System.out.println("Course Details:");
        ICourseRecord c = new Course(name,code,faculty,credits,duration);
        c.displayCourseRecord();
    }
}