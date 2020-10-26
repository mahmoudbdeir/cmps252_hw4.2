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

@Tag("48")
class Record_16 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 16: FirstName is Ann")
	void FirstNameOfRecord16() {
		assertEquals("Ann", customers.get(15).getFirstName());
	}

	@Test
	@DisplayName("Record 16: LastName is Senff")
	void LastNameOfRecord16() {
		assertEquals("Senff", customers.get(15).getLastName());
	}

	@Test
	@DisplayName("Record 16: Company is Travelodge Santa Barbara Beach")
	void CompanyOfRecord16() {
		assertEquals("Travelodge Santa Barbara Beach", customers.get(15).getCompany());
	}

	@Test
	@DisplayName("Record 16: Address is 1165 E Acacia Ct")
	void AddressOfRecord16() {
		assertEquals("1165 E Acacia Ct", customers.get(15).getAddress());
	}

	@Test
	@DisplayName("Record 16: City is Ontario")
	void CityOfRecord16() {
		assertEquals("Ontario", customers.get(15).getCity());
	}

	@Test
	@DisplayName("Record 16: County is San Bernardino")
	void CountyOfRecord16() {
		assertEquals("San Bernardino", customers.get(15).getCounty());
	}

	@Test
	@DisplayName("Record 16: State is CA")
	void StateOfRecord16() {
		assertEquals("CA", customers.get(15).getState());
	}

	@Test
	@DisplayName("Record 16: ZIP is 91761")
	void ZIPOfRecord16() {
		assertEquals("91761", customers.get(15).getZIP());
	}

	@Test
	@DisplayName("Record 16: Phone is 909-923-0954")
	void PhoneOfRecord16() {
		assertEquals("909-923-0954", customers.get(15).getPhone());
	}

	@Test
	@DisplayName("Record 16: Fax is 909-923-0555")
	void FaxOfRecord16() {
		assertEquals("909-923-0555", customers.get(15).getFax());
	}

	@Test
	@DisplayName("Record 16: Email is ann@senff.com")
	void EmailOfRecord16() {
		assertEquals("ann@senff.com", customers.get(15).getEmail());
	}

	@Test
	@DisplayName("Record 16: Web is http://www.annsenff.com")
	void WebOfRecord16() {
		assertEquals("http://www.annsenff.com", customers.get(15).getWeb());
	}
}
