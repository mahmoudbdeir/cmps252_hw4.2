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
class Record_4565 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4565: FirstName is Francis")
	void FirstNameOfRecord4565() {
		assertEquals("Francis", customers.get(4564).getFirstName());
	}

	@Test
	@DisplayName("Record 4565: LastName is Schurkamp")
	void LastNameOfRecord4565() {
		assertEquals("Schurkamp", customers.get(4564).getLastName());
	}

	@Test
	@DisplayName("Record 4565: Company is Glahn, Wilbur A Iii")
	void CompanyOfRecord4565() {
		assertEquals("Glahn, Wilbur A Iii", customers.get(4564).getCompany());
	}

	@Test
	@DisplayName("Record 4565: Address is 1017 Turnpike St")
	void AddressOfRecord4565() {
		assertEquals("1017 Turnpike St", customers.get(4564).getAddress());
	}

	@Test
	@DisplayName("Record 4565: City is Canton")
	void CityOfRecord4565() {
		assertEquals("Canton", customers.get(4564).getCity());
	}

	@Test
	@DisplayName("Record 4565: County is Norfolk")
	void CountyOfRecord4565() {
		assertEquals("Norfolk", customers.get(4564).getCounty());
	}

	@Test
	@DisplayName("Record 4565: State is MA")
	void StateOfRecord4565() {
		assertEquals("MA", customers.get(4564).getState());
	}

	@Test
	@DisplayName("Record 4565: ZIP is 2021")
	void ZIPOfRecord4565() {
		assertEquals("2021", customers.get(4564).getZIP());
	}

	@Test
	@DisplayName("Record 4565: Phone is 781-828-2123")
	void PhoneOfRecord4565() {
		assertEquals("781-828-2123", customers.get(4564).getPhone());
	}

	@Test
	@DisplayName("Record 4565: Fax is 781-828-1261")
	void FaxOfRecord4565() {
		assertEquals("781-828-1261", customers.get(4564).getFax());
	}

	@Test
	@DisplayName("Record 4565: Email is francis@schurkamp.com")
	void EmailOfRecord4565() {
		assertEquals("francis@schurkamp.com", customers.get(4564).getEmail());
	}

	@Test
	@DisplayName("Record 4565: Web is http://www.francisschurkamp.com")
	void WebOfRecord4565() {
		assertEquals("http://www.francisschurkamp.com", customers.get(4564).getWeb());
	}
}
