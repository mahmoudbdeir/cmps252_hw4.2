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

@Tag("47")
class Record_4785 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4785: FirstName is Lila")
	void FirstNameOfRecord4785() {
		assertEquals("Lila", customers.get(4784).getFirstName());
	}

	@Test
	@DisplayName("Record 4785: LastName is Lenoci")
	void LastNameOfRecord4785() {
		assertEquals("Lenoci", customers.get(4784).getLastName());
	}

	@Test
	@DisplayName("Record 4785: Company is Dean, Barbara J Esq")
	void CompanyOfRecord4785() {
		assertEquals("Dean, Barbara J Esq", customers.get(4784).getCompany());
	}

	@Test
	@DisplayName("Record 4785: Address is 35325 Date Palm Dr  #-150")
	void AddressOfRecord4785() {
		assertEquals("35325 Date Palm Dr  #-150", customers.get(4784).getAddress());
	}

	@Test
	@DisplayName("Record 4785: City is Cathedral City")
	void CityOfRecord4785() {
		assertEquals("Cathedral City", customers.get(4784).getCity());
	}

	@Test
	@DisplayName("Record 4785: County is Riverside")
	void CountyOfRecord4785() {
		assertEquals("Riverside", customers.get(4784).getCounty());
	}

	@Test
	@DisplayName("Record 4785: State is CA")
	void StateOfRecord4785() {
		assertEquals("CA", customers.get(4784).getState());
	}

	@Test
	@DisplayName("Record 4785: ZIP is 92234")
	void ZIPOfRecord4785() {
		assertEquals("92234", customers.get(4784).getZIP());
	}

	@Test
	@DisplayName("Record 4785: Phone is 760-770-5394")
	void PhoneOfRecord4785() {
		assertEquals("760-770-5394", customers.get(4784).getPhone());
	}

	@Test
	@DisplayName("Record 4785: Fax is 760-770-9916")
	void FaxOfRecord4785() {
		assertEquals("760-770-9916", customers.get(4784).getFax());
	}

	@Test
	@DisplayName("Record 4785: Email is lila@lenoci.com")
	void EmailOfRecord4785() {
		assertEquals("lila@lenoci.com", customers.get(4784).getEmail());
	}

	@Test
	@DisplayName("Record 4785: Web is http://www.lilalenoci.com")
	void WebOfRecord4785() {
		assertEquals("http://www.lilalenoci.com", customers.get(4784).getWeb());
	}
}
