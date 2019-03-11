
public class SaveAs {	
	/* 
	 * Save method without using strategy pattern 
	 * */
	public void save(String name, String format) {
		if (format.equals("PDF")) {
			System.out.println("Save \""+ name +"\" document to PDF format");
		} else if (format.equals("Word")) {
			System.out.println("Save \""+ name +"\" document to Word format");
		} else {
			System.out.println("Save \""+ name +"\" document to Another format");
		}
	}
}
