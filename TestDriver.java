import java.text.ParseException;
    
    import java.text.SimpleDateFormat;
    
    import java.util.Arrays;
    
    import java.util.Collections;
    
    import java.util.Comparator;
    
    import java.util.Date;
    
    import Employee.Faculty.Level;
    
    public class TestDriver {
    
    public static void main(String[] args) {
    
    SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yy"); /*this is used to parse a Date from String text*/
    
    Employee[] employee=new Employee[9];/*an array of Employees (Staff,Faculty,Partime)*/
    
    try {
    
    employee[0]=new Staff("Paita", "Allen", "123", 'M', sdf.parse("2/23/59"), 50.00); /*creating a new Staff object*/
    
    employee[1]=new Staff("Steven", "Zapata", "456", 'F', sdf.parse("7/12/64"), 35.00);
    
    employee[2]=new Staff("Enrique", "Rios", "789", 'M', sdf.parse("6/2/70"), 40.00);
    
    employee[3]=new Faculty("Anne", "Johnson", "243", 'F', sdf.parse("4/27/62"), Level.FU, new Education("Ph.D", "Engineering", 3));/*creating a new Faculty object; and an Edcuation object is passed as one of the arguments*/
    
    employee[4]=new Faculty("William", "Bouris", "791", 'F', sdf.parse("3/14/75"), Level.AO, new Education("Ph.D", "English", 1));
    
    employee[5]=new Faculty("Christopher", "Andrade", "623", 'F', sdf.parse("5/22/80"), Level.AS, new Education("MS", "Physical Education", 0));
    
    employee[6]=new Partime("Augusto", "Guzman", "455", 'F', sdf.parse("8/10/77"), 35.00, 30);
    
    employee[7]=new Partime("Martin", "Depirro", "678", 'F', sdf.parse("9/15/87"), 30.00, 15);
    
    employee[8]=new Partime("Marque", "Aldaco", "945", 'M', sdf.parse("11/24/88"), 20.00, 35);
    
    System.out.println("details of all STAFF employees");
    
    for (Employee emp : employee) {
    
    if(emp.getClass()==Staff.class){ /*checking if its a Staff object*/
    
    System.out.println(emp.toString());
    
    System.out.println("---");
    
    }
    
    }
    
    System.out.println();
    
    System.out.println("details of all FACULTY employees");
    
    for (Employee emp : employee) {
    
    if(emp.getClass()==Faculty.class){ /*checking if its a Faculty object*/
    
    System.out.println(emp.toString());
    
    System.out.println("---");
    
    }
    
    }
    
    System.out.println();
    
    System.out.println("details of all PART TIME employees");
    
    for (Employee emp : employee) {
    
    if(emp.getClass()==Partime.class){ /*checking if its a Partime object*/
    
    System.out.println(emp.toString());
    
    System.out.println("---");
    
    }
    
    }
    
    float total_salary_all_employees=0;
    
    float total_salary_partime_employees=0;
    
    for (Employee emp : employee) {
    
    if(emp.getClass()==Partime.class){ /*checking if its a Partime object*/
    
    total_salary_partime_employees+=emp.monthlyEarning();
    
    }
    
    total_salary_all_employees+=emp.monthlyEarning();
    
    }
    
    System.out.println("Total salary of all part time employees: "+total_salary_partime_employees);
    
    System.out.println("Total salary of all employees: "+total_salary_all_employees);
    
    System.out.println("Employee Info in descending order of employee id\n");
    
    Collections.sort(Arrays.asList(employee),new Comparator<Employee>() {
    
    /**
    
    * Sorting array using Comparator on the basis of descending order
    
    * of Employee ID
    
    */
    
    public int compare(Employee o1, Employee o2) {
    
    return o2.getId().compareToIgnoreCase(o1.getId());
    
    }
    
    });
    
    for (Employee emp : employee) {
    
    System.out.println(emp.toString());
    
    System.out.println("\n");
    
    }
    
    System.out.println("Employee Info in ascending order of lastname \n");
    
    Collections.sort(Arrays.asList(employee),new Comparator<Employee>() {
    
    /**
    
    * Sorting array using Comparator on the basis of ascending order
    
    * of lastname
    
    */
    
    public int compare(Employee o1, Employee o2) {
    
    return o1.getLastname().compareToIgnoreCase(o2.getLastname());
    
    }
    
    });
    
    for (Employee emp : employee) {
    
    System.out.println(emp.toString());
    
    System.out.println("\n");
    
    }
    
    try {
    
    System.out.println("Cloning demonstration");
    
    Faculty clonedObject = (Faculty) employee[3].clone();
    
    /**
    
    * Remember!
    
    * we're doing this because employee[3] is supposed to be a
    
    * Faculty object,if not,it wont return expected values.
    
    */
    
    System.out.println("original object:");
    
    System.out.println(employee[3].toString()); /*original object*/
    
    System.out.println("Cloned Object: ");
    
    System.out.println(clonedObject.toString()); /*cloned object*/
    
    } catch (CloneNotSupportedException e) {
    
    e.printStackTrace();
    
    }
    
    } catch (ParseException e) {
    
    e.printStackTrace();
    
    }
    
    }
    
    }
