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

@Tag("18")
class Record_961 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 961: FirstName is Sun")
	void FirstNameOfRecord961() {
		assertEquals("Sun", customers.get(960).getFirstName());
	}

	@Test
	@DisplayName("Record 961: LastName is Arman")
	void LastNameOfRecord961() {
		assertEquals("Arman", customers.get(960).getLastName());
	}

	@Test
	@DisplayName("Record 961: Company is Francor Sales Co")
	void CompanyOfRecord961() {
		assertEquals("Francor Sales Co", customers.get(960).getCompany());
	}

	@Test
	@DisplayName("Record 961: Address is 110 Bi County Blvd")
	void AddressOfRecord961() {
		assertEquals("110 Bi County Blvd", customers.get(960).getAddress());
	}

	@Test
	@DisplayName("Record 961: City is Farmingdale")
	void CityOfRecord961() {
		assertEquals("Farmingdale", customers.get(960).getCity());
	}

	@Test
	@DisplayName("Record 961: County is Nassau")
	void CountyOfRecord961() {
		assertEquals("Nassau", customers.get(960).getCounty());
	}

	@Test
	@DisplayName("Record 961: State is NY")
	void StateOfRecord961() {
		assertEquals("NY", customers.get(960).getState());
	}

	@Test
	@DisplayName("Record 961: ZIP is 11735")
	void ZIPOfRecord961() {
		assertEquals("11735", customers.get(960).getZIP());
	}

	@Test
	@DisplayName("Record 961: Phone is 516-845-8567")
	void PhoneOfRecord961() {
		assertEquals("516-845-8567", customers.get(960).getPhone());
	}

	@Test
	@DisplayName("Record 961: Fax is 516-845-7705")
	void FaxOfRecord961() {
		assertEquals("516-845-7705", customers.get(960).getFax());
	}

	@Test
	@DisplayName("Record 961: Email is sun@arman.com")
	void EmailOfRecord961() {
		assertEquals("sun@arman.com", customers.get(960).getEmail());
	}

	@Test
	@DisplayName("Record 961: Web is http://www.sunarman.com")
	void WebOfRecord961() {
		assertEquals("http://www.sunarman.com", customers.get(960).getWeb());
	}
}
