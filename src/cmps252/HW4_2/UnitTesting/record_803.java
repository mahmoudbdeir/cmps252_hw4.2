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
class Record_803 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 803: FirstName is Estelle")
	void FirstNameOfRecord803() {
		assertEquals("Estelle", customers.get(802).getFirstName());
	}

	@Test
	@DisplayName("Record 803: LastName is Shore")
	void LastNameOfRecord803() {
		assertEquals("Shore", customers.get(802).getLastName());
	}

	@Test
	@DisplayName("Record 803: Company is Chamber Of Commerce")
	void CompanyOfRecord803() {
		assertEquals("Chamber Of Commerce", customers.get(802).getCompany());
	}

	@Test
	@DisplayName("Record 803: Address is 4503 Menaul Blvd Ne")
	void AddressOfRecord803() {
		assertEquals("4503 Menaul Blvd Ne", customers.get(802).getAddress());
	}

	@Test
	@DisplayName("Record 803: City is Albuquerque")
	void CityOfRecord803() {
		assertEquals("Albuquerque", customers.get(802).getCity());
	}

	@Test
	@DisplayName("Record 803: County is Bernalillo")
	void CountyOfRecord803() {
		assertEquals("Bernalillo", customers.get(802).getCounty());
	}

	@Test
	@DisplayName("Record 803: State is NM")
	void StateOfRecord803() {
		assertEquals("NM", customers.get(802).getState());
	}

	@Test
	@DisplayName("Record 803: ZIP is 87110")
	void ZIPOfRecord803() {
		assertEquals("87110", customers.get(802).getZIP());
	}

	@Test
	@DisplayName("Record 803: Phone is 505-888-2528")
	void PhoneOfRecord803() {
		assertEquals("505-888-2528", customers.get(802).getPhone());
	}

	@Test
	@DisplayName("Record 803: Fax is 505-888-9607")
	void FaxOfRecord803() {
		assertEquals("505-888-9607", customers.get(802).getFax());
	}

	@Test
	@DisplayName("Record 803: Email is estelle@shore.com")
	void EmailOfRecord803() {
		assertEquals("estelle@shore.com", customers.get(802).getEmail());
	}

	@Test
	@DisplayName("Record 803: Web is http://www.estelleshore.com")
	void WebOfRecord803() {
		assertEquals("http://www.estelleshore.com", customers.get(802).getWeb());
	}
}
