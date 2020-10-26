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

@Tag("19")
class Record_100 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 100: FirstName is Harrison")
	void FirstNameOfRecord100() {
		assertEquals("Harrison", customers.get(99).getFirstName());
	}

	@Test
	@DisplayName("Record 100: LastName is Bunk")
	void LastNameOfRecord100() {
		assertEquals("Bunk", customers.get(99).getLastName());
	}

	@Test
	@DisplayName("Record 100: Company is Greene, Hersch Esq")
	void CompanyOfRecord100() {
		assertEquals("Greene, Hersch Esq", customers.get(99).getCompany());
	}

	@Test
	@DisplayName("Record 100: Address is 8635 Loch Raven Blvd")
	void AddressOfRecord100() {
		assertEquals("8635 Loch Raven Blvd", customers.get(99).getAddress());
	}

	@Test
	@DisplayName("Record 100: City is Towson")
	void CityOfRecord100() {
		assertEquals("Towson", customers.get(99).getCity());
	}

	@Test
	@DisplayName("Record 100: County is Baltimore")
	void CountyOfRecord100() {
		assertEquals("Baltimore", customers.get(99).getCounty());
	}

	@Test
	@DisplayName("Record 100: State is MD")
	void StateOfRecord100() {
		assertEquals("MD", customers.get(99).getState());
	}

	@Test
	@DisplayName("Record 100: ZIP is 21286")
	void ZIPOfRecord100() {
		assertEquals("21286", customers.get(99).getZIP());
	}

	@Test
	@DisplayName("Record 100: Phone is 410-665-9497")
	void PhoneOfRecord100() {
		assertEquals("410-665-9497", customers.get(99).getPhone());
	}

	@Test
	@DisplayName("Record 100: Fax is 410-665-3697")
	void FaxOfRecord100() {
		assertEquals("410-665-3697", customers.get(99).getFax());
	}

	@Test
	@DisplayName("Record 100: Email is harrison@bunk.com")
	void EmailOfRecord100() {
		assertEquals("harrison@bunk.com", customers.get(99).getEmail());
	}

	@Test
	@DisplayName("Record 100: Web is http://www.harrisonbunk.com")
	void WebOfRecord100() {
		assertEquals("http://www.harrisonbunk.com", customers.get(99).getWeb());
	}
}
