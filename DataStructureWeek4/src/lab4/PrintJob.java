package lab4;

public class PrintJob {
	public String members;
	public int id;
	public String doc_name;
	public int pages;
	
	
	public PrintJob(String members, int id, String doc_name, int pages) {
		this.members = members;
		this.id = id;
		this.doc_name = doc_name;
		this.pages = pages;
	}
	
	public String toString() {
		return "Member: " + this.members +
				"\nID: " + this.id +
				"\nDocument Name: " +
				"\nPages: " + this.pages;
	}
}
