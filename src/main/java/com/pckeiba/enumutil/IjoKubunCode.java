package com.pckeiba.enumutil;

public enum IjoKubunCode implements CodeInterface {
	SCRATCHED("1","出走取消","取消"),
	EXCLUDED_BY_STARTERS("2","発走除外","発除"),
	EXCLUDED_BY_STEWARDS("3","競走除外","競除"),
	FALL_TO_FINISH("4","競走中止","中止"),
	DISQUALIFIED("5","失格","失格"),
	REMOUNT_AFTER_A_CROPPER("6","落馬再騎乗","再騎"),
	DISQUALIFIED_AND_PLACED("7","降着","降着")
	;

	private IjoKubunCode(String code, String content, String contentIsShort) {
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
