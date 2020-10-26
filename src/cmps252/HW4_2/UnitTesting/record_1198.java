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

@Tag("37")
class Record_1198 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1198: FirstName is Kaitlyn")
	void FirstNameOfRecord1198() {
		assertEquals("Kaitlyn", customers.get(1197).getFirstName());
	}

	@Test
	@DisplayName("Record 1198: LastName is Phibbs")
	void LastNameOfRecord1198() {
		assertEquals("Phibbs", customers.get(1197).getLastName());
	}

	@Test
	@DisplayName("Record 1198: Company is Ransome Lift")
	void CompanyOfRecord1198() {
		assertEquals("Ransome Lift", customers.get(1197).getCompany());
	}

	@Test
	@DisplayName("Record 1198: Address is 324 Henry St")
	void AddressOfRecord1198() {
		assertEquals("324 Henry St", customers.get(1197).getAddress());
	}

	@Test
	@DisplayName("Record 1198: City is Lexington")
	void CityOfRecord1198() {
		assertEquals("Lexington", customers.get(1197).getCity());
	}

	@Test
	@DisplayName("Record 1198: County is Fayette")
	void CountyOfRecord1198() {
		assertEquals("Fayette", customers.get(1197).getCounty());
	}

	@Test
	@DisplayName("Record 1198: State is KY")
	void StateOfRecord1198() {
		assertEquals("KY", customers.get(1197).getState());
	}

	@Test
	@DisplayName("Record 1198: ZIP is 40508")
	void ZIPOfRecord1198() {
		assertEquals("40508", customers.get(1197).getZIP());
	}

	@Test
	@DisplayName("Record 1198: Phone is 859-255-8342")
	void PhoneOfRecord1198() {
		assertEquals("859-255-8342", customers.get(1197).getPhone());
	}

	@Test
	@DisplayName("Record 1198: Fax is 859-255-0891")
	void FaxOfRecord1198() {
		assertEquals("859-255-0891", customers.get(1197).getFax());
	}

	@Test
	@DisplayName("Record 1198: Email is kaitlyn@phibbs.com")
	void EmailOfRecord1198() {
		assertEquals("kaitlyn@phibbs.com", customers.get(1197).getEmail());
	}

	@Test
	@DisplayName("Record 1198: Web is http://www.kaitlynphibbs.com")
	void WebOfRecord1198() {
		assertEquals("http://www.kaitlynphibbs.com", customers.get(1197).getWeb());
	}
}
