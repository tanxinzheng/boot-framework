package com.github.tanxinzheng.framework.web.dictionary;

import java.util.Map;

/**
 * Created by tanxinzheng on 16/10/20.
 */
public interface DictionaryInterpreterService {

    /**
     * 翻译
     * @param dictionaryType    字典类型
     * @param dictionaryCode    字典代码
     * @return
     */
    Map<String, Object> translateDictionary(String dictionaryType, String dictionaryCode);

}
