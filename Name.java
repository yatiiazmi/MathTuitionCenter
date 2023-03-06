public class Name {
    
    private String fname;
    private String lname;
    private String mname;
    
    
    //consturctpr
    //no return, name same as class
    public Name (String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    
    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }
    
    public String getFName(){
        return fname;
    }

    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.mname = mname;
    }
    
    public String getMName(){
        return mname;
    }
    
    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.lname = lname;
    }
    
    public String getLName(){
        return lname;
    }

    
}
