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

@Tag("4")
class Record_150 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 150: FirstName is Noble")
	void FirstNameOfRecord150() {
		assertEquals("Noble", customers.get(149).getFirstName());
	}

	@Test
	@DisplayName("Record 150: LastName is Koenemund")
	void LastNameOfRecord150() {
		assertEquals("Koenemund", customers.get(149).getLastName());
	}

	@Test
	@DisplayName("Record 150: Company is Peerless Hardware Mfg Co")
	void CompanyOfRecord150() {
		assertEquals("Peerless Hardware Mfg Co", customers.get(149).getCompany());
	}

	@Test
	@DisplayName("Record 150: Address is 116 Fountain St")
	void AddressOfRecord150() {
		assertEquals("116 Fountain St", customers.get(149).getAddress());
	}

	@Test
	@DisplayName("Record 150: City is Philadelphia")
	void CityOfRecord150() {
		assertEquals("Philadelphia", customers.get(149).getCity());
	}

	@Test
	@DisplayName("Record 150: County is Philadelphia")
	void CountyOfRecord150() {
		assertEquals("Philadelphia", customers.get(149).getCounty());
	}

	@Test
	@DisplayName("Record 150: State is PA")
	void StateOfRecord150() {
		assertEquals("PA", customers.get(149).getState());
	}

	@Test
	@DisplayName("Record 150: ZIP is 19127")
	void ZIPOfRecord150() {
		assertEquals("19127", customers.get(149).getZIP());
	}

	@Test
	@DisplayName("Record 150: Phone is 215-482-5520")
	void PhoneOfRecord150() {
		assertEquals("215-482-5520", customers.get(149).getPhone());
	}

	@Test
	@DisplayName("Record 150: Fax is 215-482-7894")
	void FaxOfRecord150() {
		assertEquals("215-482-7894", customers.get(149).getFax());
	}

	@Test
	@DisplayName("Record 150: Email is noble@koenemund.com")
	void EmailOfRecord150() {
		assertEquals("noble@koenemund.com", customers.get(149).getEmail());
	}

	@Test
	@DisplayName("Record 150: Web is http://www.noblekoenemund.com")
	void WebOfRecord150() {
		assertEquals("http://www.noblekoenemund.com", customers.get(149).getWeb());
	}
}
