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
	KOKURA("10","小倉"),
	MONBETSU("30","門別"),
	KITAMI("31","北見"),
	IWAMIZAWA("32","岩見"),
	OBIHIRO("33","帯広"),
	ASAHIKAWA("34","旭川"),
	MORIOKA("35","盛岡"),
	MIZUSAWA("36","水沢"),
	KAMINOYAMA("37","上山"),
	SANJYO("38","三条"),
	ASHIKAGA("39","足利"),
	UTSUNOMIYA("40","宇都"),
	TAKASAKI("41","高崎"),
	URAWA("42","浦和"),
	FUNABASHI("43","船橋"),
	OHI("44","大井"),
	KAWASAKI("45","川崎"),
	KANAZAWA("46","金沢"),
	KASAMATSU("47","笠松"),
	NAGOYA("48","名古"),
	KIMIIDERA("49","紀三"),
	SONODA("50","園田"),
	HIMEJI("51","姫路"),
	MASUDA("52","益田"),
	FUKUYAMA("53","福山"),
	KOCHI("54","高知"),
	SAGA("55","佐賀"),
	ARAO("56","荒尾"),
	NAKATSU("57","中津"),
	SAPPORO_NAR("58","札幌"),
	HAKODATE_NAR("59","函館"),
	NIIGATA_NAR("60","新潟"),
	CHUKYO_NAR("61","中京"),
	ETC("A0","外"),
	JPN("A2","日"),
	USA("A4","米"),
	GB("A6","英"),
	FR("A8","仏"),
	IND("B0","印"),
	IRE("B2","愛"),
	NZ("B4","新"),
	AUS("B6","豪"),
	CAN("B8","加"),
	ITY("C0","伊"),
	GER("C2","独"),
	OMN("C5","オ"),
	IRQ("C6","イ"),
	UAE("C7","UAE"),
	SYR("C8","叙"),
	SWE("D0","瑞"),
	HUN("D2","洪"),
	POR("D4","葡"),
	RUS("D6","露"),
	URU("D8","宇"),
	PER("E0","秘"),
	ARG("E2","亜"),
	BRZ("E4","伯"),
	BEL("E6","白"),
	TUR("E8","土"),
	KOR("F0","韓"),
	CHN("F1","中"),
	CHI("F2","智"),
	PAN("F8","巴"),
	HK("G0","香"),
	SPA("G2","西"),
	GER_2("H0","独"),
	SAF("H2","南　(阿)"),
	SWI("H4","ス"),
	MCO("H6","モ"),
	PHI("H8","比"),
	PUE("I0","プ"),
	COL("I2","コ"),
	CZE("I4","チ"),
	CZE_2("I6","チ"),
	SLO("I8","ス"),
	ECU("J0","エ"),
	GR("J2","ギ"),
	MAL("J4","馬"),
	MEX("J6","墨"),
	MOR("J8","摩"),
	PAK("K0","基"),
	POL("K2","波"),
	PRY("K4","拉"),
	SDA("K6","サ"),
	CYP("K8","キ"),
	THA("L0","泰"),
	UKR("L2","烏"),
	VEN("L4","ベ"),
	YUG("L6","ユ"),
	DEN("L8","丁"),
	SIN("M0","嘉"),
	MAC("M2","澳"),
	AUT("M4","墺"),
	JOR("M6","約"),
	QAT("M8","華")
	;

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
