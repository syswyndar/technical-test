package com.syswyndar.technicaltest.model.interfaces;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarListResponse<T> {
    
    private String code;
    private String message;
    private List<T> data;
}
