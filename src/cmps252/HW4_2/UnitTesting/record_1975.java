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
class Record_1975 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1975: FirstName is Jana")
	void FirstNameOfRecord1975() {
		assertEquals("Jana", customers.get(1974).getFirstName());
	}

	@Test
	@DisplayName("Record 1975: LastName is Delk")
	void LastNameOfRecord1975() {
		assertEquals("Delk", customers.get(1974).getLastName());
	}

	@Test
	@DisplayName("Record 1975: Company is Camden Bar & Rstrnt Supl Co")
	void CompanyOfRecord1975() {
		assertEquals("Camden Bar & Rstrnt Supl Co", customers.get(1974).getCompany());
	}

	@Test
	@DisplayName("Record 1975: Address is 18 John St")
	void AddressOfRecord1975() {
		assertEquals("18 John St", customers.get(1974).getAddress());
	}

	@Test
	@DisplayName("Record 1975: City is New York")
	void CityOfRecord1975() {
		assertEquals("New York", customers.get(1974).getCity());
	}

	@Test
	@DisplayName("Record 1975: County is New York")
	void CountyOfRecord1975() {
		assertEquals("New York", customers.get(1974).getCounty());
	}

	@Test
	@DisplayName("Record 1975: State is NY")
	void StateOfRecord1975() {
		assertEquals("NY", customers.get(1974).getState());
	}

	@Test
	@DisplayName("Record 1975: ZIP is 10038")
	void ZIPOfRecord1975() {
		assertEquals("10038", customers.get(1974).getZIP());
	}

	@Test
	@DisplayName("Record 1975: Phone is 212-349-7226")
	void PhoneOfRecord1975() {
		assertEquals("212-349-7226", customers.get(1974).getPhone());
	}

	@Test
	@DisplayName("Record 1975: Fax is 212-349-1992")
	void FaxOfRecord1975() {
		assertEquals("212-349-1992", customers.get(1974).getFax());
	}

	@Test
	@DisplayName("Record 1975: Email is jana@delk.com")
	void EmailOfRecord1975() {
		assertEquals("jana@delk.com", customers.get(1974).getEmail());
	}

	@Test
	@DisplayName("Record 1975: Web is http://www.janadelk.com")
	void WebOfRecord1975() {
		assertEquals("http://www.janadelk.com", customers.get(1974).getWeb());
	}
}
