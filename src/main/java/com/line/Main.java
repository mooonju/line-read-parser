package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\zzzo_\\Downloads\\seoul_hospital_infos.txt";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        for(Hospital hospital : hospitals){
            System.out.printf("%s, %s, %s, %s, %d, %s, %s\n",
                    hospital.getId(), hospital.getAddress(), hospital.getDistrict(),
                    hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(), hospital.getSubdivision());
        }
    }
}

