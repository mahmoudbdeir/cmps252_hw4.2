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

@Tag("20")
class Record_2707 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2707: FirstName is Eugene")
	void FirstNameOfRecord2707() {
		assertEquals("Eugene", customers.get(2706).getFirstName());
	}

	@Test
	@DisplayName("Record 2707: LastName is Munro")
	void LastNameOfRecord2707() {
		assertEquals("Munro", customers.get(2706).getLastName());
	}

	@Test
	@DisplayName("Record 2707: Company is Schram, Steven H Esq")
	void CompanyOfRecord2707() {
		assertEquals("Schram, Steven H Esq", customers.get(2706).getCompany());
	}

	@Test
	@DisplayName("Record 2707: Address is 1408 Courtesy Rd")
	void AddressOfRecord2707() {
		assertEquals("1408 Courtesy Rd", customers.get(2706).getAddress());
	}

	@Test
	@DisplayName("Record 2707: City is High Point")
	void CityOfRecord2707() {
		assertEquals("High Point", customers.get(2706).getCity());
	}

	@Test
	@DisplayName("Record 2707: County is Guilford")
	void CountyOfRecord2707() {
		assertEquals("Guilford", customers.get(2706).getCounty());
	}

	@Test
	@DisplayName("Record 2707: State is NC")
	void StateOfRecord2707() {
		assertEquals("NC", customers.get(2706).getState());
	}

	@Test
	@DisplayName("Record 2707: ZIP is 27260")
	void ZIPOfRecord2707() {
		assertEquals("27260", customers.get(2706).getZIP());
	}

	@Test
	@DisplayName("Record 2707: Phone is 336-885-3509")
	void PhoneOfRecord2707() {
		assertEquals("336-885-3509", customers.get(2706).getPhone());
	}

	@Test
	@DisplayName("Record 2707: Fax is 336-885-6919")
	void FaxOfRecord2707() {
		assertEquals("336-885-6919", customers.get(2706).getFax());
	}

	@Test
	@DisplayName("Record 2707: Email is eugene@munro.com")
	void EmailOfRecord2707() {
		assertEquals("eugene@munro.com", customers.get(2706).getEmail());
	}

	@Test
	@DisplayName("Record 2707: Web is http://www.eugenemunro.com")
	void WebOfRecord2707() {
		assertEquals("http://www.eugenemunro.com", customers.get(2706).getWeb());
	}
}
