package com.pckeiba.enumutil;

public enum KyosoShubetsuCode implements CodeInterface {
	TWO_YEAR_OLDS("11","2歳"),
	THREE_YEAR_OLDS("12","3歳"),
	THREE_YEAR_OLDS_UP("13","3歳以上"),
	FOUR_YEAR_OLDS_UP("14","4歳以上"),
	THREE_YEAR_OLDS_UP_STEEPLE_CHASE("18","障害3歳以上"),
	FOUR_YEAR_OLDS_UP_STEEPLE_CHASE("19","障害4歳以上"),
	;

	private KyosoShubetsuCode(String code, String content) {
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
