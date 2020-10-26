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
class Record_2046 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2046: FirstName is Sharlene")
	void FirstNameOfRecord2046() {
		assertEquals("Sharlene", customers.get(2045).getFirstName());
	}

	@Test
	@DisplayName("Record 2046: LastName is Lauridsen")
	void LastNameOfRecord2046() {
		assertEquals("Lauridsen", customers.get(2045).getLastName());
	}

	@Test
	@DisplayName("Record 2046: Company is Grant County Glass")
	void CompanyOfRecord2046() {
		assertEquals("Grant County Glass", customers.get(2045).getCompany());
	}

	@Test
	@DisplayName("Record 2046: Address is 133 Centre")
	void AddressOfRecord2046() {
		assertEquals("133 Centre", customers.get(2045).getAddress());
	}

	@Test
	@DisplayName("Record 2046: City is Middleboro")
	void CityOfRecord2046() {
		assertEquals("Middleboro", customers.get(2045).getCity());
	}

	@Test
	@DisplayName("Record 2046: County is Plymouth")
	void CountyOfRecord2046() {
		assertEquals("Plymouth", customers.get(2045).getCounty());
	}

	@Test
	@DisplayName("Record 2046: State is MA")
	void StateOfRecord2046() {
		assertEquals("MA", customers.get(2045).getState());
	}

	@Test
	@DisplayName("Record 2046: ZIP is 2346")
	void ZIPOfRecord2046() {
		assertEquals("2346", customers.get(2045).getZIP());
	}

	@Test
	@DisplayName("Record 2046: Phone is 508-946-0947")
	void PhoneOfRecord2046() {
		assertEquals("508-946-0947", customers.get(2045).getPhone());
	}

	@Test
	@DisplayName("Record 2046: Fax is 508-946-5378")
	void FaxOfRecord2046() {
		assertEquals("508-946-5378", customers.get(2045).getFax());
	}

	@Test
	@DisplayName("Record 2046: Email is sharlene@lauridsen.com")
	void EmailOfRecord2046() {
		assertEquals("sharlene@lauridsen.com", customers.get(2045).getEmail());
	}

	@Test
	@DisplayName("Record 2046: Web is http://www.sharlenelauridsen.com")
	void WebOfRecord2046() {
		assertEquals("http://www.sharlenelauridsen.com", customers.get(2045).getWeb());
	}
}
