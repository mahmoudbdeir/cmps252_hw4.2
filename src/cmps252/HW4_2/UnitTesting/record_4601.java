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

@Tag("12")
class Record_4601 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4601: FirstName is Douglas")
	void FirstNameOfRecord4601() {
		assertEquals("Douglas", customers.get(4600).getFirstName());
	}

	@Test
	@DisplayName("Record 4601: LastName is Tofanelli")
	void LastNameOfRecord4601() {
		assertEquals("Tofanelli", customers.get(4600).getLastName());
	}

	@Test
	@DisplayName("Record 4601: Company is Chatham Minuteman")
	void CompanyOfRecord4601() {
		assertEquals("Chatham Minuteman", customers.get(4600).getCompany());
	}

	@Test
	@DisplayName("Record 4601: Address is 1420 Locust St")
	void AddressOfRecord4601() {
		assertEquals("1420 Locust St", customers.get(4600).getAddress());
	}

	@Test
	@DisplayName("Record 4601: City is Philadelphia")
	void CityOfRecord4601() {
		assertEquals("Philadelphia", customers.get(4600).getCity());
	}

	@Test
	@DisplayName("Record 4601: County is Philadelphia")
	void CountyOfRecord4601() {
		assertEquals("Philadelphia", customers.get(4600).getCounty());
	}

	@Test
	@DisplayName("Record 4601: State is PA")
	void StateOfRecord4601() {
		assertEquals("PA", customers.get(4600).getState());
	}

	@Test
	@DisplayName("Record 4601: ZIP is 19102")
	void ZIPOfRecord4601() {
		assertEquals("19102", customers.get(4600).getZIP());
	}

	@Test
	@DisplayName("Record 4601: Phone is 215-893-7158")
	void PhoneOfRecord4601() {
		assertEquals("215-893-7158", customers.get(4600).getPhone());
	}

	@Test
	@DisplayName("Record 4601: Fax is 215-893-5332")
	void FaxOfRecord4601() {
		assertEquals("215-893-5332", customers.get(4600).getFax());
	}

	@Test
	@DisplayName("Record 4601: Email is douglas@tofanelli.com")
	void EmailOfRecord4601() {
		assertEquals("douglas@tofanelli.com", customers.get(4600).getEmail());
	}

	@Test
	@DisplayName("Record 4601: Web is http://www.douglastofanelli.com")
	void WebOfRecord4601() {
		assertEquals("http://www.douglastofanelli.com", customers.get(4600).getWeb());
	}
}
