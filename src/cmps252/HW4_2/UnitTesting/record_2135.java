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
class Record_2135 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2135: FirstName is Alfred")
	void FirstNameOfRecord2135() {
		assertEquals("Alfred", customers.get(2134).getFirstName());
	}

	@Test
	@DisplayName("Record 2135: LastName is Hammons")
	void LastNameOfRecord2135() {
		assertEquals("Hammons", customers.get(2134).getLastName());
	}

	@Test
	@DisplayName("Record 2135: Company is Antigo Co Op Credit Union")
	void CompanyOfRecord2135() {
		assertEquals("Antigo Co Op Credit Union", customers.get(2134).getCompany());
	}

	@Test
	@DisplayName("Record 2135: Address is 4549 Austin Bluffs Pky")
	void AddressOfRecord2135() {
		assertEquals("4549 Austin Bluffs Pky", customers.get(2134).getAddress());
	}

	@Test
	@DisplayName("Record 2135: City is Colorado Springs")
	void CityOfRecord2135() {
		assertEquals("Colorado Springs", customers.get(2134).getCity());
	}

	@Test
	@DisplayName("Record 2135: County is El Paso")
	void CountyOfRecord2135() {
		assertEquals("El Paso", customers.get(2134).getCounty());
	}

	@Test
	@DisplayName("Record 2135: State is CO")
	void StateOfRecord2135() {
		assertEquals("CO", customers.get(2134).getState());
	}

	@Test
	@DisplayName("Record 2135: ZIP is 80918")
	void ZIPOfRecord2135() {
		assertEquals("80918", customers.get(2134).getZIP());
	}

	@Test
	@DisplayName("Record 2135: Phone is 719-596-4300")
	void PhoneOfRecord2135() {
		assertEquals("719-596-4300", customers.get(2134).getPhone());
	}

	@Test
	@DisplayName("Record 2135: Fax is 719-596-4679")
	void FaxOfRecord2135() {
		assertEquals("719-596-4679", customers.get(2134).getFax());
	}

	@Test
	@DisplayName("Record 2135: Email is alfred@hammons.com")
	void EmailOfRecord2135() {
		assertEquals("alfred@hammons.com", customers.get(2134).getEmail());
	}

	@Test
	@DisplayName("Record 2135: Web is http://www.alfredhammons.com")
	void WebOfRecord2135() {
		assertEquals("http://www.alfredhammons.com", customers.get(2134).getWeb());
	}
}
