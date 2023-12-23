class Student3{
	
int index;
String ime;
static String fakultet ="ITS"; 
Student3(int r,String n){
index = r;
ime = n;
}
void display (){

System.out.println(index + " " + ime + " " + fakultet);
}

public static void main(String args[]){
Student3 s1 = new Student3(111,"Petar");
Student3 s2 = new Student3(222,"Marko");
s1.display();
s2.display();
}
}
