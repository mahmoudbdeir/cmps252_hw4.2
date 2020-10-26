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

@Tag("32")
class Record_3937 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3937: FirstName is Darin")
	void FirstNameOfRecord3937() {
		assertEquals("Darin", customers.get(3936).getFirstName());
	}

	@Test
	@DisplayName("Record 3937: LastName is Lafone")
	void LastNameOfRecord3937() {
		assertEquals("Lafone", customers.get(3936).getLastName());
	}

	@Test
	@DisplayName("Record 3937: Company is Lamination House")
	void CompanyOfRecord3937() {
		assertEquals("Lamination House", customers.get(3936).getCompany());
	}

	@Test
	@DisplayName("Record 3937: Address is 17 Church St")
	void AddressOfRecord3937() {
		assertEquals("17 Church St", customers.get(3936).getAddress());
	}

	@Test
	@DisplayName("Record 3937: City is Kingston")
	void CityOfRecord3937() {
		assertEquals("Kingston", customers.get(3936).getCity());
	}

	@Test
	@DisplayName("Record 3937: County is Rockingham")
	void CountyOfRecord3937() {
		assertEquals("Rockingham", customers.get(3936).getCounty());
	}

	@Test
	@DisplayName("Record 3937: State is NH")
	void StateOfRecord3937() {
		assertEquals("NH", customers.get(3936).getState());
	}

	@Test
	@DisplayName("Record 3937: ZIP is 3848")
	void ZIPOfRecord3937() {
		assertEquals("3848", customers.get(3936).getZIP());
	}

	@Test
	@DisplayName("Record 3937: Phone is 603-642-9538")
	void PhoneOfRecord3937() {
		assertEquals("603-642-9538", customers.get(3936).getPhone());
	}

	@Test
	@DisplayName("Record 3937: Fax is 603-642-6658")
	void FaxOfRecord3937() {
		assertEquals("603-642-6658", customers.get(3936).getFax());
	}

	@Test
	@DisplayName("Record 3937: Email is darin@lafone.com")
	void EmailOfRecord3937() {
		assertEquals("darin@lafone.com", customers.get(3936).getEmail());
	}

	@Test
	@DisplayName("Record 3937: Web is http://www.darinlafone.com")
	void WebOfRecord3937() {
		assertEquals("http://www.darinlafone.com", customers.get(3936).getWeb());
	}
}
