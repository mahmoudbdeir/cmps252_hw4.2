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

@Tag("14")
class Record_1511 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1511: FirstName is Valentin")
	void FirstNameOfRecord1511() {
		assertEquals("Valentin", customers.get(1510).getFirstName());
	}

	@Test
	@DisplayName("Record 1511: LastName is Sherard")
	void LastNameOfRecord1511() {
		assertEquals("Sherard", customers.get(1510).getLastName());
	}

	@Test
	@DisplayName("Record 1511: Company is Information Incorporated")
	void CompanyOfRecord1511() {
		assertEquals("Information Incorporated", customers.get(1510).getCompany());
	}

	@Test
	@DisplayName("Record 1511: Address is 103 Main St")
	void AddressOfRecord1511() {
		assertEquals("103 Main St", customers.get(1510).getAddress());
	}

	@Test
	@DisplayName("Record 1511: City is Kingston")
	void CityOfRecord1511() {
		assertEquals("Kingston", customers.get(1510).getCity());
	}

	@Test
	@DisplayName("Record 1511: County is Luzerne")
	void CountyOfRecord1511() {
		assertEquals("Luzerne", customers.get(1510).getCounty());
	}

	@Test
	@DisplayName("Record 1511: State is PA")
	void StateOfRecord1511() {
		assertEquals("PA", customers.get(1510).getState());
	}

	@Test
	@DisplayName("Record 1511: ZIP is 18704")
	void ZIPOfRecord1511() {
		assertEquals("18704", customers.get(1510).getZIP());
	}

	@Test
	@DisplayName("Record 1511: Phone is 570-288-7992")
	void PhoneOfRecord1511() {
		assertEquals("570-288-7992", customers.get(1510).getPhone());
	}

	@Test
	@DisplayName("Record 1511: Fax is 570-288-6196")
	void FaxOfRecord1511() {
		assertEquals("570-288-6196", customers.get(1510).getFax());
	}

	@Test
	@DisplayName("Record 1511: Email is valentin@sherard.com")
	void EmailOfRecord1511() {
		assertEquals("valentin@sherard.com", customers.get(1510).getEmail());
	}

	@Test
	@DisplayName("Record 1511: Web is http://www.valentinsherard.com")
	void WebOfRecord1511() {
		assertEquals("http://www.valentinsherard.com", customers.get(1510).getWeb());
	}
}
