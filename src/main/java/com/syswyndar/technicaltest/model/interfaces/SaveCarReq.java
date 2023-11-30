package com.syswyndar.technicaltest.model.interfaces;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveCarReq {
    private String car_name;
    private Long brand_id;
}
