package com.pckeiba.enumutil;

public enum TozaiShozokuCode implements CodeInterface {
	A("1","美浦","美浦"),
	B("2","栗東","栗東"),
	C("3","地方招待","地方"),
	D("4","外国招待","外国")
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
