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

@Tag("49")
class Record_1525 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1525: FirstName is Herminia")
	void FirstNameOfRecord1525() {
		assertEquals("Herminia", customers.get(1524).getFirstName());
	}

	@Test
	@DisplayName("Record 1525: LastName is Josue")
	void LastNameOfRecord1525() {
		assertEquals("Josue", customers.get(1524).getLastName());
	}

	@Test
	@DisplayName("Record 1525: Company is Acker, Danna M Esq")
	void CompanyOfRecord1525() {
		assertEquals("Acker, Danna M Esq", customers.get(1524).getCompany());
	}

	@Test
	@DisplayName("Record 1525: Address is 1000 25th St")
	void AddressOfRecord1525() {
		assertEquals("1000 25th St", customers.get(1524).getAddress());
	}

	@Test
	@DisplayName("Record 1525: City is San Francisco")
	void CityOfRecord1525() {
		assertEquals("San Francisco", customers.get(1524).getCity());
	}

	@Test
	@DisplayName("Record 1525: County is San Francisco")
	void CountyOfRecord1525() {
		assertEquals("San Francisco", customers.get(1524).getCounty());
	}

	@Test
	@DisplayName("Record 1525: State is CA")
	void StateOfRecord1525() {
		assertEquals("CA", customers.get(1524).getState());
	}

	@Test
	@DisplayName("Record 1525: ZIP is 94107")
	void ZIPOfRecord1525() {
		assertEquals("94107", customers.get(1524).getZIP());
	}

	@Test
	@DisplayName("Record 1525: Phone is 415-824-1180")
	void PhoneOfRecord1525() {
		assertEquals("415-824-1180", customers.get(1524).getPhone());
	}

	@Test
	@DisplayName("Record 1525: Fax is 415-824-8245")
	void FaxOfRecord1525() {
		assertEquals("415-824-8245", customers.get(1524).getFax());
	}

	@Test
	@DisplayName("Record 1525: Email is herminia@josue.com")
	void EmailOfRecord1525() {
		assertEquals("herminia@josue.com", customers.get(1524).getEmail());
	}

	@Test
	@DisplayName("Record 1525: Web is http://www.herminiajosue.com")
	void WebOfRecord1525() {
		assertEquals("http://www.herminiajosue.com", customers.get(1524).getWeb());
	}
}
