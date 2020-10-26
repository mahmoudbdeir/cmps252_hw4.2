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

@Tag("28")
class Record_3306 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3306: FirstName is Hiram")
	void FirstNameOfRecord3306() {
		assertEquals("Hiram", customers.get(3305).getFirstName());
	}

	@Test
	@DisplayName("Record 3306: LastName is Goll")
	void LastNameOfRecord3306() {
		assertEquals("Goll", customers.get(3305).getLastName());
	}

	@Test
	@DisplayName("Record 3306: Company is Reno Orthopedic Appliance Inc")
	void CompanyOfRecord3306() {
		assertEquals("Reno Orthopedic Appliance Inc", customers.get(3305).getCompany());
	}

	@Test
	@DisplayName("Record 3306: Address is Box #-74413")
	void AddressOfRecord3306() {
		assertEquals("Box #-74413", customers.get(3305).getAddress());
	}

	@Test
	@DisplayName("Record 3306: City is Fairbanks")
	void CityOfRecord3306() {
		assertEquals("Fairbanks", customers.get(3305).getCity());
	}

	@Test
	@DisplayName("Record 3306: County is Fairbanks North Star")
	void CountyOfRecord3306() {
		assertEquals("Fairbanks North Star", customers.get(3305).getCounty());
	}

	@Test
	@DisplayName("Record 3306: State is AK")
	void StateOfRecord3306() {
		assertEquals("AK", customers.get(3305).getState());
	}

	@Test
	@DisplayName("Record 3306: ZIP is 99707")
	void ZIPOfRecord3306() {
		assertEquals("99707", customers.get(3305).getZIP());
	}

	@Test
	@DisplayName("Record 3306: Phone is 907-456-6008")
	void PhoneOfRecord3306() {
		assertEquals("907-456-6008", customers.get(3305).getPhone());
	}

	@Test
	@DisplayName("Record 3306: Fax is 907-456-1974")
	void FaxOfRecord3306() {
		assertEquals("907-456-1974", customers.get(3305).getFax());
	}

	@Test
	@DisplayName("Record 3306: Email is hiram@goll.com")
	void EmailOfRecord3306() {
		assertEquals("hiram@goll.com", customers.get(3305).getEmail());
	}

	@Test
	@DisplayName("Record 3306: Web is http://www.hiramgoll.com")
	void WebOfRecord3306() {
		assertEquals("http://www.hiramgoll.com", customers.get(3305).getWeb());
	}
}
