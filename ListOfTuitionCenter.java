public class ListofTuitionCenter {
    
    TuitionCenter tuition;
    int numTC;
 
    
    //constructor
    public ListofTuitionCenter(int numTC ){
        System.out.println("List of our tuition center: ");
        this.numTC= numTC;
    }
    
  
    public int getNumTCs(){
        return numTC;
    }
    
    public void setNumTC(){
        this.numTC = numTC;
    }
    
    public void setTuitionCenter(TuitionCenter tuitioncenter){
        tuition = tuitioncenter;
    }
}
