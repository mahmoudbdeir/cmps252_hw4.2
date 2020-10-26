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

@Tag("17")
class Record_2662 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2662: FirstName is Wendy")
	void FirstNameOfRecord2662() {
		assertEquals("Wendy", customers.get(2661).getFirstName());
	}

	@Test
	@DisplayName("Record 2662: LastName is Berdecia")
	void LastNameOfRecord2662() {
		assertEquals("Berdecia", customers.get(2661).getLastName());
	}

	@Test
	@DisplayName("Record 2662: Company is Homewood Chambers Of Commerce")
	void CompanyOfRecord2662() {
		assertEquals("Homewood Chambers Of Commerce", customers.get(2661).getCompany());
	}

	@Test
	@DisplayName("Record 2662: Address is 10 George")
	void AddressOfRecord2662() {
		assertEquals("10 George", customers.get(2661).getAddress());
	}

	@Test
	@DisplayName("Record 2662: City is Wallingford")
	void CityOfRecord2662() {
		assertEquals("Wallingford", customers.get(2661).getCity());
	}

	@Test
	@DisplayName("Record 2662: County is New Haven")
	void CountyOfRecord2662() {
		assertEquals("New Haven", customers.get(2661).getCounty());
	}

	@Test
	@DisplayName("Record 2662: State is CT")
	void StateOfRecord2662() {
		assertEquals("CT", customers.get(2661).getState());
	}

	@Test
	@DisplayName("Record 2662: ZIP is 6492")
	void ZIPOfRecord2662() {
		assertEquals("6492", customers.get(2661).getZIP());
	}

	@Test
	@DisplayName("Record 2662: Phone is 203-294-1110")
	void PhoneOfRecord2662() {
		assertEquals("203-294-1110", customers.get(2661).getPhone());
	}

	@Test
	@DisplayName("Record 2662: Fax is 203-294-5609")
	void FaxOfRecord2662() {
		assertEquals("203-294-5609", customers.get(2661).getFax());
	}

	@Test
	@DisplayName("Record 2662: Email is wendy@berdecia.com")
	void EmailOfRecord2662() {
		assertEquals("wendy@berdecia.com", customers.get(2661).getEmail());
	}

	@Test
	@DisplayName("Record 2662: Web is http://www.wendyberdecia.com")
	void WebOfRecord2662() {
		assertEquals("http://www.wendyberdecia.com", customers.get(2661).getWeb());
	}
}
