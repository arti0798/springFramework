package spring;

public class HashcodeEqualsTest {
	public static void main(String args[]){
		Student1 s1=new Student1(1, "Arti");
		Student1 s2=new Student1(1, "Arti");
		//Student s3=new Student(3, "Karishma");
		//Student s4=s1;
		
		System.out.println("S1 Name and hashcode :"+s1.getName()+"," + s1.hashCode());
		System.out.println("S2 Name and hashcode :"+s2.getName()+"," + s2.hashCode());
// Return false because s1 and s2 points to different memory.
		// Both have different reference.
		System.out.println("Equals test s1 and s2:"+s1.equals(s2));
}
}
// plan