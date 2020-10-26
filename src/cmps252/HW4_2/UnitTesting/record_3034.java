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

@Tag("7")
class Record_3034 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3034: FirstName is Christa")
	void FirstNameOfRecord3034() {
		assertEquals("Christa", customers.get(3033).getFirstName());
	}

	@Test
	@DisplayName("Record 3034: LastName is Kyrnan")
	void LastNameOfRecord3034() {
		assertEquals("Kyrnan", customers.get(3033).getLastName());
	}

	@Test
	@DisplayName("Record 3034: Company is Schwartsman Wynstock Garaelik")
	void CompanyOfRecord3034() {
		assertEquals("Schwartsman Wynstock Garaelik", customers.get(3033).getCompany());
	}

	@Test
	@DisplayName("Record 3034: Address is 5021 Almaden Expy")
	void AddressOfRecord3034() {
		assertEquals("5021 Almaden Expy", customers.get(3033).getAddress());
	}

	@Test
	@DisplayName("Record 3034: City is San Jose")
	void CityOfRecord3034() {
		assertEquals("San Jose", customers.get(3033).getCity());
	}

	@Test
	@DisplayName("Record 3034: County is Santa Clara")
	void CountyOfRecord3034() {
		assertEquals("Santa Clara", customers.get(3033).getCounty());
	}

	@Test
	@DisplayName("Record 3034: State is CA")
	void StateOfRecord3034() {
		assertEquals("CA", customers.get(3033).getState());
	}

	@Test
	@DisplayName("Record 3034: ZIP is 95118")
	void ZIPOfRecord3034() {
		assertEquals("95118", customers.get(3033).getZIP());
	}

	@Test
	@DisplayName("Record 3034: Phone is 408-265-5260")
	void PhoneOfRecord3034() {
		assertEquals("408-265-5260", customers.get(3033).getPhone());
	}

	@Test
	@DisplayName("Record 3034: Fax is 408-265-1471")
	void FaxOfRecord3034() {
		assertEquals("408-265-1471", customers.get(3033).getFax());
	}

	@Test
	@DisplayName("Record 3034: Email is christa@kyrnan.com")
	void EmailOfRecord3034() {
		assertEquals("christa@kyrnan.com", customers.get(3033).getEmail());
	}

	@Test
	@DisplayName("Record 3034: Web is http://www.christakyrnan.com")
	void WebOfRecord3034() {
		assertEquals("http://www.christakyrnan.com", customers.get(3033).getWeb());
	}
}
