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

@Tag("27")
class Record_623 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 623: FirstName is Esther")
	void FirstNameOfRecord623() {
		assertEquals("Esther", customers.get(622).getFirstName());
	}

	@Test
	@DisplayName("Record 623: LastName is Chiappetta")
	void LastNameOfRecord623() {
		assertEquals("Chiappetta", customers.get(622).getLastName());
	}

	@Test
	@DisplayName("Record 623: Company is Murphy Mccoubrey Murphy")
	void CompanyOfRecord623() {
		assertEquals("Murphy Mccoubrey Murphy", customers.get(622).getCompany());
	}

	@Test
	@DisplayName("Record 623: Address is 200 Hillsdale Ave")
	void AddressOfRecord623() {
		assertEquals("200 Hillsdale Ave", customers.get(622).getAddress());
	}

	@Test
	@DisplayName("Record 623: City is San Jose")
	void CityOfRecord623() {
		assertEquals("San Jose", customers.get(622).getCity());
	}

	@Test
	@DisplayName("Record 623: County is Santa Clara")
	void CountyOfRecord623() {
		assertEquals("Santa Clara", customers.get(622).getCounty());
	}

	@Test
	@DisplayName("Record 623: State is CA")
	void StateOfRecord623() {
		assertEquals("CA", customers.get(622).getState());
	}

	@Test
	@DisplayName("Record 623: ZIP is 95136")
	void ZIPOfRecord623() {
		assertEquals("95136", customers.get(622).getZIP());
	}

	@Test
	@DisplayName("Record 623: Phone is 408-227-9365")
	void PhoneOfRecord623() {
		assertEquals("408-227-9365", customers.get(622).getPhone());
	}

	@Test
	@DisplayName("Record 623: Fax is 408-227-4887")
	void FaxOfRecord623() {
		assertEquals("408-227-4887", customers.get(622).getFax());
	}

	@Test
	@DisplayName("Record 623: Email is esther@chiappetta.com")
	void EmailOfRecord623() {
		assertEquals("esther@chiappetta.com", customers.get(622).getEmail());
	}

	@Test
	@DisplayName("Record 623: Web is http://www.estherchiappetta.com")
	void WebOfRecord623() {
		assertEquals("http://www.estherchiappetta.com", customers.get(622).getWeb());
	}
}
