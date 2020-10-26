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

@Tag("3")
class Record_121 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 121: FirstName is Gino")
	void FirstNameOfRecord121() {
		assertEquals("Gino", customers.get(120).getFirstName());
	}

	@Test
	@DisplayName("Record 121: LastName is Naragon")
	void LastNameOfRecord121() {
		assertEquals("Naragon", customers.get(120).getLastName());
	}

	@Test
	@DisplayName("Record 121: Company is Lethert, Michael J")
	void CompanyOfRecord121() {
		assertEquals("Lethert, Michael J", customers.get(120).getCompany());
	}

	@Test
	@DisplayName("Record 121: Address is 24 Mechanic St")
	void AddressOfRecord121() {
		assertEquals("24 Mechanic St", customers.get(120).getAddress());
	}

	@Test
	@DisplayName("Record 121: City is Red Bank")
	void CityOfRecord121() {
		assertEquals("Red Bank", customers.get(120).getCity());
	}

	@Test
	@DisplayName("Record 121: County is Monmouth")
	void CountyOfRecord121() {
		assertEquals("Monmouth", customers.get(120).getCounty());
	}

	@Test
	@DisplayName("Record 121: State is NJ")
	void StateOfRecord121() {
		assertEquals("NJ", customers.get(120).getState());
	}

	@Test
	@DisplayName("Record 121: ZIP is 7701")
	void ZIPOfRecord121() {
		assertEquals("7701", customers.get(120).getZIP());
	}

	@Test
	@DisplayName("Record 121: Phone is 732-842-3403")
	void PhoneOfRecord121() {
		assertEquals("732-842-3403", customers.get(120).getPhone());
	}

	@Test
	@DisplayName("Record 121: Fax is 732-842-7621")
	void FaxOfRecord121() {
		assertEquals("732-842-7621", customers.get(120).getFax());
	}

	@Test
	@DisplayName("Record 121: Email is gino@naragon.com")
	void EmailOfRecord121() {
		assertEquals("gino@naragon.com", customers.get(120).getEmail());
	}

	@Test
	@DisplayName("Record 121: Web is http://www.ginonaragon.com")
	void WebOfRecord121() {
		assertEquals("http://www.ginonaragon.com", customers.get(120).getWeb());
	}
}
