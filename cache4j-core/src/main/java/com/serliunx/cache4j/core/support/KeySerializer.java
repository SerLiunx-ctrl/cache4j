package com.serliunx.cache4j.core.support;

/**
 * 键序列化器
 *
 * @author <a href="mailto:serliunx@yeah.net">SerLiunx</a>
 * @version 1.0.0
 * @since 2025/2/10
 */
public interface KeySerializer<S, R> {

	/**
	 * 将键序列化成指定类型
	 *
	 * @param key	键
	 * @return	序列化后的值
	 */
	R serialize(S key);
}
