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

@Tag("28")
class Record_4046 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4046: FirstName is Nolan")
	void FirstNameOfRecord4046() {
		assertEquals("Nolan", customers.get(4045).getFirstName());
	}

	@Test
	@DisplayName("Record 4046: LastName is Grieme")
	void LastNameOfRecord4046() {
		assertEquals("Grieme", customers.get(4045).getLastName());
	}

	@Test
	@DisplayName("Record 4046: Company is Dell Display Service")
	void CompanyOfRecord4046() {
		assertEquals("Dell Display Service", customers.get(4045).getCompany());
	}

	@Test
	@DisplayName("Record 4046: Address is 275 W Moreland Rd")
	void AddressOfRecord4046() {
		assertEquals("275 W Moreland Rd", customers.get(4045).getAddress());
	}

	@Test
	@DisplayName("Record 4046: City is Willow Grove")
	void CityOfRecord4046() {
		assertEquals("Willow Grove", customers.get(4045).getCity());
	}

	@Test
	@DisplayName("Record 4046: County is Montgomery")
	void CountyOfRecord4046() {
		assertEquals("Montgomery", customers.get(4045).getCounty());
	}

	@Test
	@DisplayName("Record 4046: State is PA")
	void StateOfRecord4046() {
		assertEquals("PA", customers.get(4045).getState());
	}

	@Test
	@DisplayName("Record 4046: ZIP is 19090")
	void ZIPOfRecord4046() {
		assertEquals("19090", customers.get(4045).getZIP());
	}

	@Test
	@DisplayName("Record 4046: Phone is 215-659-6868")
	void PhoneOfRecord4046() {
		assertEquals("215-659-6868", customers.get(4045).getPhone());
	}

	@Test
	@DisplayName("Record 4046: Fax is 215-659-8014")
	void FaxOfRecord4046() {
		assertEquals("215-659-8014", customers.get(4045).getFax());
	}

	@Test
	@DisplayName("Record 4046: Email is nolan@grieme.com")
	void EmailOfRecord4046() {
		assertEquals("nolan@grieme.com", customers.get(4045).getEmail());
	}

	@Test
	@DisplayName("Record 4046: Web is http://www.nolangrieme.com")
	void WebOfRecord4046() {
		assertEquals("http://www.nolangrieme.com", customers.get(4045).getWeb());
	}
}
