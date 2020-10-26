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
class Record_4033 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4033: FirstName is Jasmin")
	void FirstNameOfRecord4033() {
		assertEquals("Jasmin", customers.get(4032).getFirstName());
	}

	@Test
	@DisplayName("Record 4033: LastName is Dambrozio")
	void LastNameOfRecord4033() {
		assertEquals("Dambrozio", customers.get(4032).getLastName());
	}

	@Test
	@DisplayName("Record 4033: Company is Legend Homes Inc")
	void CompanyOfRecord4033() {
		assertEquals("Legend Homes Inc", customers.get(4032).getCompany());
	}

	@Test
	@DisplayName("Record 4033: Address is 16140 Vincennes Ave")
	void AddressOfRecord4033() {
		assertEquals("16140 Vincennes Ave", customers.get(4032).getAddress());
	}

	@Test
	@DisplayName("Record 4033: City is South Holland")
	void CityOfRecord4033() {
		assertEquals("South Holland", customers.get(4032).getCity());
	}

	@Test
	@DisplayName("Record 4033: County is Cook")
	void CountyOfRecord4033() {
		assertEquals("Cook", customers.get(4032).getCounty());
	}

	@Test
	@DisplayName("Record 4033: State is IL")
	void StateOfRecord4033() {
		assertEquals("IL", customers.get(4032).getState());
	}

	@Test
	@DisplayName("Record 4033: ZIP is 60473")
	void ZIPOfRecord4033() {
		assertEquals("60473", customers.get(4032).getZIP());
	}

	@Test
	@DisplayName("Record 4033: Phone is 708-331-1403")
	void PhoneOfRecord4033() {
		assertEquals("708-331-1403", customers.get(4032).getPhone());
	}

	@Test
	@DisplayName("Record 4033: Fax is 708-331-2537")
	void FaxOfRecord4033() {
		assertEquals("708-331-2537", customers.get(4032).getFax());
	}

	@Test
	@DisplayName("Record 4033: Email is jasmin@dambrozio.com")
	void EmailOfRecord4033() {
		assertEquals("jasmin@dambrozio.com", customers.get(4032).getEmail());
	}

	@Test
	@DisplayName("Record 4033: Web is http://www.jasmindambrozio.com")
	void WebOfRecord4033() {
		assertEquals("http://www.jasmindambrozio.com", customers.get(4032).getWeb());
	}
}
