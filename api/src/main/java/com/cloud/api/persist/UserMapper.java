package com.cloud.api.persist;


import com.cloud.api.damain.DO.UserDO;

import java.util.List;

/**
 * @author lingjun.jlj
 * @create 2017-09-22
 **/

public interface UserMapper {

    void addUser(UserDO user);

    void update(UserDO userDO);

    List<UserDO> selectUser();

}
