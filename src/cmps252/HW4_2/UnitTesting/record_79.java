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

@Tag("21")
class Record_79 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 79: FirstName is Virgilio")
	void FirstNameOfRecord79() {
		assertEquals("Virgilio", customers.get(78).getFirstName());
	}

	@Test
	@DisplayName("Record 79: LastName is Vallas")
	void LastNameOfRecord79() {
		assertEquals("Vallas", customers.get(78).getLastName());
	}

	@Test
	@DisplayName("Record 79: Company is Badger Package Express")
	void CompanyOfRecord79() {
		assertEquals("Badger Package Express", customers.get(78).getCompany());
	}

	@Test
	@DisplayName("Record 79: Address is 2364 Sw 8th St")
	void AddressOfRecord79() {
		assertEquals("2364 Sw 8th St", customers.get(78).getAddress());
	}

	@Test
	@DisplayName("Record 79: City is Miami")
	void CityOfRecord79() {
		assertEquals("Miami", customers.get(78).getCity());
	}

	@Test
	@DisplayName("Record 79: County is Miami-Dade")
	void CountyOfRecord79() {
		assertEquals("Miami-Dade", customers.get(78).getCounty());
	}

	@Test
	@DisplayName("Record 79: State is FL")
	void StateOfRecord79() {
		assertEquals("FL", customers.get(78).getState());
	}

	@Test
	@DisplayName("Record 79: ZIP is 33135")
	void ZIPOfRecord79() {
		assertEquals("33135", customers.get(78).getZIP());
	}

	@Test
	@DisplayName("Record 79: Phone is 305-643-5008")
	void PhoneOfRecord79() {
		assertEquals("305-643-5008", customers.get(78).getPhone());
	}

	@Test
	@DisplayName("Record 79: Fax is 305-643-7944")
	void FaxOfRecord79() {
		assertEquals("305-643-7944", customers.get(78).getFax());
	}

	@Test
	@DisplayName("Record 79: Email is virgilio@vallas.com")
	void EmailOfRecord79() {
		assertEquals("virgilio@vallas.com", customers.get(78).getEmail());
	}

	@Test
	@DisplayName("Record 79: Web is http://www.virgiliovallas.com")
	void WebOfRecord79() {
		assertEquals("http://www.virgiliovallas.com", customers.get(78).getWeb());
	}
}
