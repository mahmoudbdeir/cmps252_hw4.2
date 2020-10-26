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

@Tag("9")
class Record_3350 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3350: FirstName is Sofia")
	void FirstNameOfRecord3350() {
		assertEquals("Sofia", customers.get(3349).getFirstName());
	}

	@Test
	@DisplayName("Record 3350: LastName is Mostyn")
	void LastNameOfRecord3350() {
		assertEquals("Mostyn", customers.get(3349).getLastName());
	}

	@Test
	@DisplayName("Record 3350: Company is Best Western Casa Grande Inn")
	void CompanyOfRecord3350() {
		assertEquals("Best Western Casa Grande Inn", customers.get(3349).getCompany());
	}

	@Test
	@DisplayName("Record 3350: Address is 8144 Walnut Hill Ln")
	void AddressOfRecord3350() {
		assertEquals("8144 Walnut Hill Ln", customers.get(3349).getAddress());
	}

	@Test
	@DisplayName("Record 3350: City is Dallas")
	void CityOfRecord3350() {
		assertEquals("Dallas", customers.get(3349).getCity());
	}

	@Test
	@DisplayName("Record 3350: County is Dallas")
	void CountyOfRecord3350() {
		assertEquals("Dallas", customers.get(3349).getCounty());
	}

	@Test
	@DisplayName("Record 3350: State is TX")
	void StateOfRecord3350() {
		assertEquals("TX", customers.get(3349).getState());
	}

	@Test
	@DisplayName("Record 3350: ZIP is 75231")
	void ZIPOfRecord3350() {
		assertEquals("75231", customers.get(3349).getZIP());
	}

	@Test
	@DisplayName("Record 3350: Phone is 214-361-8767")
	void PhoneOfRecord3350() {
		assertEquals("214-361-8767", customers.get(3349).getPhone());
	}

	@Test
	@DisplayName("Record 3350: Fax is 214-361-1551")
	void FaxOfRecord3350() {
		assertEquals("214-361-1551", customers.get(3349).getFax());
	}

	@Test
	@DisplayName("Record 3350: Email is sofia@mostyn.com")
	void EmailOfRecord3350() {
		assertEquals("sofia@mostyn.com", customers.get(3349).getEmail());
	}

	@Test
	@DisplayName("Record 3350: Web is http://www.sofiamostyn.com")
	void WebOfRecord3350() {
		assertEquals("http://www.sofiamostyn.com", customers.get(3349).getWeb());
	}
}
