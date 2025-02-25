public class Student{

 
 private String Name;
 private String City;
 private double Gpa;
 

 private static int rollnumber=00;

 Student(String Name,String City,double Gpa){
 this.Name=Name;
 this.City=City;
 this.Gpa=Gpa;
 this.rollnumber=rollnumber++;
rollnumber++;  

} 
 
public void Display(){
System.out.println("The name of the Student is "+ Name);
System.out.println("The Name of the city is "+ City);
System.out.println("The Gpa is "+ Gpa);
System.out.println("The Rollnumber is "+ rollnumber);


}



  



}
