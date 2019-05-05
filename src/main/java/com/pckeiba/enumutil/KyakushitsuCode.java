package com.pckeiba.enumutil;

public enum KyakushitsuCode implements CodeInterface {
	A("1","逃げ","逃"),
	B("2","先行","先"),
	C("3","差し","差"),
	D("4","追込","追"),
	UNKNOWN("0","","")
	;

	private KyakushitsuCode(String code, String content, String contentIsShort) {
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
