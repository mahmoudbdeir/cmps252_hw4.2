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

@Tag("49")
class Record_4186 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4186: FirstName is Kristy")
	void FirstNameOfRecord4186() {
		assertEquals("Kristy", customers.get(4185).getFirstName());
	}

	@Test
	@DisplayName("Record 4186: LastName is Ovalle")
	void LastNameOfRecord4186() {
		assertEquals("Ovalle", customers.get(4185).getLastName());
	}

	@Test
	@DisplayName("Record 4186: Company is Goldenberg, Kara A Esq")
	void CompanyOfRecord4186() {
		assertEquals("Goldenberg, Kara A Esq", customers.get(4185).getCompany());
	}

	@Test
	@DisplayName("Record 4186: Address is 3003b State Hwy  #-73")
	void AddressOfRecord4186() {
		assertEquals("3003b State Hwy  #-73", customers.get(4185).getAddress());
	}

	@Test
	@DisplayName("Record 4186: City is Marlton")
	void CityOfRecord4186() {
		assertEquals("Marlton", customers.get(4185).getCity());
	}

	@Test
	@DisplayName("Record 4186: County is Burlington")
	void CountyOfRecord4186() {
		assertEquals("Burlington", customers.get(4185).getCounty());
	}

	@Test
	@DisplayName("Record 4186: State is NJ")
	void StateOfRecord4186() {
		assertEquals("NJ", customers.get(4185).getState());
	}

	@Test
	@DisplayName("Record 4186: ZIP is 8053")
	void ZIPOfRecord4186() {
		assertEquals("8053", customers.get(4185).getZIP());
	}

	@Test
	@DisplayName("Record 4186: Phone is 856-596-2441")
	void PhoneOfRecord4186() {
		assertEquals("856-596-2441", customers.get(4185).getPhone());
	}

	@Test
	@DisplayName("Record 4186: Fax is 856-596-7207")
	void FaxOfRecord4186() {
		assertEquals("856-596-7207", customers.get(4185).getFax());
	}

	@Test
	@DisplayName("Record 4186: Email is kristy@ovalle.com")
	void EmailOfRecord4186() {
		assertEquals("kristy@ovalle.com", customers.get(4185).getEmail());
	}

	@Test
	@DisplayName("Record 4186: Web is http://www.kristyovalle.com")
	void WebOfRecord4186() {
		assertEquals("http://www.kristyovalle.com", customers.get(4185).getWeb());
	}
}
