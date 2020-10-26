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

@Tag("20")
class Record_4354 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4354: FirstName is Sarah")
	void FirstNameOfRecord4354() {
		assertEquals("Sarah", customers.get(4353).getFirstName());
	}

	@Test
	@DisplayName("Record 4354: LastName is Stickley")
	void LastNameOfRecord4354() {
		assertEquals("Stickley", customers.get(4353).getLastName());
	}

	@Test
	@DisplayName("Record 4354: Company is Schydt, Jill Esq")
	void CompanyOfRecord4354() {
		assertEquals("Schydt, Jill Esq", customers.get(4353).getCompany());
	}

	@Test
	@DisplayName("Record 4354: Address is 800 Brickell Ave  #-904")
	void AddressOfRecord4354() {
		assertEquals("800 Brickell Ave  #-904", customers.get(4353).getAddress());
	}

	@Test
	@DisplayName("Record 4354: City is Miami")
	void CityOfRecord4354() {
		assertEquals("Miami", customers.get(4353).getCity());
	}

	@Test
	@DisplayName("Record 4354: County is Miami-Dade")
	void CountyOfRecord4354() {
		assertEquals("Miami-Dade", customers.get(4353).getCounty());
	}

	@Test
	@DisplayName("Record 4354: State is FL")
	void StateOfRecord4354() {
		assertEquals("FL", customers.get(4353).getState());
	}

	@Test
	@DisplayName("Record 4354: ZIP is 33131")
	void ZIPOfRecord4354() {
		assertEquals("33131", customers.get(4353).getZIP());
	}

	@Test
	@DisplayName("Record 4354: Phone is 305-539-2631")
	void PhoneOfRecord4354() {
		assertEquals("305-539-2631", customers.get(4353).getPhone());
	}

	@Test
	@DisplayName("Record 4354: Fax is 305-539-4022")
	void FaxOfRecord4354() {
		assertEquals("305-539-4022", customers.get(4353).getFax());
	}

	@Test
	@DisplayName("Record 4354: Email is sarah@stickley.com")
	void EmailOfRecord4354() {
		assertEquals("sarah@stickley.com", customers.get(4353).getEmail());
	}

	@Test
	@DisplayName("Record 4354: Web is http://www.sarahstickley.com")
	void WebOfRecord4354() {
		assertEquals("http://www.sarahstickley.com", customers.get(4353).getWeb());
	}
}
