package fr.fms.Business;

import fr.fms.entities.Category;
import fr.fms.entities.Contact;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBusiness {

    public List<Contact> getContacts() throws Exception;

    public Page<Contact> getContactsPages(String kw, int page) throws Exception;

    public Page<Contact> getContactsByCategoriePage(Long catId, int page) throws Exception;

    public void saveContact(Contact contact) throws Exception;

    public Contact getContactById(Long id) throws Exception;

    public void deleteContact(Long id) throws Exception;

    public List<Category> getCategories() throws Exception;
}
