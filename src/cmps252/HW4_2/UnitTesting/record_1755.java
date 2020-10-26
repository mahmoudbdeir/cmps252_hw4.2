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

@Tag("32")
class Record_1755 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1755: FirstName is Clayton")
	void FirstNameOfRecord1755() {
		assertEquals("Clayton", customers.get(1754).getFirstName());
	}

	@Test
	@DisplayName("Record 1755: LastName is Bark")
	void LastNameOfRecord1755() {
		assertEquals("Bark", customers.get(1754).getLastName());
	}

	@Test
	@DisplayName("Record 1755: Company is Jack Larsen Lenor Inc")
	void CompanyOfRecord1755() {
		assertEquals("Jack Larsen Lenor Inc", customers.get(1754).getCompany());
	}

	@Test
	@DisplayName("Record 1755: Address is 5 Washington St")
	void AddressOfRecord1755() {
		assertEquals("5 Washington St", customers.get(1754).getAddress());
	}

	@Test
	@DisplayName("Record 1755: City is Rocky Hill")
	void CityOfRecord1755() {
		assertEquals("Rocky Hill", customers.get(1754).getCity());
	}

	@Test
	@DisplayName("Record 1755: County is Somerset")
	void CountyOfRecord1755() {
		assertEquals("Somerset", customers.get(1754).getCounty());
	}

	@Test
	@DisplayName("Record 1755: State is NJ")
	void StateOfRecord1755() {
		assertEquals("NJ", customers.get(1754).getState());
	}

	@Test
	@DisplayName("Record 1755: ZIP is 8553")
	void ZIPOfRecord1755() {
		assertEquals("8553", customers.get(1754).getZIP());
	}

	@Test
	@DisplayName("Record 1755: Phone is 609-921-9242")
	void PhoneOfRecord1755() {
		assertEquals("609-921-9242", customers.get(1754).getPhone());
	}

	@Test
	@DisplayName("Record 1755: Fax is 609-921-2548")
	void FaxOfRecord1755() {
		assertEquals("609-921-2548", customers.get(1754).getFax());
	}

	@Test
	@DisplayName("Record 1755: Email is clayton@bark.com")
	void EmailOfRecord1755() {
		assertEquals("clayton@bark.com", customers.get(1754).getEmail());
	}

	@Test
	@DisplayName("Record 1755: Web is http://www.claytonbark.com")
	void WebOfRecord1755() {
		assertEquals("http://www.claytonbark.com", customers.get(1754).getWeb());
	}
}
