package com.pckeiba.enumutil;

public enum HinshuCode implements CodeInterface {
	A("01","サラブレッド","サラ"),
	B("02","サラブレッド系種","サラ系"),
	C("03","準サラブレッド","準サラ"),
	D("04","軽半血種","軽半"),
	E("05","アングロアラブ","アア"),
	F("06","アラブ系種","アラ系"),
	G("07","アラブ","アラブ"),
	H("08","中半血種","中半"),
	;

	private HinshuCode(String code, String content, String contentIsShort) {
		this.code = code;
		this.content = content;
		this.contentIsShort = contentIsShort;
	}
	private String code;
	private String content;
	private String contentIsShort;
	public String getCode() {
		return code;
	}
	public String getContent() {
		return content;
	}
	public String getContentIsShort() {
		return contentIsShort;
	}

}
