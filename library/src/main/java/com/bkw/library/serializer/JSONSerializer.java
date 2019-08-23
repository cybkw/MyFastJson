package com.bkw.library.serializer;

import com.bkw.library.deserializer.ObjectSerializer;

/**
 * JSON序列化器
 */
public class JSONSerializer {

    /**
     * 字符串拼接
     */
    private final StringBuilder out;
    /**
     * 序列化 / 反序列化配置
     */
    private final SerializeConfig config;

    /**
     * 参考源码：JSONSerializer.java 63行
     *
     * @param out
     * @param config
     */

    public JSONSerializer(StringBuilder out, SerializeConfig config) {
        this.out = out;
        this.config = config;
    }

    /**
     * 开始序列化
     * 参考源码JSON.java 740行 - JSONSerializer.java 275行
     *
     * @param object 需要序列化的对象
     */
    public void write(Object object) {
        // 序列化对象为空不作处理
        if (object == null) {
            // JSONSerializer.java 277 - 808行
            out.append("null");
            return;
        }

        // 获取序列化对象Class
        Class<?> clazz = object.getClass();
        // 对象序列化接口实现（参考源码：JSONSerializer.java 282 - 410行）
        ObjectSerializer writer = config.getObjectWriter(clazz);
        // 调用接口序列化方法
        writer.write(config, object, out);
    }
}
