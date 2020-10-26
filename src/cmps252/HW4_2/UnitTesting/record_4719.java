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

@Tag("6")
class Record_4719 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4719: FirstName is Brianne")
	void FirstNameOfRecord4719() {
		assertEquals("Brianne", customers.get(4718).getFirstName());
	}

	@Test
	@DisplayName("Record 4719: LastName is Sickendick")
	void LastNameOfRecord4719() {
		assertEquals("Sickendick", customers.get(4718).getLastName());
	}

	@Test
	@DisplayName("Record 4719: Company is National Safety Apparel Inc")
	void CompanyOfRecord4719() {
		assertEquals("National Safety Apparel Inc", customers.get(4718).getCompany());
	}

	@Test
	@DisplayName("Record 4719: Address is 160 E 56th St")
	void AddressOfRecord4719() {
		assertEquals("160 E 56th St", customers.get(4718).getAddress());
	}

	@Test
	@DisplayName("Record 4719: City is New York")
	void CityOfRecord4719() {
		assertEquals("New York", customers.get(4718).getCity());
	}

	@Test
	@DisplayName("Record 4719: County is New York")
	void CountyOfRecord4719() {
		assertEquals("New York", customers.get(4718).getCounty());
	}

	@Test
	@DisplayName("Record 4719: State is NY")
	void StateOfRecord4719() {
		assertEquals("NY", customers.get(4718).getState());
	}

	@Test
	@DisplayName("Record 4719: ZIP is 10022")
	void ZIPOfRecord4719() {
		assertEquals("10022", customers.get(4718).getZIP());
	}

	@Test
	@DisplayName("Record 4719: Phone is 212-355-5962")
	void PhoneOfRecord4719() {
		assertEquals("212-355-5962", customers.get(4718).getPhone());
	}

	@Test
	@DisplayName("Record 4719: Fax is 212-355-7287")
	void FaxOfRecord4719() {
		assertEquals("212-355-7287", customers.get(4718).getFax());
	}

	@Test
	@DisplayName("Record 4719: Email is brianne@sickendick.com")
	void EmailOfRecord4719() {
		assertEquals("brianne@sickendick.com", customers.get(4718).getEmail());
	}

	@Test
	@DisplayName("Record 4719: Web is http://www.briannesickendick.com")
	void WebOfRecord4719() {
		assertEquals("http://www.briannesickendick.com", customers.get(4718).getWeb());
	}
}
