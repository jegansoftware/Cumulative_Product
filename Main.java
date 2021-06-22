package analyze;

public class Cumulative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product_Cum ini=new Product_Cum();
		ini.readValue(); // Values is obtained by User
		ini.cumulative(); // Calculation Process
		ini.display(); // This display the result 
		ini=null;
		
	}

}
