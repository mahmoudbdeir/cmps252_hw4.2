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

@Tag("46")
class Record_4403 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4403: FirstName is Marina")
	void FirstNameOfRecord4403() {
		assertEquals("Marina", customers.get(4402).getFirstName());
	}

	@Test
	@DisplayName("Record 4403: LastName is Tarrance")
	void LastNameOfRecord4403() {
		assertEquals("Tarrance", customers.get(4402).getLastName());
	}

	@Test
	@DisplayName("Record 4403: Company is Menominee County Fed Crdt Un")
	void CompanyOfRecord4403() {
		assertEquals("Menominee County Fed Crdt Un", customers.get(4402).getCompany());
	}

	@Test
	@DisplayName("Record 4403: Address is 4653 S 33rd St")
	void AddressOfRecord4403() {
		assertEquals("4653 S 33rd St", customers.get(4402).getAddress());
	}

	@Test
	@DisplayName("Record 4403: City is Phoenix")
	void CityOfRecord4403() {
		assertEquals("Phoenix", customers.get(4402).getCity());
	}

	@Test
	@DisplayName("Record 4403: County is Maricopa")
	void CountyOfRecord4403() {
		assertEquals("Maricopa", customers.get(4402).getCounty());
	}

	@Test
	@DisplayName("Record 4403: State is AZ")
	void StateOfRecord4403() {
		assertEquals("AZ", customers.get(4402).getState());
	}

	@Test
	@DisplayName("Record 4403: ZIP is 85040")
	void ZIPOfRecord4403() {
		assertEquals("85040", customers.get(4402).getZIP());
	}

	@Test
	@DisplayName("Record 4403: Phone is 602-243-0737")
	void PhoneOfRecord4403() {
		assertEquals("602-243-0737", customers.get(4402).getPhone());
	}

	@Test
	@DisplayName("Record 4403: Fax is 602-243-4148")
	void FaxOfRecord4403() {
		assertEquals("602-243-4148", customers.get(4402).getFax());
	}

	@Test
	@DisplayName("Record 4403: Email is marina@tarrance.com")
	void EmailOfRecord4403() {
		assertEquals("marina@tarrance.com", customers.get(4402).getEmail());
	}

	@Test
	@DisplayName("Record 4403: Web is http://www.marinatarrance.com")
	void WebOfRecord4403() {
		assertEquals("http://www.marinatarrance.com", customers.get(4402).getWeb());
	}
}
