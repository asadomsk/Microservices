package producer.model;

public class Action {
	
	private String action;
	private String source;
	private String dest;
	private String date;
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Action [action=" + action + ", source=" + source + ", dest=" + dest + ", date=" + date
				+ "]";
	}
	
	

}
