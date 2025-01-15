package fr.fms.entities;


import lombok.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Getter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String sname;
    @NotNull
    private String email;
    @NotNull
    private String phone;
    @NotNull
    private String adresse;

    @ManyToOne
    private Category category;


}
