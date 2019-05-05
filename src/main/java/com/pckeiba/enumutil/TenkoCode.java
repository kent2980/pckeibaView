package com.pckeiba.enumutil;

public enum TenkoCode implements CodeInterface {
	FINE("1","晴"),
	CLOUDY("2","曇"),
	RAINY("3","雨"),
	DRIZZLE("4","小雨"),
	SNOW("5","雪"),
	LIGHT_SNOW("6","小雪"),
	UNKNOWN("0","")
	;

	private TenkoCode(String code, String content) {
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
