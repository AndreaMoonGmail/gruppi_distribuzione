import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
	public static List<Integer> retrieveInput (String terminaliPath) throws IOException {
		File fil = new File(terminaliPath);
		FileReader inputFil = new FileReader(fil);
		BufferedReader in = new BufferedReader(inputFil);
		List<Integer>input= new ArrayList<Integer>();

		String s =in.readLine();
		
		while(s!=null)
		{
		    input.add(Integer.valueOf(s.trim()));
		    s = in.readLine();
		}
		in.close();
		return input;
	}
	
	
	public static void createDelete(List<Integer> inputTerminali, String outputFilePath) throws Exception{
		StringBuffer del= new StringBuffer();
		del.append(" delete  from sisalpay_wopr_ms_download.settingdistributiontsids where tsid in (  \n");
		
		for (Integer terminale : inputTerminali) {
			del.append(terminale.toString()).append(",\n");
		}
		del.deleteCharAt(del.length()-2);
	    del.append(")");
	    System.out.println(del);
	    
	    writeFile(outputFilePath, del);
	}


	private static void writeFile(String outputFilePath, StringBuffer stringToWrite) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
	    writer.write(stringToWrite.toString());
	    writer.close();
	}
	
	public static void createInsertGruppi(List<Integer> inputTerminali, List<Integer> gruppi, String outputFilePath) throws Exception{
		StringBuffer insert= new StringBuffer();
		
		
		for (Integer gruppo : gruppi) {
			insert.append("-- gruppo "+gruppo+"\n");
			
			for (Integer terminale : inputTerminali) {
				insert.append("INSERT INTO sisalpay_wopr_ms_download.settingdistributiontsids VALUES (null, '"+terminale+"', "+gruppo+", NOW(), 0);\n");
			}
			insert.append("\n");
			writeFile(outputFilePath, insert);
		}
	}
}
