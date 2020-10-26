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
class Record_4058 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4058: FirstName is Theron")
	void FirstNameOfRecord4058() {
		assertEquals("Theron", customers.get(4057).getFirstName());
	}

	@Test
	@DisplayName("Record 4058: LastName is Starch")
	void LastNameOfRecord4058() {
		assertEquals("Starch", customers.get(4057).getLastName());
	}

	@Test
	@DisplayName("Record 4058: Company is Details International Inc")
	void CompanyOfRecord4058() {
		assertEquals("Details International Inc", customers.get(4057).getCompany());
	}

	@Test
	@DisplayName("Record 4058: Address is 45 Rockefeller Plz")
	void AddressOfRecord4058() {
		assertEquals("45 Rockefeller Plz", customers.get(4057).getAddress());
	}

	@Test
	@DisplayName("Record 4058: City is New York")
	void CityOfRecord4058() {
		assertEquals("New York", customers.get(4057).getCity());
	}

	@Test
	@DisplayName("Record 4058: County is New York")
	void CountyOfRecord4058() {
		assertEquals("New York", customers.get(4057).getCounty());
	}

	@Test
	@DisplayName("Record 4058: State is NY")
	void StateOfRecord4058() {
		assertEquals("NY", customers.get(4057).getState());
	}

	@Test
	@DisplayName("Record 4058: ZIP is 10111")
	void ZIPOfRecord4058() {
		assertEquals("10111", customers.get(4057).getZIP());
	}

	@Test
	@DisplayName("Record 4058: Phone is 212-603-2437")
	void PhoneOfRecord4058() {
		assertEquals("212-603-2437", customers.get(4057).getPhone());
	}

	@Test
	@DisplayName("Record 4058: Fax is 212-603-4271")
	void FaxOfRecord4058() {
		assertEquals("212-603-4271", customers.get(4057).getFax());
	}

	@Test
	@DisplayName("Record 4058: Email is theron@starch.com")
	void EmailOfRecord4058() {
		assertEquals("theron@starch.com", customers.get(4057).getEmail());
	}

	@Test
	@DisplayName("Record 4058: Web is http://www.theronstarch.com")
	void WebOfRecord4058() {
		assertEquals("http://www.theronstarch.com", customers.get(4057).getWeb());
	}
}
