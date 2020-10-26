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

@Tag("25")
class Record_4530 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4530: FirstName is Giuseppe")
	void FirstNameOfRecord4530() {
		assertEquals("Giuseppe", customers.get(4529).getFirstName());
	}

	@Test
	@DisplayName("Record 4530: LastName is Ciriaco")
	void LastNameOfRecord4530() {
		assertEquals("Ciriaco", customers.get(4529).getLastName());
	}

	@Test
	@DisplayName("Record 4530: Company is Sir Investments")
	void CompanyOfRecord4530() {
		assertEquals("Sir Investments", customers.get(4529).getCompany());
	}

	@Test
	@DisplayName("Record 4530: Address is 15 E 21st St")
	void AddressOfRecord4530() {
		assertEquals("15 E 21st St", customers.get(4529).getAddress());
	}

	@Test
	@DisplayName("Record 4530: City is Linden")
	void CityOfRecord4530() {
		assertEquals("Linden", customers.get(4529).getCity());
	}

	@Test
	@DisplayName("Record 4530: County is Union")
	void CountyOfRecord4530() {
		assertEquals("Union", customers.get(4529).getCounty());
	}

	@Test
	@DisplayName("Record 4530: State is NJ")
	void StateOfRecord4530() {
		assertEquals("NJ", customers.get(4529).getState());
	}

	@Test
	@DisplayName("Record 4530: ZIP is 7036")
	void ZIPOfRecord4530() {
		assertEquals("07036", customers.get(4529).getZIP());
	}

	@Test
	@DisplayName("Record 4530: Phone is 908-862-4569")
	void PhoneOfRecord4530() {
		assertEquals("908-862-4569", customers.get(4529).getPhone());
	}

	@Test
	@DisplayName("Record 4530: Fax is 908-862-5262")
	void FaxOfRecord4530() {
		assertEquals("908-862-5262", customers.get(4529).getFax());
	}

	@Test
	@DisplayName("Record 4530: Email is giuseppe@ciriaco.com")
	void EmailOfRecord4530() {
		assertEquals("giuseppe@ciriaco.com", customers.get(4529).getEmail());
	}

	@Test
	@DisplayName("Record 4530: Web is http://www.giuseppeciriaco.com")
	void WebOfRecord4530() {
		assertEquals("http://www.giuseppeciriaco.com", customers.get(4529).getWeb());
	}
}
