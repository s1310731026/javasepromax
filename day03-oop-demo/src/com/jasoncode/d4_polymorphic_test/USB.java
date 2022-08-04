package com.jasoncode.d4_polymorphic_test;

/**
 * USB接口 == 規範
 */
public interface USB {
    // 接入 拔出
    void connect();
    void unconnect();
}
