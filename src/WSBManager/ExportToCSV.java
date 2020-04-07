package WSBManager;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ExportToCSV {

		static String output;
		static List<List<String>> data = Arrays.asList();
		
		public void Export(String output, List data) {
			this.output = output;
			this.data = data;
		}
		
		
		public static void exportToCSV() throws IOException {
			try {
			FileWriter csvWriter = new FileWriter(output);

			for (List<String> rowData : data) {
			    csvWriter.append(String.join(",", rowData));
			    csvWriter.append("\n");
			}

			csvWriter.flush();
			csvWriter.close();	
		} catch (IOException ex) {
            System.out.println("Problem z dostêpem do pliku");
        		}
	}
}