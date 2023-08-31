
package buoi5_bai2;
import java.util.Scanner;
public class Faculty {
    private String Name;
    private String Date;
    private School x = new School();

    public Faculty() {
    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input name of Faculty: ");
        Name = sc.nextLine();
        System.out.println("input date of Faculty: ");
        Date = sc.nextLine();
        System.out.println("iinput School: ");
        System.out.println("input name of school: " );
        x.setName(sc.nextLine());
        System.out.println("input date of school: ");
        x.setDate(sc.nextLine());
    }
    public void Output(){
        
       
        System.out.println("Name of faculty: "+ Name );
        System.out.println("Date of faculty: " + Date );
        System.out.println("Name of school: " + x.getName());
        System.out.println("Date of school: " + x.getDate());
        
    }
}
