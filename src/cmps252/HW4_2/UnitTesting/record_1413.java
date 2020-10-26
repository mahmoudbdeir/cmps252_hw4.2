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

@Tag("40")
class Record_1413 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1413: FirstName is Eric")
	void FirstNameOfRecord1413() {
		assertEquals("Eric", customers.get(1412).getFirstName());
	}

	@Test
	@DisplayName("Record 1413: LastName is Shuga")
	void LastNameOfRecord1413() {
		assertEquals("Shuga", customers.get(1412).getLastName());
	}

	@Test
	@DisplayName("Record 1413: Company is Hopkins & Huebner Pc")
	void CompanyOfRecord1413() {
		assertEquals("Hopkins & Huebner Pc", customers.get(1412).getCompany());
	}

	@Test
	@DisplayName("Record 1413: Address is 305 Bloomfield Ave")
	void AddressOfRecord1413() {
		assertEquals("305 Bloomfield Ave", customers.get(1412).getAddress());
	}

	@Test
	@DisplayName("Record 1413: City is Gilroy")
	void CityOfRecord1413() {
		assertEquals("Gilroy", customers.get(1412).getCity());
	}

	@Test
	@DisplayName("Record 1413: County is Santa Clara")
	void CountyOfRecord1413() {
		assertEquals("Santa Clara", customers.get(1412).getCounty());
	}

	@Test
	@DisplayName("Record 1413: State is CA")
	void StateOfRecord1413() {
		assertEquals("CA", customers.get(1412).getState());
	}

	@Test
	@DisplayName("Record 1413: ZIP is 95020")
	void ZIPOfRecord1413() {
		assertEquals("95020", customers.get(1412).getZIP());
	}

	@Test
	@DisplayName("Record 1413: Phone is 408-847-7052")
	void PhoneOfRecord1413() {
		assertEquals("408-847-7052", customers.get(1412).getPhone());
	}

	@Test
	@DisplayName("Record 1413: Fax is 408-847-0187")
	void FaxOfRecord1413() {
		assertEquals("408-847-0187", customers.get(1412).getFax());
	}

	@Test
	@DisplayName("Record 1413: Email is eric@shuga.com")
	void EmailOfRecord1413() {
		assertEquals("eric@shuga.com", customers.get(1412).getEmail());
	}

	@Test
	@DisplayName("Record 1413: Web is http://www.ericshuga.com")
	void WebOfRecord1413() {
		assertEquals("http://www.ericshuga.com", customers.get(1412).getWeb());
	}
}
