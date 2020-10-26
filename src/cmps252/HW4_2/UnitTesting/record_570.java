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

@Tag("22")
class Record_570 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 570: FirstName is Bernadine")
	void FirstNameOfRecord570() {
		assertEquals("Bernadine", customers.get(569).getFirstName());
	}

	@Test
	@DisplayName("Record 570: LastName is Baral")
	void LastNameOfRecord570() {
		assertEquals("Baral", customers.get(569).getLastName());
	}

	@Test
	@DisplayName("Record 570: Company is Spectrum Data Systems Inc")
	void CompanyOfRecord570() {
		assertEquals("Spectrum Data Systems Inc", customers.get(569).getCompany());
	}

	@Test
	@DisplayName("Record 570: Address is 2825 N 19th St")
	void AddressOfRecord570() {
		assertEquals("2825 N 19th St", customers.get(569).getAddress());
	}

	@Test
	@DisplayName("Record 570: City is Waco")
	void CityOfRecord570() {
		assertEquals("Waco", customers.get(569).getCity());
	}

	@Test
	@DisplayName("Record 570: County is McLennan")
	void CountyOfRecord570() {
		assertEquals("McLennan", customers.get(569).getCounty());
	}

	@Test
	@DisplayName("Record 570: State is TX")
	void StateOfRecord570() {
		assertEquals("TX", customers.get(569).getState());
	}

	@Test
	@DisplayName("Record 570: ZIP is 76708")
	void ZIPOfRecord570() {
		assertEquals("76708", customers.get(569).getZIP());
	}

	@Test
	@DisplayName("Record 570: Phone is 254-752-1613")
	void PhoneOfRecord570() {
		assertEquals("254-752-1613", customers.get(569).getPhone());
	}

	@Test
	@DisplayName("Record 570: Fax is 254-752-8818")
	void FaxOfRecord570() {
		assertEquals("254-752-8818", customers.get(569).getFax());
	}

	@Test
	@DisplayName("Record 570: Email is bernadine@baral.com")
	void EmailOfRecord570() {
		assertEquals("bernadine@baral.com", customers.get(569).getEmail());
	}

	@Test
	@DisplayName("Record 570: Web is http://www.bernadinebaral.com")
	void WebOfRecord570() {
		assertEquals("http://www.bernadinebaral.com", customers.get(569).getWeb());
	}
}
