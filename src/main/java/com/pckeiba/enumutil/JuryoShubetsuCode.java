package com.pckeiba.enumutil;

public enum JuryoShubetsuCode implements CodeInterface {
	HANDE("1","ハンデ"),
	BETTEI("2","別定"),
	BAREI("3","馬齢"),
	TERYO("4","定量")
	;

	private JuryoShubetsuCode(String code, String content) {
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
