
public class MainProgram {
	static void saveFile(String document, String type) {
		new SaveAs().save(document, type);
	}
	
	static void saveFile(String document, Save save) {
		save.saveFile(document);
	}
		
	public static void main(String[] args) {
		// Without strategy pattern
		saveFile("Report 1", "PDF");
		saveFile("Report 2", "Word");
		
		// With strategy pattern
		saveFile("Report 1", new SaveAsPDF());
		saveFile("Report 2", new SaveAsWord());
	}
}
