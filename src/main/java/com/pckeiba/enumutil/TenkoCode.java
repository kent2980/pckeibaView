package com.pckeiba.enumutil;

public enum TenkoCode implements CodeInterface {
	FINE("01","晴"),
	CLOUDY("02","曇"),
	RAINY("03","雨"),
	DRIZZLE("04","小雨"),
	SNOW("05","雪"),
	LIGHT_SNOW("06","小雪")
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
