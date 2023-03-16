package Exam3;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> { //Cloneable { // clone 추가해야됨
	private String title;
	private Date publishDate;
	private String comment;

	public Book(String title, Date publishDate, String commnet) {
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}

	@Override
	public int compareTo(Book o) {
		if (publishDate.getTime() < o.publishDate.getTime())
		// publishDate의 타입이 Date이므로 compareTo() 메서드 내부에서 비교하기 위해서는 
		// getTime() 메서드를 사용하여 long 타입으로 변경
		{
			return -1;
		} else if (publishDate.getTime() > o.publishDate.getTime()) {
			return 1;
		} else {
			return 0;
		}

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publishDate=" + publishDate + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

//    @Override
//    public Book clone() throws CloneNotSupportedException {
//        return (Book) super.clone();
//    }
	
}
