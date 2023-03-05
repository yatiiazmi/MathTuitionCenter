public class TeacherList {
    // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Student
    private Teacher teachers[] = new Teacher[10];
    private int currszteacher = 0;
    
    //consturctpr
    //no return, name same as class
    public numofTeachers (Student students, int currsz){
        this.teachers = teachers;
        this.currszteacher = currszteacher ;
    }
    
    // operation

    public void add(Teacher t, int i) {
        teachers[i] = t;
    }
    
    // method overloading
    public void add(Teacher t) {
        teachers[currszteacher++] = t;
    }    

}
