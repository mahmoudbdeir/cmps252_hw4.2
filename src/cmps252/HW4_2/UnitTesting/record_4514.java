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

@Tag("42")
class Record_4514 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4514: FirstName is Stephen")
	void FirstNameOfRecord4514() {
		assertEquals("Stephen", customers.get(4513).getFirstName());
	}

	@Test
	@DisplayName("Record 4514: LastName is Mcgriff")
	void LastNameOfRecord4514() {
		assertEquals("Mcgriff", customers.get(4513).getLastName());
	}

	@Test
	@DisplayName("Record 4514: Company is Olson, Matt")
	void CompanyOfRecord4514() {
		assertEquals("Olson, Matt", customers.get(4513).getCompany());
	}

	@Test
	@DisplayName("Record 4514: Address is 2920 Nw 79th Ave")
	void AddressOfRecord4514() {
		assertEquals("2920 Nw 79th Ave", customers.get(4513).getAddress());
	}

	@Test
	@DisplayName("Record 4514: City is Miami")
	void CityOfRecord4514() {
		assertEquals("Miami", customers.get(4513).getCity());
	}

	@Test
	@DisplayName("Record 4514: County is Miami-Dade")
	void CountyOfRecord4514() {
		assertEquals("Miami-Dade", customers.get(4513).getCounty());
	}

	@Test
	@DisplayName("Record 4514: State is FL")
	void StateOfRecord4514() {
		assertEquals("FL", customers.get(4513).getState());
	}

	@Test
	@DisplayName("Record 4514: ZIP is 33122")
	void ZIPOfRecord4514() {
		assertEquals("33122", customers.get(4513).getZIP());
	}

	@Test
	@DisplayName("Record 4514: Phone is 305-477-3660")
	void PhoneOfRecord4514() {
		assertEquals("305-477-3660", customers.get(4513).getPhone());
	}

	@Test
	@DisplayName("Record 4514: Fax is 305-477-0038")
	void FaxOfRecord4514() {
		assertEquals("305-477-0038", customers.get(4513).getFax());
	}

	@Test
	@DisplayName("Record 4514: Email is stephen@mcgriff.com")
	void EmailOfRecord4514() {
		assertEquals("stephen@mcgriff.com", customers.get(4513).getEmail());
	}

	@Test
	@DisplayName("Record 4514: Web is http://www.stephenmcgriff.com")
	void WebOfRecord4514() {
		assertEquals("http://www.stephenmcgriff.com", customers.get(4513).getWeb());
	}
}
