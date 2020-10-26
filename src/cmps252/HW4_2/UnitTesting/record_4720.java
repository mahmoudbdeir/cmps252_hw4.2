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

@Tag("9")
class Record_4720 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4720: FirstName is Peter")
	void FirstNameOfRecord4720() {
		assertEquals("Peter", customers.get(4719).getFirstName());
	}

	@Test
	@DisplayName("Record 4720: LastName is Mcdonagh")
	void LastNameOfRecord4720() {
		assertEquals("Mcdonagh", customers.get(4719).getLastName());
	}

	@Test
	@DisplayName("Record 4720: Company is Century Graphics")
	void CompanyOfRecord4720() {
		assertEquals("Century Graphics", customers.get(4719).getCompany());
	}

	@Test
	@DisplayName("Record 4720: Address is Rr 2")
	void AddressOfRecord4720() {
		assertEquals("Rr 2", customers.get(4719).getAddress());
	}

	@Test
	@DisplayName("Record 4720: City is Bloomington")
	void CityOfRecord4720() {
		assertEquals("Bloomington", customers.get(4719).getCity());
	}

	@Test
	@DisplayName("Record 4720: County is McLean")
	void CountyOfRecord4720() {
		assertEquals("McLean", customers.get(4719).getCounty());
	}

	@Test
	@DisplayName("Record 4720: State is IL")
	void StateOfRecord4720() {
		assertEquals("IL", customers.get(4719).getState());
	}

	@Test
	@DisplayName("Record 4720: ZIP is 61704")
	void ZIPOfRecord4720() {
		assertEquals("61704", customers.get(4719).getZIP());
	}

	@Test
	@DisplayName("Record 4720: Phone is 309-378-2433")
	void PhoneOfRecord4720() {
		assertEquals("309-378-2433", customers.get(4719).getPhone());
	}

	@Test
	@DisplayName("Record 4720: Fax is 309-378-9809")
	void FaxOfRecord4720() {
		assertEquals("309-378-9809", customers.get(4719).getFax());
	}

	@Test
	@DisplayName("Record 4720: Email is peter@mcdonagh.com")
	void EmailOfRecord4720() {
		assertEquals("peter@mcdonagh.com", customers.get(4719).getEmail());
	}

	@Test
	@DisplayName("Record 4720: Web is http://www.petermcdonagh.com")
	void WebOfRecord4720() {
		assertEquals("http://www.petermcdonagh.com", customers.get(4719).getWeb());
	}
}
