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

@Tag("17")
class Record_2594 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2594: FirstName is Rickey")
	void FirstNameOfRecord2594() {
		assertEquals("Rickey", customers.get(2593).getFirstName());
	}

	@Test
	@DisplayName("Record 2594: LastName is Oh")
	void LastNameOfRecord2594() {
		assertEquals("Oh", customers.get(2593).getLastName());
	}

	@Test
	@DisplayName("Record 2594: Company is Contemporary Productions Inc")
	void CompanyOfRecord2594() {
		assertEquals("Contemporary Productions Inc", customers.get(2593).getCompany());
	}

	@Test
	@DisplayName("Record 2594: Address is 58 E Centre St")
	void AddressOfRecord2594() {
		assertEquals("58 E Centre St", customers.get(2593).getAddress());
	}

	@Test
	@DisplayName("Record 2594: City is Deptford")
	void CityOfRecord2594() {
		assertEquals("Deptford", customers.get(2593).getCity());
	}

	@Test
	@DisplayName("Record 2594: County is Gloucester")
	void CountyOfRecord2594() {
		assertEquals("Gloucester", customers.get(2593).getCounty());
	}

	@Test
	@DisplayName("Record 2594: State is NJ")
	void StateOfRecord2594() {
		assertEquals("NJ", customers.get(2593).getState());
	}

	@Test
	@DisplayName("Record 2594: ZIP is 8096")
	void ZIPOfRecord2594() {
		assertEquals("8096", customers.get(2593).getZIP());
	}

	@Test
	@DisplayName("Record 2594: Phone is 856-798-9884")
	void PhoneOfRecord2594() {
		assertEquals("856-798-9884", customers.get(2593).getPhone());
	}

	@Test
	@DisplayName("Record 2594: Fax is 856-798-9948")
	void FaxOfRecord2594() {
		assertEquals("856-798-9948", customers.get(2593).getFax());
	}

	@Test
	@DisplayName("Record 2594: Email is rickey@oh.com")
	void EmailOfRecord2594() {
		assertEquals("rickey@oh.com", customers.get(2593).getEmail());
	}

	@Test
	@DisplayName("Record 2594: Web is http://www.rickeyoh.com")
	void WebOfRecord2594() {
		assertEquals("http://www.rickeyoh.com", customers.get(2593).getWeb());
	}
}
