package fr.fms.web;


import fr.fms.Business.IBusinessImpl;
import fr.fms.dao.CategoryRepository;
import fr.fms.dao.ContactRepository;
import fr.fms.entities.Category;
import fr.fms.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class ContactController {

    @Autowired
    IBusinessImpl businessImpl;
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    CategoryRepository categoryRepository;

        @GetMapping("/index")
        public String index(Model model, @RequestParam(name = "page", defaultValue = "0") int page,
                                         @RequestParam(name = "keyword", defaultValue = "") String kw,
                                         @RequestParam(name = "catId", defaultValue = "0")Long catId,
                                          @ModelAttribute(name = "error") String error) throws Exception {

            Page<Contact> contacts;
            Page<Contact> contactByCategories = null;
            if (catId > 0) {
                Optional<Category> categoryOptional = categoryRepository.findById(catId);
                contacts = businessImpl.getContactsByCategoriePage(catId, page);
                if (categoryOptional.isPresent()) {
                    //model.addAttribute("error", ManageError.STR_ERROR);
                    contacts = businessImpl.getContactsByCategoriePage(catId, page);
                } else {
                    contacts = Page.empty();
                    System.out.println("Contact :" + contacts);
                }
                if (categoryOptional.isPresent()) {
                    contacts = businessImpl.getContactsByCategoriePage(catId, page);
                    Category category = categoryOptional.get();
                    System.out.println("category id :" + category.getId());

                    contactByCategories = businessImpl.getContactsByCategoriePage(category.getId(), page);
                } else {
                    contacts = Page.empty();
                }
            } else {
                contacts = contactRepository.findByNameContains(PageRequest.of(page, 5), kw);
            }
            List<Category> categories = businessImpl.getCategories();
            model.addAttribute("listContact", contacts.getContent());
            model.addAttribute("pages", new int[contacts.getTotalPages()]);
            model.addAttribute("currentPage", page);
            model.addAttribute("keyword", kw);
            model.addAttribute("categories", businessImpl.getCategories());
            model.addAttribute("catId", catId);
            if (catId > 0 && contactByCategories != null) {
                model.addAttribute("contactByCategorie", contactByCategories.getContent());
            }
            return "contacts";
        }
        @GetMapping("/delete")
        public String delete(Long id, int page, String kw){
            Optional<Contact> contactDell = contactRepository.findById(id);
            if(contactDell.isPresent()){
                contactRepository.deleteById(contactDell.get().getId());
            }
            return "redirect:/index?catId=1";
        }
        @GetMapping("/contact")
        public String contact(Model model){
            model.addAttribute("contact", new Contact());
            model.addAttribute("categories", categoryRepository.findAll());

            return "contact";
        }
        @PostMapping("/save")
        public String save(@Valid Contact contact, BindingResult bindingResult){
            if(bindingResult.hasErrors()){
                return "update";
            }
            contactRepository.save(contact);
            return "redirect:/index";
        }
        @GetMapping("/update/{id}")
        public String update(@PathVariable(value = "id") Long id, Model model){

            Optional<Contact> contactUpdate = contactRepository.findById(id);
            if(contactUpdate.isPresent()){
                Contact contact = contactUpdate.get();
                model.addAttribute("contact", contact);
                model.addAttribute("categories", categoryRepository.findAll());
                contactRepository.save(contact);
                return "update";
            }else{
                System.out.println(("Not found Article " +id));
                return "Error";
            }
        }
        @GetMapping("/")
        public String home(){
            return "redirect:/index";
        }


}
