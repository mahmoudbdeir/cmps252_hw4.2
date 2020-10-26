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

@Tag("11")
class Record_3313 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3313: FirstName is Fay")
	void FirstNameOfRecord3313() {
		assertEquals("Fay", customers.get(3312).getFirstName());
	}

	@Test
	@DisplayName("Record 3313: LastName is Holy")
	void LastNameOfRecord3313() {
		assertEquals("Holy", customers.get(3312).getLastName());
	}

	@Test
	@DisplayName("Record 3313: Company is Rubber Stamp Shop")
	void CompanyOfRecord3313() {
		assertEquals("Rubber Stamp Shop", customers.get(3312).getCompany());
	}

	@Test
	@DisplayName("Record 3313: Address is 34 Peachtree St Nw")
	void AddressOfRecord3313() {
		assertEquals("34 Peachtree St Nw", customers.get(3312).getAddress());
	}

	@Test
	@DisplayName("Record 3313: City is Atlanta")
	void CityOfRecord3313() {
		assertEquals("Atlanta", customers.get(3312).getCity());
	}

	@Test
	@DisplayName("Record 3313: County is Fulton")
	void CountyOfRecord3313() {
		assertEquals("Fulton", customers.get(3312).getCounty());
	}

	@Test
	@DisplayName("Record 3313: State is GA")
	void StateOfRecord3313() {
		assertEquals("GA", customers.get(3312).getState());
	}

	@Test
	@DisplayName("Record 3313: ZIP is 30303")
	void ZIPOfRecord3313() {
		assertEquals("30303", customers.get(3312).getZIP());
	}

	@Test
	@DisplayName("Record 3313: Phone is 404-330-2393")
	void PhoneOfRecord3313() {
		assertEquals("404-330-2393", customers.get(3312).getPhone());
	}

	@Test
	@DisplayName("Record 3313: Fax is 404-330-6418")
	void FaxOfRecord3313() {
		assertEquals("404-330-6418", customers.get(3312).getFax());
	}

	@Test
	@DisplayName("Record 3313: Email is fay@holy.com")
	void EmailOfRecord3313() {
		assertEquals("fay@holy.com", customers.get(3312).getEmail());
	}

	@Test
	@DisplayName("Record 3313: Web is http://www.fayholy.com")
	void WebOfRecord3313() {
		assertEquals("http://www.fayholy.com", customers.get(3312).getWeb());
	}
}
