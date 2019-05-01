package com.pckeiba.enumutil;

public enum BabaJotaiCode implements CodeInterface {
	FIRM("01","良"),
	GOOD("02","稍重"),
	YIELDING("03","重"),
	SOFT("04","不良")
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
