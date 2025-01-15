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

    public Contact(String name, String sname, String email, String phone, String adresse, Category category) {
        this.name = name;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
        this.adresse = adresse;
        this.category = category;
    }



    @ManyToOne
    private Category category;


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
