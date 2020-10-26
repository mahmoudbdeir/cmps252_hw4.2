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

@Tag("26")
class Record_3378 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3378: FirstName is Andrea")
	void FirstNameOfRecord3378() {
		assertEquals("Andrea", customers.get(3377).getFirstName());
	}

	@Test
	@DisplayName("Record 3378: LastName is Pintea")
	void LastNameOfRecord3378() {
		assertEquals("Pintea", customers.get(3377).getLastName());
	}

	@Test
	@DisplayName("Record 3378: Company is Alco Health Service Corp")
	void CompanyOfRecord3378() {
		assertEquals("Alco Health Service Corp", customers.get(3377).getCompany());
	}

	@Test
	@DisplayName("Record 3378: Address is 1550 S Anahym Blvd")
	void AddressOfRecord3378() {
		assertEquals("1550 S Anahym Blvd", customers.get(3377).getAddress());
	}

	@Test
	@DisplayName("Record 3378: City is Anahym")
	void CityOfRecord3378() {
		assertEquals("Anahym", customers.get(3377).getCity());
	}

	@Test
	@DisplayName("Record 3378: County is Orange")
	void CountyOfRecord3378() {
		assertEquals("Orange", customers.get(3377).getCounty());
	}

	@Test
	@DisplayName("Record 3378: State is CA")
	void StateOfRecord3378() {
		assertEquals("CA", customers.get(3377).getState());
	}

	@Test
	@DisplayName("Record 3378: ZIP is 92805")
	void ZIPOfRecord3378() {
		assertEquals("92805", customers.get(3377).getZIP());
	}

	@Test
	@DisplayName("Record 3378: Phone is 714-491-6875")
	void PhoneOfRecord3378() {
		assertEquals("714-491-6875", customers.get(3377).getPhone());
	}

	@Test
	@DisplayName("Record 3378: Fax is 714-491-1067")
	void FaxOfRecord3378() {
		assertEquals("714-491-1067", customers.get(3377).getFax());
	}

	@Test
	@DisplayName("Record 3378: Email is andrea@pintea.com")
	void EmailOfRecord3378() {
		assertEquals("andrea@pintea.com", customers.get(3377).getEmail());
	}

	@Test
	@DisplayName("Record 3378: Web is http://www.andreapintea.com")
	void WebOfRecord3378() {
		assertEquals("http://www.andreapintea.com", customers.get(3377).getWeb());
	}
}
