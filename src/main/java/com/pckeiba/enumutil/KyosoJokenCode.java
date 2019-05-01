package com.pckeiba.enumutil;

public enum KyosoJokenCode implements CodeInterface {
	FIVE_HUND("005","500万以下"),
	ONE_THOU("010","1000万以下"),
	ONE_THOU_SIX_HUND("016","1600万以下"),
	SHINBA("701","新馬"),
	MISSHUSO("702","未出走"),
	MISHORI("703","未勝利"),
	OP("999","オープン")
	;

	private KyosoJokenCode(String code, String content) {
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
