package com.serliunx.cache4j.core.support;

/**
 * 字符串型的键序列化器: 将键调用 {@link Object#toString()} 后得到
 *
 * @author <a href="mailto:serliunx@yeah.net">SerLiunx</a>
 * @version 1.0.0
 * @since 2025/2/10
 */
public final class StringKeySerializer implements KeySerializer<Object, String> {

	/**
	 * 单例
	 */
	private static final KeySerializer<Object, String> INSTANCE = new StringKeySerializer();

	// private-ctor
	private StringKeySerializer() {}

	@Override
	public String serialize(Object key) {
		return key.toString();
	}

	/**
	 * 获取实例
	 */
	public static KeySerializer<Object, String> getInstance() {
		return INSTANCE;
	}
}
