package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.repository.UserTourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<UserEntity> {
    @Autowired
    private UserTourRepository userTourRepository;
    @Override
    protected Class<UserEntity> clazz() {
        return UserEntity.class;
    }

    public UserEntity loadUserByUsername(String userName) {
        String sql = "select * from tbl_users u where u.username = '" + userName + "' and status = 1";
        return this.getEntityByNativeSQL(sql);
    }
    public UserEntity roleUserGuest(int userId) {
        String sql = "INSERT INTO tbl_users_roles (user_id, role_id)"
                + "SELECT p.id, c.id"
                + "FROM tbl_users p, tbl_roles c"
                + "WHERE p.id = "+userId+" AND c.id = 19;";
        return this.getEntityByNativeSQL(sql);
    }
    public boolean isEmailNumberExists(String email){
        UserEntity userEntity = userTourRepository.findByEmail(email);
        return userEntity != null;
    }

}
