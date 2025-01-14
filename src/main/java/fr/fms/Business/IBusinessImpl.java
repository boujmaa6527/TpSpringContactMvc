package fr.fms.Business;

import fr.fms.dao.CategoryRepository;
import fr.fms.dao.ContactRepository;
import fr.fms.entities.Category;
import fr.fms.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IBusinessImpl implements IBusiness{

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Contact> getContacts() throws Exception{
        return contactRepository.findAll();
    }
    @Override
    public Contact getContactById(Long id) throws Exception{
        Optional<Contact> optional = contactRepository.findById(id);
        return optional.isPresent()? optional.get() : null;
    }

    @Override
    public void saveContact(Contact contact)throws Exception{
        contactRepository.save(contact);
    }

    @Override
    public Page<Contact> getContactsByCategoriePage(Long catId, int page) throws Exception{
        return contactRepository.findByCategoryId(catId, PageRequest.of(page, 5));
    }
    @Override
    public Page<Contact> getContactsPages(String kw, int page) throws Exception{
        return contactRepository.findByNameContains(PageRequest.of(page,5), kw);
    }
    @Override
    public void deleteContact(Long id) throws Exception{
        contactRepository.deleteById(id);
    }

    public List<Category> getCategories() throws Exception{
        return categoryRepository.findAll();
    }
    public Category getCategoryById(Long id) throws Exception{
        return categoryRepository.getById(id);
    }
}
