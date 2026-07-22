package studentmanagement;

import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> students=new ArrayList<>();
    public void addStudent(Student sc) {
        students.add(sc);
    }
    public void viewStudent() {
        System.out.println("View All data:");
        for(Student x: students){
            System.out.println(x);
        }
    }
    public Student searchId(String id){
         for(Student x: students){
             if(id.equals(x.getId())){
                 return x;
             }
         }
         return null;
    }
    public boolean updateStudent(String name,String id,String dept,double cgpa){
    for(Student x:students){
        if(id.equals(x.getId())){
        x.setName(name);
        x.setCgpa(cgpa);
        x.getDept();
        return true;
        }
    }
        return false;
    }
    public boolean deleteStudent(String id){
        Student s=searchId(id);
        if(s!=null){
            students.remove(s);
        }
        return false;
    }
}
