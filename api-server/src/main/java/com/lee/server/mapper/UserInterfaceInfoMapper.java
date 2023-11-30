package com.lee.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.common.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Lee
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




