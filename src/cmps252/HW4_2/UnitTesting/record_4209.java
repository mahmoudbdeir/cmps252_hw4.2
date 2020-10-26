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

@Tag("15")
class Record_4209 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4209: FirstName is Prince")
	void FirstNameOfRecord4209() {
		assertEquals("Prince", customers.get(4208).getFirstName());
	}

	@Test
	@DisplayName("Record 4209: LastName is Chea")
	void LastNameOfRecord4209() {
		assertEquals("Chea", customers.get(4208).getLastName());
	}

	@Test
	@DisplayName("Record 4209: Company is Motel")
	void CompanyOfRecord4209() {
		assertEquals("Motel", customers.get(4208).getCompany());
	}

	@Test
	@DisplayName("Record 4209: Address is 175 5th Ave")
	void AddressOfRecord4209() {
		assertEquals("175 5th Ave", customers.get(4208).getAddress());
	}

	@Test
	@DisplayName("Record 4209: City is New York")
	void CityOfRecord4209() {
		assertEquals("New York", customers.get(4208).getCity());
	}

	@Test
	@DisplayName("Record 4209: County is New York")
	void CountyOfRecord4209() {
		assertEquals("New York", customers.get(4208).getCounty());
	}

	@Test
	@DisplayName("Record 4209: State is NY")
	void StateOfRecord4209() {
		assertEquals("NY", customers.get(4208).getState());
	}

	@Test
	@DisplayName("Record 4209: ZIP is 10010")
	void ZIPOfRecord4209() {
		assertEquals("10010", customers.get(4208).getZIP());
	}

	@Test
	@DisplayName("Record 4209: Phone is 212-460-4956")
	void PhoneOfRecord4209() {
		assertEquals("212-460-4956", customers.get(4208).getPhone());
	}

	@Test
	@DisplayName("Record 4209: Fax is 212-460-3804")
	void FaxOfRecord4209() {
		assertEquals("212-460-3804", customers.get(4208).getFax());
	}

	@Test
	@DisplayName("Record 4209: Email is prince@chea.com")
	void EmailOfRecord4209() {
		assertEquals("prince@chea.com", customers.get(4208).getEmail());
	}

	@Test
	@DisplayName("Record 4209: Web is http://www.princechea.com")
	void WebOfRecord4209() {
		assertEquals("http://www.princechea.com", customers.get(4208).getWeb());
	}
}
