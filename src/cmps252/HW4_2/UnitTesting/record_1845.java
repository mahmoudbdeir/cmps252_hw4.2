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

@Tag("37")
class Record_1845 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1845: FirstName is Harlan")
	void FirstNameOfRecord1845() {
		assertEquals("Harlan", customers.get(1844).getFirstName());
	}

	@Test
	@DisplayName("Record 1845: LastName is Gerhold")
	void LastNameOfRecord1845() {
		assertEquals("Gerhold", customers.get(1844).getLastName());
	}

	@Test
	@DisplayName("Record 1845: Company is Red Roof Inns")
	void CompanyOfRecord1845() {
		assertEquals("Red Roof Inns", customers.get(1844).getCompany());
	}

	@Test
	@DisplayName("Record 1845: Address is 16077 Se Evelyn St")
	void AddressOfRecord1845() {
		assertEquals("16077 Se Evelyn St", customers.get(1844).getAddress());
	}

	@Test
	@DisplayName("Record 1845: City is Clackamas")
	void CityOfRecord1845() {
		assertEquals("Clackamas", customers.get(1844).getCity());
	}

	@Test
	@DisplayName("Record 1845: County is Clackamas")
	void CountyOfRecord1845() {
		assertEquals("Clackamas", customers.get(1844).getCounty());
	}

	@Test
	@DisplayName("Record 1845: State is OR")
	void StateOfRecord1845() {
		assertEquals("OR", customers.get(1844).getState());
	}

	@Test
	@DisplayName("Record 1845: ZIP is 97015")
	void ZIPOfRecord1845() {
		assertEquals("97015", customers.get(1844).getZIP());
	}

	@Test
	@DisplayName("Record 1845: Phone is 503-655-0356")
	void PhoneOfRecord1845() {
		assertEquals("503-655-0356", customers.get(1844).getPhone());
	}

	@Test
	@DisplayName("Record 1845: Fax is 503-655-7816")
	void FaxOfRecord1845() {
		assertEquals("503-655-7816", customers.get(1844).getFax());
	}

	@Test
	@DisplayName("Record 1845: Email is harlan@gerhold.com")
	void EmailOfRecord1845() {
		assertEquals("harlan@gerhold.com", customers.get(1844).getEmail());
	}

	@Test
	@DisplayName("Record 1845: Web is http://www.harlangerhold.com")
	void WebOfRecord1845() {
		assertEquals("http://www.harlangerhold.com", customers.get(1844).getWeb());
	}
}
