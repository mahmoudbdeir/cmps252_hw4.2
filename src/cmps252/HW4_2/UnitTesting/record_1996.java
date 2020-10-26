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

@Tag("33")
class Record_1996 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1996: FirstName is Kathryn")
	void FirstNameOfRecord1996() {
		assertEquals("Kathryn", customers.get(1995).getFirstName());
	}

	@Test
	@DisplayName("Record 1996: LastName is Gatewood")
	void LastNameOfRecord1996() {
		assertEquals("Gatewood", customers.get(1995).getLastName());
	}

	@Test
	@DisplayName("Record 1996: Company is Sjs Products Corp")
	void CompanyOfRecord1996() {
		assertEquals("Sjs Products Corp", customers.get(1995).getCompany());
	}

	@Test
	@DisplayName("Record 1996: Address is 847 N Troy St")
	void AddressOfRecord1996() {
		assertEquals("847 N Troy St", customers.get(1995).getAddress());
	}

	@Test
	@DisplayName("Record 1996: City is Chicago")
	void CityOfRecord1996() {
		assertEquals("Chicago", customers.get(1995).getCity());
	}

	@Test
	@DisplayName("Record 1996: County is Cook")
	void CountyOfRecord1996() {
		assertEquals("Cook", customers.get(1995).getCounty());
	}

	@Test
	@DisplayName("Record 1996: State is IL")
	void StateOfRecord1996() {
		assertEquals("IL", customers.get(1995).getState());
	}

	@Test
	@DisplayName("Record 1996: ZIP is 60622")
	void ZIPOfRecord1996() {
		assertEquals("60622", customers.get(1995).getZIP());
	}

	@Test
	@DisplayName("Record 1996: Phone is 773-638-1881")
	void PhoneOfRecord1996() {
		assertEquals("773-638-1881", customers.get(1995).getPhone());
	}

	@Test
	@DisplayName("Record 1996: Fax is 773-638-7634")
	void FaxOfRecord1996() {
		assertEquals("773-638-7634", customers.get(1995).getFax());
	}

	@Test
	@DisplayName("Record 1996: Email is kathryn@gatewood.com")
	void EmailOfRecord1996() {
		assertEquals("kathryn@gatewood.com", customers.get(1995).getEmail());
	}

	@Test
	@DisplayName("Record 1996: Web is http://www.kathryngatewood.com")
	void WebOfRecord1996() {
		assertEquals("http://www.kathryngatewood.com", customers.get(1995).getWeb());
	}
}
