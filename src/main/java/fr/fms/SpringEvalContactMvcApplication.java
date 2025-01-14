package fr.fms;


import fr.fms.dao.CategoryRepository;
import fr.fms.dao.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEvalContactMvcApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactRepository;

	@Autowired
	private CategoryRepository categoryRepository ;
	public static void main(String[] args) {
		SpringApplication.run(SpringEvalContactMvcApplication.class, args);
	}

	public void run(String... args) throws Exception {

//		Category professionnel = categoryRepository.save(new Category("professionnel"));
//		Category personel  = categoryRepository.save(new Category("personnel"));
//		Category client  = categoryRepository.save(new Category("client"));
//
//		contactRepository.save(new Contact("Rachid", "ben", "ben@yahoo.fr", "0123456789", "2 rue Fms", professionnel));
//		contactRepository.save(new Contact("vincent", "becker", "becker@yahoo.fr", "0123456789", "24 rue de la marnire riga", professionnel));
//		contactRepository.save(new Contact("robert", "lafont", "robert@yahoo.fr", "0123456789", "10 rue place de la victoire", professionnel));
//		contactRepository.save(new Contact("samuel", "delabarre", "samuel@yahoo.fr", "0123456789", "15 rue joliot curie", professionnel));
//		contactRepository.save(new Contact("jean", "valjean", "valjean@yahoo.fr", "0123456789", "10 rue jean giraudoux", professionnel));
//		contactRepository.save(new Contact("Johana", "collegue", "jo@yahoo.fr", "0123456789", "7 rue de tarbes", professionnel));
//		contactRepository.save(new Contact("jean-pierre", "papin", "papin@yahoo.fr", "0123456789", "9 rue du vélodrome", professionnel));
//		contactRepository.save(new Contact("alexis", "delagdo", "alexis@yahoo.fr", "0123456789", "25 rue george duhamel", professionnel));
//		contactRepository.save(new Contact("alik", "oussmanov", "alik@yahoo.fr", "0123456789", "14 rue de la victoire", professionnel));
//		contactRepository.save(new Contact("mouloud", "moulouda", "mouloud@yahoo.fr", "0123456789", "12 rue du jardin", personel));
//		contactRepository.save(new Contact("samy", "benmouloude", "samy@yahoo.fr", "0123456789", "32 rue de la Poterie", personel));
//		contactRepository.save(new Contact("mathieu", "devaux", "devaux@yahoo.fr", "0123456789", "24 rue de la foret", personel));
//		contactRepository.save(new Contact("ibnBen", "omar", "benomar@yahoo.fr", "0123456789", "28 rue Fms", personel));
//		contactRepository.save(new Contact("mathew", "thema", "math@yahoo.fr", "0123456789", "62 rue Fms", personel));
//		contactRepository.save(new Contact("jacques", "chirac", "jacque@yahoo.fr", "0123456789", "32 rue de l'elysee", personel));
//		contactRepository.save(new Contact("philipe", "devilepin", "philipe@yahoo.fr", "0123456789", "14 rue des senties", personel));
//		contactRepository.save(new Contact("smail", "benzaoui", "smail@yahoo.fr", "0123456789", "52 rue de gousinville", personel));
//		contactRepository.save(new Contact("moha", "salah", "salah@yahoo.fr", "0123456789", "32 rue de liverpool", personel));
//		contactRepository.save(new Contact("zinedine", "zidane", "zindane@yahoo.fr", "0123456789", "32 rue de madrid", personel));
//		contactRepository.save(new Contact("dujardin", "luc", "luc@yahoo.fr", "0123456789", "32 rue de nice", client));
//		contactRepository.save(new Contact("bokarzbor", "rachida", "bokazbor@yahoo.fr", "0123456789", "24 rue de la Poterie", client));
//		contactRepository.save(new Contact("bonarnar", "toufik", "bonarnar@yahoo.fr", "0123456789", "74 rue de la palace", client));
//		contactRepository.save(new Contact("bodeerbar", "omar", "boderrba@yahoo.fr", "0123456789", "53 rue de marrakech", client));
//		contactRepository.save(new Contact("bocherma", "jeanpierre", "bocherma@yahoo.fr", "0123456789", "2 rue d'agadir", client));
//		contactRepository.save(new Contact("alain", "leboulanger", "alain@yahoo.fr", "0123456789", "2 rue de gasyccourt", client));
//		contactRepository.save(new Contact("jaquy", "chintoc", "chintoc@yahoo.fr", "0123456789", "14 rue de mongalet", client));
//		contactRepository.save(new Contact("bruce", "mathos", "mathos@yahoo.fr", "0123456789", "2 rue de jean giraudoux", client));
//		contactRepository.save(new Contact("patrick", "césaire", "césaire@yahoo.fr", "0123456789", "2 rue de la gouadloupe", client));
//		contactRepository.save(new Contact("georges", "orwell", "orwell@yahoo.fr", "0123456789", "2 rue de la ferme", client));


	}
}
