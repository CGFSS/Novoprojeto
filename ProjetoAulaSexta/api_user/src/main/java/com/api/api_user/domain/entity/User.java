package com.api.api_user.domain.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="nome")
    @NotBlank(message = "Nome é obrigatório")
    @Length(message="Nome com no máximo 50 caracteres",max=50)
    String nome;
    @Column(name="nascimento")
    Date nascimento;
    @Column(name="sexo")
    @NotBlank(message = "Sexo é obrigatória")
    @Length(message="M ou F",max=30)
    String sexo;
    @Column(name="cpf")
    @NotBlank(message = "cpf é obrigatório")
    @CPF(message="Deve ser um CPF valido")
    @Length(message="CPF com 50 caracteres",max=50)
    String cpf;
}
