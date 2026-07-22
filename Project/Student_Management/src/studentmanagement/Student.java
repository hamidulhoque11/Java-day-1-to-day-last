package studentmanagement;

class Student {
     private String name,id,dept;
    private double cgpa;
    //constructor
    Student(String name, String id, String dept, double cgpa){
        this.name=name;
        this.id=id;
        this.dept=dept;
        this.cgpa=cgpa;
    }
    //Setter method
  public  void setName(String name){
    this.name=name;
    }
    public  void setId(String id){
        this.id=id;
    }
    public  void setDept(String dept){
        this.dept=dept;
    }
    public  void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
    //getter method
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getDept(){
        return dept;
    }
    public double getCgpa(){
        return cgpa;
    }
    //toString for display
    @Override
public String toString(){
        return "Name :"+name+
                "\nID :"+id+
                "\nDepartment :"+dept+
                "\nCGPA :"+cgpa+
                "\n";
}
}
