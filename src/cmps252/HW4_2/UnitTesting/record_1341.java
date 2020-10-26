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

@Tag("26")
class Record_1341 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1341: FirstName is Celeste")
	void FirstNameOfRecord1341() {
		assertEquals("Celeste", customers.get(1340).getFirstName());
	}

	@Test
	@DisplayName("Record 1341: LastName is Spraggins")
	void LastNameOfRecord1341() {
		assertEquals("Spraggins", customers.get(1340).getLastName());
	}

	@Test
	@DisplayName("Record 1341: Company is Speedi Sign")
	void CompanyOfRecord1341() {
		assertEquals("Speedi Sign", customers.get(1340).getCompany());
	}

	@Test
	@DisplayName("Record 1341: Address is 6515 Corporate Dr")
	void AddressOfRecord1341() {
		assertEquals("6515 Corporate Dr", customers.get(1340).getAddress());
	}

	@Test
	@DisplayName("Record 1341: City is Houston")
	void CityOfRecord1341() {
		assertEquals("Houston", customers.get(1340).getCity());
	}

	@Test
	@DisplayName("Record 1341: County is Harris")
	void CountyOfRecord1341() {
		assertEquals("Harris", customers.get(1340).getCounty());
	}

	@Test
	@DisplayName("Record 1341: State is TX")
	void StateOfRecord1341() {
		assertEquals("TX", customers.get(1340).getState());
	}

	@Test
	@DisplayName("Record 1341: ZIP is 77036")
	void ZIPOfRecord1341() {
		assertEquals("77036", customers.get(1340).getZIP());
	}

	@Test
	@DisplayName("Record 1341: Phone is 713-772-8761")
	void PhoneOfRecord1341() {
		assertEquals("713-772-8761", customers.get(1340).getPhone());
	}

	@Test
	@DisplayName("Record 1341: Fax is 713-772-6845")
	void FaxOfRecord1341() {
		assertEquals("713-772-6845", customers.get(1340).getFax());
	}

	@Test
	@DisplayName("Record 1341: Email is celeste@spraggins.com")
	void EmailOfRecord1341() {
		assertEquals("celeste@spraggins.com", customers.get(1340).getEmail());
	}

	@Test
	@DisplayName("Record 1341: Web is http://www.celestespraggins.com")
	void WebOfRecord1341() {
		assertEquals("http://www.celestespraggins.com", customers.get(1340).getWeb());
	}
}
