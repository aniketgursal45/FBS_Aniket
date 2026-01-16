package Controller;

import ExceptionsHandle.IdExistException;
import Model.Employee;
public class EmployeeController {
	EmployeeDAO ed=new EmployeeDAO();
	public void addEmployee(Employee e) throws IdExistException {
		// TODO Auto-generated method stub
		ed.addEmployee(e);
		
	}

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return ed.searchEmployee(id);
		
	}

	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		return ed.updateEmployee(id,salary);
		
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return ed.deleteEmployee(id);
		
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		ed.displayAll();
	}

	public void myIdComparator() {
		// TODO Auto-generated method stub
		ed.myIdComparator();
		ed.displayAll();
		
	}

	public void mySalaryComparator() {
		// TODO Auto-generated method stub
		ed.mySalaryComparator();
		ed.displayAll();
	}


}
