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

@Tag("29")
class Record_742 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 742: FirstName is Louise")
	void FirstNameOfRecord742() {
		assertEquals("Louise", customers.get(741).getFirstName());
	}

	@Test
	@DisplayName("Record 742: LastName is Hyde")
	void LastNameOfRecord742() {
		assertEquals("Hyde", customers.get(741).getLastName());
	}

	@Test
	@DisplayName("Record 742: Company is Diabetes Association American")
	void CompanyOfRecord742() {
		assertEquals("Diabetes Association American", customers.get(741).getCompany());
	}

	@Test
	@DisplayName("Record 742: Address is 2541 E Jackson St")
	void AddressOfRecord742() {
		assertEquals("2541 E Jackson St", customers.get(741).getAddress());
	}

	@Test
	@DisplayName("Record 742: City is Phoenix")
	void CityOfRecord742() {
		assertEquals("Phoenix", customers.get(741).getCity());
	}

	@Test
	@DisplayName("Record 742: County is Maricopa")
	void CountyOfRecord742() {
		assertEquals("Maricopa", customers.get(741).getCounty());
	}

	@Test
	@DisplayName("Record 742: State is AZ")
	void StateOfRecord742() {
		assertEquals("AZ", customers.get(741).getState());
	}

	@Test
	@DisplayName("Record 742: ZIP is 85034")
	void ZIPOfRecord742() {
		assertEquals("85034", customers.get(741).getZIP());
	}

	@Test
	@DisplayName("Record 742: Phone is 602-275-2514")
	void PhoneOfRecord742() {
		assertEquals("602-275-2514", customers.get(741).getPhone());
	}

	@Test
	@DisplayName("Record 742: Fax is 602-275-9112")
	void FaxOfRecord742() {
		assertEquals("602-275-9112", customers.get(741).getFax());
	}

	@Test
	@DisplayName("Record 742: Email is louise@hyde.com")
	void EmailOfRecord742() {
		assertEquals("louise@hyde.com", customers.get(741).getEmail());
	}

	@Test
	@DisplayName("Record 742: Web is http://www.louisehyde.com")
	void WebOfRecord742() {
		assertEquals("http://www.louisehyde.com", customers.get(741).getWeb());
	}
}
