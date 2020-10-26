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

@Tag("17")
class Record_1970 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1970: FirstName is Nell")
	void FirstNameOfRecord1970() {
		assertEquals("Nell", customers.get(1969).getFirstName());
	}

	@Test
	@DisplayName("Record 1970: LastName is Peets")
	void LastNameOfRecord1970() {
		assertEquals("Peets", customers.get(1969).getLastName());
	}

	@Test
	@DisplayName("Record 1970: Company is Theresa Burke Counts")
	void CompanyOfRecord1970() {
		assertEquals("Theresa Burke Counts", customers.get(1969).getCompany());
	}

	@Test
	@DisplayName("Record 1970: Address is Asbury Ave")
	void AddressOfRecord1970() {
		assertEquals("Asbury Ave", customers.get(1969).getAddress());
	}

	@Test
	@DisplayName("Record 1970: City is Lincolnshire")
	void CityOfRecord1970() {
		assertEquals("Lincolnshire", customers.get(1969).getCity());
	}

	@Test
	@DisplayName("Record 1970: County is Lake")
	void CountyOfRecord1970() {
		assertEquals("Lake", customers.get(1969).getCounty());
	}

	@Test
	@DisplayName("Record 1970: State is IL")
	void StateOfRecord1970() {
		assertEquals("IL", customers.get(1969).getState());
	}

	@Test
	@DisplayName("Record 1970: ZIP is 60069")
	void ZIPOfRecord1970() {
		assertEquals("60069", customers.get(1969).getZIP());
	}

	@Test
	@DisplayName("Record 1970: Phone is 847-634-0900")
	void PhoneOfRecord1970() {
		assertEquals("847-634-0900", customers.get(1969).getPhone());
	}

	@Test
	@DisplayName("Record 1970: Fax is 847-634-6364")
	void FaxOfRecord1970() {
		assertEquals("847-634-6364", customers.get(1969).getFax());
	}

	@Test
	@DisplayName("Record 1970: Email is nell@peets.com")
	void EmailOfRecord1970() {
		assertEquals("nell@peets.com", customers.get(1969).getEmail());
	}

	@Test
	@DisplayName("Record 1970: Web is http://www.nellpeets.com")
	void WebOfRecord1970() {
		assertEquals("http://www.nellpeets.com", customers.get(1969).getWeb());
	}
}
