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

@Tag("10")
class Record_1835 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1835: FirstName is Reginald")
	void FirstNameOfRecord1835() {
		assertEquals("Reginald", customers.get(1834).getFirstName());
	}

	@Test
	@DisplayName("Record 1835: LastName is Dimartino")
	void LastNameOfRecord1835() {
		assertEquals("Dimartino", customers.get(1834).getLastName());
	}

	@Test
	@DisplayName("Record 1835: Company is Pulaski Office Products")
	void CompanyOfRecord1835() {
		assertEquals("Pulaski Office Products", customers.get(1834).getCompany());
	}

	@Test
	@DisplayName("Record 1835: Address is 207 Winsor St")
	void AddressOfRecord1835() {
		assertEquals("207 Winsor St", customers.get(1834).getAddress());
	}

	@Test
	@DisplayName("Record 1835: City is Jamestown")
	void CityOfRecord1835() {
		assertEquals("Jamestown", customers.get(1834).getCity());
	}

	@Test
	@DisplayName("Record 1835: County is Chautauqua")
	void CountyOfRecord1835() {
		assertEquals("Chautauqua", customers.get(1834).getCounty());
	}

	@Test
	@DisplayName("Record 1835: State is NY")
	void StateOfRecord1835() {
		assertEquals("NY", customers.get(1834).getState());
	}

	@Test
	@DisplayName("Record 1835: ZIP is 14701")
	void ZIPOfRecord1835() {
		assertEquals("14701", customers.get(1834).getZIP());
	}

	@Test
	@DisplayName("Record 1835: Phone is 716-664-6936")
	void PhoneOfRecord1835() {
		assertEquals("716-664-6936", customers.get(1834).getPhone());
	}

	@Test
	@DisplayName("Record 1835: Fax is 716-664-6413")
	void FaxOfRecord1835() {
		assertEquals("716-664-6413", customers.get(1834).getFax());
	}

	@Test
	@DisplayName("Record 1835: Email is reginald@dimartino.com")
	void EmailOfRecord1835() {
		assertEquals("reginald@dimartino.com", customers.get(1834).getEmail());
	}

	@Test
	@DisplayName("Record 1835: Web is http://www.reginalddimartino.com")
	void WebOfRecord1835() {
		assertEquals("http://www.reginalddimartino.com", customers.get(1834).getWeb());
	}
}
