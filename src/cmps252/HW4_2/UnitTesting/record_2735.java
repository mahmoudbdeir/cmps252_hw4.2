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

@Tag("36")
class Record_2735 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2735: FirstName is Mari")
	void FirstNameOfRecord2735() {
		assertEquals("Mari", customers.get(2734).getFirstName());
	}

	@Test
	@DisplayName("Record 2735: LastName is Shively")
	void LastNameOfRecord2735() {
		assertEquals("Shively", customers.get(2734).getLastName());
	}

	@Test
	@DisplayName("Record 2735: Company is Gunn Godfrey & Allison")
	void CompanyOfRecord2735() {
		assertEquals("Gunn Godfrey & Allison", customers.get(2734).getCompany());
	}

	@Test
	@DisplayName("Record 2735: Address is 6565 Eastland Rd")
	void AddressOfRecord2735() {
		assertEquals("6565 Eastland Rd", customers.get(2734).getAddress());
	}

	@Test
	@DisplayName("Record 2735: City is Brook Park")
	void CityOfRecord2735() {
		assertEquals("Brook Park", customers.get(2734).getCity());
	}

	@Test
	@DisplayName("Record 2735: County is Cuyahoga")
	void CountyOfRecord2735() {
		assertEquals("Cuyahoga", customers.get(2734).getCounty());
	}

	@Test
	@DisplayName("Record 2735: State is OH")
	void StateOfRecord2735() {
		assertEquals("OH", customers.get(2734).getState());
	}

	@Test
	@DisplayName("Record 2735: ZIP is 44142")
	void ZIPOfRecord2735() {
		assertEquals("44142", customers.get(2734).getZIP());
	}

	@Test
	@DisplayName("Record 2735: Phone is 216-826-3475")
	void PhoneOfRecord2735() {
		assertEquals("216-826-3475", customers.get(2734).getPhone());
	}

	@Test
	@DisplayName("Record 2735: Fax is 216-826-9672")
	void FaxOfRecord2735() {
		assertEquals("216-826-9672", customers.get(2734).getFax());
	}

	@Test
	@DisplayName("Record 2735: Email is mari@shively.com")
	void EmailOfRecord2735() {
		assertEquals("mari@shively.com", customers.get(2734).getEmail());
	}

	@Test
	@DisplayName("Record 2735: Web is http://www.marishively.com")
	void WebOfRecord2735() {
		assertEquals("http://www.marishively.com", customers.get(2734).getWeb());
	}
}
