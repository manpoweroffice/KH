package job;

public class SchedulerVo {

	private String title;
	private String content;
	private String startevent;
	private String endevent;
	
	@Override
	public String toString() {
		return "SchedulerVo [title=" + title + ", content=" + content + ", startevent=" + startevent + ", endevent="
				+ endevent + "]";
	}
	public SchedulerVo(){}
	public SchedulerVo(String title,String content,String startevent,String endevent){
		this.title=title;
		this.content=content;
		this.startevent=startevent;
		this.endevent=endevent;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStartevent() {
		return startevent;
	}
	public void setStartevent(String startevent) {
		this.startevent = startevent;
	}
	public String getEndevent() {
		return endevent;
	}
	public void setEndevent(String endevent) {
		this.endevent = endevent;
	}
	
}
