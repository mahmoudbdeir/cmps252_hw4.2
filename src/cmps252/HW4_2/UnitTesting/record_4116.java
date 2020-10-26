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

@Tag("41")
class Record_4116 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4116: FirstName is Harrison")
	void FirstNameOfRecord4116() {
		assertEquals("Harrison", customers.get(4115).getFirstName());
	}

	@Test
	@DisplayName("Record 4116: LastName is Terrasas")
	void LastNameOfRecord4116() {
		assertEquals("Terrasas", customers.get(4115).getLastName());
	}

	@Test
	@DisplayName("Record 4116: Company is Portal Pipe Line Co")
	void CompanyOfRecord4116() {
		assertEquals("Portal Pipe Line Co", customers.get(4115).getCompany());
	}

	@Test
	@DisplayName("Record 4116: Address is 2007 Se Powell Blvd")
	void AddressOfRecord4116() {
		assertEquals("2007 Se Powell Blvd", customers.get(4115).getAddress());
	}

	@Test
	@DisplayName("Record 4116: City is Portland")
	void CityOfRecord4116() {
		assertEquals("Portland", customers.get(4115).getCity());
	}

	@Test
	@DisplayName("Record 4116: County is Multnomah")
	void CountyOfRecord4116() {
		assertEquals("Multnomah", customers.get(4115).getCounty());
	}

	@Test
	@DisplayName("Record 4116: State is OR")
	void StateOfRecord4116() {
		assertEquals("OR", customers.get(4115).getState());
	}

	@Test
	@DisplayName("Record 4116: ZIP is 97202")
	void ZIPOfRecord4116() {
		assertEquals("97202", customers.get(4115).getZIP());
	}

	@Test
	@DisplayName("Record 4116: Phone is 503-235-4996")
	void PhoneOfRecord4116() {
		assertEquals("503-235-4996", customers.get(4115).getPhone());
	}

	@Test
	@DisplayName("Record 4116: Fax is 503-235-9474")
	void FaxOfRecord4116() {
		assertEquals("503-235-9474", customers.get(4115).getFax());
	}

	@Test
	@DisplayName("Record 4116: Email is harrison@terrasas.com")
	void EmailOfRecord4116() {
		assertEquals("harrison@terrasas.com", customers.get(4115).getEmail());
	}

	@Test
	@DisplayName("Record 4116: Web is http://www.harrisonterrasas.com")
	void WebOfRecord4116() {
		assertEquals("http://www.harrisonterrasas.com", customers.get(4115).getWeb());
	}
}
