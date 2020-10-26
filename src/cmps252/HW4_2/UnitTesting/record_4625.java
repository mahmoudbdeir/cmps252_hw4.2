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

@Tag("35")
class Record_4625 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4625: FirstName is Jerome")
	void FirstNameOfRecord4625() {
		assertEquals("Jerome", customers.get(4624).getFirstName());
	}

	@Test
	@DisplayName("Record 4625: LastName is Burreson")
	void LastNameOfRecord4625() {
		assertEquals("Burreson", customers.get(4624).getLastName());
	}

	@Test
	@DisplayName("Record 4625: Company is Hoisington Engineers")
	void CompanyOfRecord4625() {
		assertEquals("Hoisington Engineers", customers.get(4624).getCompany());
	}

	@Test
	@DisplayName("Record 4625: Address is Box #-19112")
	void AddressOfRecord4625() {
		assertEquals("Box #-19112", customers.get(4624).getAddress());
	}

	@Test
	@DisplayName("Record 4625: City is Dallas")
	void CityOfRecord4625() {
		assertEquals("Dallas", customers.get(4624).getCity());
	}

	@Test
	@DisplayName("Record 4625: County is Dallas")
	void CountyOfRecord4625() {
		assertEquals("Dallas", customers.get(4624).getCounty());
	}

	@Test
	@DisplayName("Record 4625: State is TX")
	void StateOfRecord4625() {
		assertEquals("TX", customers.get(4624).getState());
	}

	@Test
	@DisplayName("Record 4625: ZIP is 75219")
	void ZIPOfRecord4625() {
		assertEquals("75219", customers.get(4624).getZIP());
	}

	@Test
	@DisplayName("Record 4625: Phone is 214-220-3153")
	void PhoneOfRecord4625() {
		assertEquals("214-220-3153", customers.get(4624).getPhone());
	}

	@Test
	@DisplayName("Record 4625: Fax is 214-220-5655")
	void FaxOfRecord4625() {
		assertEquals("214-220-5655", customers.get(4624).getFax());
	}

	@Test
	@DisplayName("Record 4625: Email is jerome@burreson.com")
	void EmailOfRecord4625() {
		assertEquals("jerome@burreson.com", customers.get(4624).getEmail());
	}

	@Test
	@DisplayName("Record 4625: Web is http://www.jeromeburreson.com")
	void WebOfRecord4625() {
		assertEquals("http://www.jeromeburreson.com", customers.get(4624).getWeb());
	}
}
