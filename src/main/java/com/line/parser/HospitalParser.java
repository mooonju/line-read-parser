package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{

//    private String replaceAllQuot(String str) {
//        return  str.replaceAll("\"", "");
//    } 이 메소드 없애고 밑에 추가해서 라인을 받을 때에 " 없애는 코드 추가
    @Override
    public Hospital parse(String str) { // 라인을 받자마자 " 삭제
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
        // csv는 쉼표로 구분되어 있는 데이터이기 때문에 쉼표를 기준으로 데이터 자르기
        return new Hospital(splitted[0], splitted[1],splitted[2],Integer.parseInt(splitted[6]),splitted[4],splitted[5]);

    }
}
