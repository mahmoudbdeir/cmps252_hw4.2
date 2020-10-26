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
class Record_4213 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4213: FirstName is Jan")
	void FirstNameOfRecord4213() {
		assertEquals("Jan", customers.get(4212).getFirstName());
	}

	@Test
	@DisplayName("Record 4213: LastName is Hariri")
	void LastNameOfRecord4213() {
		assertEquals("Hariri", customers.get(4212).getLastName());
	}

	@Test
	@DisplayName("Record 4213: Company is Strata Graphics Inc")
	void CompanyOfRecord4213() {
		assertEquals("Strata Graphics Inc", customers.get(4212).getCompany());
	}

	@Test
	@DisplayName("Record 4213: Address is 3 Thorburn Ave")
	void AddressOfRecord4213() {
		assertEquals("3 Thorburn Ave", customers.get(4212).getAddress());
	}

	@Test
	@DisplayName("Record 4213: City is Lindenhurst")
	void CityOfRecord4213() {
		assertEquals("Lindenhurst", customers.get(4212).getCity());
	}

	@Test
	@DisplayName("Record 4213: County is Suffolk")
	void CountyOfRecord4213() {
		assertEquals("Suffolk", customers.get(4212).getCounty());
	}

	@Test
	@DisplayName("Record 4213: State is NY")
	void StateOfRecord4213() {
		assertEquals("NY", customers.get(4212).getState());
	}

	@Test
	@DisplayName("Record 4213: ZIP is 11757")
	void ZIPOfRecord4213() {
		assertEquals("11757", customers.get(4212).getZIP());
	}

	@Test
	@DisplayName("Record 4213: Phone is 631-669-6733")
	void PhoneOfRecord4213() {
		assertEquals("631-669-6733", customers.get(4212).getPhone());
	}

	@Test
	@DisplayName("Record 4213: Fax is 631-669-6879")
	void FaxOfRecord4213() {
		assertEquals("631-669-6879", customers.get(4212).getFax());
	}

	@Test
	@DisplayName("Record 4213: Email is jan@hariri.com")
	void EmailOfRecord4213() {
		assertEquals("jan@hariri.com", customers.get(4212).getEmail());
	}

	@Test
	@DisplayName("Record 4213: Web is http://www.janhariri.com")
	void WebOfRecord4213() {
		assertEquals("http://www.janhariri.com", customers.get(4212).getWeb());
	}
}
