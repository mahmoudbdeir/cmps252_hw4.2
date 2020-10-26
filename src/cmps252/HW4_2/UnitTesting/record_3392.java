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
class Record_3392 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3392: FirstName is Yong")
	void FirstNameOfRecord3392() {
		assertEquals("Yong", customers.get(3391).getFirstName());
	}

	@Test
	@DisplayName("Record 3392: LastName is Mullice")
	void LastNameOfRecord3392() {
		assertEquals("Mullice", customers.get(3391).getLastName());
	}

	@Test
	@DisplayName("Record 3392: Company is Kelble Bros Inc")
	void CompanyOfRecord3392() {
		assertEquals("Kelble Bros Inc", customers.get(3391).getCompany());
	}

	@Test
	@DisplayName("Record 3392: Address is 246 Lombard St")
	void AddressOfRecord3392() {
		assertEquals("246 Lombard St", customers.get(3391).getAddress());
	}

	@Test
	@DisplayName("Record 3392: City is Thousand Oaks")
	void CityOfRecord3392() {
		assertEquals("Thousand Oaks", customers.get(3391).getCity());
	}

	@Test
	@DisplayName("Record 3392: County is Ventura")
	void CountyOfRecord3392() {
		assertEquals("Ventura", customers.get(3391).getCounty());
	}

	@Test
	@DisplayName("Record 3392: State is CA")
	void StateOfRecord3392() {
		assertEquals("CA", customers.get(3391).getState());
	}

	@Test
	@DisplayName("Record 3392: ZIP is 91360")
	void ZIPOfRecord3392() {
		assertEquals("91360", customers.get(3391).getZIP());
	}

	@Test
	@DisplayName("Record 3392: Phone is 805-379-1752")
	void PhoneOfRecord3392() {
		assertEquals("805-379-1752", customers.get(3391).getPhone());
	}

	@Test
	@DisplayName("Record 3392: Fax is 805-379-8084")
	void FaxOfRecord3392() {
		assertEquals("805-379-8084", customers.get(3391).getFax());
	}

	@Test
	@DisplayName("Record 3392: Email is yong@mullice.com")
	void EmailOfRecord3392() {
		assertEquals("yong@mullice.com", customers.get(3391).getEmail());
	}

	@Test
	@DisplayName("Record 3392: Web is http://www.yongmullice.com")
	void WebOfRecord3392() {
		assertEquals("http://www.yongmullice.com", customers.get(3391).getWeb());
	}
}
