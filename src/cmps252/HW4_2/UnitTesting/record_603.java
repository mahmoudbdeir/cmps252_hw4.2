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

@Tag("44")
class Record_603 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 603: FirstName is Clarissa")
	void FirstNameOfRecord603() {
		assertEquals("Clarissa", customers.get(602).getFirstName());
	}

	@Test
	@DisplayName("Record 603: LastName is Schaub")
	void LastNameOfRecord603() {
		assertEquals("Schaub", customers.get(602).getLastName());
	}

	@Test
	@DisplayName("Record 603: Company is Natcom Inc")
	void CompanyOfRecord603() {
		assertEquals("Natcom Inc", customers.get(602).getCompany());
	}

	@Test
	@DisplayName("Record 603: Address is 620 Pershing Ave")
	void AddressOfRecord603() {
		assertEquals("620 Pershing Ave", customers.get(602).getAddress());
	}

	@Test
	@DisplayName("Record 603: City is Pocatello")
	void CityOfRecord603() {
		assertEquals("Pocatello", customers.get(602).getCity());
	}

	@Test
	@DisplayName("Record 603: County is Bannock")
	void CountyOfRecord603() {
		assertEquals("Bannock", customers.get(602).getCounty());
	}

	@Test
	@DisplayName("Record 603: State is ID")
	void StateOfRecord603() {
		assertEquals("ID", customers.get(602).getState());
	}

	@Test
	@DisplayName("Record 603: ZIP is 83201")
	void ZIPOfRecord603() {
		assertEquals("83201", customers.get(602).getZIP());
	}

	@Test
	@DisplayName("Record 603: Phone is 208-233-9498")
	void PhoneOfRecord603() {
		assertEquals("208-233-9498", customers.get(602).getPhone());
	}

	@Test
	@DisplayName("Record 603: Fax is 208-233-9271")
	void FaxOfRecord603() {
		assertEquals("208-233-9271", customers.get(602).getFax());
	}

	@Test
	@DisplayName("Record 603: Email is clarissa@schaub.com")
	void EmailOfRecord603() {
		assertEquals("clarissa@schaub.com", customers.get(602).getEmail());
	}

	@Test
	@DisplayName("Record 603: Web is http://www.clarissaschaub.com")
	void WebOfRecord603() {
		assertEquals("http://www.clarissaschaub.com", customers.get(602).getWeb());
	}
}
