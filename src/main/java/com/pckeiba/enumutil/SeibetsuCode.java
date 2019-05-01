package com.pckeiba.enumutil;

public enum SeibetsuCode implements CodeInterface {
	A("01","牡馬","牡"),
	B("02","牝馬","牝"),
	C("03","セン馬","セン")
	;

	private SeibetsuCode(String code, String content, String contentIsShort) {
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
