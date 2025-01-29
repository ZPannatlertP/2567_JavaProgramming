
public class book {
	private String title;
	private Author author; //composition Concept
	private int page;
	
	book(String title, Author author , int page){
		this.title=title;
		this.author=author;
		this.page=page;
	}
	book(String title, Author author){
		/*this.title = title;
		this.author = author;
		this.page=0;*/
		this(title,author,0);
	}
	book(){
			this.title=null;
			this.author=null;
			this.page=0;
	}
	public String getTitile() {
		return this.title;
	}
	public Author getAuthor() {
		return this.author;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return this.page;
	}
	public String toString() {
		return getTitile()+ " has "+getPage()+" pages write by "+getAuthor();
	}
	
	
	
	
}
