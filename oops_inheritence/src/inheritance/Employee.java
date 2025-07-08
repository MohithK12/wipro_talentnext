package inheritance;

public class Employee extends Person {
 private double Asalary;
 private int sYear;
 private String NI_no;
 Employee(){
	 super();
	 this.Asalary=0.0;
	 this.sYear=0;
	 this.NI_no="";
 }
 Employee(String name,double salary,int year,String no){
	 super(name);
	 this.Asalary=salary;
	 this.sYear=year;
	 this.NI_no=no;
 }
 double getSalary() {
	 return Asalary;
 }
 int getYear() {
	 return sYear;
 }
 String getNIno() {
	 return NI_no;
 }
 void setSalary(double salary) {
	 this.Asalary=salary;
 }
 void setYear(int year) {
	 this.sYear=year;
 }
 void setNIno(String no) {
	 this.NI_no=no;
 }
}
