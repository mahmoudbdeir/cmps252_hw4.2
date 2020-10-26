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

@Tag("14")
class Record_642 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 642: FirstName is Sam")
	void FirstNameOfRecord642() {
		assertEquals("Sam", customers.get(641).getFirstName());
	}

	@Test
	@DisplayName("Record 642: LastName is Hollinghead")
	void LastNameOfRecord642() {
		assertEquals("Hollinghead", customers.get(641).getLastName());
	}

	@Test
	@DisplayName("Record 642: Company is Advanced Copy Systems Inc")
	void CompanyOfRecord642() {
		assertEquals("Advanced Copy Systems Inc", customers.get(641).getCompany());
	}

	@Test
	@DisplayName("Record 642: Address is 433 Allied Dr")
	void AddressOfRecord642() {
		assertEquals("433 Allied Dr", customers.get(641).getAddress());
	}

	@Test
	@DisplayName("Record 642: City is Nashville")
	void CityOfRecord642() {
		assertEquals("Nashville", customers.get(641).getCity());
	}

	@Test
	@DisplayName("Record 642: County is Davidson")
	void CountyOfRecord642() {
		assertEquals("Davidson", customers.get(641).getCounty());
	}

	@Test
	@DisplayName("Record 642: State is TN")
	void StateOfRecord642() {
		assertEquals("TN", customers.get(641).getState());
	}

	@Test
	@DisplayName("Record 642: ZIP is 37211")
	void ZIPOfRecord642() {
		assertEquals("37211", customers.get(641).getZIP());
	}

	@Test
	@DisplayName("Record 642: Phone is 615-333-4013")
	void PhoneOfRecord642() {
		assertEquals("615-333-4013", customers.get(641).getPhone());
	}

	@Test
	@DisplayName("Record 642: Fax is 615-333-4802")
	void FaxOfRecord642() {
		assertEquals("615-333-4802", customers.get(641).getFax());
	}

	@Test
	@DisplayName("Record 642: Email is sam@hollinghead.com")
	void EmailOfRecord642() {
		assertEquals("sam@hollinghead.com", customers.get(641).getEmail());
	}

	@Test
	@DisplayName("Record 642: Web is http://www.samhollinghead.com")
	void WebOfRecord642() {
		assertEquals("http://www.samhollinghead.com", customers.get(641).getWeb());
	}
}
