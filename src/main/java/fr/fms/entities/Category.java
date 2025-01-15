package fr.fms.entities;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Getter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Size(min = 5, max = 51)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Contact> contacts;



    public Category(String name) {
        this.name = name;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Category(String name, long id) {
        this.name = name;
        this.id = id;
    }
}
