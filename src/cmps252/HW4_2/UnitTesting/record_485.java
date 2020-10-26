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

@Tag("37")
class Record_485 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 485: FirstName is Terence")
	void FirstNameOfRecord485() {
		assertEquals("Terence", customers.get(484).getFirstName());
	}

	@Test
	@DisplayName("Record 485: LastName is Nydig")
	void LastNameOfRecord485() {
		assertEquals("Nydig", customers.get(484).getLastName());
	}

	@Test
	@DisplayName("Record 485: Company is Hettinger Mobridge Cndy & Tob")
	void CompanyOfRecord485() {
		assertEquals("Hettinger Mobridge Cndy & Tob", customers.get(484).getCompany());
	}

	@Test
	@DisplayName("Record 485: Address is 1003 Pioneer Rd")
	void AddressOfRecord485() {
		assertEquals("1003 Pioneer Rd", customers.get(484).getAddress());
	}

	@Test
	@DisplayName("Record 485: City is Fairbanks")
	void CityOfRecord485() {
		assertEquals("Fairbanks", customers.get(484).getCity());
	}

	@Test
	@DisplayName("Record 485: County is Fairbanks North Star")
	void CountyOfRecord485() {
		assertEquals("Fairbanks North Star", customers.get(484).getCounty());
	}

	@Test
	@DisplayName("Record 485: State is AK")
	void StateOfRecord485() {
		assertEquals("AK", customers.get(484).getState());
	}

	@Test
	@DisplayName("Record 485: ZIP is 99701")
	void ZIPOfRecord485() {
		assertEquals("99701", customers.get(484).getZIP());
	}

	@Test
	@DisplayName("Record 485: Phone is 907-451-5695")
	void PhoneOfRecord485() {
		assertEquals("907-451-5695", customers.get(484).getPhone());
	}

	@Test
	@DisplayName("Record 485: Fax is 907-451-7214")
	void FaxOfRecord485() {
		assertEquals("907-451-7214", customers.get(484).getFax());
	}

	@Test
	@DisplayName("Record 485: Email is terence@nydig.com")
	void EmailOfRecord485() {
		assertEquals("terence@nydig.com", customers.get(484).getEmail());
	}

	@Test
	@DisplayName("Record 485: Web is http://www.terencenydig.com")
	void WebOfRecord485() {
		assertEquals("http://www.terencenydig.com", customers.get(484).getWeb());
	}
}
