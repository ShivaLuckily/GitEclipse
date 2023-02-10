package flipkart.com;

public class Automation {
	
	public static void main(String[] args) {
		
		
		String s="i like automation testing";
		
		String[] s1=s.split(" ");
		
	
		
		for(String word:s1) {
			
			if("automation".equals(word)) {
				
				
		String s2=		s.replaceAll("automation", "API");
				
				System.out.println(s2);
				
				
			break;
			}
			
		}
		System.out.println("not present");
	}

}
