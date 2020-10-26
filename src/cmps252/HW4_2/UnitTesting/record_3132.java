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
class Record_3132 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3132: FirstName is Robt")
	void FirstNameOfRecord3132() {
		assertEquals("Robt", customers.get(3131).getFirstName());
	}

	@Test
	@DisplayName("Record 3132: LastName is Ringlyn")
	void LastNameOfRecord3132() {
		assertEquals("Ringlyn", customers.get(3131).getLastName());
	}

	@Test
	@DisplayName("Record 3132: Company is Cummings Business Machines")
	void CompanyOfRecord3132() {
		assertEquals("Cummings Business Machines", customers.get(3131).getCompany());
	}

	@Test
	@DisplayName("Record 3132: Address is 415 Park Ave")
	void AddressOfRecord3132() {
		assertEquals("415 Park Ave", customers.get(3131).getAddress());
	}

	@Test
	@DisplayName("Record 3132: City is San Fernando")
	void CityOfRecord3132() {
		assertEquals("San Fernando", customers.get(3131).getCity());
	}

	@Test
	@DisplayName("Record 3132: County is Los Angeles")
	void CountyOfRecord3132() {
		assertEquals("Los Angeles", customers.get(3131).getCounty());
	}

	@Test
	@DisplayName("Record 3132: State is CA")
	void StateOfRecord3132() {
		assertEquals("CA", customers.get(3131).getState());
	}

	@Test
	@DisplayName("Record 3132: ZIP is 91340")
	void ZIPOfRecord3132() {
		assertEquals("91340", customers.get(3131).getZIP());
	}

	@Test
	@DisplayName("Record 3132: Phone is 818-361-6934")
	void PhoneOfRecord3132() {
		assertEquals("818-361-6934", customers.get(3131).getPhone());
	}

	@Test
	@DisplayName("Record 3132: Fax is 818-361-3831")
	void FaxOfRecord3132() {
		assertEquals("818-361-3831", customers.get(3131).getFax());
	}

	@Test
	@DisplayName("Record 3132: Email is robt@ringlyn.com")
	void EmailOfRecord3132() {
		assertEquals("robt@ringlyn.com", customers.get(3131).getEmail());
	}

	@Test
	@DisplayName("Record 3132: Web is http://www.robtringlyn.com")
	void WebOfRecord3132() {
		assertEquals("http://www.robtringlyn.com", customers.get(3131).getWeb());
	}
}
