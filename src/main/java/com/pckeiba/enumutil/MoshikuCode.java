package com.pckeiba.enumutil;

public enum MoshikuCode implements CodeInterface {
	A("01","栗毛"),
	B("02","栃栗毛"),
	C("03","鹿毛"),
	D("04","黒鹿毛"),
	E("05","青鹿毛"),
	F("06","青毛"),
	G("07","芦毛"),
	H("08","栗粕毛"),
	I("09","鹿粕毛"),
	J("10","青粕毛"),
	K("11","白毛")
	;

	private MoshikuCode(String code, String content) {
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
