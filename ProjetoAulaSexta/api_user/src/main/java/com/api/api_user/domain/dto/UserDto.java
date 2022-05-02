package com.api.api_user.domain.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    Long id;
    String nome;
    Date nascimento;
    String sexo;
    String cpf;  
}
