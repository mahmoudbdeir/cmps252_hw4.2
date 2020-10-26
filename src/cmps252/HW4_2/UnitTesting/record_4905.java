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

@Tag("22")
class Record_4905 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4905: FirstName is Arlen")
	void FirstNameOfRecord4905() {
		assertEquals("Arlen", customers.get(4904).getFirstName());
	}

	@Test
	@DisplayName("Record 4905: LastName is Wamboldt")
	void LastNameOfRecord4905() {
		assertEquals("Wamboldt", customers.get(4904).getLastName());
	}

	@Test
	@DisplayName("Record 4905: Company is B & B Plumbing")
	void CompanyOfRecord4905() {
		assertEquals("B & B Plumbing", customers.get(4904).getCompany());
	}

	@Test
	@DisplayName("Record 4905: Address is 710 Oakfield Dr  #-201")
	void AddressOfRecord4905() {
		assertEquals("710 Oakfield Dr  #-201", customers.get(4904).getAddress());
	}

	@Test
	@DisplayName("Record 4905: City is Brandon")
	void CityOfRecord4905() {
		assertEquals("Brandon", customers.get(4904).getCity());
	}

	@Test
	@DisplayName("Record 4905: County is Hillsborough")
	void CountyOfRecord4905() {
		assertEquals("Hillsborough", customers.get(4904).getCounty());
	}

	@Test
	@DisplayName("Record 4905: State is FL")
	void StateOfRecord4905() {
		assertEquals("FL", customers.get(4904).getState());
	}

	@Test
	@DisplayName("Record 4905: ZIP is 33511")
	void ZIPOfRecord4905() {
		assertEquals("33511", customers.get(4904).getZIP());
	}

	@Test
	@DisplayName("Record 4905: Phone is 813-684-1628")
	void PhoneOfRecord4905() {
		assertEquals("813-684-1628", customers.get(4904).getPhone());
	}

	@Test
	@DisplayName("Record 4905: Fax is 813-684-5884")
	void FaxOfRecord4905() {
		assertEquals("813-684-5884", customers.get(4904).getFax());
	}

	@Test
	@DisplayName("Record 4905: Email is arlen@wamboldt.com")
	void EmailOfRecord4905() {
		assertEquals("arlen@wamboldt.com", customers.get(4904).getEmail());
	}

	@Test
	@DisplayName("Record 4905: Web is http://www.arlenwamboldt.com")
	void WebOfRecord4905() {
		assertEquals("http://www.arlenwamboldt.com", customers.get(4904).getWeb());
	}
}
