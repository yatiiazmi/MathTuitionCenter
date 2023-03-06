// created by team in KL
public class Student {
    // data/attributes
    private Name name;
    private String kp;
    private String address;
    private String schoolname;
    private float marks[] = new float[5];
    
    public Student(){
        System.out.println("Student object created");
    }
    
    // methods or operations
    public float calcAvg() {
        return 0;
    }
    
    public float calcMin() {
        return 0;
    }
    

    public void setName(Name thename) {
        name = thename;
    }    
    
    
    public void setMark(float mark, int i) {
        marks[i] = mark;        
    }
    
}
