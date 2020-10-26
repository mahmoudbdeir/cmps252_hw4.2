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

@Tag("33")
class Record_3304 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3304: FirstName is Ward")
	void FirstNameOfRecord3304() {
		assertEquals("Ward", customers.get(3303).getFirstName());
	}

	@Test
	@DisplayName("Record 3304: LastName is Deslandes")
	void LastNameOfRecord3304() {
		assertEquals("Deslandes", customers.get(3303).getLastName());
	}

	@Test
	@DisplayName("Record 3304: Company is Wkav")
	void CompanyOfRecord3304() {
		assertEquals("Wkav", customers.get(3303).getCompany());
	}

	@Test
	@DisplayName("Record 3304: Address is 750 105th Ave")
	void AddressOfRecord3304() {
		assertEquals("750 105th Ave", customers.get(3303).getAddress());
	}

	@Test
	@DisplayName("Record 3304: City is Oakland")
	void CityOfRecord3304() {
		assertEquals("Oakland", customers.get(3303).getCity());
	}

	@Test
	@DisplayName("Record 3304: County is Alameda")
	void CountyOfRecord3304() {
		assertEquals("Alameda", customers.get(3303).getCounty());
	}

	@Test
	@DisplayName("Record 3304: State is CA")
	void StateOfRecord3304() {
		assertEquals("CA", customers.get(3303).getState());
	}

	@Test
	@DisplayName("Record 3304: ZIP is 94603")
	void ZIPOfRecord3304() {
		assertEquals("94603", customers.get(3303).getZIP());
	}

	@Test
	@DisplayName("Record 3304: Phone is 510-569-4432")
	void PhoneOfRecord3304() {
		assertEquals("510-569-4432", customers.get(3303).getPhone());
	}

	@Test
	@DisplayName("Record 3304: Fax is 510-569-9434")
	void FaxOfRecord3304() {
		assertEquals("510-569-9434", customers.get(3303).getFax());
	}

	@Test
	@DisplayName("Record 3304: Email is ward@deslandes.com")
	void EmailOfRecord3304() {
		assertEquals("ward@deslandes.com", customers.get(3303).getEmail());
	}

	@Test
	@DisplayName("Record 3304: Web is http://www.warddeslandes.com")
	void WebOfRecord3304() {
		assertEquals("http://www.warddeslandes.com", customers.get(3303).getWeb());
	}
}
