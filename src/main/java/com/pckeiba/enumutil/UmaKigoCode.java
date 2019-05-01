package com.pckeiba.enumutil;

public enum UmaKigoCode implements CodeInterface {
	A("01","(抽)"),
	B("02","[抽]"),
	C("03","(父)"),
	D("04","(市)"),
	E("05","(地)"),
	F("06","(外)"),
	G("07","(父)(抽)"),
	H("08","(父)(市)"),
	I("09","(父)(地)"),
	J("10","(市)(地)"),
	K("11","(外)(地)"),
	L("12","(父)(市)(地)"),
	M("15","(招)"),
	N("16","(招)(外)"),
	O("17","(招)(父)"),
	P("18","(招)(市)"),
	Q("19","(招)(父)(市)"),
	R("20","(父)(外)"),
	S("21","[地]"),
	T("22","(外)[地]"),
	U("23","(父)[地]"),
	V("24","(市)[地]"),
	W("25","(父)(市)[地]"),
	X("26","[外]"),
	Y("27","(父)[外]"),
	Z("31","(持)"),
	AA("40","(父)(外)(地)"),
	AB("41","(父)(外)[地] ")
	;

	private UmaKigoCode(String code, String content) {
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
