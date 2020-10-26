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

@Tag("40")
class Record_3812 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3812: FirstName is Helene")
	void FirstNameOfRecord3812() {
		assertEquals("Helene", customers.get(3811).getFirstName());
	}

	@Test
	@DisplayName("Record 3812: LastName is Gaulzetti")
	void LastNameOfRecord3812() {
		assertEquals("Gaulzetti", customers.get(3811).getLastName());
	}

	@Test
	@DisplayName("Record 3812: Company is Cal State Glass & Mirror Co")
	void CompanyOfRecord3812() {
		assertEquals("Cal State Glass & Mirror Co", customers.get(3811).getCompany());
	}

	@Test
	@DisplayName("Record 3812: Address is 49 S Main St")
	void AddressOfRecord3812() {
		assertEquals("49 S Main St", customers.get(3811).getAddress());
	}

	@Test
	@DisplayName("Record 3812: City is Pleasantville")
	void CityOfRecord3812() {
		assertEquals("Pleasantville", customers.get(3811).getCity());
	}

	@Test
	@DisplayName("Record 3812: County is Atlantic")
	void CountyOfRecord3812() {
		assertEquals("Atlantic", customers.get(3811).getCounty());
	}

	@Test
	@DisplayName("Record 3812: State is NJ")
	void StateOfRecord3812() {
		assertEquals("NJ", customers.get(3811).getState());
	}

	@Test
	@DisplayName("Record 3812: ZIP is 8232")
	void ZIPOfRecord3812() {
		assertEquals("8232", customers.get(3811).getZIP());
	}

	@Test
	@DisplayName("Record 3812: Phone is 609-641-3190")
	void PhoneOfRecord3812() {
		assertEquals("609-641-3190", customers.get(3811).getPhone());
	}

	@Test
	@DisplayName("Record 3812: Fax is 609-641-6107")
	void FaxOfRecord3812() {
		assertEquals("609-641-6107", customers.get(3811).getFax());
	}

	@Test
	@DisplayName("Record 3812: Email is helene@gaulzetti.com")
	void EmailOfRecord3812() {
		assertEquals("helene@gaulzetti.com", customers.get(3811).getEmail());
	}

	@Test
	@DisplayName("Record 3812: Web is http://www.helenegaulzetti.com")
	void WebOfRecord3812() {
		assertEquals("http://www.helenegaulzetti.com", customers.get(3811).getWeb());
	}
}
