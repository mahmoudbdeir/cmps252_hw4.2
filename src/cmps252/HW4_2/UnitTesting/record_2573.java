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

@Tag("19")
class Record_2573 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2573: FirstName is Nettie")
	void FirstNameOfRecord2573() {
		assertEquals("Nettie", customers.get(2572).getFirstName());
	}

	@Test
	@DisplayName("Record 2573: LastName is Carothers")
	void LastNameOfRecord2573() {
		assertEquals("Carothers", customers.get(2572).getLastName());
	}

	@Test
	@DisplayName("Record 2573: Company is Mainline Pipe Service")
	void CompanyOfRecord2573() {
		assertEquals("Mainline Pipe Service", customers.get(2572).getCompany());
	}

	@Test
	@DisplayName("Record 2573: Address is 244 Pedretti Ave")
	void AddressOfRecord2573() {
		assertEquals("244 Pedretti Ave", customers.get(2572).getAddress());
	}

	@Test
	@DisplayName("Record 2573: City is Cincinnati")
	void CityOfRecord2573() {
		assertEquals("Cincinnati", customers.get(2572).getCity());
	}

	@Test
	@DisplayName("Record 2573: County is Hamilton")
	void CountyOfRecord2573() {
		assertEquals("Hamilton", customers.get(2572).getCounty());
	}

	@Test
	@DisplayName("Record 2573: State is OH")
	void StateOfRecord2573() {
		assertEquals("OH", customers.get(2572).getState());
	}

	@Test
	@DisplayName("Record 2573: ZIP is 45238")
	void ZIPOfRecord2573() {
		assertEquals("45238", customers.get(2572).getZIP());
	}

	@Test
	@DisplayName("Record 2573: Phone is 513-251-0996")
	void PhoneOfRecord2573() {
		assertEquals("513-251-0996", customers.get(2572).getPhone());
	}

	@Test
	@DisplayName("Record 2573: Fax is 513-251-3566")
	void FaxOfRecord2573() {
		assertEquals("513-251-3566", customers.get(2572).getFax());
	}

	@Test
	@DisplayName("Record 2573: Email is nettie@carothers.com")
	void EmailOfRecord2573() {
		assertEquals("nettie@carothers.com", customers.get(2572).getEmail());
	}

	@Test
	@DisplayName("Record 2573: Web is http://www.nettiecarothers.com")
	void WebOfRecord2573() {
		assertEquals("http://www.nettiecarothers.com", customers.get(2572).getWeb());
	}
}
