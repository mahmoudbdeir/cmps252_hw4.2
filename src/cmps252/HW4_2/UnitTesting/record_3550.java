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

@Tag("44")
class Record_3550 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3550: FirstName is Marci")
	void FirstNameOfRecord3550() {
		assertEquals("Marci", customers.get(3549).getFirstName());
	}

	@Test
	@DisplayName("Record 3550: LastName is Derflinger")
	void LastNameOfRecord3550() {
		assertEquals("Derflinger", customers.get(3549).getLastName());
	}

	@Test
	@DisplayName("Record 3550: Company is Niarchos, Celeste R Esq")
	void CompanyOfRecord3550() {
		assertEquals("Niarchos, Celeste R Esq", customers.get(3549).getCompany());
	}

	@Test
	@DisplayName("Record 3550: Address is 11604 Hart St")
	void AddressOfRecord3550() {
		assertEquals("11604 Hart St", customers.get(3549).getAddress());
	}

	@Test
	@DisplayName("Record 3550: City is North Hollywood")
	void CityOfRecord3550() {
		assertEquals("North Hollywood", customers.get(3549).getCity());
	}

	@Test
	@DisplayName("Record 3550: County is Los Angeles")
	void CountyOfRecord3550() {
		assertEquals("Los Angeles", customers.get(3549).getCounty());
	}

	@Test
	@DisplayName("Record 3550: State is CA")
	void StateOfRecord3550() {
		assertEquals("CA", customers.get(3549).getState());
	}

	@Test
	@DisplayName("Record 3550: ZIP is 91605")
	void ZIPOfRecord3550() {
		assertEquals("91605", customers.get(3549).getZIP());
	}

	@Test
	@DisplayName("Record 3550: Phone is 818-982-6299")
	void PhoneOfRecord3550() {
		assertEquals("818-982-6299", customers.get(3549).getPhone());
	}

	@Test
	@DisplayName("Record 3550: Fax is 818-982-9514")
	void FaxOfRecord3550() {
		assertEquals("818-982-9514", customers.get(3549).getFax());
	}

	@Test
	@DisplayName("Record 3550: Email is marci@derflinger.com")
	void EmailOfRecord3550() {
		assertEquals("marci@derflinger.com", customers.get(3549).getEmail());
	}

	@Test
	@DisplayName("Record 3550: Web is http://www.marciderflinger.com")
	void WebOfRecord3550() {
		assertEquals("http://www.marciderflinger.com", customers.get(3549).getWeb());
	}
}
