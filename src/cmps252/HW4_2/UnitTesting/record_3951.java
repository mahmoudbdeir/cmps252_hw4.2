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

@Tag("1")
class Record_3951 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3951: FirstName is Lonny")
	void FirstNameOfRecord3951() {
		assertEquals("Lonny", customers.get(3950).getFirstName());
	}

	@Test
	@DisplayName("Record 3951: LastName is Rattan")
	void LastNameOfRecord3951() {
		assertEquals("Rattan", customers.get(3950).getLastName());
	}

	@Test
	@DisplayName("Record 3951: Company is R V Quinn Inc")
	void CompanyOfRecord3951() {
		assertEquals("R V Quinn Inc", customers.get(3950).getCompany());
	}

	@Test
	@DisplayName("Record 3951: Address is 847 Pleasant St")
	void AddressOfRecord3951() {
		assertEquals("847 Pleasant St", customers.get(3950).getAddress());
	}

	@Test
	@DisplayName("Record 3951: City is Fall River")
	void CityOfRecord3951() {
		assertEquals("Fall River", customers.get(3950).getCity());
	}

	@Test
	@DisplayName("Record 3951: County is Bristol")
	void CountyOfRecord3951() {
		assertEquals("Bristol", customers.get(3950).getCounty());
	}

	@Test
	@DisplayName("Record 3951: State is MA")
	void StateOfRecord3951() {
		assertEquals("MA", customers.get(3950).getState());
	}

	@Test
	@DisplayName("Record 3951: ZIP is 2723")
	void ZIPOfRecord3951() {
		assertEquals("2723", customers.get(3950).getZIP());
	}

	@Test
	@DisplayName("Record 3951: Phone is 508-677-4887")
	void PhoneOfRecord3951() {
		assertEquals("508-677-4887", customers.get(3950).getPhone());
	}

	@Test
	@DisplayName("Record 3951: Fax is 508-677-1863")
	void FaxOfRecord3951() {
		assertEquals("508-677-1863", customers.get(3950).getFax());
	}

	@Test
	@DisplayName("Record 3951: Email is lonny@rattan.com")
	void EmailOfRecord3951() {
		assertEquals("lonny@rattan.com", customers.get(3950).getEmail());
	}

	@Test
	@DisplayName("Record 3951: Web is http://www.lonnyrattan.com")
	void WebOfRecord3951() {
		assertEquals("http://www.lonnyrattan.com", customers.get(3950).getWeb());
	}
}
