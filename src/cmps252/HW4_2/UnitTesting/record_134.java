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
class Record_134 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 134: FirstName is Arnulfo")
	void FirstNameOfRecord134() {
		assertEquals("Arnulfo", customers.get(133).getFirstName());
	}

	@Test
	@DisplayName("Record 134: LastName is Lomasney")
	void LastNameOfRecord134() {
		assertEquals("Lomasney", customers.get(133).getLastName());
	}

	@Test
	@DisplayName("Record 134: Company is Wrgb Tv 6")
	void CompanyOfRecord134() {
		assertEquals("Wrgb Tv 6", customers.get(133).getCompany());
	}

	@Test
	@DisplayName("Record 134: Address is Box #-50029")
	void AddressOfRecord134() {
		assertEquals("Box #-50029", customers.get(133).getAddress());
	}

	@Test
	@DisplayName("Record 134: City is Oxnard")
	void CityOfRecord134() {
		assertEquals("Oxnard", customers.get(133).getCity());
	}

	@Test
	@DisplayName("Record 134: County is Ventura")
	void CountyOfRecord134() {
		assertEquals("Ventura", customers.get(133).getCounty());
	}

	@Test
	@DisplayName("Record 134: State is CA")
	void StateOfRecord134() {
		assertEquals("CA", customers.get(133).getState());
	}

	@Test
	@DisplayName("Record 134: ZIP is 93031")
	void ZIPOfRecord134() {
		assertEquals("93031", customers.get(133).getZIP());
	}

	@Test
	@DisplayName("Record 134: Phone is 805-485-5048")
	void PhoneOfRecord134() {
		assertEquals("805-485-5048", customers.get(133).getPhone());
	}

	@Test
	@DisplayName("Record 134: Fax is 805-485-5656")
	void FaxOfRecord134() {
		assertEquals("805-485-5656", customers.get(133).getFax());
	}

	@Test
	@DisplayName("Record 134: Email is arnulfo@lomasney.com")
	void EmailOfRecord134() {
		assertEquals("arnulfo@lomasney.com", customers.get(133).getEmail());
	}

	@Test
	@DisplayName("Record 134: Web is http://www.arnulfolomasney.com")
	void WebOfRecord134() {
		assertEquals("http://www.arnulfolomasney.com", customers.get(133).getWeb());
	}
}
