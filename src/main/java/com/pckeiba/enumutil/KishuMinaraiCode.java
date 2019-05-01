package com.pckeiba.enumutil;

public enum KishuMinaraiCode implements CodeInterface {
	A("01","1Kg減","☆"),
	B("02","2Kg減","△"),
	C("03","3Kg減","▲")
	;

	private KishuMinaraiCode(String code, String content, String contentKigo) {
		this.code = code;
		this.content = content;
		this.contentKigo = contentKigo;
	}
	private String code;
	private String content;
	private String contentKigo;
	public String getCode() {
		return code;
	}
	public String getContent() {
		return content;
	}
	public String getContentKigo() {
		return contentKigo;
	}

}
