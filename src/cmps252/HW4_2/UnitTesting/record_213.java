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

@Tag("24")
class Record_213 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 213: FirstName is Ray")
	void FirstNameOfRecord213() {
		assertEquals("Ray", customers.get(212).getFirstName());
	}

	@Test
	@DisplayName("Record 213: LastName is Pinchbeck")
	void LastNameOfRecord213() {
		assertEquals("Pinchbeck", customers.get(212).getLastName());
	}

	@Test
	@DisplayName("Record 213: Company is Lockhart & Law Ins Agcy Inc")
	void CompanyOfRecord213() {
		assertEquals("Lockhart & Law Ins Agcy Inc", customers.get(212).getCompany());
	}

	@Test
	@DisplayName("Record 213: Address is 107 W Van Buren St")
	void AddressOfRecord213() {
		assertEquals("107 W Van Buren St", customers.get(212).getAddress());
	}

	@Test
	@DisplayName("Record 213: City is Chicago")
	void CityOfRecord213() {
		assertEquals("Chicago", customers.get(212).getCity());
	}

	@Test
	@DisplayName("Record 213: County is Cook")
	void CountyOfRecord213() {
		assertEquals("Cook", customers.get(212).getCounty());
	}

	@Test
	@DisplayName("Record 213: State is IL")
	void StateOfRecord213() {
		assertEquals("IL", customers.get(212).getState());
	}

	@Test
	@DisplayName("Record 213: ZIP is 60605")
	void ZIPOfRecord213() {
		assertEquals("60605", customers.get(212).getZIP());
	}

	@Test
	@DisplayName("Record 213: Phone is 312-939-1585")
	void PhoneOfRecord213() {
		assertEquals("312-939-1585", customers.get(212).getPhone());
	}

	@Test
	@DisplayName("Record 213: Fax is 312-939-9545")
	void FaxOfRecord213() {
		assertEquals("312-939-9545", customers.get(212).getFax());
	}

	@Test
	@DisplayName("Record 213: Email is ray@pinchbeck.com")
	void EmailOfRecord213() {
		assertEquals("ray@pinchbeck.com", customers.get(212).getEmail());
	}

	@Test
	@DisplayName("Record 213: Web is http://www.raypinchbeck.com")
	void WebOfRecord213() {
		assertEquals("http://www.raypinchbeck.com", customers.get(212).getWeb());
	}
}
