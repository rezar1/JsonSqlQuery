
/**
 * Baijiahulian.com Inc. Copyright (c) 2014-2016 All Rights Reserved.
 */

package com.extensions.logmonitor.util.beanCopy;

import java.lang.reflect.Method;

/**
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time Oct 19, 2016
 * @Desc this guy is too lazy, nothing left.
 */

public interface MethodFilter {

    public boolean needFilter(Method method);

}
