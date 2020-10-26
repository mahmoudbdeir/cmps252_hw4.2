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

@Tag("27")
class Record_3720 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3720: FirstName is Geraldo")
	void FirstNameOfRecord3720() {
		assertEquals("Geraldo", customers.get(3719).getFirstName());
	}

	@Test
	@DisplayName("Record 3720: LastName is Bonamo")
	void LastNameOfRecord3720() {
		assertEquals("Bonamo", customers.get(3719).getLastName());
	}

	@Test
	@DisplayName("Record 3720: Company is Thomas Tvert Inc")
	void CompanyOfRecord3720() {
		assertEquals("Thomas Tvert Inc", customers.get(3719).getCompany());
	}

	@Test
	@DisplayName("Record 3720: Address is 16730 Schoenborn St")
	void AddressOfRecord3720() {
		assertEquals("16730 Schoenborn St", customers.get(3719).getAddress());
	}

	@Test
	@DisplayName("Record 3720: City is North Hills")
	void CityOfRecord3720() {
		assertEquals("North Hills", customers.get(3719).getCity());
	}

	@Test
	@DisplayName("Record 3720: County is Los Angeles")
	void CountyOfRecord3720() {
		assertEquals("Los Angeles", customers.get(3719).getCounty());
	}

	@Test
	@DisplayName("Record 3720: State is CA")
	void StateOfRecord3720() {
		assertEquals("CA", customers.get(3719).getState());
	}

	@Test
	@DisplayName("Record 3720: ZIP is 91343")
	void ZIPOfRecord3720() {
		assertEquals("91343", customers.get(3719).getZIP());
	}

	@Test
	@DisplayName("Record 3720: Phone is 818-894-0895")
	void PhoneOfRecord3720() {
		assertEquals("818-894-0895", customers.get(3719).getPhone());
	}

	@Test
	@DisplayName("Record 3720: Fax is 818-894-1885")
	void FaxOfRecord3720() {
		assertEquals("818-894-1885", customers.get(3719).getFax());
	}

	@Test
	@DisplayName("Record 3720: Email is geraldo@bonamo.com")
	void EmailOfRecord3720() {
		assertEquals("geraldo@bonamo.com", customers.get(3719).getEmail());
	}

	@Test
	@DisplayName("Record 3720: Web is http://www.geraldobonamo.com")
	void WebOfRecord3720() {
		assertEquals("http://www.geraldobonamo.com", customers.get(3719).getWeb());
	}
}
