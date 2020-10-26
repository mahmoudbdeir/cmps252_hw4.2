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

@Tag("38")
class Record_2178 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2178: FirstName is Daryl")
	void FirstNameOfRecord2178() {
		assertEquals("Daryl", customers.get(2177).getFirstName());
	}

	@Test
	@DisplayName("Record 2178: LastName is Kadner")
	void LastNameOfRecord2178() {
		assertEquals("Kadner", customers.get(2177).getLastName());
	}

	@Test
	@DisplayName("Record 2178: Company is Pointers Caulkers & Clnrs Lcl")
	void CompanyOfRecord2178() {
		assertEquals("Pointers Caulkers & Clnrs Lcl", customers.get(2177).getCompany());
	}

	@Test
	@DisplayName("Record 2178: Address is 2939 W Culver St")
	void AddressOfRecord2178() {
		assertEquals("2939 W Culver St", customers.get(2177).getAddress());
	}

	@Test
	@DisplayName("Record 2178: City is Phoenix")
	void CityOfRecord2178() {
		assertEquals("Phoenix", customers.get(2177).getCity());
	}

	@Test
	@DisplayName("Record 2178: County is Maricopa")
	void CountyOfRecord2178() {
		assertEquals("Maricopa", customers.get(2177).getCounty());
	}

	@Test
	@DisplayName("Record 2178: State is AZ")
	void StateOfRecord2178() {
		assertEquals("AZ", customers.get(2177).getState());
	}

	@Test
	@DisplayName("Record 2178: ZIP is 85009")
	void ZIPOfRecord2178() {
		assertEquals("85009", customers.get(2177).getZIP());
	}

	@Test
	@DisplayName("Record 2178: Phone is 602-233-4904")
	void PhoneOfRecord2178() {
		assertEquals("602-233-4904", customers.get(2177).getPhone());
	}

	@Test
	@DisplayName("Record 2178: Fax is 602-233-9872")
	void FaxOfRecord2178() {
		assertEquals("602-233-9872", customers.get(2177).getFax());
	}

	@Test
	@DisplayName("Record 2178: Email is daryl@kadner.com")
	void EmailOfRecord2178() {
		assertEquals("daryl@kadner.com", customers.get(2177).getEmail());
	}

	@Test
	@DisplayName("Record 2178: Web is http://www.darylkadner.com")
	void WebOfRecord2178() {
		assertEquals("http://www.darylkadner.com", customers.get(2177).getWeb());
	}
}
