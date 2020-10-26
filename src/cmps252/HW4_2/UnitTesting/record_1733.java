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

@Tag("16")
class Record_1733 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1733: FirstName is Angelia")
	void FirstNameOfRecord1733() {
		assertEquals("Angelia", customers.get(1732).getFirstName());
	}

	@Test
	@DisplayName("Record 1733: LastName is Mccage")
	void LastNameOfRecord1733() {
		assertEquals("Mccage", customers.get(1732).getLastName());
	}

	@Test
	@DisplayName("Record 1733: Company is Poli Auto Inc")
	void CompanyOfRecord1733() {
		assertEquals("Poli Auto Inc", customers.get(1732).getCompany());
	}

	@Test
	@DisplayName("Record 1733: Address is 126 S 16th St")
	void AddressOfRecord1733() {
		assertEquals("126 S 16th St", customers.get(1732).getAddress());
	}

	@Test
	@DisplayName("Record 1733: City is Philadelphia")
	void CityOfRecord1733() {
		assertEquals("Philadelphia", customers.get(1732).getCity());
	}

	@Test
	@DisplayName("Record 1733: County is Philadelphia")
	void CountyOfRecord1733() {
		assertEquals("Philadelphia", customers.get(1732).getCounty());
	}

	@Test
	@DisplayName("Record 1733: State is PA")
	void StateOfRecord1733() {
		assertEquals("PA", customers.get(1732).getState());
	}

	@Test
	@DisplayName("Record 1733: ZIP is 19102")
	void ZIPOfRecord1733() {
		assertEquals("19102", customers.get(1732).getZIP());
	}

	@Test
	@DisplayName("Record 1733: Phone is 215-564-9405")
	void PhoneOfRecord1733() {
		assertEquals("215-564-9405", customers.get(1732).getPhone());
	}

	@Test
	@DisplayName("Record 1733: Fax is 215-564-3855")
	void FaxOfRecord1733() {
		assertEquals("215-564-3855", customers.get(1732).getFax());
	}

	@Test
	@DisplayName("Record 1733: Email is angelia@mccage.com")
	void EmailOfRecord1733() {
		assertEquals("angelia@mccage.com", customers.get(1732).getEmail());
	}

	@Test
	@DisplayName("Record 1733: Web is http://www.angeliamccage.com")
	void WebOfRecord1733() {
		assertEquals("http://www.angeliamccage.com", customers.get(1732).getWeb());
	}
}
