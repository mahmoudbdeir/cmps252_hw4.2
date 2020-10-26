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

@Tag("5")
class Record_923 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 923: FirstName is Johnnie")
	void FirstNameOfRecord923() {
		assertEquals("Johnnie", customers.get(922).getFirstName());
	}

	@Test
	@DisplayName("Record 923: LastName is Gothe")
	void LastNameOfRecord923() {
		assertEquals("Gothe", customers.get(922).getLastName());
	}

	@Test
	@DisplayName("Record 923: Company is Inco Graphics")
	void CompanyOfRecord923() {
		assertEquals("Inco Graphics", customers.get(922).getCompany());
	}

	@Test
	@DisplayName("Record 923: Address is 2765 S Highland Dr")
	void AddressOfRecord923() {
		assertEquals("2765 S Highland Dr", customers.get(922).getAddress());
	}

	@Test
	@DisplayName("Record 923: City is Las Vegas")
	void CityOfRecord923() {
		assertEquals("Las Vegas", customers.get(922).getCity());
	}

	@Test
	@DisplayName("Record 923: County is Clark")
	void CountyOfRecord923() {
		assertEquals("Clark", customers.get(922).getCounty());
	}

	@Test
	@DisplayName("Record 923: State is NV")
	void StateOfRecord923() {
		assertEquals("NV", customers.get(922).getState());
	}

	@Test
	@DisplayName("Record 923: ZIP is 89109")
	void ZIPOfRecord923() {
		assertEquals("89109", customers.get(922).getZIP());
	}

	@Test
	@DisplayName("Record 923: Phone is 702-734-0479")
	void PhoneOfRecord923() {
		assertEquals("702-734-0479", customers.get(922).getPhone());
	}

	@Test
	@DisplayName("Record 923: Fax is 702-734-6841")
	void FaxOfRecord923() {
		assertEquals("702-734-6841", customers.get(922).getFax());
	}

	@Test
	@DisplayName("Record 923: Email is johnnie@gothe.com")
	void EmailOfRecord923() {
		assertEquals("johnnie@gothe.com", customers.get(922).getEmail());
	}

	@Test
	@DisplayName("Record 923: Web is http://www.johnniegothe.com")
	void WebOfRecord923() {
		assertEquals("http://www.johnniegothe.com", customers.get(922).getWeb());
	}
}
