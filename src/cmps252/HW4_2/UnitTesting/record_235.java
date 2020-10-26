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
class Record_235 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 235: FirstName is Kieth")
	void FirstNameOfRecord235() {
		assertEquals("Kieth", customers.get(234).getFirstName());
	}

	@Test
	@DisplayName("Record 235: LastName is Fumagalli")
	void LastNameOfRecord235() {
		assertEquals("Fumagalli", customers.get(234).getLastName());
	}

	@Test
	@DisplayName("Record 235: Company is Boston Properties")
	void CompanyOfRecord235() {
		assertEquals("Boston Properties", customers.get(234).getCompany());
	}

	@Test
	@DisplayName("Record 235: Address is 13219 34th Ave")
	void AddressOfRecord235() {
		assertEquals("13219 34th Ave", customers.get(234).getAddress());
	}

	@Test
	@DisplayName("Record 235: City is Flushing")
	void CityOfRecord235() {
		assertEquals("Flushing", customers.get(234).getCity());
	}

	@Test
	@DisplayName("Record 235: County is Queens")
	void CountyOfRecord235() {
		assertEquals("Queens", customers.get(234).getCounty());
	}

	@Test
	@DisplayName("Record 235: State is NY")
	void StateOfRecord235() {
		assertEquals("NY", customers.get(234).getState());
	}

	@Test
	@DisplayName("Record 235: ZIP is 11354")
	void ZIPOfRecord235() {
		assertEquals("11354", customers.get(234).getZIP());
	}

	@Test
	@DisplayName("Record 235: Phone is 718-353-2807")
	void PhoneOfRecord235() {
		assertEquals("718-353-2807", customers.get(234).getPhone());
	}

	@Test
	@DisplayName("Record 235: Fax is 718-353-7446")
	void FaxOfRecord235() {
		assertEquals("718-353-7446", customers.get(234).getFax());
	}

	@Test
	@DisplayName("Record 235: Email is kieth@fumagalli.com")
	void EmailOfRecord235() {
		assertEquals("kieth@fumagalli.com", customers.get(234).getEmail());
	}

	@Test
	@DisplayName("Record 235: Web is http://www.kiethfumagalli.com")
	void WebOfRecord235() {
		assertEquals("http://www.kiethfumagalli.com", customers.get(234).getWeb());
	}
}
