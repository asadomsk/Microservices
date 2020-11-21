package save.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actions2")
public class Action {

	@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="action_id")
    private int id;
	private String action;
	@Column(name="file_source")
	private String source;
	@Column(name="file_dest")
	private String dest;
	 @Column(name="creation_date")
	private String date;

	public Action() {
	}

	public Action(String action, String source, String dest, String date) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	


}
