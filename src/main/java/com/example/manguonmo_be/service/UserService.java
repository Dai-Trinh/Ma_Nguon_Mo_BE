package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.repository.UserRepository;
import com.example.manguonmo_be.repository.UserTourRepository;
import com.example.manguonmo_be.service.dto.UserDTO;
import com.example.manguonmo_be.service.mapper.UserMapper;
import com.example.manguonmo_be.service.respone.CommonResponse;
import com.example.manguonmo_be.service.respone.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<UserEntity> {
    @Autowired
    private UserTourRepository userTourRepository;

    @Autowired
    UserRepository userRepository;
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

    public CommonResponse getUser(String username, String passWord){
        UserEntity userEntity = userRepository.getUserEntity(username, passWord);
        if(userEntity == null) {
            Result result = new Result("400", "Thông tin tai khoản hoặc mật khẩu không chính xác", false);
            return new CommonResponse(result);
        }
        UserDTO userDTO = UserMapper.INSTANCE.convertToDTO(userEntity);
        userDTO.setAdmin(userEntity.isAdmin());
        Result result = new Result("00", "Đăng nhập thành công", true);
        return new CommonResponse(result, userDTO);
    }

}
