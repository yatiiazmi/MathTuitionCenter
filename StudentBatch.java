public class StudentBatch {
    // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Student
    private Student students[] = new Student[10];
    private int currszstud = 0;
    
    //consturctpr
    //no return, name same as class
    public StudentBatch (Student students, int currszstud){
        this.students = students;
        this.currszstud = currszstud ;
    }
    
    // operation

    public void add(Student s, int i) {
        students[i] = s;
    }
    
    // method overloading
    public void add(Student s) {
        students[currszstud++] = s;
    }    
    
    // find a particular student
    public boolean find(String name) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currszstud; i++) {
            if (students[i].name == name) 
                return true;
            }
        return false;
        }
    
}
