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

@Tag("2")
class Record_959 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 959: FirstName is Marsha")
	void FirstNameOfRecord959() {
		assertEquals("Marsha", customers.get(958).getFirstName());
	}

	@Test
	@DisplayName("Record 959: LastName is Frueh")
	void LastNameOfRecord959() {
		assertEquals("Frueh", customers.get(958).getLastName());
	}

	@Test
	@DisplayName("Record 959: Company is Alamo Machine Works Inc")
	void CompanyOfRecord959() {
		assertEquals("Alamo Machine Works Inc", customers.get(958).getCompany());
	}

	@Test
	@DisplayName("Record 959: Address is 98128 Aiea Hyghts")
	void AddressOfRecord959() {
		assertEquals("98128 Aiea Hyghts", customers.get(958).getAddress());
	}

	@Test
	@DisplayName("Record 959: City is Aiea")
	void CityOfRecord959() {
		assertEquals("Aiea", customers.get(958).getCity());
	}

	@Test
	@DisplayName("Record 959: County is Honolulu")
	void CountyOfRecord959() {
		assertEquals("Honolulu", customers.get(958).getCounty());
	}

	@Test
	@DisplayName("Record 959: State is HI")
	void StateOfRecord959() {
		assertEquals("HI", customers.get(958).getState());
	}

	@Test
	@DisplayName("Record 959: ZIP is 96701")
	void ZIPOfRecord959() {
		assertEquals("96701", customers.get(958).getZIP());
	}

	@Test
	@DisplayName("Record 959: Phone is 808-486-3823")
	void PhoneOfRecord959() {
		assertEquals("808-486-3823", customers.get(958).getPhone());
	}

	@Test
	@DisplayName("Record 959: Fax is 808-486-2217")
	void FaxOfRecord959() {
		assertEquals("808-486-2217", customers.get(958).getFax());
	}

	@Test
	@DisplayName("Record 959: Email is marsha@frueh.com")
	void EmailOfRecord959() {
		assertEquals("marsha@frueh.com", customers.get(958).getEmail());
	}

	@Test
	@DisplayName("Record 959: Web is http://www.marshafrueh.com")
	void WebOfRecord959() {
		assertEquals("http://www.marshafrueh.com", customers.get(958).getWeb());
	}
}
