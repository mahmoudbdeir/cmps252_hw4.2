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
class Record_3225 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3225: FirstName is Johanna")
	void FirstNameOfRecord3225() {
		assertEquals("Johanna", customers.get(3224).getFirstName());
	}

	@Test
	@DisplayName("Record 3225: LastName is Phorng")
	void LastNameOfRecord3225() {
		assertEquals("Phorng", customers.get(3224).getLastName());
	}

	@Test
	@DisplayName("Record 3225: Company is Creativity By Zena")
	void CompanyOfRecord3225() {
		assertEquals("Creativity By Zena", customers.get(3224).getCompany());
	}

	@Test
	@DisplayName("Record 3225: Address is 4856 S Orange Ave")
	void AddressOfRecord3225() {
		assertEquals("4856 S Orange Ave", customers.get(3224).getAddress());
	}

	@Test
	@DisplayName("Record 3225: City is Orlando")
	void CityOfRecord3225() {
		assertEquals("Orlando", customers.get(3224).getCity());
	}

	@Test
	@DisplayName("Record 3225: County is Orange")
	void CountyOfRecord3225() {
		assertEquals("Orange", customers.get(3224).getCounty());
	}

	@Test
	@DisplayName("Record 3225: State is FL")
	void StateOfRecord3225() {
		assertEquals("FL", customers.get(3224).getState());
	}

	@Test
	@DisplayName("Record 3225: ZIP is 32806")
	void ZIPOfRecord3225() {
		assertEquals("32806", customers.get(3224).getZIP());
	}

	@Test
	@DisplayName("Record 3225: Phone is 407-855-9079")
	void PhoneOfRecord3225() {
		assertEquals("407-855-9079", customers.get(3224).getPhone());
	}

	@Test
	@DisplayName("Record 3225: Fax is 407-855-5014")
	void FaxOfRecord3225() {
		assertEquals("407-855-5014", customers.get(3224).getFax());
	}

	@Test
	@DisplayName("Record 3225: Email is johanna@phorng.com")
	void EmailOfRecord3225() {
		assertEquals("johanna@phorng.com", customers.get(3224).getEmail());
	}

	@Test
	@DisplayName("Record 3225: Web is http://www.johannaphorng.com")
	void WebOfRecord3225() {
		assertEquals("http://www.johannaphorng.com", customers.get(3224).getWeb());
	}
}
