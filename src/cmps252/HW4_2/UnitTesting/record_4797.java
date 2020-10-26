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

@Tag("20")
class Record_4797 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4797: FirstName is Lyndon")
	void FirstNameOfRecord4797() {
		assertEquals("Lyndon", customers.get(4796).getFirstName());
	}

	@Test
	@DisplayName("Record 4797: LastName is Briski")
	void LastNameOfRecord4797() {
		assertEquals("Briski", customers.get(4796).getLastName());
	}

	@Test
	@DisplayName("Record 4797: Company is Akerman Senterfitt & ydson Pa")
	void CompanyOfRecord4797() {
		assertEquals("Akerman Senterfitt & ydson Pa", customers.get(4796).getCompany());
	}

	@Test
	@DisplayName("Record 4797: Address is 2509 Summer Ave")
	void AddressOfRecord4797() {
		assertEquals("2509 Summer Ave", customers.get(4796).getAddress());
	}

	@Test
	@DisplayName("Record 4797: City is Memphis")
	void CityOfRecord4797() {
		assertEquals("Memphis", customers.get(4796).getCity());
	}

	@Test
	@DisplayName("Record 4797: County is Shelby")
	void CountyOfRecord4797() {
		assertEquals("Shelby", customers.get(4796).getCounty());
	}

	@Test
	@DisplayName("Record 4797: State is TN")
	void StateOfRecord4797() {
		assertEquals("TN", customers.get(4796).getState());
	}

	@Test
	@DisplayName("Record 4797: ZIP is 38112")
	void ZIPOfRecord4797() {
		assertEquals("38112", customers.get(4796).getZIP());
	}

	@Test
	@DisplayName("Record 4797: Phone is 901-323-4733")
	void PhoneOfRecord4797() {
		assertEquals("901-323-4733", customers.get(4796).getPhone());
	}

	@Test
	@DisplayName("Record 4797: Fax is 901-323-1731")
	void FaxOfRecord4797() {
		assertEquals("901-323-1731", customers.get(4796).getFax());
	}

	@Test
	@DisplayName("Record 4797: Email is lyndon@briski.com")
	void EmailOfRecord4797() {
		assertEquals("lyndon@briski.com", customers.get(4796).getEmail());
	}

	@Test
	@DisplayName("Record 4797: Web is http://www.lyndonbriski.com")
	void WebOfRecord4797() {
		assertEquals("http://www.lyndonbriski.com", customers.get(4796).getWeb());
	}
}
