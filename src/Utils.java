import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utils {
	public static List<Integer> retrieveInput (String terminaliPath) throws IOException {
		File fil = new File(terminaliPath);
		FileReader inputFil = new FileReader(fil);
		BufferedReader in = new BufferedReader(inputFil);
		List<Integer>input= new ArrayList<Integer>();

		String s =in.readLine();
		
		while(s!=null)
		{
		    input.add(Integer.valueOf(s));
		    s = in.readLine();
		}
		in.close();
		return input;
	}
}
