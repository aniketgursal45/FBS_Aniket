package View;

import java.util.Scanner;
import Controller.EmployeeController;
import Model.Admin;
import Model.Employee;
import Model.Hr;
import Model.Salesmanager;

public class EmployeeView {

    EmployeeController ec;
    Scanner sc = new Scanner(System.in);

    public EmployeeView(EmployeeController ec) {
        this.ec = ec;
    }

    public void showOptions() {
        int choice = 0;

        do {
        	
        	System.out.println();
            System.out.println("1. Add an Employee");
            System.out.println("2. Search an Employee");
            System.out.println("3. Update an Employee");
            System.out.println("4. Delete an Employee");
            System.out.println("5. Display all Employees");
            System.out.println("6. Sort all Employees on Id(1) or Salary(2):- ");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter Choice:- ");
            try {
            choice = sc.nextInt();
            }catch(java.util.InputMismatchException e) {
            	System.out.println("Enter Numbers only as Per Menu");
            	sc.nextLine();
            	choice =-1;
            	continue;
            }

            switch (choice) {

                case 1:
              
                    System.out.println("Enter Employee Type (1-HR, 2-Admin, 3-SalesManager): ");
                  
                    int type ;
                    try {
                    type= sc.nextInt();
                    }catch(java.util.InputMismatchException ex) {
                    	System.out.println("Enter Number between 1,2,3");
                    	sc.nextLine();
                    	 break; 
                    }
                    System.out.print("Enter ID: ");
                    int id ;
                    try {
                    id= sc.nextInt();
                    sc.nextLine();
                    }catch(java.util.InputMismatchException ex) {
                    	System.out.println("Enter Id in Numbers Only");
                    	sc.nextLine();
                    	 break; 
                    }

                    System.out.print("Enter Name: ");
                    String name= sc.nextLine();
                    if (!name.matches("[A-Za-z ]+")) {
                        System.out.println("Enter Name in alphabets only!");
                        break;  // return to main menu
                    }
                    System.out.print("Enter Base Salary: ");
                    double salary ;
                    try {
                    salary= sc.nextDouble();
                    }catch(java.util.InputMismatchException ex) {
                    	System.out.println("Enter salary in Numbers Only");
                    	sc.nextLine();
                    	 break; 
                    }
                    if (type == 1) {
                        System.out.print("Enter Commission: ");
                        double comm ;
                        try {
                        comm = sc.nextDouble();
                        }catch(java.util.InputMismatchException ex) {
                        	System.out.println("Enter in numbers only");
                        	sc.nextLine();
                        	 break; 
                        }
                        try {
                        ec.addEmployee(new Hr(id, name, salary, comm));
                        System.out.println("HR added successfully!");
                        }catch(ExceptionsHandle.IdExistException ex) {
                        	System.out.println(ex);
                        }

                    } else if (type == 2) {
                        System.out.print("Enter Allowance: ");
                        double allowance ;
                        try{
                        	allowance= sc.nextDouble();
                        }catch(java.util.InputMismatchException ex) {
                        	System.out.println("Enter in Numbers Only");
                        	sc.nextLine();
                        	 break; 
                        }
                        try {
                        ec.addEmployee(new Admin(id, name, salary, allowance));
                        System.out.println("Admin added successfully!");
                        }catch(ExceptionsHandle.IdExistException ex) {
                        	System.out.println(ex);
                        }

                    } else if (type == 3) {
                        System.out.print("Enter Target: ");
                        int target ;
                        try{
                        	target= sc.nextInt();
                        }catch(java.util.InputMismatchException ex) {
                        	System.out.println("Enter in Numbers Only");
                        	sc.nextLine();
                        	 break; 
                        }
                      
                        System.out.print("Enter Incentive per Target: ");
                        double incentive ;
                        try{
                        	incentive= sc.nextDouble();
                        }catch(java.util.InputMismatchException ex) {
                        	System.out.println("Enter in Numbers Only");
                        	sc.nextLine();
                        	 break; 
                        }
                        try {
                        ec.addEmployee(new Salesmanager(id, name, salary, target, incentive));
                        System.out.println("Sales Manager added successfully!");
                        }catch(ExceptionsHandle.IdExistException ex) {
                        	System.out.println(ex);
                        }

                    } else {
                        System.out.println("Invalid Type!");
                    }
                    break;
                	

                case 2:               
                    try {
                    System.out.print("Enter ID to search: ");
                    id = sc.nextInt();
                    Employee e = ec.searchEmployee(id);
                    if (e != null)
                        System.out.println("Found: " + e);
                    else
                        System.out.println("Employee not found.");
                    
                    }catch(java.util.InputMismatchException ex) {
                    	System.out.println("Enter Numbers Only");
                    	sc.nextLine();
                    	 break; 
                    }catch(Exception i) {
                    	System.out.println("Something went wrong");
                    	 break; 
                    }
                    break;

                case 3:
                	try {
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    salary = sc.nextDouble();

                    if (ec.updateEmployee(id, salary))
                        System.out.println("Updated successfully!");
                    else
                        System.out.println("Employee not found.");
                    
                	}catch(java.util.InputMismatchException e) {
                		System.out.println("Enters Number Only");
                		sc.nextLine(); 
                		 break; 
                	}catch(Exception e) {
                		System.out.println("Something went Wrong");
                		 break; 
                	}
                	break;

                case 4:
                	try {
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextInt();

                    if (ec.deleteEmployee(id))
                        System.out.println("Deleted successfully!");
                    else
                        System.out.println("Employee not found.");
                   
                	}catch(java.util.InputMismatchException e) {
                		System.out.println("Enter Numbers only");
                		sc.nextLine();
                		 break; 
                	}
                	 break;
                	
                case 5:
                    ec.displayAll();
                    break;

                case 6:
                	try {
                    int select = 4;
                    while (select != 0) {

                        System.out.println("Select Sorting 1 for id or 2 for salary(0 To Exit):- ");
                        select = sc.nextInt();

                        if (select == 1) {
                            ec.myIdComparator();
                        } else if (select == 2) {
                            ec.mySalaryComparator();
                        } else if (select != 0) {
                            System.out.println("Enter Correct Choice!");
                        }
                    }
                    
                	}catch(java.util.InputMismatchException e) {
                		System.out.println("Enter Numbers Only");
                		sc.nextLine();
                		 break; 
                	}
                	break;
            }
        	

        } while (choice != 0);

        System.out.println("Program Exited");
    	
    }
}
