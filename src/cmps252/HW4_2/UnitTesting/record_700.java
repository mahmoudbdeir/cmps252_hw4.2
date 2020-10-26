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
class Record_700 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 700: FirstName is Geraldine")
	void FirstNameOfRecord700() {
		assertEquals("Geraldine", customers.get(699).getFirstName());
	}

	@Test
	@DisplayName("Record 700: LastName is Asif")
	void LastNameOfRecord700() {
		assertEquals("Asif", customers.get(699).getLastName());
	}

	@Test
	@DisplayName("Record 700: Company is Martinez Inc")
	void CompanyOfRecord700() {
		assertEquals("Martinez Inc", customers.get(699).getCompany());
	}

	@Test
	@DisplayName("Record 700: Address is 6510 Van Nuys Blvd")
	void AddressOfRecord700() {
		assertEquals("6510 Van Nuys Blvd", customers.get(699).getAddress());
	}

	@Test
	@DisplayName("Record 700: City is Van Nuys")
	void CityOfRecord700() {
		assertEquals("Van Nuys", customers.get(699).getCity());
	}

	@Test
	@DisplayName("Record 700: County is Los Angeles")
	void CountyOfRecord700() {
		assertEquals("Los Angeles", customers.get(699).getCounty());
	}

	@Test
	@DisplayName("Record 700: State is CA")
	void StateOfRecord700() {
		assertEquals("CA", customers.get(699).getState());
	}

	@Test
	@DisplayName("Record 700: ZIP is 91401")
	void ZIPOfRecord700() {
		assertEquals("91401", customers.get(699).getZIP());
	}

	@Test
	@DisplayName("Record 700: Phone is 818-787-5770")
	void PhoneOfRecord700() {
		assertEquals("818-787-5770", customers.get(699).getPhone());
	}

	@Test
	@DisplayName("Record 700: Fax is 818-787-7661")
	void FaxOfRecord700() {
		assertEquals("818-787-7661", customers.get(699).getFax());
	}

	@Test
	@DisplayName("Record 700: Email is geraldine@asif.com")
	void EmailOfRecord700() {
		assertEquals("geraldine@asif.com", customers.get(699).getEmail());
	}

	@Test
	@DisplayName("Record 700: Web is http://www.geraldineasif.com")
	void WebOfRecord700() {
		assertEquals("http://www.geraldineasif.com", customers.get(699).getWeb());
	}
}
