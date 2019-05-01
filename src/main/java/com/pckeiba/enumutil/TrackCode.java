package com.pckeiba.enumutil;

public enum TrackCode implements CodeInterface {
	A("10","芝・直線","芝"),
	B("11","芝・左","芝"),
	C("12","芝・左外","芝"),
	D("13","芝・左内－外","芝"),
	E("14","芝・左外－内","芝"),
	F("15","芝・左","芝"),
	G("16","芝・左","芝"),
	H("17","芝・右","芝"),
	I("18","芝・右外","芝"),
	J("19","芝・右内－外","芝"),
	K("20","芝・右外－内","芝"),
	L("21","芝・右内","芝"),
	M("22","芝・右外","芝"),
	N("23","ダート・左・","ダート"),
	O("24","ダート・右","ダート"),
	P("25","ダート・左内","ダート"),
	Q("26","ダート・右外回","ダート"),
	R("52","障害 芝・ダート",""),
	S("53","障害 芝・左","芝"),
	T("54","障害 芝","芝"),
	U("55","障害 芝・外","芝"),
	V("56","障害 芝・外－内","芝"),
	W("57","障害 芝・内－外","芝"),
	X("58","障害 芝・内","芝"),
	Y("59","障害 芝・外","芝"),
	;

	private TrackCode(String code, String content, String baba) {
		this.code = code;
		this.content = content;
		this.baba = baba;
	}
	private String code;
	private String content;
	private String baba;
	public String getCode() {
		return code;
	}
	public String getContent() {
		return content;
	}
	public String getBaba() {
		return baba;
	}

}
