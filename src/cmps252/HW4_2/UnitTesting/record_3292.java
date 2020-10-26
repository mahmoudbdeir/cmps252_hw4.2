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

@Tag("37")
class Record_3292 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3292: FirstName is Dewey")
	void FirstNameOfRecord3292() {
		assertEquals("Dewey", customers.get(3291).getFirstName());
	}

	@Test
	@DisplayName("Record 3292: LastName is Llanos")
	void LastNameOfRecord3292() {
		assertEquals("Llanos", customers.get(3291).getLastName());
	}

	@Test
	@DisplayName("Record 3292: Company is Red Roof Inns")
	void CompanyOfRecord3292() {
		assertEquals("Red Roof Inns", customers.get(3291).getCompany());
	}

	@Test
	@DisplayName("Record 3292: Address is 2711 Teague Rd  #-427")
	void AddressOfRecord3292() {
		assertEquals("2711 Teague Rd  #-427", customers.get(3291).getAddress());
	}

	@Test
	@DisplayName("Record 3292: City is Houston")
	void CityOfRecord3292() {
		assertEquals("Houston", customers.get(3291).getCity());
	}

	@Test
	@DisplayName("Record 3292: County is Harris")
	void CountyOfRecord3292() {
		assertEquals("Harris", customers.get(3291).getCounty());
	}

	@Test
	@DisplayName("Record 3292: State is TX")
	void StateOfRecord3292() {
		assertEquals("TX", customers.get(3291).getState());
	}

	@Test
	@DisplayName("Record 3292: ZIP is 77080")
	void ZIPOfRecord3292() {
		assertEquals("77080", customers.get(3291).getZIP());
	}

	@Test
	@DisplayName("Record 3292: Phone is 713-690-2497")
	void PhoneOfRecord3292() {
		assertEquals("713-690-2497", customers.get(3291).getPhone());
	}

	@Test
	@DisplayName("Record 3292: Fax is 713-690-9982")
	void FaxOfRecord3292() {
		assertEquals("713-690-9982", customers.get(3291).getFax());
	}

	@Test
	@DisplayName("Record 3292: Email is dewey@llanos.com")
	void EmailOfRecord3292() {
		assertEquals("dewey@llanos.com", customers.get(3291).getEmail());
	}

	@Test
	@DisplayName("Record 3292: Web is http://www.deweyllanos.com")
	void WebOfRecord3292() {
		assertEquals("http://www.deweyllanos.com", customers.get(3291).getWeb());
	}
}
