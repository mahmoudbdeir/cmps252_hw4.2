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

@Tag("31")
class Record_3484 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3484: FirstName is Jody")
	void FirstNameOfRecord3484() {
		assertEquals("Jody", customers.get(3483).getFirstName());
	}

	@Test
	@DisplayName("Record 3484: LastName is Durward")
	void LastNameOfRecord3484() {
		assertEquals("Durward", customers.get(3483).getLastName());
	}

	@Test
	@DisplayName("Record 3484: Company is Hickory Baked Ham Co")
	void CompanyOfRecord3484() {
		assertEquals("Hickory Baked Ham Co", customers.get(3483).getCompany());
	}

	@Test
	@DisplayName("Record 3484: Address is 113 Saint Clair Ave Ne")
	void AddressOfRecord3484() {
		assertEquals("113 Saint Clair Ave Ne", customers.get(3483).getAddress());
	}

	@Test
	@DisplayName("Record 3484: City is Cleveland")
	void CityOfRecord3484() {
		assertEquals("Cleveland", customers.get(3483).getCity());
	}

	@Test
	@DisplayName("Record 3484: County is Cuyahoga")
	void CountyOfRecord3484() {
		assertEquals("Cuyahoga", customers.get(3483).getCounty());
	}

	@Test
	@DisplayName("Record 3484: State is OH")
	void StateOfRecord3484() {
		assertEquals("OH", customers.get(3483).getState());
	}

	@Test
	@DisplayName("Record 3484: ZIP is 44114")
	void ZIPOfRecord3484() {
		assertEquals("44114", customers.get(3483).getZIP());
	}

	@Test
	@DisplayName("Record 3484: Phone is 216-696-4988")
	void PhoneOfRecord3484() {
		assertEquals("216-696-4988", customers.get(3483).getPhone());
	}

	@Test
	@DisplayName("Record 3484: Fax is 216-696-7467")
	void FaxOfRecord3484() {
		assertEquals("216-696-7467", customers.get(3483).getFax());
	}

	@Test
	@DisplayName("Record 3484: Email is jody@durward.com")
	void EmailOfRecord3484() {
		assertEquals("jody@durward.com", customers.get(3483).getEmail());
	}

	@Test
	@DisplayName("Record 3484: Web is http://www.jodydurward.com")
	void WebOfRecord3484() {
		assertEquals("http://www.jodydurward.com", customers.get(3483).getWeb());
	}
}
