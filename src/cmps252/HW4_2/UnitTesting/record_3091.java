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

@Tag("13")
class Record_3091 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3091: FirstName is Erick")
	void FirstNameOfRecord3091() {
		assertEquals("Erick", customers.get(3090).getFirstName());
	}

	@Test
	@DisplayName("Record 3091: LastName is Monteleone")
	void LastNameOfRecord3091() {
		assertEquals("Monteleone", customers.get(3090).getLastName());
	}

	@Test
	@DisplayName("Record 3091: Company is L D Amory Co")
	void CompanyOfRecord3091() {
		assertEquals("L D Amory Co", customers.get(3090).getCompany());
	}

	@Test
	@DisplayName("Record 3091: Address is 3030 Elmore Park Rd")
	void AddressOfRecord3091() {
		assertEquals("3030 Elmore Park Rd", customers.get(3090).getAddress());
	}

	@Test
	@DisplayName("Record 3091: City is Memphis")
	void CityOfRecord3091() {
		assertEquals("Memphis", customers.get(3090).getCity());
	}

	@Test
	@DisplayName("Record 3091: County is Shelby")
	void CountyOfRecord3091() {
		assertEquals("Shelby", customers.get(3090).getCounty());
	}

	@Test
	@DisplayName("Record 3091: State is TN")
	void StateOfRecord3091() {
		assertEquals("TN", customers.get(3090).getState());
	}

	@Test
	@DisplayName("Record 3091: ZIP is 38134")
	void ZIPOfRecord3091() {
		assertEquals("38134", customers.get(3090).getZIP());
	}

	@Test
	@DisplayName("Record 3091: Phone is 901-372-7652")
	void PhoneOfRecord3091() {
		assertEquals("901-372-7652", customers.get(3090).getPhone());
	}

	@Test
	@DisplayName("Record 3091: Fax is 901-372-5706")
	void FaxOfRecord3091() {
		assertEquals("901-372-5706", customers.get(3090).getFax());
	}

	@Test
	@DisplayName("Record 3091: Email is erick@monteleone.com")
	void EmailOfRecord3091() {
		assertEquals("erick@monteleone.com", customers.get(3090).getEmail());
	}

	@Test
	@DisplayName("Record 3091: Web is http://www.erickmonteleone.com")
	void WebOfRecord3091() {
		assertEquals("http://www.erickmonteleone.com", customers.get(3090).getWeb());
	}
}
