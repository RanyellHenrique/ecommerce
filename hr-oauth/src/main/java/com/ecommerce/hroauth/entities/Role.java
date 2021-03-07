package com.ecommerce.hroauth.entities;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Role {

    @EqualsAndHashCode.Include
    private Long id;
    private String roleName;

}
