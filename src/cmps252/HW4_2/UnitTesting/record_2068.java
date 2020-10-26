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

@Tag("5")
class Record_2068 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2068: FirstName is Lilly")
	void FirstNameOfRecord2068() {
		assertEquals("Lilly", customers.get(2067).getFirstName());
	}

	@Test
	@DisplayName("Record 2068: LastName is Tobery")
	void LastNameOfRecord2068() {
		assertEquals("Tobery", customers.get(2067).getLastName());
	}

	@Test
	@DisplayName("Record 2068: Company is Daley, P Martin")
	void CompanyOfRecord2068() {
		assertEquals("Daley, P Martin", customers.get(2067).getCompany());
	}

	@Test
	@DisplayName("Record 2068: Address is 135 Old Branchville Rd")
	void AddressOfRecord2068() {
		assertEquals("135 Old Branchville Rd", customers.get(2067).getAddress());
	}

	@Test
	@DisplayName("Record 2068: City is Ridgefield")
	void CityOfRecord2068() {
		assertEquals("Ridgefield", customers.get(2067).getCity());
	}

	@Test
	@DisplayName("Record 2068: County is Fairfield")
	void CountyOfRecord2068() {
		assertEquals("Fairfield", customers.get(2067).getCounty());
	}

	@Test
	@DisplayName("Record 2068: State is CT")
	void StateOfRecord2068() {
		assertEquals("CT", customers.get(2067).getState());
	}

	@Test
	@DisplayName("Record 2068: ZIP is 6877")
	void ZIPOfRecord2068() {
		assertEquals("6877", customers.get(2067).getZIP());
	}

	@Test
	@DisplayName("Record 2068: Phone is 203-438-9304")
	void PhoneOfRecord2068() {
		assertEquals("203-438-9304", customers.get(2067).getPhone());
	}

	@Test
	@DisplayName("Record 2068: Fax is 203-438-4178")
	void FaxOfRecord2068() {
		assertEquals("203-438-4178", customers.get(2067).getFax());
	}

	@Test
	@DisplayName("Record 2068: Email is lilly@tobery.com")
	void EmailOfRecord2068() {
		assertEquals("lilly@tobery.com", customers.get(2067).getEmail());
	}

	@Test
	@DisplayName("Record 2068: Web is http://www.lillytobery.com")
	void WebOfRecord2068() {
		assertEquals("http://www.lillytobery.com", customers.get(2067).getWeb());
	}
}
