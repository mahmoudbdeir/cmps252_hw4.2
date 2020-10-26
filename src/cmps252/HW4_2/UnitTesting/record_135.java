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

@Tag("7")
class Record_135 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 135: FirstName is Clara")
	void FirstNameOfRecord135() {
		assertEquals("Clara", customers.get(134).getFirstName());
	}

	@Test
	@DisplayName("Record 135: LastName is Reyer")
	void LastNameOfRecord135() {
		assertEquals("Reyer", customers.get(134).getLastName());
	}

	@Test
	@DisplayName("Record 135: Company is Blue Cross & Blue Shield Of")
	void CompanyOfRecord135() {
		assertEquals("Blue Cross & Blue Shield Of", customers.get(134).getCompany());
	}

	@Test
	@DisplayName("Record 135: Address is 8280 Clairemont Mesa Blvd")
	void AddressOfRecord135() {
		assertEquals("8280 Clairemont Mesa Blvd", customers.get(134).getAddress());
	}

	@Test
	@DisplayName("Record 135: City is San Diego")
	void CityOfRecord135() {
		assertEquals("San Diego", customers.get(134).getCity());
	}

	@Test
	@DisplayName("Record 135: County is San Diego")
	void CountyOfRecord135() {
		assertEquals("San Diego", customers.get(134).getCounty());
	}

	@Test
	@DisplayName("Record 135: State is CA")
	void StateOfRecord135() {
		assertEquals("CA", customers.get(134).getState());
	}

	@Test
	@DisplayName("Record 135: ZIP is 92111")
	void ZIPOfRecord135() {
		assertEquals("92111", customers.get(134).getZIP());
	}

	@Test
	@DisplayName("Record 135: Phone is 858-268-1367")
	void PhoneOfRecord135() {
		assertEquals("858-268-1367", customers.get(134).getPhone());
	}

	@Test
	@DisplayName("Record 135: Fax is 858-268-8669")
	void FaxOfRecord135() {
		assertEquals("858-268-8669", customers.get(134).getFax());
	}

	@Test
	@DisplayName("Record 135: Email is clara@reyer.com")
	void EmailOfRecord135() {
		assertEquals("clara@reyer.com", customers.get(134).getEmail());
	}

	@Test
	@DisplayName("Record 135: Web is http://www.clarareyer.com")
	void WebOfRecord135() {
		assertEquals("http://www.clarareyer.com", customers.get(134).getWeb());
	}
}
