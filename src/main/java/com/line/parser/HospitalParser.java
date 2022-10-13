package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{

    private String getSubdivision(String name) {
        String[] subdivisions = { "소아과", "피부과", "성형외과", "정형외과", "안과", "가정의학과", "산부인과", "관절", "안과", "비뇨기과", "치과", "내과", "외과"};
        for(String subdivision : subdivisions){
            if(name.contains(subdivision)){
                return subdivision;
            }
        }
        return "";
    }

//    private String replaceAllQuot(String str) {
//        return  str.replaceAll("\"", "");
//    } 이 메소드 없애고 밑에 추가해서 라인을 받을 때에 " 없애는 코드 추가
    @Override
    public Hospital parse(String str) { // 라인을 받자마자 " 삭제
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
        // csv는 쉼표로 구분되어 있는 데이터이기 때문에 쉼표를 기준으로 데이터 자르기

        // id 0
        // address 1
        // district
        // category 2
        // emergencyRoom 6
        // name 10
        // subdivision 5

        // subdivision은 파싱해서 추가
        String name = splitted[10];
        String subdivision = getSubdivision(name);
        return new Hospital(splitted[0], splitted[1],splitted[2],Integer.parseInt(splitted[6]),name, subdivision);

    }
}
