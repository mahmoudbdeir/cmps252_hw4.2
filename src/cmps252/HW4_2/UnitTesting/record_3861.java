package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("9")
class Record_3861 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3861: FirstName is Gregorio")
	void FirstNameOfRecord3861() {
		assertEquals("Gregorio", customers.get(3860).getFirstName());
	}

	@Test
	@DisplayName("Record 3861: LastName is Stoudenmire")
	void LastNameOfRecord3861() {
		assertEquals("Stoudenmire", customers.get(3860).getLastName());
	}

	@Test
	@DisplayName("Record 3861: Company is Gardner, Holm")
	void CompanyOfRecord3861() {
		assertEquals("Gardner, Holm", customers.get(3860).getCompany());
	}

	@Test
	@DisplayName("Record 3861: Address is 416 W Grand St")
	void AddressOfRecord3861() {
		assertEquals("416 W Grand St", customers.get(3860).getAddress());
	}

	@Test
	@DisplayName("Record 3861: City is Elizabeth")
	void CityOfRecord3861() {
		assertEquals("Elizabeth", customers.get(3860).getCity());
	}

	@Test
	@DisplayName("Record 3861: County is Union")
	void CountyOfRecord3861() {
		assertEquals("Union", customers.get(3860).getCounty());
	}

	@Test
	@DisplayName("Record 3861: State is NJ")
	void StateOfRecord3861() {
		assertEquals("NJ", customers.get(3860).getState());
	}

	@Test
	@DisplayName("Record 3861: ZIP is 7202")
	void ZIPOfRecord3861() {
		assertEquals("7202", customers.get(3860).getZIP());
	}

	@Test
	@DisplayName("Record 3861: Phone is 908-354-6112")
	void PhoneOfRecord3861() {
		assertEquals("908-354-6112", customers.get(3860).getPhone());
	}

	@Test
	@DisplayName("Record 3861: Fax is 908-354-2124")
	void FaxOfRecord3861() {
		assertEquals("908-354-2124", customers.get(3860).getFax());
	}

	@Test
	@DisplayName("Record 3861: Email is gregorio@stoudenmire.com")
	void EmailOfRecord3861() {
		assertEquals("gregorio@stoudenmire.com", customers.get(3860).getEmail());
	}

	@Test
	@DisplayName("Record 3861: Web is http://www.gregoriostoudenmire.com")
	void WebOfRecord3861() {
		assertEquals("http://www.gregoriostoudenmire.com", customers.get(3860).getWeb());
	}
}
