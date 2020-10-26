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

@Tag("2")
class Record_564 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 564: FirstName is Brandon")
	void FirstNameOfRecord564() {
		assertEquals("Brandon", customers.get(563).getFirstName());
	}

	@Test
	@DisplayName("Record 564: LastName is Duverney")
	void LastNameOfRecord564() {
		assertEquals("Duverney", customers.get(563).getLastName());
	}

	@Test
	@DisplayName("Record 564: Company is Maffy, Albert Esq")
	void CompanyOfRecord564() {
		assertEquals("Maffy, Albert Esq", customers.get(563).getCompany());
	}

	@Test
	@DisplayName("Record 564: Address is 1014 N Highway 67")
	void AddressOfRecord564() {
		assertEquals("1014 N Highway 67", customers.get(563).getAddress());
	}

	@Test
	@DisplayName("Record 564: City is Cedar Hill")
	void CityOfRecord564() {
		assertEquals("Cedar Hill", customers.get(563).getCity());
	}

	@Test
	@DisplayName("Record 564: County is Dallas")
	void CountyOfRecord564() {
		assertEquals("Dallas", customers.get(563).getCounty());
	}

	@Test
	@DisplayName("Record 564: State is TX")
	void StateOfRecord564() {
		assertEquals("TX", customers.get(563).getState());
	}

	@Test
	@DisplayName("Record 564: ZIP is 75104")
	void ZIPOfRecord564() {
		assertEquals("75104", customers.get(563).getZIP());
	}

	@Test
	@DisplayName("Record 564: Phone is 972-293-3472")
	void PhoneOfRecord564() {
		assertEquals("972-293-3472", customers.get(563).getPhone());
	}

	@Test
	@DisplayName("Record 564: Fax is 972-293-5733")
	void FaxOfRecord564() {
		assertEquals("972-293-5733", customers.get(563).getFax());
	}

	@Test
	@DisplayName("Record 564: Email is brandon@duverney.com")
	void EmailOfRecord564() {
		assertEquals("brandon@duverney.com", customers.get(563).getEmail());
	}

	@Test
	@DisplayName("Record 564: Web is http://www.brandonduverney.com")
	void WebOfRecord564() {
		assertEquals("http://www.brandonduverney.com", customers.get(563).getWeb());
	}
}
