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

@Tag("5")
class Record_3997 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3997: FirstName is Britt")
	void FirstNameOfRecord3997() {
		assertEquals("Britt", customers.get(3996).getFirstName());
	}

	@Test
	@DisplayName("Record 3997: LastName is Beachell")
	void LastNameOfRecord3997() {
		assertEquals("Beachell", customers.get(3996).getLastName());
	}

	@Test
	@DisplayName("Record 3997: Company is Mark E Mader Atty")
	void CompanyOfRecord3997() {
		assertEquals("Mark E Mader Atty", customers.get(3996).getCompany());
	}

	@Test
	@DisplayName("Record 3997: Address is 7825 San Leandro St")
	void AddressOfRecord3997() {
		assertEquals("7825 San Leandro St", customers.get(3996).getAddress());
	}

	@Test
	@DisplayName("Record 3997: City is Oakland")
	void CityOfRecord3997() {
		assertEquals("Oakland", customers.get(3996).getCity());
	}

	@Test
	@DisplayName("Record 3997: County is Alameda")
	void CountyOfRecord3997() {
		assertEquals("Alameda", customers.get(3996).getCounty());
	}

	@Test
	@DisplayName("Record 3997: State is CA")
	void StateOfRecord3997() {
		assertEquals("CA", customers.get(3996).getState());
	}

	@Test
	@DisplayName("Record 3997: ZIP is 94621")
	void ZIPOfRecord3997() {
		assertEquals("94621", customers.get(3996).getZIP());
	}

	@Test
	@DisplayName("Record 3997: Phone is 510-632-3583")
	void PhoneOfRecord3997() {
		assertEquals("510-632-3583", customers.get(3996).getPhone());
	}

	@Test
	@DisplayName("Record 3997: Fax is 510-632-3475")
	void FaxOfRecord3997() {
		assertEquals("510-632-3475", customers.get(3996).getFax());
	}

	@Test
	@DisplayName("Record 3997: Email is britt@beachell.com")
	void EmailOfRecord3997() {
		assertEquals("britt@beachell.com", customers.get(3996).getEmail());
	}

	@Test
	@DisplayName("Record 3997: Web is http://www.brittbeachell.com")
	void WebOfRecord3997() {
		assertEquals("http://www.brittbeachell.com", customers.get(3996).getWeb());
	}
}
