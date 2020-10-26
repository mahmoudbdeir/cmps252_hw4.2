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
class Record_4896 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4896: FirstName is Theron")
	void FirstNameOfRecord4896() {
		assertEquals("Theron", customers.get(4895).getFirstName());
	}

	@Test
	@DisplayName("Record 4896: LastName is Henrichs")
	void LastNameOfRecord4896() {
		assertEquals("Henrichs", customers.get(4895).getLastName());
	}

	@Test
	@DisplayName("Record 4896: Company is Maltby Electric Supply Co Inc")
	void CompanyOfRecord4896() {
		assertEquals("Maltby Electric Supply Co Inc", customers.get(4895).getCompany());
	}

	@Test
	@DisplayName("Record 4896: Address is 2 John St")
	void AddressOfRecord4896() {
		assertEquals("2 John St", customers.get(4895).getAddress());
	}

	@Test
	@DisplayName("Record 4896: City is Haledon")
	void CityOfRecord4896() {
		assertEquals("Haledon", customers.get(4895).getCity());
	}

	@Test
	@DisplayName("Record 4896: County is Passaic")
	void CountyOfRecord4896() {
		assertEquals("Passaic", customers.get(4895).getCounty());
	}

	@Test
	@DisplayName("Record 4896: State is NJ")
	void StateOfRecord4896() {
		assertEquals("NJ", customers.get(4895).getState());
	}

	@Test
	@DisplayName("Record 4896: ZIP is 7508")
	void ZIPOfRecord4896() {
		assertEquals("7508", customers.get(4895).getZIP());
	}

	@Test
	@DisplayName("Record 4896: Phone is 973-956-8552")
	void PhoneOfRecord4896() {
		assertEquals("973-956-8552", customers.get(4895).getPhone());
	}

	@Test
	@DisplayName("Record 4896: Fax is 973-956-5645")
	void FaxOfRecord4896() {
		assertEquals("973-956-5645", customers.get(4895).getFax());
	}

	@Test
	@DisplayName("Record 4896: Email is theron@henrichs.com")
	void EmailOfRecord4896() {
		assertEquals("theron@henrichs.com", customers.get(4895).getEmail());
	}

	@Test
	@DisplayName("Record 4896: Web is http://www.theronhenrichs.com")
	void WebOfRecord4896() {
		assertEquals("http://www.theronhenrichs.com", customers.get(4895).getWeb());
	}
}
