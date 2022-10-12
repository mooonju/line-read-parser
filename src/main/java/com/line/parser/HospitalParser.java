package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        // csv는 쉼표로 구분되어 있는 데이터이기 때문에 쉼표를 기준으로 데이터 자름
        return new Hospital(splitted[0]);
    }
}
