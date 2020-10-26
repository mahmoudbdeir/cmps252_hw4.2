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

@Tag("36")
class Record_198 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 198: FirstName is Chuck")
	void FirstNameOfRecord198() {
		assertEquals("Chuck", customers.get(197).getFirstName());
	}

	@Test
	@DisplayName("Record 198: LastName is Cuningham")
	void LastNameOfRecord198() {
		assertEquals("Cuningham", customers.get(197).getLastName());
	}

	@Test
	@DisplayName("Record 198: Company is Spaedy, Shellie Md")
	void CompanyOfRecord198() {
		assertEquals("Spaedy, Shellie Md", customers.get(197).getCompany());
	}

	@Test
	@DisplayName("Record 198: Address is 1325 Tower Ave")
	void AddressOfRecord198() {
		assertEquals("1325 Tower Ave", customers.get(197).getAddress());
	}

	@Test
	@DisplayName("Record 198: City is Superior")
	void CityOfRecord198() {
		assertEquals("Superior", customers.get(197).getCity());
	}

	@Test
	@DisplayName("Record 198: County is Douglas")
	void CountyOfRecord198() {
		assertEquals("Douglas", customers.get(197).getCounty());
	}

	@Test
	@DisplayName("Record 198: State is WI")
	void StateOfRecord198() {
		assertEquals("WI", customers.get(197).getState());
	}

	@Test
	@DisplayName("Record 198: ZIP is 54880")
	void ZIPOfRecord198() {
		assertEquals("54880", customers.get(197).getZIP());
	}

	@Test
	@DisplayName("Record 198: Phone is 715-394-0505")
	void PhoneOfRecord198() {
		assertEquals("715-394-0505", customers.get(197).getPhone());
	}

	@Test
	@DisplayName("Record 198: Fax is 715-394-3989")
	void FaxOfRecord198() {
		assertEquals("715-394-3989", customers.get(197).getFax());
	}

	@Test
	@DisplayName("Record 198: Email is chuck@cuningham.com")
	void EmailOfRecord198() {
		assertEquals("chuck@cuningham.com", customers.get(197).getEmail());
	}

	@Test
	@DisplayName("Record 198: Web is http://www.chuckcuningham.com")
	void WebOfRecord198() {
		assertEquals("http://www.chuckcuningham.com", customers.get(197).getWeb());
	}
}
