package com.github.tanxinzheng.framework.web.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.tanxinzheng.framework.web.dictionary.AccountJsonSerializer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by tanxinzheng on 16/10/20.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@JacksonAnnotationsInside
@JsonSerialize(using = AccountJsonSerializer.class)
public @interface AccountField {

    /**
     * 字段名称
     * @return
     */
    String fieldName() default "";

    /**
     * 输出格式
     * @return
     */
    Class outputFormat() default String.class;

}
