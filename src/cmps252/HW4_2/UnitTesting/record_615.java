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

@Tag("32")
class Record_615 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 615: FirstName is Huey")
	void FirstNameOfRecord615() {
		assertEquals("Huey", customers.get(614).getFirstName());
	}

	@Test
	@DisplayName("Record 615: LastName is Totosz")
	void LastNameOfRecord615() {
		assertEquals("Totosz", customers.get(614).getLastName());
	}

	@Test
	@DisplayName("Record 615: Company is New Brunswick Gen Sht Metl Wks")
	void CompanyOfRecord615() {
		assertEquals("New Brunswick Gen Sht Metl Wks", customers.get(614).getCompany());
	}

	@Test
	@DisplayName("Record 615: Address is 756 Concord Rd Se")
	void AddressOfRecord615() {
		assertEquals("756 Concord Rd Se", customers.get(614).getAddress());
	}

	@Test
	@DisplayName("Record 615: City is Smyrna")
	void CityOfRecord615() {
		assertEquals("Smyrna", customers.get(614).getCity());
	}

	@Test
	@DisplayName("Record 615: County is Cobb")
	void CountyOfRecord615() {
		assertEquals("Cobb", customers.get(614).getCounty());
	}

	@Test
	@DisplayName("Record 615: State is GA")
	void StateOfRecord615() {
		assertEquals("GA", customers.get(614).getState());
	}

	@Test
	@DisplayName("Record 615: ZIP is 30082")
	void ZIPOfRecord615() {
		assertEquals("30082", customers.get(614).getZIP());
	}

	@Test
	@DisplayName("Record 615: Phone is 770-436-7804")
	void PhoneOfRecord615() {
		assertEquals("770-436-7804", customers.get(614).getPhone());
	}

	@Test
	@DisplayName("Record 615: Fax is 770-436-3625")
	void FaxOfRecord615() {
		assertEquals("770-436-3625", customers.get(614).getFax());
	}

	@Test
	@DisplayName("Record 615: Email is huey@totosz.com")
	void EmailOfRecord615() {
		assertEquals("huey@totosz.com", customers.get(614).getEmail());
	}

	@Test
	@DisplayName("Record 615: Web is http://www.hueytotosz.com")
	void WebOfRecord615() {
		assertEquals("http://www.hueytotosz.com", customers.get(614).getWeb());
	}
}
