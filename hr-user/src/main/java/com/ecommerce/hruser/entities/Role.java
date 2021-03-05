package com.ecommerce.hruser.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_role")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String roleName;

}
