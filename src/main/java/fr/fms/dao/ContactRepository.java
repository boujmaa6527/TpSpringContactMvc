package fr.fms.dao;

import fr.fms.entities.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByNameContains(String name);
    Page<Contact> findByCategoryId(Long category_id,  Pageable pageable);
    Page<Contact> findByNameContains(Pageable pageable, String name);
}
