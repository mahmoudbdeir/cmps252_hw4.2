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

@Tag("10")
class Record_66 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 66: FirstName is Dalton")
	void FirstNameOfRecord66() {
		assertEquals("Dalton", customers.get(65).getFirstName());
	}

	@Test
	@DisplayName("Record 66: LastName is Calix")
	void LastNameOfRecord66() {
		assertEquals("Calix", customers.get(65).getLastName());
	}

	@Test
	@DisplayName("Record 66: Company is Roth, David P")
	void CompanyOfRecord66() {
		assertEquals("Roth, David P", customers.get(65).getCompany());
	}

	@Test
	@DisplayName("Record 66: Address is 7847 Convoy Ct")
	void AddressOfRecord66() {
		assertEquals("7847 Convoy Ct", customers.get(65).getAddress());
	}

	@Test
	@DisplayName("Record 66: City is San Diego")
	void CityOfRecord66() {
		assertEquals("San Diego", customers.get(65).getCity());
	}

	@Test
	@DisplayName("Record 66: County is San Diego")
	void CountyOfRecord66() {
		assertEquals("San Diego", customers.get(65).getCounty());
	}

	@Test
	@DisplayName("Record 66: State is CA")
	void StateOfRecord66() {
		assertEquals("CA", customers.get(65).getState());
	}

	@Test
	@DisplayName("Record 66: ZIP is 92111")
	void ZIPOfRecord66() {
		assertEquals("92111", customers.get(65).getZIP());
	}

	@Test
	@DisplayName("Record 66: Phone is 858-268-1329")
	void PhoneOfRecord66() {
		assertEquals("858-268-1329", customers.get(65).getPhone());
	}

	@Test
	@DisplayName("Record 66: Fax is 858-268-5667")
	void FaxOfRecord66() {
		assertEquals("858-268-5667", customers.get(65).getFax());
	}

	@Test
	@DisplayName("Record 66: Email is dalton@calix.com")
	void EmailOfRecord66() {
		assertEquals("dalton@calix.com", customers.get(65).getEmail());
	}

	@Test
	@DisplayName("Record 66: Web is http://www.daltoncalix.com")
	void WebOfRecord66() {
		assertEquals("http://www.daltoncalix.com", customers.get(65).getWeb());
	}
}
