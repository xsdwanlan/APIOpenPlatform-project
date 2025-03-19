package  com.wwjapi.wwjapicommon.service;

import  com.wwjapi.wwjapicommon.model.entity.User;


/**
 * 内部用户服务
 *
 *   
 *    
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
