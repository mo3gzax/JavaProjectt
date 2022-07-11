import java.text.SimpleDateFormat;
    
    import java.util.Date;
    
    public abstract class Employee implements Cloneable {
    
    String firstname, lastname, id;
    
    char sex;
    
    Date dob;
    
    Employee() {
    
    /* default constructor */
    
    }
    
    Employee(String firstname, String lastname, String id, char sex, Date dob) {
    
    /**
    
    * parameterized constructor
    
    */
    
    this.firstname = firstname;
    
    this.lastname = lastname;
    
    this.id = id;
    
    this.sex = sex;
    
    this.dob = dob;
    
    }
    
    public String toString() {
    
    /**
    
    * method to return a string containing all details
    
    */
    
    SimpleDateFormat dateformat = new SimpleDateFormat("mm/dd/yy");
    
    /**
    
    * an object to parse date from string and to display a date in required
    
    * format
    
    */
    
    String str = "ID Employee number: " + id + "\nEmployee Last name: "
    
    + lastname + ", Firstname: " + firstname + "\nBirth Date: "
    
    + dateformat.format(dob);
    
    return str;
    
    }
    
    public String getFirstname() {
    
    return firstname;
    
    }
    
    public void setFirstname(String firstname) {
    
    this.firstname = firstname;
    
    }
    
    public String getLastname() {
    
    return lastname;
    
    }
    
    public void setLastname(String lastname) {
    
    this.lastname = lastname;
    
    }
    
    public String getId() {
    
    return id;
    
    }
    
    public void setId(String id) {
    
    this.id = id;
    
    }
    
    public char getSex() {
    
    return sex;
    
    }
    
    public void setSex(char sex) {
    
    this.sex = sex;
    
    }
    
    public Date getDob() {
    
    return dob;
    
    }
    
    public void setDob(Date dob) {
    
    this.dob = dob;
    
    }
    
    /**
    
    * abstract method to return monthly earning
    
    *
    
    * @return monthly earning in double format
    
    */
    
    public abstract double monthlyEarning();
    
    @Override
    
    protected Object clone() throws CloneNotSupportedException {
    
    /**
    
    * will throw an Exception if Object cloning is not supported
    
    */
    
    return super.clone();
    
    }
    
    }
