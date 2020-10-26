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

@Tag("0")
class Record_3692 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3692: FirstName is Hilario")
	void FirstNameOfRecord3692() {
		assertEquals("Hilario", customers.get(3691).getFirstName());
	}

	@Test
	@DisplayName("Record 3692: LastName is Ertle")
	void LastNameOfRecord3692() {
		assertEquals("Ertle", customers.get(3691).getLastName());
	}

	@Test
	@DisplayName("Record 3692: Company is Buschneck Machine & Tool Co")
	void CompanyOfRecord3692() {
		assertEquals("Buschneck Machine & Tool Co", customers.get(3691).getCompany());
	}

	@Test
	@DisplayName("Record 3692: Address is 5210 Commerce Cir")
	void AddressOfRecord3692() {
		assertEquals("5210 Commerce Cir", customers.get(3691).getAddress());
	}

	@Test
	@DisplayName("Record 3692: City is Indianapolis")
	void CityOfRecord3692() {
		assertEquals("Indianapolis", customers.get(3691).getCity());
	}

	@Test
	@DisplayName("Record 3692: County is Marion")
	void CountyOfRecord3692() {
		assertEquals("Marion", customers.get(3691).getCounty());
	}

	@Test
	@DisplayName("Record 3692: State is IN")
	void StateOfRecord3692() {
		assertEquals("IN", customers.get(3691).getState());
	}

	@Test
	@DisplayName("Record 3692: ZIP is 46237")
	void ZIPOfRecord3692() {
		assertEquals("46237", customers.get(3691).getZIP());
	}

	@Test
	@DisplayName("Record 3692: Phone is 317-885-3747")
	void PhoneOfRecord3692() {
		assertEquals("317-885-3747", customers.get(3691).getPhone());
	}

	@Test
	@DisplayName("Record 3692: Fax is 317-885-2039")
	void FaxOfRecord3692() {
		assertEquals("317-885-2039", customers.get(3691).getFax());
	}

	@Test
	@DisplayName("Record 3692: Email is hilario@ertle.com")
	void EmailOfRecord3692() {
		assertEquals("hilario@ertle.com", customers.get(3691).getEmail());
	}

	@Test
	@DisplayName("Record 3692: Web is http://www.hilarioertle.com")
	void WebOfRecord3692() {
		assertEquals("http://www.hilarioertle.com", customers.get(3691).getWeb());
	}
}
