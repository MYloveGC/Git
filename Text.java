public class Text{
	public String name;
	private double salary;
	public Text(String empName){
		name = empName;
	}
	public void setSalary(double empSal){
		salary = empSal;
	}
	public void printEmp(){
		System.out.println("name : "+ name );
		System.out.println("salary : "+salary);
	}
	public static void main(String []args){
		Text test = new Text("Ransiak");
		test.setSalary(1000);
		test.printEmp();
	}
}