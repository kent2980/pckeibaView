package com.pckeiba.enumutil;

public enum BabaJotaiCode implements CodeInterface {
	FIRM("1","良"),
	GOOD("2","稍重"),
	YIELDING("3","重"),
	SOFT("4","不良"),
	UNKNOWN("0","")
	;

	private BabaJotaiCode(String code, String content) {
		this.code = code;
		this.content = content;
	}
	private String code;
	private String content;
	public String getCode() {
		return code;
	}
	public String getContent() {
		return content;
	}

}
