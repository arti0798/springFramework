package spring;

public class OverRIdeTOString {
    
    public static void main(String[] args) {
        
        Std s1 = new Std(1,"Heena");
        System.out.println(s1.toString());
    }
}

class Std {

    int rollno;
    String name;

    public Std(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // @Override
    // public String toString() {

    //     return rollno + "," + name;
    // }
    
}
