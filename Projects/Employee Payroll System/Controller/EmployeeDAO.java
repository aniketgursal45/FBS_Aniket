package Controller;

import Model.Admin;
import Model.Employee;
import Model.Hr;
import Model.Salesmanager;
import java.util.*;

import ExceptionsHandle.IdExistException;


public class EmployeeDAO {
	
	static ArrayList<Employee> eArr=new ArrayList<Employee>();
	static {
		eArr.add( new Hr(101, "Ranjit", 50000, 5000));
		eArr.add(new Hr(102, "Amit", 48000, 4500));
		eArr.add(new Hr(103, "Sneha", 47000, 4000));
		eArr.add(new Salesmanager(201, "Karan", 60000, 12, 8000));
		eArr.add(new Salesmanager(202, "Meena", 58000, 15, 7500));
		eArr.add(new Salesmanager(203, "Rohit", 62000, 10, 9000));
		eArr.add(new Admin(301, "Pragati", 70000, 10000));
		eArr.add(new Admin(302, "Isha", 68000, 9500));
		eArr.add(new Admin(303, "Pooja", 72000, 11000));
		eArr.add(new Admin(304, "Shubham", 75000, 12000));
	}

	public boolean addEmployee(Employee e)throws IdExistException {
		// TODO Auto-generated method stub
		for(Employee f:eArr) {
			if(f.getId()==e.getId()) {
				throw new IdExistException();
			}
		}
			return eArr.add(e);
		
		
	}
	
	public Employee searchEmployee(int id){
		// TODO Auto-generated method stub
		for (Employee e: eArr) {
			 if (e.getId() == id) {
	                return e;
	            }  
        }
        return null;
	}
	
	

	public boolean updateEmployee(int id,double salary) {
		// TODO Auto-generated method stub
		for (Employee e: eArr) {
            if (e.getId() == id) {
            	e.setSalary(salary);
                return true;
            }
            
        }
		return false;
		
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		for (Employee e:eArr) {
            if (e.getId() == id) {
            	eArr.remove(e);
                return true;
            }
        }
        return false;
		
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		for (Employee e:eArr) {
			System.out.println(e);
           }
	}
	public void myIdComparator() {
		// TODO Auto-generated method stub
		Collections.sort(eArr,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
		}
		);
		
	}

	public void mySalaryComparator() {
		// TODO Auto-generated method stub
		Collections.sort(eArr,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getSalary(),o2.getSalary());
			}
		});
	}

}
