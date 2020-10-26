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

@Tag("33")
class Record_1414 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1414: FirstName is Carmelo")
	void FirstNameOfRecord1414() {
		assertEquals("Carmelo", customers.get(1413).getFirstName());
	}

	@Test
	@DisplayName("Record 1414: LastName is Rosenstock")
	void LastNameOfRecord1414() {
		assertEquals("Rosenstock", customers.get(1413).getLastName());
	}

	@Test
	@DisplayName("Record 1414: Company is Bloomsbury Review")
	void CompanyOfRecord1414() {
		assertEquals("Bloomsbury Review", customers.get(1413).getCompany());
	}

	@Test
	@DisplayName("Record 1414: Address is 222 E 49th St")
	void AddressOfRecord1414() {
		assertEquals("222 E 49th St", customers.get(1413).getAddress());
	}

	@Test
	@DisplayName("Record 1414: City is New York")
	void CityOfRecord1414() {
		assertEquals("New York", customers.get(1413).getCity());
	}

	@Test
	@DisplayName("Record 1414: County is New York")
	void CountyOfRecord1414() {
		assertEquals("New York", customers.get(1413).getCounty());
	}

	@Test
	@DisplayName("Record 1414: State is NY")
	void StateOfRecord1414() {
		assertEquals("NY", customers.get(1413).getState());
	}

	@Test
	@DisplayName("Record 1414: ZIP is 10017")
	void ZIPOfRecord1414() {
		assertEquals("10017", customers.get(1413).getZIP());
	}

	@Test
	@DisplayName("Record 1414: Phone is 212-758-2804")
	void PhoneOfRecord1414() {
		assertEquals("212-758-2804", customers.get(1413).getPhone());
	}

	@Test
	@DisplayName("Record 1414: Fax is 212-758-5249")
	void FaxOfRecord1414() {
		assertEquals("212-758-5249", customers.get(1413).getFax());
	}

	@Test
	@DisplayName("Record 1414: Email is carmelo@rosenstock.com")
	void EmailOfRecord1414() {
		assertEquals("carmelo@rosenstock.com", customers.get(1413).getEmail());
	}

	@Test
	@DisplayName("Record 1414: Web is http://www.carmelorosenstock.com")
	void WebOfRecord1414() {
		assertEquals("http://www.carmelorosenstock.com", customers.get(1413).getWeb());
	}
}
