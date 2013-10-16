
package week_three;

import java.util.*;


public class BigEnough {

	public static void main(String[] args) {
		
		Employees myEmployees = new Employees();
		
		System.out.println("Employee input system. Enter an empty username or an ID of Zero to finish.");
		
		addEmployees(myEmployees);
		
		System.out.println("Users who's ID is even or there name starts with an S: ");
		
		// Print out the employees with an even ID
		for (int i = 0; i < myEmployees.getIds().size(); i ++ ) {
			
			if (myEmployees.getIds().get(i) % 2 == 0) {
				System.out.println(myEmployees.getIds().get(i) + ": " + myEmployees.getNames().get(i));
			}	
		} // end of even id loop
		
		
		// Print out the employees whose name starts with an S ( or an s)
		for (int j = 0; j < myEmployees.getNames().size(); j ++) {
			if ( myEmployees.getNames().get(j).toUpperCase().charAt(0) == 'S') {
				System.out.println(myEmployees.getIds().get(j) + ": " + myEmployees.getNames().get(j));
			}
		}
		

	}
	
	
	
	private static void addEmployees(Employees myEmployees) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {			
			System.out.print("Please enter an employee name: ");
			String employeeName = in.nextLine();
			
			if (employeeName.length() == 0) {
				flag = false;
				break;
			}
			
			System.out.print("Please enter there employee ID: ");
     		int employeeID = in.nextInt();
			
			if (employeeID == 0) {
				flag = false;
				break;
			}
			
			myEmployees.setName(employeeName);
			myEmployees.setID(employeeID);
			
			in.nextLine();
		} // end input while
		
		in.close();
		
	} // end addEmployees method

}


class Employees {
	
	private ArrayList<Integer> ids = new ArrayList<Integer>();
	private ArrayList<String> names = new ArrayList<String>();;
	
	public void setID(int id) {
		this.ids.add(id);
	}
	
	public void setName(String name) {
		this.names.add(name);
	}
	
	public ArrayList<Integer> getIds() {
		return this.ids;	
	}
	
	public ArrayList<String> getNames() {
		return this.names;	
	}
}