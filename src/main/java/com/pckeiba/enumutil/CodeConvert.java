package com.pckeiba.enumutil;

import java.util.Arrays;

public class CodeConvert {


    /**
     * 第一引数に指定されたEnumの中から、第2引数のコード値と一致するものを取得する。
     *
     * @param target 取得したいEnumのクラス
     * @param code   検索するコード値
     * @param <E>    CodeInterfaceを実装したEnumクラス
     * @return
     */
    @SuppressWarnings("rawtypes")
	public static <E extends Enum & CodeInterface> E valueOf(Class<E> target, String code) {

        return Arrays.stream(target.getEnumConstants())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}