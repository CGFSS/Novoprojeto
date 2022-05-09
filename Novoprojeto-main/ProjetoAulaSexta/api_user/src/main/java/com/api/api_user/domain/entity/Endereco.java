package com.api.api_user.domain.entity;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="cep")
    @NotBlank(message = "CEP é obrigatório")
    @Length(message="CEP com no máximo 50 caracteres",max=50)
    String cep;

    @Column(name="rua")
    @NotBlank(message = "Rua é obrigatório")
    @Length(message="Rua com no máximo 50 caracteres",max=50)
    String rua;

    @Column(name="bairro")
    @NotBlank(message = "Bairro é obrigatório")
    @Length(message="Bairro com no máximo 50 caracteres",max=50)
    String bairro;

    @Column(name="numero")
    @NotBlank(message = "Numero é obrigatória")
    @Length(message="Maximo 5 digitos",max=5)
    Integer numero;

    @Column(name="cidade")
    @NotBlank(message = "Cidade é obrigatório")
    @Length(message="Cidade com no máximo 50 caracteres",max=50)
    String cidade;

    @Column(name="uf")
    @NotBlank(message = "UF é obrigatório")
    @Length(message="UF com no máximo 2 caracteres",max=2)
    String uf;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="cliente_endereco",
            joinColumns={@JoinColumn(name="endereco_id",
              referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="cliente_id",
              referencedColumnName="id")})
    Cliente cliente;
}