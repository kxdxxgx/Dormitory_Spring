package com.dormitory.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DormitoryRoomDTO {
    //도미토리
    private String d_code;
    private String d_name;
    private String d_telno;
    private String d_checkout;
    private String d_checkin;
    private String d_star;
    private String d_img;
    private String d_type;
    private int d_zipcode;
    private String d_road;
    private double d_lat;
    private double d_lon;
    private String d_description;
    private String d_grade;
    private String d_discount;
    
    //룸
    private int r_code;
    private String r_name;
    private int r_num;
    private int r_max_num;
    private String r_img;
    private String r_price;
}
