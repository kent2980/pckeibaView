package com.pckeiba.enumutil;

public enum TozaiShozokuCode implements CodeInterface {
	A("01","関東","美浦"),
	B("02","関西","栗東"),
	C("03","地方招待","招待"),
	D("04","外国招待","招待")
	;

	private TozaiShozokuCode(String code, String content, String contentIsShort) {
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
