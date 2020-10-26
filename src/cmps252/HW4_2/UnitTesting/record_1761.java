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

@Tag("23")
class Record_1761 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1761: FirstName is Jordan")
	void FirstNameOfRecord1761() {
		assertEquals("Jordan", customers.get(1760).getFirstName());
	}

	@Test
	@DisplayName("Record 1761: LastName is Wohld")
	void LastNameOfRecord1761() {
		assertEquals("Wohld", customers.get(1760).getLastName());
	}

	@Test
	@DisplayName("Record 1761: Company is Microwave Printed Circuitry")
	void CompanyOfRecord1761() {
		assertEquals("Microwave Printed Circuitry", customers.get(1760).getCompany());
	}

	@Test
	@DisplayName("Record 1761: Address is 55 Spring St")
	void AddressOfRecord1761() {
		assertEquals("55 Spring St", customers.get(1760).getAddress());
	}

	@Test
	@DisplayName("Record 1761: City is Pittsfield")
	void CityOfRecord1761() {
		assertEquals("Pittsfield", customers.get(1760).getCity());
	}

	@Test
	@DisplayName("Record 1761: County is Berkshire")
	void CountyOfRecord1761() {
		assertEquals("Berkshire", customers.get(1760).getCounty());
	}

	@Test
	@DisplayName("Record 1761: State is MA")
	void StateOfRecord1761() {
		assertEquals("MA", customers.get(1760).getState());
	}

	@Test
	@DisplayName("Record 1761: ZIP is 1201")
	void ZIPOfRecord1761() {
		assertEquals("1201", customers.get(1760).getZIP());
	}

	@Test
	@DisplayName("Record 1761: Phone is 413-442-0301")
	void PhoneOfRecord1761() {
		assertEquals("413-442-0301", customers.get(1760).getPhone());
	}

	@Test
	@DisplayName("Record 1761: Fax is 413-442-9262")
	void FaxOfRecord1761() {
		assertEquals("413-442-9262", customers.get(1760).getFax());
	}

	@Test
	@DisplayName("Record 1761: Email is jordan@wohld.com")
	void EmailOfRecord1761() {
		assertEquals("jordan@wohld.com", customers.get(1760).getEmail());
	}

	@Test
	@DisplayName("Record 1761: Web is http://www.jordanwohld.com")
	void WebOfRecord1761() {
		assertEquals("http://www.jordanwohld.com", customers.get(1760).getWeb());
	}
}
