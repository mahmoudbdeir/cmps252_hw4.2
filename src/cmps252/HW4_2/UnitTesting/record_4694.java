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
class Record_4694 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4694: FirstName is Gail")
	void FirstNameOfRecord4694() {
		assertEquals("Gail", customers.get(4693).getFirstName());
	}

	@Test
	@DisplayName("Record 4694: LastName is Vaccarino")
	void LastNameOfRecord4694() {
		assertEquals("Vaccarino", customers.get(4693).getLastName());
	}

	@Test
	@DisplayName("Record 4694: Company is Sheep Breeder Magazine")
	void CompanyOfRecord4694() {
		assertEquals("Sheep Breeder Magazine", customers.get(4693).getCompany());
	}

	@Test
	@DisplayName("Record 4694: Address is 1038 Terminal Way")
	void AddressOfRecord4694() {
		assertEquals("1038 Terminal Way", customers.get(4693).getAddress());
	}

	@Test
	@DisplayName("Record 4694: City is San Carlos")
	void CityOfRecord4694() {
		assertEquals("San Carlos", customers.get(4693).getCity());
	}

	@Test
	@DisplayName("Record 4694: County is San Mateo")
	void CountyOfRecord4694() {
		assertEquals("San Mateo", customers.get(4693).getCounty());
	}

	@Test
	@DisplayName("Record 4694: State is CA")
	void StateOfRecord4694() {
		assertEquals("CA", customers.get(4693).getState());
	}

	@Test
	@DisplayName("Record 4694: ZIP is 94070")
	void ZIPOfRecord4694() {
		assertEquals("94070", customers.get(4693).getZIP());
	}

	@Test
	@DisplayName("Record 4694: Phone is 650-592-6954")
	void PhoneOfRecord4694() {
		assertEquals("650-592-6954", customers.get(4693).getPhone());
	}

	@Test
	@DisplayName("Record 4694: Fax is 650-592-9334")
	void FaxOfRecord4694() {
		assertEquals("650-592-9334", customers.get(4693).getFax());
	}

	@Test
	@DisplayName("Record 4694: Email is gail@vaccarino.com")
	void EmailOfRecord4694() {
		assertEquals("gail@vaccarino.com", customers.get(4693).getEmail());
	}

	@Test
	@DisplayName("Record 4694: Web is http://www.gailvaccarino.com")
	void WebOfRecord4694() {
		assertEquals("http://www.gailvaccarino.com", customers.get(4693).getWeb());
	}
}
