// application team in UTP
public class Main
{
    // application code
	public static void main(String[] args) {
	    
        Student mike = new Student();
        Name name = new Name("Michael", "Alex", "Rok" ); 
        name.setFName("Michael");
        name.setMName("Alex");
        name.setLName("Rok");
        mike.setName(name);

        Student adila = new Student();
        name = new Name ("Adila", "binti", "Izzat");
        name.setFName("Adila");
        name.setMName("binti");
        name.setLName("Izzat");
        adila.setName(name);
        
        
        Student imran = new Student();
        name = new Name ("Syed", "Imran", "Shah");
        name.setFName("Syed");
        name.setMName("Imran");
        name.setLName("Shah");
        imran.setName(name);
        
        
        // creating a batch object
        StudentBatch sb2023 = new StudentBatch(adila,0);
        sb2023.add(mike);
        sb2023.add(adila, 0);       
        
        // declare a method that allows for the following:
        boolean isIn = sb2023.find(adila);
        
        

        Teacher cikguminah = new Teacher("cikguminah","0314556","Tronoh","Master",1);
        name = new Name("Ms", "Aminah", "Zainal");
        name.setFName("Ms");
        name.setMName("Aminah");
        name.setLName("Zainal");
        cikguminah.setName(name);
        
        for (int i=0; i<5; i++) 
            mike.setMark(100, i);
        
        // calculate and print the avg
        float avg = 0;
        avg = mike.calcAvg();
        System.out.println("Avg = " + avg);
        
        // calculate the min marks for mike
        System.out.println("Min = " + mike.calcMin());        
	}
}
