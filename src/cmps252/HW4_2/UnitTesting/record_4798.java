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

@Tag("30")
class Record_4798 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4798: FirstName is Kent")
	void FirstNameOfRecord4798() {
		assertEquals("Kent", customers.get(4797).getFirstName());
	}

	@Test
	@DisplayName("Record 4798: LastName is Gatrell")
	void LastNameOfRecord4798() {
		assertEquals("Gatrell", customers.get(4797).getLastName());
	}

	@Test
	@DisplayName("Record 4798: Company is C L Hann Industries")
	void CompanyOfRecord4798() {
		assertEquals("C L Hann Industries", customers.get(4797).getCompany());
	}

	@Test
	@DisplayName("Record 4798: Address is 900 E Louisiana Ave  #-209")
	void AddressOfRecord4798() {
		assertEquals("900 E Louisiana Ave  #-209", customers.get(4797).getAddress());
	}

	@Test
	@DisplayName("Record 4798: City is Denver")
	void CityOfRecord4798() {
		assertEquals("Denver", customers.get(4797).getCity());
	}

	@Test
	@DisplayName("Record 4798: County is Denver")
	void CountyOfRecord4798() {
		assertEquals("Denver", customers.get(4797).getCounty());
	}

	@Test
	@DisplayName("Record 4798: State is CO")
	void StateOfRecord4798() {
		assertEquals("CO", customers.get(4797).getState());
	}

	@Test
	@DisplayName("Record 4798: ZIP is 80210")
	void ZIPOfRecord4798() {
		assertEquals("80210", customers.get(4797).getZIP());
	}

	@Test
	@DisplayName("Record 4798: Phone is 303-778-4460")
	void PhoneOfRecord4798() {
		assertEquals("303-778-4460", customers.get(4797).getPhone());
	}

	@Test
	@DisplayName("Record 4798: Fax is 303-778-6447")
	void FaxOfRecord4798() {
		assertEquals("303-778-6447", customers.get(4797).getFax());
	}

	@Test
	@DisplayName("Record 4798: Email is kent@gatrell.com")
	void EmailOfRecord4798() {
		assertEquals("kent@gatrell.com", customers.get(4797).getEmail());
	}

	@Test
	@DisplayName("Record 4798: Web is http://www.kentgatrell.com")
	void WebOfRecord4798() {
		assertEquals("http://www.kentgatrell.com", customers.get(4797).getWeb());
	}
}
