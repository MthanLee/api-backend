package com.lee.common.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.common.model.entity.UserInterfaceInfo;

/**
* @author Lee
*/
public interface InnerUserInterfaceInfoService {


    /**
     * 调用统计接口
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
