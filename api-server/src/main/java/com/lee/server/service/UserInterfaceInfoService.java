package com.lee.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.common.model.entity.UserInterfaceInfo;

/**
* @author Lee
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用统计接口
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
