package com.pckeiba.enumutil;

public enum KishuMinaraiCode implements CodeInterface {
	A("1","1Kg減","☆"),
	B("2","2Kg減","△"),
	C("3","3Kg減","▲"),
	D("0","","")
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
