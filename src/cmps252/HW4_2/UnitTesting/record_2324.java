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

@Tag("39")
class Record_2324 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2324: FirstName is Jeffry")
	void FirstNameOfRecord2324() {
		assertEquals("Jeffry", customers.get(2323).getFirstName());
	}

	@Test
	@DisplayName("Record 2324: LastName is Erkkila")
	void LastNameOfRecord2324() {
		assertEquals("Erkkila", customers.get(2323).getLastName());
	}

	@Test
	@DisplayName("Record 2324: Company is Skipperliner Marine")
	void CompanyOfRecord2324() {
		assertEquals("Skipperliner Marine", customers.get(2323).getCompany());
	}

	@Test
	@DisplayName("Record 2324: Address is 27412 Calle Arroyo")
	void AddressOfRecord2324() {
		assertEquals("27412 Calle Arroyo", customers.get(2323).getAddress());
	}

	@Test
	@DisplayName("Record 2324: City is San Juan Capistrano")
	void CityOfRecord2324() {
		assertEquals("San Juan Capistrano", customers.get(2323).getCity());
	}

	@Test
	@DisplayName("Record 2324: County is Orange")
	void CountyOfRecord2324() {
		assertEquals("Orange", customers.get(2323).getCounty());
	}

	@Test
	@DisplayName("Record 2324: State is CA")
	void StateOfRecord2324() {
		assertEquals("CA", customers.get(2323).getState());
	}

	@Test
	@DisplayName("Record 2324: ZIP is 92675")
	void ZIPOfRecord2324() {
		assertEquals("92675", customers.get(2323).getZIP());
	}

	@Test
	@DisplayName("Record 2324: Phone is 949-248-7247")
	void PhoneOfRecord2324() {
		assertEquals("949-248-7247", customers.get(2323).getPhone());
	}

	@Test
	@DisplayName("Record 2324: Fax is 949-248-5842")
	void FaxOfRecord2324() {
		assertEquals("949-248-5842", customers.get(2323).getFax());
	}

	@Test
	@DisplayName("Record 2324: Email is jeffry@erkkila.com")
	void EmailOfRecord2324() {
		assertEquals("jeffry@erkkila.com", customers.get(2323).getEmail());
	}

	@Test
	@DisplayName("Record 2324: Web is http://www.jeffryerkkila.com")
	void WebOfRecord2324() {
		assertEquals("http://www.jeffryerkkila.com", customers.get(2323).getWeb());
	}
}
