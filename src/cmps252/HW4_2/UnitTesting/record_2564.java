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
class Record_2564 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2564: FirstName is Gaylord")
	void FirstNameOfRecord2564() {
		assertEquals("Gaylord", customers.get(2563).getFirstName());
	}

	@Test
	@DisplayName("Record 2564: LastName is Metcalfe")
	void LastNameOfRecord2564() {
		assertEquals("Metcalfe", customers.get(2563).getLastName());
	}

	@Test
	@DisplayName("Record 2564: Company is E R A Duke Realtors")
	void CompanyOfRecord2564() {
		assertEquals("E R A Duke Realtors", customers.get(2563).getCompany());
	}

	@Test
	@DisplayName("Record 2564: Address is 3800 N 23rd St")
	void AddressOfRecord2564() {
		assertEquals("3800 N 23rd St", customers.get(2563).getAddress());
	}

	@Test
	@DisplayName("Record 2564: City is McAllen")
	void CityOfRecord2564() {
		assertEquals("McAllen", customers.get(2563).getCity());
	}

	@Test
	@DisplayName("Record 2564: County is Hidalgo")
	void CountyOfRecord2564() {
		assertEquals("Hidalgo", customers.get(2563).getCounty());
	}

	@Test
	@DisplayName("Record 2564: State is TX")
	void StateOfRecord2564() {
		assertEquals("TX", customers.get(2563).getState());
	}

	@Test
	@DisplayName("Record 2564: ZIP is 78501")
	void ZIPOfRecord2564() {
		assertEquals("78501", customers.get(2563).getZIP());
	}

	@Test
	@DisplayName("Record 2564: Phone is 956-631-7345")
	void PhoneOfRecord2564() {
		assertEquals("956-631-7345", customers.get(2563).getPhone());
	}

	@Test
	@DisplayName("Record 2564: Fax is 956-631-8503")
	void FaxOfRecord2564() {
		assertEquals("956-631-8503", customers.get(2563).getFax());
	}

	@Test
	@DisplayName("Record 2564: Email is gaylord@metcalfe.com")
	void EmailOfRecord2564() {
		assertEquals("gaylord@metcalfe.com", customers.get(2563).getEmail());
	}

	@Test
	@DisplayName("Record 2564: Web is http://www.gaylordmetcalfe.com")
	void WebOfRecord2564() {
		assertEquals("http://www.gaylordmetcalfe.com", customers.get(2563).getWeb());
	}
}
