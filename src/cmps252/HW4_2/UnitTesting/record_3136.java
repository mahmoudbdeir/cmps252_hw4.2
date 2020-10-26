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
class Record_3136 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3136: FirstName is Julian")
	void FirstNameOfRecord3136() {
		assertEquals("Julian", customers.get(3135).getFirstName());
	}

	@Test
	@DisplayName("Record 3136: LastName is Escareno")
	void LastNameOfRecord3136() {
		assertEquals("Escareno", customers.get(3135).getLastName());
	}

	@Test
	@DisplayName("Record 3136: Company is Denali Mechanical Inc")
	void CompanyOfRecord3136() {
		assertEquals("Denali Mechanical Inc", customers.get(3135).getCompany());
	}

	@Test
	@DisplayName("Record 3136: Address is 17309 Roscoe Blvd")
	void AddressOfRecord3136() {
		assertEquals("17309 Roscoe Blvd", customers.get(3135).getAddress());
	}

	@Test
	@DisplayName("Record 3136: City is Northridge")
	void CityOfRecord3136() {
		assertEquals("Northridge", customers.get(3135).getCity());
	}

	@Test
	@DisplayName("Record 3136: County is Los Angeles")
	void CountyOfRecord3136() {
		assertEquals("Los Angeles", customers.get(3135).getCounty());
	}

	@Test
	@DisplayName("Record 3136: State is CA")
	void StateOfRecord3136() {
		assertEquals("CA", customers.get(3135).getState());
	}

	@Test
	@DisplayName("Record 3136: ZIP is 91325")
	void ZIPOfRecord3136() {
		assertEquals("91325", customers.get(3135).getZIP());
	}

	@Test
	@DisplayName("Record 3136: Phone is 818-996-5198")
	void PhoneOfRecord3136() {
		assertEquals("818-996-5198", customers.get(3135).getPhone());
	}

	@Test
	@DisplayName("Record 3136: Fax is 818-996-2812")
	void FaxOfRecord3136() {
		assertEquals("818-996-2812", customers.get(3135).getFax());
	}

	@Test
	@DisplayName("Record 3136: Email is julian@escareno.com")
	void EmailOfRecord3136() {
		assertEquals("julian@escareno.com", customers.get(3135).getEmail());
	}

	@Test
	@DisplayName("Record 3136: Web is http://www.julianescareno.com")
	void WebOfRecord3136() {
		assertEquals("http://www.julianescareno.com", customers.get(3135).getWeb());
	}
}
