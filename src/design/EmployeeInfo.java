package design;

import java.util.Scanner;

public abstract class EmployeeInfo implements Employee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */

	static String companyName;
	double salary;
	String benefits;
	int employeeID;
	String name;
	int age;
	String department;



	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo() {}

	public EmployeeInfo(int employeeId) {
		this.employeeID = employeeId;
	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		this.employeeID = employeeId;

	}

	public EmployeeInfo(double salary, int employeeID, String name, String department) {
		this.salary = salary;
		this.employeeID = employeeID;
		this.name = name;
		this.department = department;
	}

	@Override
	public int employeeId() {
		return this.employeeID;
	}

	@Override
	public String employeeName() {
		return this.name;
	}

	@Override
	public void assignDepartment() {
		//System.out.println("department is :");

	}

	@Override
	public double calculateSalary() {
		return this.salary;
	}

	@Override
	public String benefitLayout() {
		return this.benefits;

	}

	@Override
	public int EmployeeAge() {
		return this.age;
	}

	@Override
	public void vacationDay() {
		System.out.println('A');
	}


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus(double salary, int performance) {
		double salaryBonus = 0;
		double bonus = 0;
		if (performance == 1) {
			bonus = 0.05;
			salaryBonus = salary + (salary * bonus);
		} else if (performance == 2) {
			bonus = 0.1;
			salaryBonus = salary + (salary * bonus);
		} else if (performance == 3) {
			bonus = 0.8;
			salaryBonus = salary + (salary * bonus);
		} else if (performance == 5) {
			bonus = 0.14;
			salaryBonus = salary + (salary * bonus);
		}

		return salaryBonus;

	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension(double salary, int yearsWorked) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String joiningDate = sc.nextLine();
		System.out.println("");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		double pension = 0;
		double totalPension;
		//Calculate pension

		if (yearsWorked == 1) {
			pension = 0.05;
			totalPension = salary * pension;
		} else if (yearsWorked == 2) {
			pension = 0.10;
			totalPension = salary * pension;
		} else if (yearsWorked == 3) {
			pension = 0.20;
			totalPension = salary * pension;
		}

		return total;
	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}

