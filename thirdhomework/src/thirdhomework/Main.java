package thirdhomework;

public class Main {

	public static void main(String[] args) {
		Student hatice = new Student(); 
        hatice.firstName = "hatice";
        
        instructor engin = new instructor();
        engin.firstName = "engin";
        
        userManager userManager = new userManager();
        userManager.add(hatice);
        userManager.add(engin);
        
        
		
	}

}
