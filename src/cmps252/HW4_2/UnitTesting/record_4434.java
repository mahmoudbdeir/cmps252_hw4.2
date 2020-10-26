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

@Tag("43")
class Record_4434 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4434: FirstName is Homer")
	void FirstNameOfRecord4434() {
		assertEquals("Homer", customers.get(4433).getFirstName());
	}

	@Test
	@DisplayName("Record 4434: LastName is Angelovich")
	void LastNameOfRecord4434() {
		assertEquals("Angelovich", customers.get(4433).getLastName());
	}

	@Test
	@DisplayName("Record 4434: Company is Audiovisual Ltd")
	void CompanyOfRecord4434() {
		assertEquals("Audiovisual Ltd", customers.get(4433).getCompany());
	}

	@Test
	@DisplayName("Record 4434: Address is 29 Gilliland Ave")
	void AddressOfRecord4434() {
		assertEquals("29 Gilliland Ave", customers.get(4433).getAddress());
	}

	@Test
	@DisplayName("Record 4434: City is Dubois")
	void CityOfRecord4434() {
		assertEquals("Dubois", customers.get(4433).getCity());
	}

	@Test
	@DisplayName("Record 4434: County is Fremont")
	void CountyOfRecord4434() {
		assertEquals("Fremont", customers.get(4433).getCounty());
	}

	@Test
	@DisplayName("Record 4434: State is WY")
	void StateOfRecord4434() {
		assertEquals("WY", customers.get(4433).getState());
	}

	@Test
	@DisplayName("Record 4434: ZIP is 82513")
	void ZIPOfRecord4434() {
		assertEquals("82513", customers.get(4433).getZIP());
	}

	@Test
	@DisplayName("Record 4434: Phone is 307-455-3312")
	void PhoneOfRecord4434() {
		assertEquals("307-455-3312", customers.get(4433).getPhone());
	}

	@Test
	@DisplayName("Record 4434: Fax is 307-455-9371")
	void FaxOfRecord4434() {
		assertEquals("307-455-9371", customers.get(4433).getFax());
	}

	@Test
	@DisplayName("Record 4434: Email is homer@angelovich.com")
	void EmailOfRecord4434() {
		assertEquals("homer@angelovich.com", customers.get(4433).getEmail());
	}

	@Test
	@DisplayName("Record 4434: Web is http://www.homerangelovich.com")
	void WebOfRecord4434() {
		assertEquals("http://www.homerangelovich.com", customers.get(4433).getWeb());
	}
}
