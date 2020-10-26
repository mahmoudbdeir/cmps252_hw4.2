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

@Tag("11")
class Record_4154 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4154: FirstName is Mario")
	void FirstNameOfRecord4154() {
		assertEquals("Mario", customers.get(4153).getFirstName());
	}

	@Test
	@DisplayName("Record 4154: LastName is Krytlow")
	void LastNameOfRecord4154() {
		assertEquals("Krytlow", customers.get(4153).getLastName());
	}

	@Test
	@DisplayName("Record 4154: Company is Royal Metal Industries")
	void CompanyOfRecord4154() {
		assertEquals("Royal Metal Industries", customers.get(4153).getCompany());
	}

	@Test
	@DisplayName("Record 4154: Address is 420 S Fannin Ave")
	void AddressOfRecord4154() {
		assertEquals("420 S Fannin Ave", customers.get(4153).getAddress());
	}

	@Test
	@DisplayName("Record 4154: City is Tyler")
	void CityOfRecord4154() {
		assertEquals("Tyler", customers.get(4153).getCity());
	}

	@Test
	@DisplayName("Record 4154: County is Smith")
	void CountyOfRecord4154() {
		assertEquals("Smith", customers.get(4153).getCounty());
	}

	@Test
	@DisplayName("Record 4154: State is TX")
	void StateOfRecord4154() {
		assertEquals("TX", customers.get(4153).getState());
	}

	@Test
	@DisplayName("Record 4154: ZIP is 75702")
	void ZIPOfRecord4154() {
		assertEquals("75702", customers.get(4153).getZIP());
	}

	@Test
	@DisplayName("Record 4154: Phone is 903-593-2330")
	void PhoneOfRecord4154() {
		assertEquals("903-593-2330", customers.get(4153).getPhone());
	}

	@Test
	@DisplayName("Record 4154: Fax is 903-593-0438")
	void FaxOfRecord4154() {
		assertEquals("903-593-0438", customers.get(4153).getFax());
	}

	@Test
	@DisplayName("Record 4154: Email is mario@krytlow.com")
	void EmailOfRecord4154() {
		assertEquals("mario@krytlow.com", customers.get(4153).getEmail());
	}

	@Test
	@DisplayName("Record 4154: Web is http://www.mariokrytlow.com")
	void WebOfRecord4154() {
		assertEquals("http://www.mariokrytlow.com", customers.get(4153).getWeb());
	}
}
