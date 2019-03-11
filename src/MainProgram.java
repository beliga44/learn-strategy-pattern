
public class MainProgram {
	static void saveFile(String document, Save save) {
		save.saveFile(document);
	}
	
	public static void main(String[] args) {
		saveFile("Report 1", new SaveAsPDF());
		saveFile("Report 2", new SaveAsWord());
	}
}
