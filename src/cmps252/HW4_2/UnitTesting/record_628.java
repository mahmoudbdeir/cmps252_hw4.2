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

@Tag("17")
class Record_628 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 628: FirstName is Faustino")
	void FirstNameOfRecord628() {
		assertEquals("Faustino", customers.get(627).getFirstName());
	}

	@Test
	@DisplayName("Record 628: LastName is Godbout")
	void LastNameOfRecord628() {
		assertEquals("Godbout", customers.get(627).getLastName());
	}

	@Test
	@DisplayName("Record 628: Company is Hackensack Water Company")
	void CompanyOfRecord628() {
		assertEquals("Hackensack Water Company", customers.get(627).getCompany());
	}

	@Test
	@DisplayName("Record 628: Address is 620 Pershing Ave")
	void AddressOfRecord628() {
		assertEquals("620 Pershing Ave", customers.get(627).getAddress());
	}

	@Test
	@DisplayName("Record 628: City is Pocatello")
	void CityOfRecord628() {
		assertEquals("Pocatello", customers.get(627).getCity());
	}

	@Test
	@DisplayName("Record 628: County is Bannock")
	void CountyOfRecord628() {
		assertEquals("Bannock", customers.get(627).getCounty());
	}

	@Test
	@DisplayName("Record 628: State is ID")
	void StateOfRecord628() {
		assertEquals("ID", customers.get(627).getState());
	}

	@Test
	@DisplayName("Record 628: ZIP is 83201")
	void ZIPOfRecord628() {
		assertEquals("83201", customers.get(627).getZIP());
	}

	@Test
	@DisplayName("Record 628: Phone is 208-233-1605")
	void PhoneOfRecord628() {
		assertEquals("208-233-1605", customers.get(627).getPhone());
	}

	@Test
	@DisplayName("Record 628: Fax is 208-233-4675")
	void FaxOfRecord628() {
		assertEquals("208-233-4675", customers.get(627).getFax());
	}

	@Test
	@DisplayName("Record 628: Email is faustino@godbout.com")
	void EmailOfRecord628() {
		assertEquals("faustino@godbout.com", customers.get(627).getEmail());
	}

	@Test
	@DisplayName("Record 628: Web is http://www.faustinogodbout.com")
	void WebOfRecord628() {
		assertEquals("http://www.faustinogodbout.com", customers.get(627).getWeb());
	}
}
