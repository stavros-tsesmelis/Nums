package com.nums.nums.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Numbers {

    private int a;
    private int b;
    private int sum = a + b;
    private int max;
    private int min;

}
