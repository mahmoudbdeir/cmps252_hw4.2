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

@Tag("6")
class Record_4834 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4834: FirstName is Salvatore")
	void FirstNameOfRecord4834() {
		assertEquals("Salvatore", customers.get(4833).getFirstName());
	}

	@Test
	@DisplayName("Record 4834: LastName is Fryd")
	void LastNameOfRecord4834() {
		assertEquals("Fryd", customers.get(4833).getLastName());
	}

	@Test
	@DisplayName("Record 4834: Company is College Of American Path")
	void CompanyOfRecord4834() {
		assertEquals("College Of American Path", customers.get(4833).getCompany());
	}

	@Test
	@DisplayName("Record 4834: Address is 330 5th Ave")
	void AddressOfRecord4834() {
		assertEquals("330 5th Ave", customers.get(4833).getAddress());
	}

	@Test
	@DisplayName("Record 4834: City is New York")
	void CityOfRecord4834() {
		assertEquals("New York", customers.get(4833).getCity());
	}

	@Test
	@DisplayName("Record 4834: County is New York")
	void CountyOfRecord4834() {
		assertEquals("New York", customers.get(4833).getCounty());
	}

	@Test
	@DisplayName("Record 4834: State is NY")
	void StateOfRecord4834() {
		assertEquals("NY", customers.get(4833).getState());
	}

	@Test
	@DisplayName("Record 4834: ZIP is 10001")
	void ZIPOfRecord4834() {
		assertEquals("10001", customers.get(4833).getZIP());
	}

	@Test
	@DisplayName("Record 4834: Phone is 212-967-5441")
	void PhoneOfRecord4834() {
		assertEquals("212-967-5441", customers.get(4833).getPhone());
	}

	@Test
	@DisplayName("Record 4834: Fax is 212-967-4759")
	void FaxOfRecord4834() {
		assertEquals("212-967-4759", customers.get(4833).getFax());
	}

	@Test
	@DisplayName("Record 4834: Email is salvatore@fryd.com")
	void EmailOfRecord4834() {
		assertEquals("salvatore@fryd.com", customers.get(4833).getEmail());
	}

	@Test
	@DisplayName("Record 4834: Web is http://www.salvatorefryd.com")
	void WebOfRecord4834() {
		assertEquals("http://www.salvatorefryd.com", customers.get(4833).getWeb());
	}
}
