// createed by team in Bangalore
public class Teacher {
    // data
    private Name name;
    private String IC;
    private String address;
    private String qualification;
    private int experience;
    
    // op
    
     //constructor
    public Teacher(String name, String IC, String address, String qualification, int experience) {
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
    }
    
    //getters and setters
    public Name getName() {
        return name;
    }
    
    public void setName(Name name) {
        this.name = name;
    }
    
    public String getIC() {
        return IC;
    }
    
    public void setIC(String IC) {
        this.IC = IC;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getQualification() {
        return qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public int getExperience() {
        return experience;
    }
    
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    
   
}
