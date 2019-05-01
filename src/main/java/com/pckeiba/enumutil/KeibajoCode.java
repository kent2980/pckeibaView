package com.pckeiba.enumutil;


public enum KeibajoCode implements CodeInterface {
	SAPPORO("01","札幌"),
	HAKODATE("02","函館"),
	FUKUSHIMA("03","福島"),
	NIGATA("04","新潟"),
	TOKYO("05","東京"),
	NAKAYAMA("06","中山"),
	CHUKYO("07","中京"),
	KYOTO("08","京都"),
	HANSHIN("09","阪神"),
	KOKURA("10","小倉");

	private KeibajoCode(String code, String content) {
		this.code = code;
		this.content = content;
	}
	private String code;
	private String content;
	@Override
	public String getCode() {
		return code;
	}
	@Override
	public String getContent() {
		return content;
	}

}
