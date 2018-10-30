import java.util.ArrayList;
import java.util.List;

public class Section implements Element{

	private String title;
	private List<Element> content = new ArrayList<Element>();
	
	public Section(String title){
		this.title = title;
	}
	
	public Section(String title, List<Element> content){
		this.title = title;
		this.content = content;
	}
	
	public void add(Element e) {
		content.add(e);
		
	}
	@Override
	public void remove(Element e) {
		content.remove(e);		
	}
	
	public void getChild(int index) {
		content.get(index);
		
	}

	public void print() {
		System.out.println(title);
		for(Element elem : content){
			elem.print();
		}
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Element> getContent() {
		return content;
	}
	public void setContent(List<Element> content) {
		this.content = content;
	}
	
	

}
