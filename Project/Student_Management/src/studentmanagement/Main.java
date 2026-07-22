package studentmanagement;

public class Main {
    public static void main(String[]args){
        Student sc1=new Student("Hamidul Hoque Masum","2024000010005","CSE",2.96);
        Student sc2=new Student("Mufassir Mahmud","2024000010162","CSE",3.55);
        Student sc3=new Student("Md Sohan","2024000010135","CSE",3.22);
        StudentManagement sm=new StudentManagement();
        //Add data in arraylist
        sm.addStudent(sc1);
        sm.addStudent(sc2);
        sm.addStudent(sc3);
        //view all data
        sm.viewStudent();
        // Search students data by id
        Student result=sm.searchId("2024000010162");
        if(result!=null){
            System.out.println("Search -\n"+result);
        }else{
            System.out.println("No data found !! "+result);
        }
        //Udate student
        boolean r=sm.updateStudent("Asifur Rahman","2024000010135","CSE",3.69 );
        if(r!=false){
            System.out.println(">>>>>update Complete..<<<<<<");
        }else{
            System.out.println("Try again..its not completed");
        }
        sm.viewStudent();
        //Delete student
        sm.deleteStudent("2024000010005");
        sm.viewStudent();
    }
}
