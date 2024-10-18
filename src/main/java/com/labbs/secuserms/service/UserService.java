package com.labbs.secuserms.service;

import com.labbs.secuserms.dto.response.UserResponseDTO;
import com.labbs.secuserms.model.User;

import java.util.List;

public interface UserService {

    List<UserResponseDTO> findAll();
}
