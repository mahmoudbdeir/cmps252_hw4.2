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

@Tag("15")
class Record_4994 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4994: FirstName is Sebastian")
	void FirstNameOfRecord4994() {
		assertEquals("Sebastian", customers.get(4993).getFirstName());
	}

	@Test
	@DisplayName("Record 4994: LastName is Cordona")
	void LastNameOfRecord4994() {
		assertEquals("Cordona", customers.get(4993).getLastName());
	}

	@Test
	@DisplayName("Record 4994: Company is Messina Trucking Inc")
	void CompanyOfRecord4994() {
		assertEquals("Messina Trucking Inc", customers.get(4993).getCompany());
	}

	@Test
	@DisplayName("Record 4994: Address is 2173 Macdade Blvd")
	void AddressOfRecord4994() {
		assertEquals("2173 Macdade Blvd", customers.get(4993).getAddress());
	}

	@Test
	@DisplayName("Record 4994: City is Holmes")
	void CityOfRecord4994() {
		assertEquals("Holmes", customers.get(4993).getCity());
	}

	@Test
	@DisplayName("Record 4994: County is Delaware")
	void CountyOfRecord4994() {
		assertEquals("Delaware", customers.get(4993).getCounty());
	}

	@Test
	@DisplayName("Record 4994: State is PA")
	void StateOfRecord4994() {
		assertEquals("PA", customers.get(4993).getState());
	}

	@Test
	@DisplayName("Record 4994: ZIP is 19043")
	void ZIPOfRecord4994() {
		assertEquals("19043", customers.get(4993).getZIP());
	}

	@Test
	@DisplayName("Record 4994: Phone is 610-522-4143")
	void PhoneOfRecord4994() {
		assertEquals("610-522-4143", customers.get(4993).getPhone());
	}

	@Test
	@DisplayName("Record 4994: Fax is 610-522-7013")
	void FaxOfRecord4994() {
		assertEquals("610-522-7013", customers.get(4993).getFax());
	}

	@Test
	@DisplayName("Record 4994: Email is sebastian@cordona.com")
	void EmailOfRecord4994() {
		assertEquals("sebastian@cordona.com", customers.get(4993).getEmail());
	}

	@Test
	@DisplayName("Record 4994: Web is http://www.sebastiancordona.com")
	void WebOfRecord4994() {
		assertEquals("http://www.sebastiancordona.com", customers.get(4993).getWeb());
	}
}
