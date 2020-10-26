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

@Tag("12")
class Record_813 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 813: FirstName is Aline")
	void FirstNameOfRecord813() {
		assertEquals("Aline", customers.get(812).getFirstName());
	}

	@Test
	@DisplayName("Record 813: LastName is Norgard")
	void LastNameOfRecord813() {
		assertEquals("Norgard", customers.get(812).getLastName());
	}

	@Test
	@DisplayName("Record 813: Company is Redwing Carriers Inc")
	void CompanyOfRecord813() {
		assertEquals("Redwing Carriers Inc", customers.get(812).getCompany());
	}

	@Test
	@DisplayName("Record 813: Address is 4630 W Wrightwood Ave")
	void AddressOfRecord813() {
		assertEquals("4630 W Wrightwood Ave", customers.get(812).getAddress());
	}

	@Test
	@DisplayName("Record 813: City is Chicago")
	void CityOfRecord813() {
		assertEquals("Chicago", customers.get(812).getCity());
	}

	@Test
	@DisplayName("Record 813: County is Cook")
	void CountyOfRecord813() {
		assertEquals("Cook", customers.get(812).getCounty());
	}

	@Test
	@DisplayName("Record 813: State is IL")
	void StateOfRecord813() {
		assertEquals("IL", customers.get(812).getState());
	}

	@Test
	@DisplayName("Record 813: ZIP is 60639")
	void ZIPOfRecord813() {
		assertEquals("60639", customers.get(812).getZIP());
	}

	@Test
	@DisplayName("Record 813: Phone is 773-276-2755")
	void PhoneOfRecord813() {
		assertEquals("773-276-2755", customers.get(812).getPhone());
	}

	@Test
	@DisplayName("Record 813: Fax is 773-276-1498")
	void FaxOfRecord813() {
		assertEquals("773-276-1498", customers.get(812).getFax());
	}

	@Test
	@DisplayName("Record 813: Email is aline@norgard.com")
	void EmailOfRecord813() {
		assertEquals("aline@norgard.com", customers.get(812).getEmail());
	}

	@Test
	@DisplayName("Record 813: Web is http://www.alinenorgard.com")
	void WebOfRecord813() {
		assertEquals("http://www.alinenorgard.com", customers.get(812).getWeb());
	}
}
