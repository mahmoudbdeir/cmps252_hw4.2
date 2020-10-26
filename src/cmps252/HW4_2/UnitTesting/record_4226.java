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

@Tag("22")
class Record_4226 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4226: FirstName is Oliver")
	void FirstNameOfRecord4226() {
		assertEquals("Oliver", customers.get(4225).getFirstName());
	}

	@Test
	@DisplayName("Record 4226: LastName is Granby")
	void LastNameOfRecord4226() {
		assertEquals("Granby", customers.get(4225).getLastName());
	}

	@Test
	@DisplayName("Record 4226: Company is Computer Train Ctr Princeton")
	void CompanyOfRecord4226() {
		assertEquals("Computer Train Ctr Princeton", customers.get(4225).getCompany());
	}

	@Test
	@DisplayName("Record 4226: Address is 1609 Chapel Ave W")
	void AddressOfRecord4226() {
		assertEquals("1609 Chapel Ave W", customers.get(4225).getAddress());
	}

	@Test
	@DisplayName("Record 4226: City is Cherry Hill")
	void CityOfRecord4226() {
		assertEquals("Cherry Hill", customers.get(4225).getCity());
	}

	@Test
	@DisplayName("Record 4226: County is Camden")
	void CountyOfRecord4226() {
		assertEquals("Camden", customers.get(4225).getCounty());
	}

	@Test
	@DisplayName("Record 4226: State is NJ")
	void StateOfRecord4226() {
		assertEquals("NJ", customers.get(4225).getState());
	}

	@Test
	@DisplayName("Record 4226: ZIP is 8002")
	void ZIPOfRecord4226() {
		assertEquals("8002", customers.get(4225).getZIP());
	}

	@Test
	@DisplayName("Record 4226: Phone is 856-829-2269")
	void PhoneOfRecord4226() {
		assertEquals("856-829-2269", customers.get(4225).getPhone());
	}

	@Test
	@DisplayName("Record 4226: Fax is 856-829-1749")
	void FaxOfRecord4226() {
		assertEquals("856-829-1749", customers.get(4225).getFax());
	}

	@Test
	@DisplayName("Record 4226: Email is oliver@granby.com")
	void EmailOfRecord4226() {
		assertEquals("oliver@granby.com", customers.get(4225).getEmail());
	}

	@Test
	@DisplayName("Record 4226: Web is http://www.olivergranby.com")
	void WebOfRecord4226() {
		assertEquals("http://www.olivergranby.com", customers.get(4225).getWeb());
	}
}
