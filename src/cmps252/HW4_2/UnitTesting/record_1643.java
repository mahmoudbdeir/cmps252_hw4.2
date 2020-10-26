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

@Tag("26")
class Record_1643 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1643: FirstName is Normand")
	void FirstNameOfRecord1643() {
		assertEquals("Normand", customers.get(1642).getFirstName());
	}

	@Test
	@DisplayName("Record 1643: LastName is Leviton")
	void LastNameOfRecord1643() {
		assertEquals("Leviton", customers.get(1642).getLastName());
	}

	@Test
	@DisplayName("Record 1643: Company is Fox, Mark D Esq")
	void CompanyOfRecord1643() {
		assertEquals("Fox, Mark D Esq", customers.get(1642).getCompany());
	}

	@Test
	@DisplayName("Record 1643: Address is 6 Stamford Forum")
	void AddressOfRecord1643() {
		assertEquals("6 Stamford Forum", customers.get(1642).getAddress());
	}

	@Test
	@DisplayName("Record 1643: City is Stamford")
	void CityOfRecord1643() {
		assertEquals("Stamford", customers.get(1642).getCity());
	}

	@Test
	@DisplayName("Record 1643: County is Fairfield")
	void CountyOfRecord1643() {
		assertEquals("Fairfield", customers.get(1642).getCounty());
	}

	@Test
	@DisplayName("Record 1643: State is CT")
	void StateOfRecord1643() {
		assertEquals("CT", customers.get(1642).getState());
	}

	@Test
	@DisplayName("Record 1643: ZIP is 6901")
	void ZIPOfRecord1643() {
		assertEquals("6901", customers.get(1642).getZIP());
	}

	@Test
	@DisplayName("Record 1643: Phone is 203-327-0712")
	void PhoneOfRecord1643() {
		assertEquals("203-327-0712", customers.get(1642).getPhone());
	}

	@Test
	@DisplayName("Record 1643: Fax is 203-327-1666")
	void FaxOfRecord1643() {
		assertEquals("203-327-1666", customers.get(1642).getFax());
	}

	@Test
	@DisplayName("Record 1643: Email is normand@leviton.com")
	void EmailOfRecord1643() {
		assertEquals("normand@leviton.com", customers.get(1642).getEmail());
	}

	@Test
	@DisplayName("Record 1643: Web is http://www.normandleviton.com")
	void WebOfRecord1643() {
		assertEquals("http://www.normandleviton.com", customers.get(1642).getWeb());
	}
}
