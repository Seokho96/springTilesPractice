package bit.com.a.dto;

import java.io.Serializable;

public class BbsParam implements Serializable {

	 private int pageNumber;
	 private int allPage;
	 
	 private String s_category;
	 private String keyword;
	 
	public BbsParam() {
		this(1,10);
	}

	
	public BbsParam(int pageNumber, int allPage) {
		super();
		this.pageNumber = pageNumber;
		this.allPage = allPage;
	}


	public BbsParam(String s_category, String keyword) {
		super();
		this.s_category = s_category;
		this.keyword = keyword;
	}

	public int getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}


	public int getAllPage() {
		return allPage;
	}


	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}


	public String getS_category() {
		return s_category;
	}

	public void setS_category(String s_category) {
		this.s_category = s_category;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	 
	
}
