package sorting;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String empName;
	private Double salary;
	private String desc;
	
	public Employee(int id,String empName,Double salary,String desc){
		this.id =  id;
		this.empName = empName;
		this.salary = salary;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int compareTo(Employee o) {
		return empName.compareTo(o.empName);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary="
				+ salary + ", desc=" + desc + "]";
	}
	
	
}
