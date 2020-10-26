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
class Record_40 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 40: FirstName is George")
	void FirstNameOfRecord40() {
		assertEquals("George", customers.get(39).getFirstName());
	}

	@Test
	@DisplayName("Record 40: LastName is Lamoureux")
	void LastNameOfRecord40() {
		assertEquals("Lamoureux", customers.get(39).getLastName());
	}

	@Test
	@DisplayName("Record 40: Company is Miller & Moseley")
	void CompanyOfRecord40() {
		assertEquals("Miller & Moseley", customers.get(39).getCompany());
	}

	@Test
	@DisplayName("Record 40: Address is 2301 York Rd")
	void AddressOfRecord40() {
		assertEquals("2301 York Rd", customers.get(39).getAddress());
	}

	@Test
	@DisplayName("Record 40: City is Lutherville Timonium")
	void CityOfRecord40() {
		assertEquals("Lutherville Timonium", customers.get(39).getCity());
	}

	@Test
	@DisplayName("Record 40: County is Baltimore")
	void CountyOfRecord40() {
		assertEquals("Baltimore", customers.get(39).getCounty());
	}

	@Test
	@DisplayName("Record 40: State is MD")
	void StateOfRecord40() {
		assertEquals("MD", customers.get(39).getState());
	}

	@Test
	@DisplayName("Record 40: ZIP is 21093")
	void ZIPOfRecord40() {
		assertEquals("21093", customers.get(39).getZIP());
	}

	@Test
	@DisplayName("Record 40: Phone is 410-252-6831")
	void PhoneOfRecord40() {
		assertEquals("410-252-6831", customers.get(39).getPhone());
	}

	@Test
	@DisplayName("Record 40: Fax is 410-252-2532")
	void FaxOfRecord40() {
		assertEquals("410-252-2532", customers.get(39).getFax());
	}

	@Test
	@DisplayName("Record 40: Email is george@lamoureux.com")
	void EmailOfRecord40() {
		assertEquals("george@lamoureux.com", customers.get(39).getEmail());
	}

	@Test
	@DisplayName("Record 40: Web is http://www.georgelamoureux.com")
	void WebOfRecord40() {
		assertEquals("http://www.georgelamoureux.com", customers.get(39).getWeb());
	}
}
