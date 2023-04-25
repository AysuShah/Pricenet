package com.example.pricenet.entity.securityEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    //    @NotEmpty(message = "Mail boş qoyula bilməz")
//    @Email(message ="Xətalı mail" )
    private String email;

    //    @NotEmpty(message = "Şifrə boş qoyula bilməz")
//    @Size(min = 8,max = 20 ,message = "Şifrə uzunluğu minimum 8, maximum 20 olamlıdır")
    private String password;

    //    @NotEmpty(message ="Rol boş qoyula bilməz" )
//    @Size(min = 8,max = 20 ,message = "Role uzunluğu minimum 8, maximum 20 olamlıdır")
    private String role;

}