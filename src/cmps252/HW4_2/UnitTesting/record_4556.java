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

@Tag("28")
class Record_4556 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4556: FirstName is Luz")
	void FirstNameOfRecord4556() {
		assertEquals("Luz", customers.get(4555).getFirstName());
	}

	@Test
	@DisplayName("Record 4556: LastName is Inscho")
	void LastNameOfRecord4556() {
		assertEquals("Inscho", customers.get(4555).getLastName());
	}

	@Test
	@DisplayName("Record 4556: Company is Nugent, Charles H Jr")
	void CompanyOfRecord4556() {
		assertEquals("Nugent, Charles H Jr", customers.get(4555).getCompany());
	}

	@Test
	@DisplayName("Record 4556: Address is 2750 Las Amigas Rd")
	void AddressOfRecord4556() {
		assertEquals("2750 Las Amigas Rd", customers.get(4555).getAddress());
	}

	@Test
	@DisplayName("Record 4556: City is Napa")
	void CityOfRecord4556() {
		assertEquals("Napa", customers.get(4555).getCity());
	}

	@Test
	@DisplayName("Record 4556: County is Napa")
	void CountyOfRecord4556() {
		assertEquals("Napa", customers.get(4555).getCounty());
	}

	@Test
	@DisplayName("Record 4556: State is CA")
	void StateOfRecord4556() {
		assertEquals("CA", customers.get(4555).getState());
	}

	@Test
	@DisplayName("Record 4556: ZIP is 94559")
	void ZIPOfRecord4556() {
		assertEquals("94559", customers.get(4555).getZIP());
	}

	@Test
	@DisplayName("Record 4556: Phone is 707-226-1546")
	void PhoneOfRecord4556() {
		assertEquals("707-226-1546", customers.get(4555).getPhone());
	}

	@Test
	@DisplayName("Record 4556: Fax is 707-226-7599")
	void FaxOfRecord4556() {
		assertEquals("707-226-7599", customers.get(4555).getFax());
	}

	@Test
	@DisplayName("Record 4556: Email is luz@inscho.com")
	void EmailOfRecord4556() {
		assertEquals("luz@inscho.com", customers.get(4555).getEmail());
	}

	@Test
	@DisplayName("Record 4556: Web is http://www.luzinscho.com")
	void WebOfRecord4556() {
		assertEquals("http://www.luzinscho.com", customers.get(4555).getWeb());
	}
}
