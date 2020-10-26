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
class Record_1218 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1218: FirstName is Scott")
	void FirstNameOfRecord1218() {
		assertEquals("Scott", customers.get(1217).getFirstName());
	}

	@Test
	@DisplayName("Record 1218: LastName is Dubrey")
	void LastNameOfRecord1218() {
		assertEquals("Dubrey", customers.get(1217).getLastName());
	}

	@Test
	@DisplayName("Record 1218: Company is Furakawa Rock Drill")
	void CompanyOfRecord1218() {
		assertEquals("Furakawa Rock Drill", customers.get(1217).getCompany());
	}

	@Test
	@DisplayName("Record 1218: Address is 9655 Bauer Dr")
	void AddressOfRecord1218() {
		assertEquals("9655 Bauer Dr", customers.get(1217).getAddress());
	}

	@Test
	@DisplayName("Record 1218: City is Indianapolis")
	void CityOfRecord1218() {
		assertEquals("Indianapolis", customers.get(1217).getCity());
	}

	@Test
	@DisplayName("Record 1218: County is Hamilton")
	void CountyOfRecord1218() {
		assertEquals("Hamilton", customers.get(1217).getCounty());
	}

	@Test
	@DisplayName("Record 1218: State is IN")
	void StateOfRecord1218() {
		assertEquals("IN", customers.get(1217).getState());
	}

	@Test
	@DisplayName("Record 1218: ZIP is 46280")
	void ZIPOfRecord1218() {
		assertEquals("46280", customers.get(1217).getZIP());
	}

	@Test
	@DisplayName("Record 1218: Phone is 317-848-2793")
	void PhoneOfRecord1218() {
		assertEquals("317-848-2793", customers.get(1217).getPhone());
	}

	@Test
	@DisplayName("Record 1218: Fax is 317-848-7334")
	void FaxOfRecord1218() {
		assertEquals("317-848-7334", customers.get(1217).getFax());
	}

	@Test
	@DisplayName("Record 1218: Email is scott@dubrey.com")
	void EmailOfRecord1218() {
		assertEquals("scott@dubrey.com", customers.get(1217).getEmail());
	}

	@Test
	@DisplayName("Record 1218: Web is http://www.scottdubrey.com")
	void WebOfRecord1218() {
		assertEquals("http://www.scottdubrey.com", customers.get(1217).getWeb());
	}
}
