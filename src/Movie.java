
public class Movie {
	private String title;
	private String category;
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public void setCategory(String newCategory) {
		category = newCategory;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
}
