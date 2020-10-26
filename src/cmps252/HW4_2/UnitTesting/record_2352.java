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

@Tag("11")
class Record_2352 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2352: FirstName is Tania")
	void FirstNameOfRecord2352() {
		assertEquals("Tania", customers.get(2351).getFirstName());
	}

	@Test
	@DisplayName("Record 2352: LastName is Drivers")
	void LastNameOfRecord2352() {
		assertEquals("Drivers", customers.get(2351).getLastName());
	}

	@Test
	@DisplayName("Record 2352: Company is Ado Trailways Bus Company")
	void CompanyOfRecord2352() {
		assertEquals("Ado Trailways Bus Company", customers.get(2351).getCompany());
	}

	@Test
	@DisplayName("Record 2352: Address is 1503 Warrensville Center Rd")
	void AddressOfRecord2352() {
		assertEquals("1503 Warrensville Center Rd", customers.get(2351).getAddress());
	}

	@Test
	@DisplayName("Record 2352: City is Cleveland")
	void CityOfRecord2352() {
		assertEquals("Cleveland", customers.get(2351).getCity());
	}

	@Test
	@DisplayName("Record 2352: County is Cuyahoga")
	void CountyOfRecord2352() {
		assertEquals("Cuyahoga", customers.get(2351).getCounty());
	}

	@Test
	@DisplayName("Record 2352: State is OH")
	void StateOfRecord2352() {
		assertEquals("OH", customers.get(2351).getState());
	}

	@Test
	@DisplayName("Record 2352: ZIP is 44121")
	void ZIPOfRecord2352() {
		assertEquals("44121", customers.get(2351).getZIP());
	}

	@Test
	@DisplayName("Record 2352: Phone is 216-382-6239")
	void PhoneOfRecord2352() {
		assertEquals("216-382-6239", customers.get(2351).getPhone());
	}

	@Test
	@DisplayName("Record 2352: Fax is 216-382-9254")
	void FaxOfRecord2352() {
		assertEquals("216-382-9254", customers.get(2351).getFax());
	}

	@Test
	@DisplayName("Record 2352: Email is tania@drivers.com")
	void EmailOfRecord2352() {
		assertEquals("tania@drivers.com", customers.get(2351).getEmail());
	}

	@Test
	@DisplayName("Record 2352: Web is http://www.taniadrivers.com")
	void WebOfRecord2352() {
		assertEquals("http://www.taniadrivers.com", customers.get(2351).getWeb());
	}
}
