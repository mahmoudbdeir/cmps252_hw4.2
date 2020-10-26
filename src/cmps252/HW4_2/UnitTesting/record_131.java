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

@Tag("9")
class Record_131 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 131: FirstName is Orlando")
	void FirstNameOfRecord131() {
		assertEquals("Orlando", customers.get(130).getFirstName());
	}

	@Test
	@DisplayName("Record 131: LastName is Dibbern")
	void LastNameOfRecord131() {
		assertEquals("Dibbern", customers.get(130).getLastName());
	}

	@Test
	@DisplayName("Record 131: Company is Flint Ink Corporation")
	void CompanyOfRecord131() {
		assertEquals("Flint Ink Corporation", customers.get(130).getCompany());
	}

	@Test
	@DisplayName("Record 131: Address is 634 Waterloo Geneva Rd")
	void AddressOfRecord131() {
		assertEquals("634 Waterloo Geneva Rd", customers.get(130).getAddress());
	}

	@Test
	@DisplayName("Record 131: City is Waterloo")
	void CityOfRecord131() {
		assertEquals("Waterloo", customers.get(130).getCity());
	}

	@Test
	@DisplayName("Record 131: County is Seneca")
	void CountyOfRecord131() {
		assertEquals("Seneca", customers.get(130).getCounty());
	}

	@Test
	@DisplayName("Record 131: State is NY")
	void StateOfRecord131() {
		assertEquals("NY", customers.get(130).getState());
	}

	@Test
	@DisplayName("Record 131: ZIP is 13165")
	void ZIPOfRecord131() {
		assertEquals("13165", customers.get(130).getZIP());
	}

	@Test
	@DisplayName("Record 131: Phone is 315-781-1403")
	void PhoneOfRecord131() {
		assertEquals("315-781-1403", customers.get(130).getPhone());
	}

	@Test
	@DisplayName("Record 131: Fax is 315-781-6515")
	void FaxOfRecord131() {
		assertEquals("315-781-6515", customers.get(130).getFax());
	}

	@Test
	@DisplayName("Record 131: Email is orlando@dibbern.com")
	void EmailOfRecord131() {
		assertEquals("orlando@dibbern.com", customers.get(130).getEmail());
	}

	@Test
	@DisplayName("Record 131: Web is http://www.orlandodibbern.com")
	void WebOfRecord131() {
		assertEquals("http://www.orlandodibbern.com", customers.get(130).getWeb());
	}
}
