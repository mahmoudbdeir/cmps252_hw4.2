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
class Record_3305 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3305: FirstName is Lisa")
	void FirstNameOfRecord3305() {
		assertEquals("Lisa", customers.get(3304).getFirstName());
	}

	@Test
	@DisplayName("Record 3305: LastName is Wiederin")
	void LastNameOfRecord3305() {
		assertEquals("Wiederin", customers.get(3304).getLastName());
	}

	@Test
	@DisplayName("Record 3305: Company is Rosania, Joseph G Esq")
	void CompanyOfRecord3305() {
		assertEquals("Rosania, Joseph G Esq", customers.get(3304).getCompany());
	}

	@Test
	@DisplayName("Record 3305: Address is 243 W 30th St")
	void AddressOfRecord3305() {
		assertEquals("243 W 30th St", customers.get(3304).getAddress());
	}

	@Test
	@DisplayName("Record 3305: City is New York")
	void CityOfRecord3305() {
		assertEquals("New York", customers.get(3304).getCity());
	}

	@Test
	@DisplayName("Record 3305: County is New York")
	void CountyOfRecord3305() {
		assertEquals("New York", customers.get(3304).getCounty());
	}

	@Test
	@DisplayName("Record 3305: State is NY")
	void StateOfRecord3305() {
		assertEquals("NY", customers.get(3304).getState());
	}

	@Test
	@DisplayName("Record 3305: ZIP is 10001")
	void ZIPOfRecord3305() {
		assertEquals("10001", customers.get(3304).getZIP());
	}

	@Test
	@DisplayName("Record 3305: Phone is 212-643-8739")
	void PhoneOfRecord3305() {
		assertEquals("212-643-8739", customers.get(3304).getPhone());
	}

	@Test
	@DisplayName("Record 3305: Fax is 212-643-7624")
	void FaxOfRecord3305() {
		assertEquals("212-643-7624", customers.get(3304).getFax());
	}

	@Test
	@DisplayName("Record 3305: Email is lisa@wiederin.com")
	void EmailOfRecord3305() {
		assertEquals("lisa@wiederin.com", customers.get(3304).getEmail());
	}

	@Test
	@DisplayName("Record 3305: Web is http://www.lisawiederin.com")
	void WebOfRecord3305() {
		assertEquals("http://www.lisawiederin.com", customers.get(3304).getWeb());
	}
}
