package com.labbs.secuserms.dto.response;

import com.labbs.secuserms.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    private UUID userId;
    private String name;
    private String email;
    private String password;
    private String cpf;

    public static List<UserResponseDTO> from(List<User> users) {
        return users.stream().map(user ->
                new UserResponseDTO(
                        user.getUserId(),
                        user.getName(),
                        user.getEmail(),
                        user.getPassword(),
                        user.getCpf()))
                .toList();

    }
}
