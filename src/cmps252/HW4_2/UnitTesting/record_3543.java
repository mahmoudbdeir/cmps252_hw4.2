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

@Tag("41")
class Record_3543 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3543: FirstName is Eloisa")
	void FirstNameOfRecord3543() {
		assertEquals("Eloisa", customers.get(3542).getFirstName());
	}

	@Test
	@DisplayName("Record 3543: LastName is Ryndel")
	void LastNameOfRecord3543() {
		assertEquals("Ryndel", customers.get(3542).getLastName());
	}

	@Test
	@DisplayName("Record 3543: Company is Hoopers Stereo Video & Cmptrs")
	void CompanyOfRecord3543() {
		assertEquals("Hoopers Stereo Video & Cmptrs", customers.get(3542).getCompany());
	}

	@Test
	@DisplayName("Record 3543: Address is 922 State Hwy  #-33")
	void AddressOfRecord3543() {
		assertEquals("922 State Hwy  #-33", customers.get(3542).getAddress());
	}

	@Test
	@DisplayName("Record 3543: City is Freehold")
	void CityOfRecord3543() {
		assertEquals("Freehold", customers.get(3542).getCity());
	}

	@Test
	@DisplayName("Record 3543: County is Monmouth")
	void CountyOfRecord3543() {
		assertEquals("Monmouth", customers.get(3542).getCounty());
	}

	@Test
	@DisplayName("Record 3543: State is NJ")
	void StateOfRecord3543() {
		assertEquals("NJ", customers.get(3542).getState());
	}

	@Test
	@DisplayName("Record 3543: ZIP is 7728")
	void ZIPOfRecord3543() {
		assertEquals("7728", customers.get(3542).getZIP());
	}

	@Test
	@DisplayName("Record 3543: Phone is 732-308-7100")
	void PhoneOfRecord3543() {
		assertEquals("732-308-7100", customers.get(3542).getPhone());
	}

	@Test
	@DisplayName("Record 3543: Fax is 732-308-5042")
	void FaxOfRecord3543() {
		assertEquals("732-308-5042", customers.get(3542).getFax());
	}

	@Test
	@DisplayName("Record 3543: Email is eloisa@ryndel.com")
	void EmailOfRecord3543() {
		assertEquals("eloisa@ryndel.com", customers.get(3542).getEmail());
	}

	@Test
	@DisplayName("Record 3543: Web is http://www.eloisaryndel.com")
	void WebOfRecord3543() {
		assertEquals("http://www.eloisaryndel.com", customers.get(3542).getWeb());
	}
}
