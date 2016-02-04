package bestTutorial;

public class StringMethods {
	
	
	private String leftTrim(String s){
		
		
		
	    int i = 0;
		for(i=0; i<s.length();i++){
			if(s.charAt(i) == ' '){
				s.substring(i);
				return s;
			}
			else{
				return s;
			}
		
		}
		return s;
	}
	
	public static void main(String[] args) {
		String s = "  Hello";
		
		StringMethods str = new StringMethods();
				
        str.leftTrim(s);
       
	}

}
