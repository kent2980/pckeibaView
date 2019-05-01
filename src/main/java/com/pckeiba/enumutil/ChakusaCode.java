package com.pckeiba.enumutil;

public enum ChakusaCode implements CodeInterface {
	A("_12","1/2馬身","1/2"),
	B("_34","3/4馬身","3/4"),
	C("1__","1馬身","1"),
	D("112","１1/2馬身","１1/2"),
	E("114","１1/4馬身","１1/4"),
	F("134","１3/4馬身","１3/4"),
	G("2__","2馬身","2"),
	H("212","２1/2馬身","２1/2"),
	I("3__","3馬身","3"),
	J("312","３1/2馬身","３1/2"),
	K("4__","4馬身","4"),
	L("5__","5馬身","5"),
	M("6__","6馬身","6"),
	N("7__","7馬身","7"),
	O("8__","8馬身","8"),
	P("9__","9馬身","9"),
	Q("A__","アタマ","アタマ"),
	R("D__","同着","同着"),
	S("H__","ハナ","ハナ"),
	T("K__","クビ","クビ"),
	U("T__","大差","大差"),
	V("Z__","１０馬身","10")
	;

	private ChakusaCode(String code, String content, String contentIsShort) {
		this.code = code;
		this.content = content;
		this.contentIsShort = contentIsShort;
	}
	private String code;
	private String content;
	private String contentIsShort;
	public String getCode() {
		return code;
	}
	public String getContent() {
		return content;
	}
	public String getContentIsShort() {
		return contentIsShort;
	}
}
