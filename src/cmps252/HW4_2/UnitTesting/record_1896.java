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
class Record_1896 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1896: FirstName is Edna")
	void FirstNameOfRecord1896() {
		assertEquals("Edna", customers.get(1895).getFirstName());
	}

	@Test
	@DisplayName("Record 1896: LastName is Mazurowski")
	void LastNameOfRecord1896() {
		assertEquals("Mazurowski", customers.get(1895).getLastName());
	}

	@Test
	@DisplayName("Record 1896: Company is Distrb Archts Intrntl Inc")
	void CompanyOfRecord1896() {
		assertEquals("Distrb Archts Intrntl Inc", customers.get(1895).getCompany());
	}

	@Test
	@DisplayName("Record 1896: Address is Rts 6 & 17 M At Bradleys")
	void AddressOfRecord1896() {
		assertEquals("Rts 6 & 17 M At Bradleys", customers.get(1895).getAddress());
	}

	@Test
	@DisplayName("Record 1896: City is Middletown")
	void CityOfRecord1896() {
		assertEquals("Middletown", customers.get(1895).getCity());
	}

	@Test
	@DisplayName("Record 1896: County is Orange")
	void CountyOfRecord1896() {
		assertEquals("Orange", customers.get(1895).getCounty());
	}

	@Test
	@DisplayName("Record 1896: State is NY")
	void StateOfRecord1896() {
		assertEquals("NY", customers.get(1895).getState());
	}

	@Test
	@DisplayName("Record 1896: ZIP is 10940")
	void ZIPOfRecord1896() {
		assertEquals("10940", customers.get(1895).getZIP());
	}

	@Test
	@DisplayName("Record 1896: Phone is 845-343-5969")
	void PhoneOfRecord1896() {
		assertEquals("845-343-5969", customers.get(1895).getPhone());
	}

	@Test
	@DisplayName("Record 1896: Fax is 845-343-4336")
	void FaxOfRecord1896() {
		assertEquals("845-343-4336", customers.get(1895).getFax());
	}

	@Test
	@DisplayName("Record 1896: Email is edna@mazurowski.com")
	void EmailOfRecord1896() {
		assertEquals("edna@mazurowski.com", customers.get(1895).getEmail());
	}

	@Test
	@DisplayName("Record 1896: Web is http://www.ednamazurowski.com")
	void WebOfRecord1896() {
		assertEquals("http://www.ednamazurowski.com", customers.get(1895).getWeb());
	}
}
