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
class Record_3560 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3560: FirstName is Lance")
	void FirstNameOfRecord3560() {
		assertEquals("Lance", customers.get(3559).getFirstName());
	}

	@Test
	@DisplayName("Record 3560: LastName is Olnes")
	void LastNameOfRecord3560() {
		assertEquals("Olnes", customers.get(3559).getLastName());
	}

	@Test
	@DisplayName("Record 3560: Company is Conroys Flowers")
	void CompanyOfRecord3560() {
		assertEquals("Conroys Flowers", customers.get(3559).getCompany());
	}

	@Test
	@DisplayName("Record 3560: Address is 42 W Chesapeake Ave")
	void AddressOfRecord3560() {
		assertEquals("42 W Chesapeake Ave", customers.get(3559).getAddress());
	}

	@Test
	@DisplayName("Record 3560: City is Towson")
	void CityOfRecord3560() {
		assertEquals("Towson", customers.get(3559).getCity());
	}

	@Test
	@DisplayName("Record 3560: County is Baltimore")
	void CountyOfRecord3560() {
		assertEquals("Baltimore", customers.get(3559).getCounty());
	}

	@Test
	@DisplayName("Record 3560: State is MD")
	void StateOfRecord3560() {
		assertEquals("MD", customers.get(3559).getState());
	}

	@Test
	@DisplayName("Record 3560: ZIP is 21204")
	void ZIPOfRecord3560() {
		assertEquals("21204", customers.get(3559).getZIP());
	}

	@Test
	@DisplayName("Record 3560: Phone is 410-337-7024")
	void PhoneOfRecord3560() {
		assertEquals("410-337-7024", customers.get(3559).getPhone());
	}

	@Test
	@DisplayName("Record 3560: Fax is 410-337-6561")
	void FaxOfRecord3560() {
		assertEquals("410-337-6561", customers.get(3559).getFax());
	}

	@Test
	@DisplayName("Record 3560: Email is lance@olnes.com")
	void EmailOfRecord3560() {
		assertEquals("lance@olnes.com", customers.get(3559).getEmail());
	}

	@Test
	@DisplayName("Record 3560: Web is http://www.lanceolnes.com")
	void WebOfRecord3560() {
		assertEquals("http://www.lanceolnes.com", customers.get(3559).getWeb());
	}
}
