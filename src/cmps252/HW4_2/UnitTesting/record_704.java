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
class Record_704 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 704: FirstName is Hollis")
	void FirstNameOfRecord704() {
		assertEquals("Hollis", customers.get(703).getFirstName());
	}

	@Test
	@DisplayName("Record 704: LastName is Tecson")
	void LastNameOfRecord704() {
		assertEquals("Tecson", customers.get(703).getLastName());
	}

	@Test
	@DisplayName("Record 704: Company is Nutri Prgm For Eldrly Essex Co")
	void CompanyOfRecord704() {
		assertEquals("Nutri Prgm For Eldrly Essex Co", customers.get(703).getCompany());
	}

	@Test
	@DisplayName("Record 704: Address is 27576 Commerce Center Dr")
	void AddressOfRecord704() {
		assertEquals("27576 Commerce Center Dr", customers.get(703).getAddress());
	}

	@Test
	@DisplayName("Record 704: City is Temecula")
	void CityOfRecord704() {
		assertEquals("Temecula", customers.get(703).getCity());
	}

	@Test
	@DisplayName("Record 704: County is Riverside")
	void CountyOfRecord704() {
		assertEquals("Riverside", customers.get(703).getCounty());
	}

	@Test
	@DisplayName("Record 704: State is CA")
	void StateOfRecord704() {
		assertEquals("CA", customers.get(703).getState());
	}

	@Test
	@DisplayName("Record 704: ZIP is 92590")
	void ZIPOfRecord704() {
		assertEquals("92590", customers.get(703).getZIP());
	}

	@Test
	@DisplayName("Record 704: Phone is 951-695-2401")
	void PhoneOfRecord704() {
		assertEquals("951-695-2401", customers.get(703).getPhone());
	}

	@Test
	@DisplayName("Record 704: Fax is 951-695-3405")
	void FaxOfRecord704() {
		assertEquals("951-695-3405", customers.get(703).getFax());
	}

	@Test
	@DisplayName("Record 704: Email is hollis@tecson.com")
	void EmailOfRecord704() {
		assertEquals("hollis@tecson.com", customers.get(703).getEmail());
	}

	@Test
	@DisplayName("Record 704: Web is http://www.hollistecson.com")
	void WebOfRecord704() {
		assertEquals("http://www.hollistecson.com", customers.get(703).getWeb());
	}
}
