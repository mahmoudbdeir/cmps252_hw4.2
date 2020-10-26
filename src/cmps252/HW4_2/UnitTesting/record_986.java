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
class Record_986 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 986: FirstName is Rosanne")
	void FirstNameOfRecord986() {
		assertEquals("Rosanne", customers.get(985).getFirstName());
	}

	@Test
	@DisplayName("Record 986: LastName is Morrisette")
	void LastNameOfRecord986() {
		assertEquals("Morrisette", customers.get(985).getLastName());
	}

	@Test
	@DisplayName("Record 986: Company is K Scale")
	void CompanyOfRecord986() {
		assertEquals("K Scale", customers.get(985).getCompany());
	}

	@Test
	@DisplayName("Record 986: Address is 639 Rochester Rd")
	void AddressOfRecord986() {
		assertEquals("639 Rochester Rd", customers.get(985).getAddress());
	}

	@Test
	@DisplayName("Record 986: City is Pittsburgh")
	void CityOfRecord986() {
		assertEquals("Pittsburgh", customers.get(985).getCity());
	}

	@Test
	@DisplayName("Record 986: County is Allegheny")
	void CountyOfRecord986() {
		assertEquals("Allegheny", customers.get(985).getCounty());
	}

	@Test
	@DisplayName("Record 986: State is PA")
	void StateOfRecord986() {
		assertEquals("PA", customers.get(985).getState());
	}

	@Test
	@DisplayName("Record 986: ZIP is 15237")
	void ZIPOfRecord986() {
		assertEquals("15237", customers.get(985).getZIP());
	}

	@Test
	@DisplayName("Record 986: Phone is 412-364-4111")
	void PhoneOfRecord986() {
		assertEquals("412-364-4111", customers.get(985).getPhone());
	}

	@Test
	@DisplayName("Record 986: Fax is 412-364-6259")
	void FaxOfRecord986() {
		assertEquals("412-364-6259", customers.get(985).getFax());
	}

	@Test
	@DisplayName("Record 986: Email is rosanne@morrisette.com")
	void EmailOfRecord986() {
		assertEquals("rosanne@morrisette.com", customers.get(985).getEmail());
	}

	@Test
	@DisplayName("Record 986: Web is http://www.rosannemorrisette.com")
	void WebOfRecord986() {
		assertEquals("http://www.rosannemorrisette.com", customers.get(985).getWeb());
	}
}
