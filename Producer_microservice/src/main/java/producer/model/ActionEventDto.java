package producer.model;

//Class object which is sent to the queue.
public class ActionEventDto {
	
	private String action;
	private String source;
	private String dest;
	private String date;
	
	
	
	
	public ActionEventDto(String action, String source, String dest, String date) {
		super();
		this.action = action;
		this.source = source;
		this.dest = dest;
		this.date = date;
	}
	
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
	
	
	public static ActionEventDto create(Action action) {
		return new ActionEventDto(action.getAction(),action.getSource(),action.getDest(),action.getDate());
	}

	
	
	@Override
	public String toString() {
		return "ActionEventDto [action=" + action + ", source=" + source + ", dest=" + dest + ", date="
				+ date + "]";
	}
	
	

}
