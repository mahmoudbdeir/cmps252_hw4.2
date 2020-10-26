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
class Record_1647 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1647: FirstName is Polly")
	void FirstNameOfRecord1647() {
		assertEquals("Polly", customers.get(1646).getFirstName());
	}

	@Test
	@DisplayName("Record 1647: LastName is Lasasso")
	void LastNameOfRecord1647() {
		assertEquals("Lasasso", customers.get(1646).getLastName());
	}

	@Test
	@DisplayName("Record 1647: Company is Drew Marco")
	void CompanyOfRecord1647() {
		assertEquals("Drew Marco", customers.get(1646).getCompany());
	}

	@Test
	@DisplayName("Record 1647: Address is 426 Main St")
	void AddressOfRecord1647() {
		assertEquals("426 Main St", customers.get(1646).getAddress());
	}

	@Test
	@DisplayName("Record 1647: City is Ketchikan")
	void CityOfRecord1647() {
		assertEquals("Ketchikan", customers.get(1646).getCity());
	}

	@Test
	@DisplayName("Record 1647: County is Ketchikan Gateway")
	void CountyOfRecord1647() {
		assertEquals("Ketchikan Gateway", customers.get(1646).getCounty());
	}

	@Test
	@DisplayName("Record 1647: State is AK")
	void StateOfRecord1647() {
		assertEquals("AK", customers.get(1646).getState());
	}

	@Test
	@DisplayName("Record 1647: ZIP is 99901")
	void ZIPOfRecord1647() {
		assertEquals("99901", customers.get(1646).getZIP());
	}

	@Test
	@DisplayName("Record 1647: Phone is 907-225-7422")
	void PhoneOfRecord1647() {
		assertEquals("907-225-7422", customers.get(1646).getPhone());
	}

	@Test
	@DisplayName("Record 1647: Fax is 907-225-2519")
	void FaxOfRecord1647() {
		assertEquals("907-225-2519", customers.get(1646).getFax());
	}

	@Test
	@DisplayName("Record 1647: Email is polly@lasasso.com")
	void EmailOfRecord1647() {
		assertEquals("polly@lasasso.com", customers.get(1646).getEmail());
	}

	@Test
	@DisplayName("Record 1647: Web is http://www.pollylasasso.com")
	void WebOfRecord1647() {
		assertEquals("http://www.pollylasasso.com", customers.get(1646).getWeb());
	}
}
