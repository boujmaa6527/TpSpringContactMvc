package fr;

import fr.fms.dao.CategoryRepository;
import fr.fms.dao.ContactRepository;
import fr.fms.entities.Contact;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

@SpringBootTest
class SpringEvalContactMvcApplicationTests {

	@Autowired
	ContactRepository contactRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Test
	void test_add_contact(){
		//Given
		//Category categoryAnonymous = categoryRepository.save(new Category("categoryAnonymous"));
		//contactRepository.save(new Contact("name", "sname","email", "phone", "adresse", categoryAnonymous ));

		//WHEN
		Contact contact = contactRepository.findByNameContains("name").get(0);

		//THEN
		assertEquals("sname", contact.getSname());
	}
	@Test
	void should_find_one_contact(){
		Iterable<Contact> contacts = contactRepository.findAll();
		assertThat(contacts).isNotEmpty();
	}


	@Test
	void contextLoads() {
	}

}
