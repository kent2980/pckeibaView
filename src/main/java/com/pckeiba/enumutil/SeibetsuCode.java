package com.pckeiba.enumutil;

public enum SeibetsuCode implements CodeInterface {
	A("1","牡馬","牡"),
	B("2","牝馬","牝"),
	C("3","セン馬","セ")
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
