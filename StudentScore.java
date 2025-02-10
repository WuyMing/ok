package com.yang.text.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentScore {
    private String studentname;
    private Integer yu;
    private Integer shu;
    private Integer ying;
    public String getName(){
    return studentname;
    }
}
