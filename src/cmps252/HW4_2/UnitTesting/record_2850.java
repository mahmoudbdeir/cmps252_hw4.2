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

@Tag("15")
class Record_2850 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2850: FirstName is Janine")
	void FirstNameOfRecord2850() {
		assertEquals("Janine", customers.get(2849).getFirstName());
	}

	@Test
	@DisplayName("Record 2850: LastName is Addington")
	void LastNameOfRecord2850() {
		assertEquals("Addington", customers.get(2849).getLastName());
	}

	@Test
	@DisplayName("Record 2850: Company is Cat Dancer Products")
	void CompanyOfRecord2850() {
		assertEquals("Cat Dancer Products", customers.get(2849).getCompany());
	}

	@Test
	@DisplayName("Record 2850: Address is 2312 Artesia Blvd")
	void AddressOfRecord2850() {
		assertEquals("2312 Artesia Blvd", customers.get(2849).getAddress());
	}

	@Test
	@DisplayName("Record 2850: City is Redondo Beach")
	void CityOfRecord2850() {
		assertEquals("Redondo Beach", customers.get(2849).getCity());
	}

	@Test
	@DisplayName("Record 2850: County is Los Angeles")
	void CountyOfRecord2850() {
		assertEquals("Los Angeles", customers.get(2849).getCounty());
	}

	@Test
	@DisplayName("Record 2850: State is CA")
	void StateOfRecord2850() {
		assertEquals("CA", customers.get(2849).getState());
	}

	@Test
	@DisplayName("Record 2850: ZIP is 90278")
	void ZIPOfRecord2850() {
		assertEquals("90278", customers.get(2849).getZIP());
	}

	@Test
	@DisplayName("Record 2850: Phone is 310-379-6162")
	void PhoneOfRecord2850() {
		assertEquals("310-379-6162", customers.get(2849).getPhone());
	}

	@Test
	@DisplayName("Record 2850: Fax is 310-379-9939")
	void FaxOfRecord2850() {
		assertEquals("310-379-9939", customers.get(2849).getFax());
	}

	@Test
	@DisplayName("Record 2850: Email is janine@addington.com")
	void EmailOfRecord2850() {
		assertEquals("janine@addington.com", customers.get(2849).getEmail());
	}

	@Test
	@DisplayName("Record 2850: Web is http://www.janineaddington.com")
	void WebOfRecord2850() {
		assertEquals("http://www.janineaddington.com", customers.get(2849).getWeb());
	}
}
