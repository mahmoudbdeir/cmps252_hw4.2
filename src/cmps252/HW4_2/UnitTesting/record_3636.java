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

@Tag("32")
class Record_3636 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3636: FirstName is Isabel")
	void FirstNameOfRecord3636() {
		assertEquals("Isabel", customers.get(3635).getFirstName());
	}

	@Test
	@DisplayName("Record 3636: LastName is Dubuisson")
	void LastNameOfRecord3636() {
		assertEquals("Dubuisson", customers.get(3635).getLastName());
	}

	@Test
	@DisplayName("Record 3636: Company is Vanier Bus Forms & Svc Hdqs")
	void CompanyOfRecord3636() {
		assertEquals("Vanier Bus Forms & Svc Hdqs", customers.get(3635).getCompany());
	}

	@Test
	@DisplayName("Record 3636: Address is 3071 W Henrietta Rd")
	void AddressOfRecord3636() {
		assertEquals("3071 W Henrietta Rd", customers.get(3635).getAddress());
	}

	@Test
	@DisplayName("Record 3636: City is Rochester")
	void CityOfRecord3636() {
		assertEquals("Rochester", customers.get(3635).getCity());
	}

	@Test
	@DisplayName("Record 3636: County is Monroe")
	void CountyOfRecord3636() {
		assertEquals("Monroe", customers.get(3635).getCounty());
	}

	@Test
	@DisplayName("Record 3636: State is NY")
	void StateOfRecord3636() {
		assertEquals("NY", customers.get(3635).getState());
	}

	@Test
	@DisplayName("Record 3636: ZIP is 14623")
	void ZIPOfRecord3636() {
		assertEquals("14623", customers.get(3635).getZIP());
	}

	@Test
	@DisplayName("Record 3636: Phone is 585-865-4897")
	void PhoneOfRecord3636() {
		assertEquals("585-865-4897", customers.get(3635).getPhone());
	}

	@Test
	@DisplayName("Record 3636: Fax is 585-865-0762")
	void FaxOfRecord3636() {
		assertEquals("585-865-0762", customers.get(3635).getFax());
	}

	@Test
	@DisplayName("Record 3636: Email is isabel@dubuisson.com")
	void EmailOfRecord3636() {
		assertEquals("isabel@dubuisson.com", customers.get(3635).getEmail());
	}

	@Test
	@DisplayName("Record 3636: Web is http://www.isabeldubuisson.com")
	void WebOfRecord3636() {
		assertEquals("http://www.isabeldubuisson.com", customers.get(3635).getWeb());
	}
}
