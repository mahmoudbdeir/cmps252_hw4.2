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

@Tag("48")
class Record_821 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 821: FirstName is Nancy")
	void FirstNameOfRecord821() {
		assertEquals("Nancy", customers.get(820).getFirstName());
	}

	@Test
	@DisplayName("Record 821: LastName is Bowin")
	void LastNameOfRecord821() {
		assertEquals("Bowin", customers.get(820).getLastName());
	}

	@Test
	@DisplayName("Record 821: Company is Rone Funeral Service")
	void CompanyOfRecord821() {
		assertEquals("Rone Funeral Service", customers.get(820).getCompany());
	}

	@Test
	@DisplayName("Record 821: Address is 1316 E 24th St")
	void AddressOfRecord821() {
		assertEquals("1316 E 24th St", customers.get(820).getAddress());
	}

	@Test
	@DisplayName("Record 821: City is Minneapolis")
	void CityOfRecord821() {
		assertEquals("Minneapolis", customers.get(820).getCity());
	}

	@Test
	@DisplayName("Record 821: County is Hennepin")
	void CountyOfRecord821() {
		assertEquals("Hennepin", customers.get(820).getCounty());
	}

	@Test
	@DisplayName("Record 821: State is MN")
	void StateOfRecord821() {
		assertEquals("MN", customers.get(820).getState());
	}

	@Test
	@DisplayName("Record 821: ZIP is 55404")
	void ZIPOfRecord821() {
		assertEquals("55404", customers.get(820).getZIP());
	}

	@Test
	@DisplayName("Record 821: Phone is 612-722-5297")
	void PhoneOfRecord821() {
		assertEquals("612-722-5297", customers.get(820).getPhone());
	}

	@Test
	@DisplayName("Record 821: Fax is 612-722-9341")
	void FaxOfRecord821() {
		assertEquals("612-722-9341", customers.get(820).getFax());
	}

	@Test
	@DisplayName("Record 821: Email is nancy@bowin.com")
	void EmailOfRecord821() {
		assertEquals("nancy@bowin.com", customers.get(820).getEmail());
	}

	@Test
	@DisplayName("Record 821: Web is http://www.nancybowin.com")
	void WebOfRecord821() {
		assertEquals("http://www.nancybowin.com", customers.get(820).getWeb());
	}
}
