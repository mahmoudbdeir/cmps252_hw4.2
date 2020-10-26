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

@Tag("34")
class Record_4461 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4461: FirstName is Phyllis")
	void FirstNameOfRecord4461() {
		assertEquals("Phyllis", customers.get(4460).getFirstName());
	}

	@Test
	@DisplayName("Record 4461: LastName is Kalmbach")
	void LastNameOfRecord4461() {
		assertEquals("Kalmbach", customers.get(4460).getLastName());
	}

	@Test
	@DisplayName("Record 4461: Company is Wesley Kind Assocs Inc")
	void CompanyOfRecord4461() {
		assertEquals("Wesley Kind Assocs Inc", customers.get(4460).getCompany());
	}

	@Test
	@DisplayName("Record 4461: Address is 72 Wathena Dr")
	void AddressOfRecord4461() {
		assertEquals("72 Wathena Dr", customers.get(4460).getAddress());
	}

	@Test
	@DisplayName("Record 4461: City is Butte")
	void CityOfRecord4461() {
		assertEquals("Butte", customers.get(4460).getCity());
	}

	@Test
	@DisplayName("Record 4461: County is Silver Bow")
	void CountyOfRecord4461() {
		assertEquals("Silver Bow", customers.get(4460).getCounty());
	}

	@Test
	@DisplayName("Record 4461: State is MT")
	void StateOfRecord4461() {
		assertEquals("MT", customers.get(4460).getState());
	}

	@Test
	@DisplayName("Record 4461: ZIP is 59701")
	void ZIPOfRecord4461() {
		assertEquals("59701", customers.get(4460).getZIP());
	}

	@Test
	@DisplayName("Record 4461: Phone is 406-490-7492")
	void PhoneOfRecord4461() {
		assertEquals("406-490-7492", customers.get(4460).getPhone());
	}

	@Test
	@DisplayName("Record 4461: Fax is 406-490-5708")
	void FaxOfRecord4461() {
		assertEquals("406-490-5708", customers.get(4460).getFax());
	}

	@Test
	@DisplayName("Record 4461: Email is phyllis@kalmbach.com")
	void EmailOfRecord4461() {
		assertEquals("phyllis@kalmbach.com", customers.get(4460).getEmail());
	}

	@Test
	@DisplayName("Record 4461: Web is http://www.phylliskalmbach.com")
	void WebOfRecord4461() {
		assertEquals("http://www.phylliskalmbach.com", customers.get(4460).getWeb());
	}
}
