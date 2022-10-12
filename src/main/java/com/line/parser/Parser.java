package com.line.parser;

public interface Parser<T> {
    T parse(String str);
    // 읽어올 파일에 따라 타입이 변함
    // 다형성을 적용하기 위해서 T 리턴
}

