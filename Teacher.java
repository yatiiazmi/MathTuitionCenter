// createed by team in Bangalore
public class Teacher {
    private String name;
    private String IC;
    private String address;
    private String qualification;
    private int experience;
    
    //constructor
    public Teacher(String name, String IC, String address, String qualification, int experience) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
    }
    
    //getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
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
}
