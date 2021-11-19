package streamAPI;

public class News {

	int newsid;
	String postedbyuser;
	String commentbyuser;
	String comment;
	public News(int newsid, String postedbyuser, String commentbyuser, String comment) {
		super();
		this.newsid = newsid;
		this.postedbyuser = postedbyuser;
		this.commentbyuser = commentbyuser;
		this.comment = comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getPostedbyuser() {
		return postedbyuser;
	}
	public void setPostedbyuser(String postedbyuser) {
		this.postedbyuser = postedbyuser;
	}
	public String getCommentbyuser() {
		return commentbyuser;
	}
	public void setCommentbyuser(String commentbyuser) {
		this.commentbyuser = commentbyuser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", postedbyuser=" + postedbyuser + ", commentbyuser=" + commentbyuser
				+ ", comment=" + comment + "]";
	}
	
	
}
