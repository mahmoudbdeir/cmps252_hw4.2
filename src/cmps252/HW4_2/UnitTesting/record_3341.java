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

@Tag("7")
class Record_3341 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3341: FirstName is Antione")
	void FirstNameOfRecord3341() {
		assertEquals("Antione", customers.get(3340).getFirstName());
	}

	@Test
	@DisplayName("Record 3341: LastName is Loeblyn")
	void LastNameOfRecord3341() {
		assertEquals("Loeblyn", customers.get(3340).getLastName());
	}

	@Test
	@DisplayName("Record 3341: Company is Womens Internatl Bowl Congres")
	void CompanyOfRecord3341() {
		assertEquals("Womens Internatl Bowl Congres", customers.get(3340).getCompany());
	}

	@Test
	@DisplayName("Record 3341: Address is 939 Laurel St")
	void AddressOfRecord3341() {
		assertEquals("939 Laurel St", customers.get(3340).getAddress());
	}

	@Test
	@DisplayName("Record 3341: City is San Carlos")
	void CityOfRecord3341() {
		assertEquals("San Carlos", customers.get(3340).getCity());
	}

	@Test
	@DisplayName("Record 3341: County is San Mateo")
	void CountyOfRecord3341() {
		assertEquals("San Mateo", customers.get(3340).getCounty());
	}

	@Test
	@DisplayName("Record 3341: State is CA")
	void StateOfRecord3341() {
		assertEquals("CA", customers.get(3340).getState());
	}

	@Test
	@DisplayName("Record 3341: ZIP is 94070")
	void ZIPOfRecord3341() {
		assertEquals("94070", customers.get(3340).getZIP());
	}

	@Test
	@DisplayName("Record 3341: Phone is 650-637-4556")
	void PhoneOfRecord3341() {
		assertEquals("650-637-4556", customers.get(3340).getPhone());
	}

	@Test
	@DisplayName("Record 3341: Fax is 650-637-5495")
	void FaxOfRecord3341() {
		assertEquals("650-637-5495", customers.get(3340).getFax());
	}

	@Test
	@DisplayName("Record 3341: Email is antione@loeblyn.com")
	void EmailOfRecord3341() {
		assertEquals("antione@loeblyn.com", customers.get(3340).getEmail());
	}

	@Test
	@DisplayName("Record 3341: Web is http://www.antioneloeblyn.com")
	void WebOfRecord3341() {
		assertEquals("http://www.antioneloeblyn.com", customers.get(3340).getWeb());
	}
}
