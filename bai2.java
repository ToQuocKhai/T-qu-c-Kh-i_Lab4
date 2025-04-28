package lab4;
class Person {
    private String name;
    private String address;
public Person(String name,String address){
    this.name = name;
    this.address = address;
}
public String getname(){
    return name;
}
public String getaddress(){
    return address;
}
public void setaddress(String address){
    this.address = address;
}
@Override
public String toString(){
        return "Person[name=" + name + ", address=" + address + "]";
}}
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address,String program,int year,double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
public String getprogram(){
    return program;
} 
public void setprogram(String program){
    this.program = program;
}
public int setyear(){
    return year;
}
public void getyear(int year){
    this.year = year;
}
public double setfee(){
    return fee;
}
public void getyear(double fee){
    this.fee = fee;
}
@Override
public String toString() {
    return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
}
}
class Staff extends Person {
    private String school;
    private double pay;
public Staff(String name, String address, String school, double pay){
    super(name, address);
    this.school = school;
    this.pay = pay;
}
public String getschool(){
    return school;
}
public void setschool(String school){
    this.school = school;
}
public double getpay(){
    return pay;
}
public void setpay(){
    this.pay = pay;
}
@Override
public String toString(){
    return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
}
}
public class bai2{
    public static void main(String[]args){
        Person person = new Person("Nguyen Van Phep", "123 Le Van Sy");
        System.out.println(person);

        Student student = new Student("Nguyen Thi No", "456 Cong Hoa","Computer Science", 2, 5000.0);
        System.out.println(student);

        Staff staff = new Staff("Anh Huynh", "789 Cao Thang", "Tech University", 60000.0);
        System.out.println(staff);
    }
}