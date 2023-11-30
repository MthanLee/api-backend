package com.lee.common.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.common.model.entity.User;


/**
 * 用户服务
 *
 * @author Lee
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey, secretKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
