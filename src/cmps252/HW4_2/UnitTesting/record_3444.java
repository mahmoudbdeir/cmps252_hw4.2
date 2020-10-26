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
class Record_3444 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3444: FirstName is Janel")
	void FirstNameOfRecord3444() {
		assertEquals("Janel", customers.get(3443).getFirstName());
	}

	@Test
	@DisplayName("Record 3444: LastName is Immerman")
	void LastNameOfRecord3444() {
		assertEquals("Immerman", customers.get(3443).getLastName());
	}

	@Test
	@DisplayName("Record 3444: Company is Great Lakes Fasteners Inc")
	void CompanyOfRecord3444() {
		assertEquals("Great Lakes Fasteners Inc", customers.get(3443).getCompany());
	}

	@Test
	@DisplayName("Record 3444: Address is 9080 Telstar Ave  #-306")
	void AddressOfRecord3444() {
		assertEquals("9080 Telstar Ave  #-306", customers.get(3443).getAddress());
	}

	@Test
	@DisplayName("Record 3444: City is El Monte")
	void CityOfRecord3444() {
		assertEquals("El Monte", customers.get(3443).getCity());
	}

	@Test
	@DisplayName("Record 3444: County is Los Angeles")
	void CountyOfRecord3444() {
		assertEquals("Los Angeles", customers.get(3443).getCounty());
	}

	@Test
	@DisplayName("Record 3444: State is CA")
	void StateOfRecord3444() {
		assertEquals("CA", customers.get(3443).getState());
	}

	@Test
	@DisplayName("Record 3444: ZIP is 91731")
	void ZIPOfRecord3444() {
		assertEquals("91731", customers.get(3443).getZIP());
	}

	@Test
	@DisplayName("Record 3444: Phone is 626-573-9493")
	void PhoneOfRecord3444() {
		assertEquals("626-573-9493", customers.get(3443).getPhone());
	}

	@Test
	@DisplayName("Record 3444: Fax is 626-573-4117")
	void FaxOfRecord3444() {
		assertEquals("626-573-4117", customers.get(3443).getFax());
	}

	@Test
	@DisplayName("Record 3444: Email is janel@immerman.com")
	void EmailOfRecord3444() {
		assertEquals("janel@immerman.com", customers.get(3443).getEmail());
	}

	@Test
	@DisplayName("Record 3444: Web is http://www.janelimmerman.com")
	void WebOfRecord3444() {
		assertEquals("http://www.janelimmerman.com", customers.get(3443).getWeb());
	}
}
