package spring.web.test.vo;

public class BoardVo {

	String seq;
	String title;
	String bdate;
	String hit;
	String content;
	
	
	
	public BoardVo() {
		// TODO Auto-generated constructor stub
	}


	public BoardVo(String seq, String title, String bdate, String hit, String content) {
		this.seq = seq;
		this.title = title;
		this.bdate = bdate;
		this.hit = hit;
		this.content = content;
	}
	
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
}
