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

@Tag("9")
class Record_3879 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3879: FirstName is Jessica")
	void FirstNameOfRecord3879() {
		assertEquals("Jessica", customers.get(3878).getFirstName());
	}

	@Test
	@DisplayName("Record 3879: LastName is Kess")
	void LastNameOfRecord3879() {
		assertEquals("Kess", customers.get(3878).getLastName());
	}

	@Test
	@DisplayName("Record 3879: Company is Caras & Associates Inc")
	void CompanyOfRecord3879() {
		assertEquals("Caras & Associates Inc", customers.get(3878).getCompany());
	}

	@Test
	@DisplayName("Record 3879: Address is 165 N Aviador St")
	void AddressOfRecord3879() {
		assertEquals("165 N Aviador St", customers.get(3878).getAddress());
	}

	@Test
	@DisplayName("Record 3879: City is Camarillo")
	void CityOfRecord3879() {
		assertEquals("Camarillo", customers.get(3878).getCity());
	}

	@Test
	@DisplayName("Record 3879: County is Ventura")
	void CountyOfRecord3879() {
		assertEquals("Ventura", customers.get(3878).getCounty());
	}

	@Test
	@DisplayName("Record 3879: State is CA")
	void StateOfRecord3879() {
		assertEquals("CA", customers.get(3878).getState());
	}

	@Test
	@DisplayName("Record 3879: ZIP is 93010")
	void ZIPOfRecord3879() {
		assertEquals("93010", customers.get(3878).getZIP());
	}

	@Test
	@DisplayName("Record 3879: Phone is 805-482-9643")
	void PhoneOfRecord3879() {
		assertEquals("805-482-9643", customers.get(3878).getPhone());
	}

	@Test
	@DisplayName("Record 3879: Fax is 805-482-4238")
	void FaxOfRecord3879() {
		assertEquals("805-482-4238", customers.get(3878).getFax());
	}

	@Test
	@DisplayName("Record 3879: Email is jessica@kess.com")
	void EmailOfRecord3879() {
		assertEquals("jessica@kess.com", customers.get(3878).getEmail());
	}

	@Test
	@DisplayName("Record 3879: Web is http://www.jessicakess.com")
	void WebOfRecord3879() {
		assertEquals("http://www.jessicakess.com", customers.get(3878).getWeb());
	}
}
