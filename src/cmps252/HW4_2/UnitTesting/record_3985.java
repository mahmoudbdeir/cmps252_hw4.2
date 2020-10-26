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
class Record_3985 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3985: FirstName is Brad")
	void FirstNameOfRecord3985() {
		assertEquals("Brad", customers.get(3984).getFirstName());
	}

	@Test
	@DisplayName("Record 3985: LastName is Hokula")
	void LastNameOfRecord3985() {
		assertEquals("Hokula", customers.get(3984).getLastName());
	}

	@Test
	@DisplayName("Record 3985: Company is Structures Ltd")
	void CompanyOfRecord3985() {
		assertEquals("Structures Ltd", customers.get(3984).getCompany());
	}

	@Test
	@DisplayName("Record 3985: Address is 1102 W Yakima Ave")
	void AddressOfRecord3985() {
		assertEquals("1102 W Yakima Ave", customers.get(3984).getAddress());
	}

	@Test
	@DisplayName("Record 3985: City is Yakima")
	void CityOfRecord3985() {
		assertEquals("Yakima", customers.get(3984).getCity());
	}

	@Test
	@DisplayName("Record 3985: County is Yakima")
	void CountyOfRecord3985() {
		assertEquals("Yakima", customers.get(3984).getCounty());
	}

	@Test
	@DisplayName("Record 3985: State is WA")
	void StateOfRecord3985() {
		assertEquals("WA", customers.get(3984).getState());
	}

	@Test
	@DisplayName("Record 3985: ZIP is 98902")
	void ZIPOfRecord3985() {
		assertEquals("98902", customers.get(3984).getZIP());
	}

	@Test
	@DisplayName("Record 3985: Phone is 509-457-7528")
	void PhoneOfRecord3985() {
		assertEquals("509-457-7528", customers.get(3984).getPhone());
	}

	@Test
	@DisplayName("Record 3985: Fax is 509-457-0412")
	void FaxOfRecord3985() {
		assertEquals("509-457-0412", customers.get(3984).getFax());
	}

	@Test
	@DisplayName("Record 3985: Email is brad@hokula.com")
	void EmailOfRecord3985() {
		assertEquals("brad@hokula.com", customers.get(3984).getEmail());
	}

	@Test
	@DisplayName("Record 3985: Web is http://www.bradhokula.com")
	void WebOfRecord3985() {
		assertEquals("http://www.bradhokula.com", customers.get(3984).getWeb());
	}
}
