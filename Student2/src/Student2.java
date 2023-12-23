
public class Student2 {

	int id; 
	String ime; 
	int starost; 
	Student2(int i, String n) { 
	id = i;
	ime = n;
	}
	Student2(int i, String n, int a) { 
	id = i;
	ime = n;
	starost = a;
	}
	void display() { 
	System.out.println(id + " " + ime + " " + starost);
	}
	public static void main(String args[]) {
	Student2 s1 = new Student2(111, "Petar "); 
	Student2 s2 = new Student2(222, "Marko", 25);
	s1.display(); 
	s2.display(); 
	}
	}