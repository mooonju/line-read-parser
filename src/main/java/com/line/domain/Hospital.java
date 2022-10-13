package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private String emergencyRoom;
    private String name;
    private String subdivision;

    // id 받아줄 constructor 생성
//    public Hospital(String id) {
//        this.id = id.replaceAll("\"", "");
        // constructor에서 id를 set할 때 "를 빈칸으로
//    }

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    // getter 생성
    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public String getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
