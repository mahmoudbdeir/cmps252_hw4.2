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

@Tag("33")
class Record_89 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 89: FirstName is Haley")
	void FirstNameOfRecord89() {
		assertEquals("Haley", customers.get(88).getFirstName());
	}

	@Test
	@DisplayName("Record 89: LastName is Lorge")
	void LastNameOfRecord89() {
		assertEquals("Lorge", customers.get(88).getLastName());
	}

	@Test
	@DisplayName("Record 89: Company is General Business Forms Inc")
	void CompanyOfRecord89() {
		assertEquals("General Business Forms Inc", customers.get(88).getCompany());
	}

	@Test
	@DisplayName("Record 89: Address is 925 Aspen St")
	void AddressOfRecord89() {
		assertEquals("925 Aspen St", customers.get(88).getAddress());
	}

	@Test
	@DisplayName("Record 89: City is Fairbanks")
	void CityOfRecord89() {
		assertEquals("Fairbanks", customers.get(88).getCity());
	}

	@Test
	@DisplayName("Record 89: County is Fairbanks North Star")
	void CountyOfRecord89() {
		assertEquals("Fairbanks North Star", customers.get(88).getCounty());
	}

	@Test
	@DisplayName("Record 89: State is AK")
	void StateOfRecord89() {
		assertEquals("AK", customers.get(88).getState());
	}

	@Test
	@DisplayName("Record 89: ZIP is 99709")
	void ZIPOfRecord89() {
		assertEquals("99709", customers.get(88).getZIP());
	}

	@Test
	@DisplayName("Record 89: Phone is 907-456-5542")
	void PhoneOfRecord89() {
		assertEquals("907-456-5542", customers.get(88).getPhone());
	}

	@Test
	@DisplayName("Record 89: Fax is 907-456-5296")
	void FaxOfRecord89() {
		assertEquals("907-456-5296", customers.get(88).getFax());
	}

	@Test
	@DisplayName("Record 89: Email is haley@lorge.com")
	void EmailOfRecord89() {
		assertEquals("haley@lorge.com", customers.get(88).getEmail());
	}

	@Test
	@DisplayName("Record 89: Web is http://www.haleylorge.com")
	void WebOfRecord89() {
		assertEquals("http://www.haleylorge.com", customers.get(88).getWeb());
	}
}
