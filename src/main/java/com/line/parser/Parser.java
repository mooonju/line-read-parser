package com.line.parser;

public interface Parser<T> {
    T parse(String str);
    // 다형성을 적용하기 위해서 T 리턴
}
