import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main_gruppi_1_2 {

	public static void main(String[] args) {
		
		List<Integer> gruppi= new ArrayList<Integer>();
		gruppi.add(1);
		gruppi.add(2);
		
		StringBuffer delete= new StringBuffer();
		
		try {
			List<Integer> inputTerminali= Utils.retrieveInput(Variabili.terminaliPath);
			
			
			System.out.println("END Succesfully");
			System.out.println();
		} catch (IOException e) {
			System.out.println(e);
			
		}

	}
	
	
	

}
