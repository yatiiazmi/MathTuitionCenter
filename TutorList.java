public class TutorList {
      private Teacher teachers[] = new Teacher[5];
    private int currs = 0;
    
    //consturctpr
    //no return, name same as class
    public TutorList (Teacher teachers[], int currs){
        this.teachers = teachers;
        this.currs = currs ;
    }
    
    // operation

    public void add(Teacher t, int i) {
       teachers[i] = t;
    }
    
    // method overloading
    public void add(Teacher t) {
        teachers[currs++] = t;
    }    
    
    // find a particular student
    public boolean find(Name name) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currs; i++) {
            if (teachers[i].name == name) 
                return true;
            }
        return false;
        }
    
}
