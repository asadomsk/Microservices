package consumer.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

//Class object from which the event type are retrieved from the queue.
public class ActionEventDto {

	public String action;
	public String source;
	public String dest;
	public String date;

	// Required for deserialization purpose.
	@JsonCreator
	public ActionEventDto( @JsonProperty("action") String action, @JsonProperty("source") String source,@JsonProperty("dest") String dest,@JsonProperty("date") String date) {
		this.action = action;
		this.source = source;
		this.dest = dest;
		this.date = date;
	}


	public String getAction() {
		return action;
	}

	public String getSource() {
		return source;
	}

	public String getDest() {
		return dest;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "ActionEventDto [action=" + action + ", source=" + source + ", dest=" + dest + ", date="
				+ date + "]";
	}

	

}
