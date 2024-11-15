import java.util.ArrayList;
import java.util.List;

public class Main_gruppi_1_2_7_8 {
public static void main(String[] args) {
		
		List<Integer> gruppi= new ArrayList<Integer>();
		gruppi.add(1);
		gruppi.add(2);
		gruppi.add(7);
//		gruppi.add(8);
		
		
		try {
			List<Integer> inputTerminali= Utils.retrieveInput(Variabili.inputTerminaliPath);
			
			Utils.createDelete(inputTerminali, Variabili.outputFielFolder+Variabili.deleteFielName);
			
			//Utils
			Utils.createInsertGruppi(inputTerminali, gruppi, Variabili.outputFielFolder+Variabili.insertGruppiFilename);
			System.out.println("END Succesfully");
			System.out.println();
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}
	
	
}
