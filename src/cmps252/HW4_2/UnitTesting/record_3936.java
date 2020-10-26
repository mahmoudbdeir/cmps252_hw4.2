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

@Tag("26")
class Record_3936 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3936: FirstName is Trent")
	void FirstNameOfRecord3936() {
		assertEquals("Trent", customers.get(3935).getFirstName());
	}

	@Test
	@DisplayName("Record 3936: LastName is Hogan")
	void LastNameOfRecord3936() {
		assertEquals("Hogan", customers.get(3935).getLastName());
	}

	@Test
	@DisplayName("Record 3936: Company is Adams, David L")
	void CompanyOfRecord3936() {
		assertEquals("Adams, David L", customers.get(3935).getCompany());
	}

	@Test
	@DisplayName("Record 3936: Address is Rt 4a A")
	void AddressOfRecord3936() {
		assertEquals("Rt 4a A", customers.get(3935).getAddress());
	}

	@Test
	@DisplayName("Record 3936: City is Springfield")
	void CityOfRecord3936() {
		assertEquals("Springfield", customers.get(3935).getCity());
	}

	@Test
	@DisplayName("Record 3936: County is Sullivan")
	void CountyOfRecord3936() {
		assertEquals("Sullivan", customers.get(3935).getCounty());
	}

	@Test
	@DisplayName("Record 3936: State is NH")
	void StateOfRecord3936() {
		assertEquals("NH", customers.get(3935).getState());
	}

	@Test
	@DisplayName("Record 3936: ZIP is 3284")
	void ZIPOfRecord3936() {
		assertEquals("3284", customers.get(3935).getZIP());
	}

	@Test
	@DisplayName("Record 3936: Phone is 603-763-8214")
	void PhoneOfRecord3936() {
		assertEquals("603-763-8214", customers.get(3935).getPhone());
	}

	@Test
	@DisplayName("Record 3936: Fax is 603-763-5093")
	void FaxOfRecord3936() {
		assertEquals("603-763-5093", customers.get(3935).getFax());
	}

	@Test
	@DisplayName("Record 3936: Email is trent@hogan.com")
	void EmailOfRecord3936() {
		assertEquals("trent@hogan.com", customers.get(3935).getEmail());
	}

	@Test
	@DisplayName("Record 3936: Web is http://www.trenthogan.com")
	void WebOfRecord3936() {
		assertEquals("http://www.trenthogan.com", customers.get(3935).getWeb());
	}
}
