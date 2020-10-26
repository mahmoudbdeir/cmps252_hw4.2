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

@Tag("30")
class Record_337 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 337: FirstName is Lesa")
	void FirstNameOfRecord337() {
		assertEquals("Lesa", customers.get(336).getFirstName());
	}

	@Test
	@DisplayName("Record 337: LastName is Vonkrosigk")
	void LastNameOfRecord337() {
		assertEquals("Vonkrosigk", customers.get(336).getLastName());
	}

	@Test
	@DisplayName("Record 337: Company is Midwest Wheel Companies")
	void CompanyOfRecord337() {
		assertEquals("Midwest Wheel Companies", customers.get(336).getCompany());
	}

	@Test
	@DisplayName("Record 337: Address is 1135 N Mckinley Ave")
	void AddressOfRecord337() {
		assertEquals("1135 N Mckinley Ave", customers.get(336).getAddress());
	}

	@Test
	@DisplayName("Record 337: City is Los Angeles")
	void CityOfRecord337() {
		assertEquals("Los Angeles", customers.get(336).getCity());
	}

	@Test
	@DisplayName("Record 337: County is Los Angeles")
	void CountyOfRecord337() {
		assertEquals("Los Angeles", customers.get(336).getCounty());
	}

	@Test
	@DisplayName("Record 337: State is CA")
	void StateOfRecord337() {
		assertEquals("CA", customers.get(336).getState());
	}

	@Test
	@DisplayName("Record 337: ZIP is 90059")
	void ZIPOfRecord337() {
		assertEquals("90059", customers.get(336).getZIP());
	}

	@Test
	@DisplayName("Record 337: Phone is 323-538-5506")
	void PhoneOfRecord337() {
		assertEquals("323-538-5506", customers.get(336).getPhone());
	}

	@Test
	@DisplayName("Record 337: Fax is 323-538-7447")
	void FaxOfRecord337() {
		assertEquals("323-538-7447", customers.get(336).getFax());
	}

	@Test
	@DisplayName("Record 337: Email is lesa@vonkrosigk.com")
	void EmailOfRecord337() {
		assertEquals("lesa@vonkrosigk.com", customers.get(336).getEmail());
	}

	@Test
	@DisplayName("Record 337: Web is http://www.lesavonkrosigk.com")
	void WebOfRecord337() {
		assertEquals("http://www.lesavonkrosigk.com", customers.get(336).getWeb());
	}
}
