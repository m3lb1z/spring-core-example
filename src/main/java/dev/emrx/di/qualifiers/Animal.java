package dev.emrx.di.qualifiers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal {

    private String nombre;
    private Integer edad;

}
