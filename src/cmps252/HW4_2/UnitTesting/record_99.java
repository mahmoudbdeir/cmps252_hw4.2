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

@Tag("3")
class Record_99 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 99: FirstName is Mathew")
	void FirstNameOfRecord99() {
		assertEquals("Mathew", customers.get(98).getFirstName());
	}

	@Test
	@DisplayName("Record 99: LastName is Ruacho")
	void LastNameOfRecord99() {
		assertEquals("Ruacho", customers.get(98).getLastName());
	}

	@Test
	@DisplayName("Record 99: Company is Complete Catering Cafe Etc")
	void CompanyOfRecord99() {
		assertEquals("Complete Catering Cafe Etc", customers.get(98).getCompany());
	}

	@Test
	@DisplayName("Record 99: Address is 1266 S Lyon St")
	void AddressOfRecord99() {
		assertEquals("1266 S Lyon St", customers.get(98).getAddress());
	}

	@Test
	@DisplayName("Record 99: City is Santa Ana")
	void CityOfRecord99() {
		assertEquals("Santa Ana", customers.get(98).getCity());
	}

	@Test
	@DisplayName("Record 99: County is Orange")
	void CountyOfRecord99() {
		assertEquals("Orange", customers.get(98).getCounty());
	}

	@Test
	@DisplayName("Record 99: State is CA")
	void StateOfRecord99() {
		assertEquals("CA", customers.get(98).getState());
	}

	@Test
	@DisplayName("Record 99: ZIP is 92705")
	void ZIPOfRecord99() {
		assertEquals("92705", customers.get(98).getZIP());
	}

	@Test
	@DisplayName("Record 99: Phone is 714-953-6350")
	void PhoneOfRecord99() {
		assertEquals("714-953-6350", customers.get(98).getPhone());
	}

	@Test
	@DisplayName("Record 99: Fax is 714-953-3604")
	void FaxOfRecord99() {
		assertEquals("714-953-3604", customers.get(98).getFax());
	}

	@Test
	@DisplayName("Record 99: Email is mathew@ruacho.com")
	void EmailOfRecord99() {
		assertEquals("mathew@ruacho.com", customers.get(98).getEmail());
	}

	@Test
	@DisplayName("Record 99: Web is http://www.mathewruacho.com")
	void WebOfRecord99() {
		assertEquals("http://www.mathewruacho.com", customers.get(98).getWeb());
	}
}
