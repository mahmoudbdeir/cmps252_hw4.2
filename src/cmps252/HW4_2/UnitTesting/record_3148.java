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

@Tag("39")
class Record_3148 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3148: FirstName is Jonah")
	void FirstNameOfRecord3148() {
		assertEquals("Jonah", customers.get(3147).getFirstName());
	}

	@Test
	@DisplayName("Record 3148: LastName is Branecki")
	void LastNameOfRecord3148() {
		assertEquals("Branecki", customers.get(3147).getLastName());
	}

	@Test
	@DisplayName("Record 3148: Company is Travelodge")
	void CompanyOfRecord3148() {
		assertEquals("Travelodge", customers.get(3147).getCompany());
	}

	@Test
	@DisplayName("Record 3148: Address is 118 New Circle Rd Ne")
	void AddressOfRecord3148() {
		assertEquals("118 New Circle Rd Ne", customers.get(3147).getAddress());
	}

	@Test
	@DisplayName("Record 3148: City is Lexington")
	void CityOfRecord3148() {
		assertEquals("Lexington", customers.get(3147).getCity());
	}

	@Test
	@DisplayName("Record 3148: County is Fayette")
	void CountyOfRecord3148() {
		assertEquals("Fayette", customers.get(3147).getCounty());
	}

	@Test
	@DisplayName("Record 3148: State is KY")
	void StateOfRecord3148() {
		assertEquals("KY", customers.get(3147).getState());
	}

	@Test
	@DisplayName("Record 3148: ZIP is 40505")
	void ZIPOfRecord3148() {
		assertEquals("40505", customers.get(3147).getZIP());
	}

	@Test
	@DisplayName("Record 3148: Phone is 859-254-3949")
	void PhoneOfRecord3148() {
		assertEquals("859-254-3949", customers.get(3147).getPhone());
	}

	@Test
	@DisplayName("Record 3148: Fax is 859-254-9156")
	void FaxOfRecord3148() {
		assertEquals("859-254-9156", customers.get(3147).getFax());
	}

	@Test
	@DisplayName("Record 3148: Email is jonah@branecki.com")
	void EmailOfRecord3148() {
		assertEquals("jonah@branecki.com", customers.get(3147).getEmail());
	}

	@Test
	@DisplayName("Record 3148: Web is http://www.jonahbranecki.com")
	void WebOfRecord3148() {
		assertEquals("http://www.jonahbranecki.com", customers.get(3147).getWeb());
	}
}
