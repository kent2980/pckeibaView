package com.pckeiba.enumutil;

public enum KyosoKigoCode implements CodeInterface {
	DSN("001","(指定)"),
	WAK("002","若手騎手"),
	DES("003","[指定]"),
	SD("004","(特指)"),
	FM("020","牝"),
	FM_DSN("021","牝 (指定)"),
	FM_DES("023","牝 [指定]"),
	FM_SD("024","牝 (特指)"),
	CG("030","牡・ｾﾝ"),
	CG_DSN("031","牡・ｾﾝ (指定)"),
	CG_DES("033","牡・ｾﾝ [指定]"),
	CG_SD("034","牡・ｾﾝ (特指)"),
	CF("040","牡・牝"),
	CF_DSN("041","牡・牝 (指定)"),
	CF_DES("043","牡・牝 [指定]"),
	CF_SD("044","牡・牝 (特指)"),
	MIX("A00","(混合)"),
	MIX_DSN("A01","(混合)(指定)"),
	MIX_WAK("A02","(混合) 若手騎手"),
	MIX_DES("A03","(混合)[指定]"),
	MIX_SD("A04","(混合)(特指)"),
	MIX_C("A10","(混合) 牡"),
	MIX_C2("A11","(混合) 牡 (指定)"),
	MIX_C_DES("A13","(混合) 牡 [指定]"),
	MIX_C_SD("A14","(混合) 牡 (特指)"),
	MIX_FM("A20","(混合) 牝 "),
	MIX_FM_DSN("A21","(混合) 牝 (指定)"),
	MIX_FM_DES("A23","(混合) 牝 [指定]"),
	MIX_FM_SD("A24","(混合) 牝 (特指)"),
	MIX_CG("A30","(混合) 牡・ｾﾝ"),
	MIX_CG_DSN("A31","(混合) 牡・ｾﾝ (指定)"),
	MIX_CG_DES("A33","(混合) 牡・ｾﾝ [指定]"),
	MIX_CG_SD("A34","(混合) 牡・ｾﾝ (特指)"),
	MIX_CF("A40","(混合) 牡・牝"),
	MIX_CF_DSN("A41","(混合) 牡・牝 (指定)"),
	D("B00","(父)"),
	D_DSN("B01","(父)(指定)"),
	D_DES("B03","(父)[指定]"),
	D_SD("B04","(父)(特指)"),
	A("C00","(市)"),
	A_DSN("C01","(市)(指定)"),
	A_DES("C03","(市)[指定]"),
	A_SD("C04","(市)(特指)"),
	S("D00","(抽)"),
	S_DSN("D01","(抽)(指定)"),
	S_DES("D03","(抽)[指定]"),
	E("E00","[抽]"),
	E_DSN("E01","[抽](指定)"),
	E_DES("E03","[抽][指定]"),
	A_S("F00","(市)(抽)"),
	A_S_DSN("F01","(市)(抽)(指定)"),
	A_S_DES("F03","(市)(抽)[指定]"),
	A_S_SD("F04","(市)(抽)(特指)"),
	G("G00","(抽) 関西配布馬 "),
	G_DSN("G01","(抽) 関西配布馬 (指定)"),
	G_DES("G03","(抽) 関西配布馬 [指定]"),
	H("H00","(抽) 関東配布馬"),
	H_DSN("H01","(抽) 関東配布馬 (指定)"),
	I("I00","[抽] 関西配布馬"),
	I_DSN("I01","[抽] 関西配布馬 (指定)"),
	I_DES("I03","[抽] 関西配布馬 [指定]"),
	J("J00","[抽] 関東配布馬"),
	J_DSN("J01","[抽] 関東配布馬 (指定)"),
	K("K00","(市)(抽) 関西配布馬"),
	K_DSN("K01","(市)(抽) 関西配布馬 (指定)"),
	K_DES("K03","(市)(抽) 関西配布馬 [指定]"),
	L("L00","(市)(抽) 関東配布馬"),
	L_DSN("L01","(市)(抽) 関東配布馬 (指定)"),
	L_DES("L03","(市)(抽) 関東配布馬 [指定]"),
	M("M00","九州産馬"),
	M_DSN("M01","九州産馬 (指定)"),
	M_DES("M03","九州産馬 [指定]"),
	M_SD("M04","九州産馬 (特指)"),
	INT("N00","(国際)"),
	INT_DSN("N01","(国際)(指定)"),
	INT_DES("N03","(国際)[指定]"),
	INT_SD("N04","(国際)(特指)"),
	INT_FM("N20","(国際) 牝"),
	INT_FM_DSN("N21","(国際) 牝 (指定)"),
	INT_FM_DES("N23","(国際) 牝 [指定]"),
	INT_FM_SD("N24","(国際) 牝 (特指)"),
	INT_CG("N30","(国際) 牡・ｾﾝ"),
	INT_CG_DSN("N31","(国際) 牡・ｾﾝ (指定)"),
	INT_CF("N40","(国際) 牡・牝"),
	INT_CF_DSN("N41","(国際) 牡・牝 (指定)"),
	INT_CF_SD("N44","(国際) 牡・牝 (特指)")
	;

	private KyosoKigoCode(String code, String content) {
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
