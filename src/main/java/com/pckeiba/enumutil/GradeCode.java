package com.pckeiba.enumutil;

public enum GradeCode implements CodeInterface {
	G1("A","G1"),
	G2("B","G2"),
	G3("C","G3"),
	NO_GRADE("D","重賞"),
	TOKUBETSU("E","特別競走"),
	JG1("F","J・G1"),
	JG2("F","J・G2"),
	JG3("F","J・G3"),
	LISTED("L","リステッド")
	;

	private GradeCode(String code, String content) {
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
