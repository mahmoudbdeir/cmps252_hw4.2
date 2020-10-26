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

@Tag("2")
class Record_4673 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4673: FirstName is Cassie")
	void FirstNameOfRecord4673() {
		assertEquals("Cassie", customers.get(4672).getFirstName());
	}

	@Test
	@DisplayName("Record 4673: LastName is Schmunk")
	void LastNameOfRecord4673() {
		assertEquals("Schmunk", customers.get(4672).getLastName());
	}

	@Test
	@DisplayName("Record 4673: Company is Kefm Lite 96")
	void CompanyOfRecord4673() {
		assertEquals("Kefm Lite 96", customers.get(4672).getCompany());
	}

	@Test
	@DisplayName("Record 4673: Address is 3709 Medford St")
	void AddressOfRecord4673() {
		assertEquals("3709 Medford St", customers.get(4672).getAddress());
	}

	@Test
	@DisplayName("Record 4673: City is Los Angeles")
	void CityOfRecord4673() {
		assertEquals("Los Angeles", customers.get(4672).getCity());
	}

	@Test
	@DisplayName("Record 4673: County is Los Angeles")
	void CountyOfRecord4673() {
		assertEquals("Los Angeles", customers.get(4672).getCounty());
	}

	@Test
	@DisplayName("Record 4673: State is CA")
	void StateOfRecord4673() {
		assertEquals("CA", customers.get(4672).getState());
	}

	@Test
	@DisplayName("Record 4673: ZIP is 90063")
	void ZIPOfRecord4673() {
		assertEquals("90063", customers.get(4672).getZIP());
	}

	@Test
	@DisplayName("Record 4673: Phone is 323-261-5255")
	void PhoneOfRecord4673() {
		assertEquals("323-261-5255", customers.get(4672).getPhone());
	}

	@Test
	@DisplayName("Record 4673: Fax is 323-261-5914")
	void FaxOfRecord4673() {
		assertEquals("323-261-5914", customers.get(4672).getFax());
	}

	@Test
	@DisplayName("Record 4673: Email is cassie@schmunk.com")
	void EmailOfRecord4673() {
		assertEquals("cassie@schmunk.com", customers.get(4672).getEmail());
	}

	@Test
	@DisplayName("Record 4673: Web is http://www.cassieschmunk.com")
	void WebOfRecord4673() {
		assertEquals("http://www.cassieschmunk.com", customers.get(4672).getWeb());
	}
}
