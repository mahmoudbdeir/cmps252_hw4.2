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

@Tag("35")
class Record_3804 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3804: FirstName is Lupe")
	void FirstNameOfRecord3804() {
		assertEquals("Lupe", customers.get(3803).getFirstName());
	}

	@Test
	@DisplayName("Record 3804: LastName is Lamotte")
	void LastNameOfRecord3804() {
		assertEquals("Lamotte", customers.get(3803).getLastName());
	}

	@Test
	@DisplayName("Record 3804: Company is Insta Litho & Graphics")
	void CompanyOfRecord3804() {
		assertEquals("Insta Litho & Graphics", customers.get(3803).getCompany());
	}

	@Test
	@DisplayName("Record 3804: Address is 1020 Rogers Ave")
	void AddressOfRecord3804() {
		assertEquals("1020 Rogers Ave", customers.get(3803).getAddress());
	}

	@Test
	@DisplayName("Record 3804: City is Brooklyn")
	void CityOfRecord3804() {
		assertEquals("Brooklyn", customers.get(3803).getCity());
	}

	@Test
	@DisplayName("Record 3804: County is Kings")
	void CountyOfRecord3804() {
		assertEquals("Kings", customers.get(3803).getCounty());
	}

	@Test
	@DisplayName("Record 3804: State is NY")
	void StateOfRecord3804() {
		assertEquals("NY", customers.get(3803).getState());
	}

	@Test
	@DisplayName("Record 3804: ZIP is 11226")
	void ZIPOfRecord3804() {
		assertEquals("11226", customers.get(3803).getZIP());
	}

	@Test
	@DisplayName("Record 3804: Phone is 718-469-6484")
	void PhoneOfRecord3804() {
		assertEquals("718-469-6484", customers.get(3803).getPhone());
	}

	@Test
	@DisplayName("Record 3804: Fax is 718-469-1685")
	void FaxOfRecord3804() {
		assertEquals("718-469-1685", customers.get(3803).getFax());
	}

	@Test
	@DisplayName("Record 3804: Email is lupe@lamotte.com")
	void EmailOfRecord3804() {
		assertEquals("lupe@lamotte.com", customers.get(3803).getEmail());
	}

	@Test
	@DisplayName("Record 3804: Web is http://www.lupelamotte.com")
	void WebOfRecord3804() {
		assertEquals("http://www.lupelamotte.com", customers.get(3803).getWeb());
	}
}
