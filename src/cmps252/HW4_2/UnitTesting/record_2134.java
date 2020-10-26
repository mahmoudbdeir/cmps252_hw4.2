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

@Tag("16")
class Record_2134 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2134: FirstName is Buck")
	void FirstNameOfRecord2134() {
		assertEquals("Buck", customers.get(2133).getFirstName());
	}

	@Test
	@DisplayName("Record 2134: LastName is Peacy")
	void LastNameOfRecord2134() {
		assertEquals("Peacy", customers.get(2133).getLastName());
	}

	@Test
	@DisplayName("Record 2134: Company is Meridian Technical Assocs Inc")
	void CompanyOfRecord2134() {
		assertEquals("Meridian Technical Assocs Inc", customers.get(2133).getCompany());
	}

	@Test
	@DisplayName("Record 2134: Address is 2401 E 17th St")
	void AddressOfRecord2134() {
		assertEquals("2401 E 17th St", customers.get(2133).getAddress());
	}

	@Test
	@DisplayName("Record 2134: City is Santa Ana")
	void CityOfRecord2134() {
		assertEquals("Santa Ana", customers.get(2133).getCity());
	}

	@Test
	@DisplayName("Record 2134: County is Orange")
	void CountyOfRecord2134() {
		assertEquals("Orange", customers.get(2133).getCounty());
	}

	@Test
	@DisplayName("Record 2134: State is CA")
	void StateOfRecord2134() {
		assertEquals("CA", customers.get(2133).getState());
	}

	@Test
	@DisplayName("Record 2134: ZIP is 92705")
	void ZIPOfRecord2134() {
		assertEquals("92705", customers.get(2133).getZIP());
	}

	@Test
	@DisplayName("Record 2134: Phone is 714-541-7187")
	void PhoneOfRecord2134() {
		assertEquals("714-541-7187", customers.get(2133).getPhone());
	}

	@Test
	@DisplayName("Record 2134: Fax is 714-541-6792")
	void FaxOfRecord2134() {
		assertEquals("714-541-6792", customers.get(2133).getFax());
	}

	@Test
	@DisplayName("Record 2134: Email is buck@peacy.com")
	void EmailOfRecord2134() {
		assertEquals("buck@peacy.com", customers.get(2133).getEmail());
	}

	@Test
	@DisplayName("Record 2134: Web is http://www.buckpeacy.com")
	void WebOfRecord2134() {
		assertEquals("http://www.buckpeacy.com", customers.get(2133).getWeb());
	}
}
