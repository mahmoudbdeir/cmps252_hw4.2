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

@Tag("21")
class Record_4100 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4100: FirstName is Shawn")
	void FirstNameOfRecord4100() {
		assertEquals("Shawn", customers.get(4099).getFirstName());
	}

	@Test
	@DisplayName("Record 4100: LastName is Muchow")
	void LastNameOfRecord4100() {
		assertEquals("Muchow", customers.get(4099).getLastName());
	}

	@Test
	@DisplayName("Record 4100: Company is North Brunswick Post")
	void CompanyOfRecord4100() {
		assertEquals("North Brunswick Post", customers.get(4099).getCompany());
	}

	@Test
	@DisplayName("Record 4100: Address is 405 Smith St")
	void AddressOfRecord4100() {
		assertEquals("405 Smith St", customers.get(4099).getAddress());
	}

	@Test
	@DisplayName("Record 4100: City is Farmingdale")
	void CityOfRecord4100() {
		assertEquals("Farmingdale", customers.get(4099).getCity());
	}

	@Test
	@DisplayName("Record 4100: County is Nassau")
	void CountyOfRecord4100() {
		assertEquals("Nassau", customers.get(4099).getCounty());
	}

	@Test
	@DisplayName("Record 4100: State is NY")
	void StateOfRecord4100() {
		assertEquals("NY", customers.get(4099).getState());
	}

	@Test
	@DisplayName("Record 4100: ZIP is 11735")
	void ZIPOfRecord4100() {
		assertEquals("11735", customers.get(4099).getZIP());
	}

	@Test
	@DisplayName("Record 4100: Phone is 516-364-1894")
	void PhoneOfRecord4100() {
		assertEquals("516-364-1894", customers.get(4099).getPhone());
	}

	@Test
	@DisplayName("Record 4100: Fax is 516-364-7808")
	void FaxOfRecord4100() {
		assertEquals("516-364-7808", customers.get(4099).getFax());
	}

	@Test
	@DisplayName("Record 4100: Email is shawn@muchow.com")
	void EmailOfRecord4100() {
		assertEquals("shawn@muchow.com", customers.get(4099).getEmail());
	}

	@Test
	@DisplayName("Record 4100: Web is http://www.shawnmuchow.com")
	void WebOfRecord4100() {
		assertEquals("http://www.shawnmuchow.com", customers.get(4099).getWeb());
	}
}
