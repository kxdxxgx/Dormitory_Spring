package com.dormitory.mapper;

import com.dormitory.dto.DormitoryDTO;
import com.dormitory.dto.ReservationDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper {
    public void managerUpdate(String userid,String dormitoryCode) throws  Exception;
    public List<ReservationDTO> getManagerR(String d_code)throws  Exception;
    public void ReservationCheckin(int reservation_code)throws Exception;
    public void ReservationCheckout(int reservation_code)throws Exception;
    public List<DormitoryDTO> getDcode()throws Exception;
}
