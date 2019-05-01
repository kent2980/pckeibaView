package com.pckeiba.enumutil;

public enum YobiCode implements CodeInterface {
	SATURDAY("1","土曜日","土"),
	SUNDAY("2","日曜日","日"),
	HOLIDAY("3","祝日","祝"),
	MONDAY("4","月曜日","月"),
	TUESDAY("5","火曜日","火"),
	WEDNESDAY("6","水曜日","水"),
	THURSDAY("7","木曜日","木"),
	FRIDAY("8","金曜日","金");

	private YobiCode(String code, String content, String contentIsShort) {
		this.code = code;
		this.content = content;
		this.contentIsShort = contentIsShort;
	}

	private String code;
	private String content;
	private String contentIsShort;

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getContent() {
		return content;
	}

	public String getContentIsShort() {
		return contentIsShort;
	}

}
