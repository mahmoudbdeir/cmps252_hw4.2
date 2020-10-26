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

@Tag("14")
class Record_3505 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3505: FirstName is Gayla")
	void FirstNameOfRecord3505() {
		assertEquals("Gayla", customers.get(3504).getFirstName());
	}

	@Test
	@DisplayName("Record 3505: LastName is Aquilera")
	void LastNameOfRecord3505() {
		assertEquals("Aquilera", customers.get(3504).getLastName());
	}

	@Test
	@DisplayName("Record 3505: Company is Brass Smith")
	void CompanyOfRecord3505() {
		assertEquals("Brass Smith", customers.get(3504).getCompany());
	}

	@Test
	@DisplayName("Record 3505: Address is 755 California Dr")
	void AddressOfRecord3505() {
		assertEquals("755 California Dr", customers.get(3504).getAddress());
	}

	@Test
	@DisplayName("Record 3505: City is Burlingame")
	void CityOfRecord3505() {
		assertEquals("Burlingame", customers.get(3504).getCity());
	}

	@Test
	@DisplayName("Record 3505: County is San Mateo")
	void CountyOfRecord3505() {
		assertEquals("San Mateo", customers.get(3504).getCounty());
	}

	@Test
	@DisplayName("Record 3505: State is CA")
	void StateOfRecord3505() {
		assertEquals("CA", customers.get(3504).getState());
	}

	@Test
	@DisplayName("Record 3505: ZIP is 94010")
	void ZIPOfRecord3505() {
		assertEquals("94010", customers.get(3504).getZIP());
	}

	@Test
	@DisplayName("Record 3505: Phone is 650-344-9223")
	void PhoneOfRecord3505() {
		assertEquals("650-344-9223", customers.get(3504).getPhone());
	}

	@Test
	@DisplayName("Record 3505: Fax is 650-344-2756")
	void FaxOfRecord3505() {
		assertEquals("650-344-2756", customers.get(3504).getFax());
	}

	@Test
	@DisplayName("Record 3505: Email is gayla@aquilera.com")
	void EmailOfRecord3505() {
		assertEquals("gayla@aquilera.com", customers.get(3504).getEmail());
	}

	@Test
	@DisplayName("Record 3505: Web is http://www.gaylaaquilera.com")
	void WebOfRecord3505() {
		assertEquals("http://www.gaylaaquilera.com", customers.get(3504).getWeb());
	}
}
