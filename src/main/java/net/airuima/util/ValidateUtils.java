package net.airuima.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/**
 * Copyright (C), 2017-2020, 武汉睿码智能科技有限公司
 * 验证工具类
 *
 * @author ruima
 * @date 2020/12/21
 */
public final class ValidateUtils {

    private ValidateUtils() {

    }

    /**
     * 验证数组的有效性
     */
    public static boolean isValid(Object[] array) {
        return null != array && array.length > 0;
    }

    /**
     * 验证字符串的有效性
     */
    public static boolean isValid(String string) {
        return string != null && string.trim().length() > 0;
    }

    /**
     * 验证集合的有效性
     */
    public static boolean isValid(Collection<?> collection) {
        return collection != null && collection.size() > 0;
    }

    /**
     * 验证Map集合的有效性
     */
    public static boolean isValid(Map<?, ?> map) {
        return map != null && map.size() > 0;
    }

    /**
     * 判断是否任一集合存在元素
     */
    public static boolean isAnyValid(Collection<?>... collection) {
        return Arrays.stream(collection).anyMatch(collect -> collect != null && collect.size() > 0);
    }
}
