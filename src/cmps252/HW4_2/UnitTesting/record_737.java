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

@Tag("3")
class Record_737 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 737: FirstName is Kristen")
	void FirstNameOfRecord737() {
		assertEquals("Kristen", customers.get(736).getFirstName());
	}

	@Test
	@DisplayName("Record 737: LastName is Millie")
	void LastNameOfRecord737() {
		assertEquals("Millie", customers.get(736).getLastName());
	}

	@Test
	@DisplayName("Record 737: Company is Kamperschroer, Kyth I")
	void CompanyOfRecord737() {
		assertEquals("Kamperschroer, Kyth I", customers.get(736).getCompany());
	}

	@Test
	@DisplayName("Record 737: Address is 756 Concord Rd")
	void AddressOfRecord737() {
		assertEquals("756 Concord Rd", customers.get(736).getAddress());
	}

	@Test
	@DisplayName("Record 737: City is Smyrna")
	void CityOfRecord737() {
		assertEquals("Smyrna", customers.get(736).getCity());
	}

	@Test
	@DisplayName("Record 737: County is Cobb")
	void CountyOfRecord737() {
		assertEquals("Cobb", customers.get(736).getCounty());
	}

	@Test
	@DisplayName("Record 737: State is GA")
	void StateOfRecord737() {
		assertEquals("GA", customers.get(736).getState());
	}

	@Test
	@DisplayName("Record 737: ZIP is 30082")
	void ZIPOfRecord737() {
		assertEquals("30082", customers.get(736).getZIP());
	}

	@Test
	@DisplayName("Record 737: Phone is 770-436-1885")
	void PhoneOfRecord737() {
		assertEquals("770-436-1885", customers.get(736).getPhone());
	}

	@Test
	@DisplayName("Record 737: Fax is 770-436-9081")
	void FaxOfRecord737() {
		assertEquals("770-436-9081", customers.get(736).getFax());
	}

	@Test
	@DisplayName("Record 737: Email is kristen@millie.com")
	void EmailOfRecord737() {
		assertEquals("kristen@millie.com", customers.get(736).getEmail());
	}

	@Test
	@DisplayName("Record 737: Web is http://www.kristenmillie.com")
	void WebOfRecord737() {
		assertEquals("http://www.kristenmillie.com", customers.get(736).getWeb());
	}
}
