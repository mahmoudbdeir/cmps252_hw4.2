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

@Tag("27")
class Record_2706 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2706: FirstName is Janel")
	void FirstNameOfRecord2706() {
		assertEquals("Janel", customers.get(2705).getFirstName());
	}

	@Test
	@DisplayName("Record 2706: LastName is Cina")
	void LastNameOfRecord2706() {
		assertEquals("Cina", customers.get(2705).getLastName());
	}

	@Test
	@DisplayName("Record 2706: Company is Bertsch Properties")
	void CompanyOfRecord2706() {
		assertEquals("Bertsch Properties", customers.get(2705).getCompany());
	}

	@Test
	@DisplayName("Record 2706: Address is 448 E Middlefield Rd")
	void AddressOfRecord2706() {
		assertEquals("448 E Middlefield Rd", customers.get(2705).getAddress());
	}

	@Test
	@DisplayName("Record 2706: City is Mountain View")
	void CityOfRecord2706() {
		assertEquals("Mountain View", customers.get(2705).getCity());
	}

	@Test
	@DisplayName("Record 2706: County is Santa Clara")
	void CountyOfRecord2706() {
		assertEquals("Santa Clara", customers.get(2705).getCounty());
	}

	@Test
	@DisplayName("Record 2706: State is CA")
	void StateOfRecord2706() {
		assertEquals("CA", customers.get(2705).getState());
	}

	@Test
	@DisplayName("Record 2706: ZIP is 94043")
	void ZIPOfRecord2706() {
		assertEquals("94043", customers.get(2705).getZIP());
	}

	@Test
	@DisplayName("Record 2706: Phone is 650-961-0318")
	void PhoneOfRecord2706() {
		assertEquals("650-961-0318", customers.get(2705).getPhone());
	}

	@Test
	@DisplayName("Record 2706: Fax is 650-961-4218")
	void FaxOfRecord2706() {
		assertEquals("650-961-4218", customers.get(2705).getFax());
	}

	@Test
	@DisplayName("Record 2706: Email is janel@cina.com")
	void EmailOfRecord2706() {
		assertEquals("janel@cina.com", customers.get(2705).getEmail());
	}

	@Test
	@DisplayName("Record 2706: Web is http://www.janelcina.com")
	void WebOfRecord2706() {
		assertEquals("http://www.janelcina.com", customers.get(2705).getWeb());
	}
}
