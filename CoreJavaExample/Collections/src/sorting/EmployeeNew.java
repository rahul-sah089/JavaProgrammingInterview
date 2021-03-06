package sorting;

import java.util.Comparator;

public class EmployeeNew {
	private Integer id;
	private String empName;
	private String des;
	private Double salary;

	public EmployeeNew(Integer id, String empName, String des, Double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.des = des;
		this.salary = salary;
	}

	public static Comparator<Employee> empComparatorByName = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			String empName1 = o1.getEmpName();
			String empName2 = o2.getEmpName();
			return empName1.compareTo(empName2);
		}
	};

	public static Comparator<Employee> empComparatorById = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			int returnVal = 0;
			int empId1 = o1.getId();
			int empId2 = o2.getId();
			if (empId1 < empId1) {
				returnVal = -1;
			}
			if (empId1 == empId2) {
				returnVal = 0;
			}
			if (empId1 > empId1) {
				returnVal = 1;
			}
			return returnVal;
		}
	};

	public static Comparator<Employee> empComparatorBySalary = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			int returnVal = 0;
			double emp1Sal = o1.getSalary();
			double emp2Sal = o2.getSalary();
			if (emp1Sal < emp2Sal) {
				returnVal = -1;
			}
			if (emp1Sal == emp2Sal) {
				returnVal = 0;
			}
			if (emp1Sal > emp2Sal) {
				returnVal = 1;
			}
			return returnVal;
		}
	};
}
