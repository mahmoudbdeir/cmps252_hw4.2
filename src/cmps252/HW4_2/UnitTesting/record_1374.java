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

@Tag("46")
class Record_1374 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1374: FirstName is Bianca")
	void FirstNameOfRecord1374() {
		assertEquals("Bianca", customers.get(1373).getFirstName());
	}

	@Test
	@DisplayName("Record 1374: LastName is Casagrande")
	void LastNameOfRecord1374() {
		assertEquals("Casagrande", customers.get(1373).getLastName());
	}

	@Test
	@DisplayName("Record 1374: Company is Pets N People Inc")
	void CompanyOfRecord1374() {
		assertEquals("Pets N People Inc", customers.get(1373).getCompany());
	}

	@Test
	@DisplayName("Record 1374: Address is 2891 Nw 75th St")
	void AddressOfRecord1374() {
		assertEquals("2891 Nw 75th St", customers.get(1373).getAddress());
	}

	@Test
	@DisplayName("Record 1374: City is Miami")
	void CityOfRecord1374() {
		assertEquals("Miami", customers.get(1373).getCity());
	}

	@Test
	@DisplayName("Record 1374: County is Miami-Dade")
	void CountyOfRecord1374() {
		assertEquals("Miami-Dade", customers.get(1373).getCounty());
	}

	@Test
	@DisplayName("Record 1374: State is FL")
	void StateOfRecord1374() {
		assertEquals("FL", customers.get(1373).getState());
	}

	@Test
	@DisplayName("Record 1374: ZIP is 33147")
	void ZIPOfRecord1374() {
		assertEquals("33147", customers.get(1373).getZIP());
	}

	@Test
	@DisplayName("Record 1374: Phone is 305-693-4259")
	void PhoneOfRecord1374() {
		assertEquals("305-693-4259", customers.get(1373).getPhone());
	}

	@Test
	@DisplayName("Record 1374: Fax is 305-693-0119")
	void FaxOfRecord1374() {
		assertEquals("305-693-0119", customers.get(1373).getFax());
	}

	@Test
	@DisplayName("Record 1374: Email is bianca@casagrande.com")
	void EmailOfRecord1374() {
		assertEquals("bianca@casagrande.com", customers.get(1373).getEmail());
	}

	@Test
	@DisplayName("Record 1374: Web is http://www.biancacasagrande.com")
	void WebOfRecord1374() {
		assertEquals("http://www.biancacasagrande.com", customers.get(1373).getWeb());
	}
}
