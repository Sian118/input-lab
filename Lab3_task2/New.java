public class New{
static String  username="Admin";
static String password="12345";
static void check(String u,String p){
if (u.equals(username) && p.equals(password)){
System.out.println("login succesfuly");

}
else {
System.out.println("login is not succesful. incorrect password");


}

}


}