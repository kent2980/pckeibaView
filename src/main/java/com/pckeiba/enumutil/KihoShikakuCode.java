package com.pckeiba.enumutil;

public enum KihoShikakuCode implements CodeInterface {
	A("01","平・障"),
	B("02","平地"),
	C("03","障害");

	private KihoShikakuCode(String code, String content) {
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
