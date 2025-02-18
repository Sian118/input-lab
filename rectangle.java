class rectangle{
double length;
double width;

public void data(){
System.out.println(this.length);
System.out.println(this.width);

}  
public double Area(){
 return length*width;

}
public double Perimeter(){
 return 2*(length+width);
}


}