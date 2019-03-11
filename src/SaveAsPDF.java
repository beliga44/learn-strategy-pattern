
public class SaveAsPDF implements Save {

	@Override
	public void saveFile(String name) {
		System.out.println("Save \""+ name +"\" document to PDF format");
	}

}
