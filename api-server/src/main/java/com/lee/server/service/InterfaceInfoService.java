package com.lee.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.common.model.entity.InterfaceInfo;

/**
* @author Lee
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
