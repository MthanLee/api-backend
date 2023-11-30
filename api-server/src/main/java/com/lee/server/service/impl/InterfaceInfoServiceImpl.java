package com.lee.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.server.common.ErrorCode;
import com.lee.server.exception.BusinessException;
import com.lee.server.mapper.InterfaceInfoMapper;
import com.lee.common.model.entity.InterfaceInfo;
import com.lee.server.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author Lee
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if(interfaceInfo == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        if(add){
            if(StringUtils.isAnyBlank(name)){
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if(StringUtils.isNoneBlank(name) && name.length() > 50){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




