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
class Record_2260 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2260: FirstName is Edgar")
	void FirstNameOfRecord2260() {
		assertEquals("Edgar", customers.get(2259).getFirstName());
	}

	@Test
	@DisplayName("Record 2260: LastName is Onyeagu")
	void LastNameOfRecord2260() {
		assertEquals("Onyeagu", customers.get(2259).getLastName());
	}

	@Test
	@DisplayName("Record 2260: Company is Eastern Roofing Company")
	void CompanyOfRecord2260() {
		assertEquals("Eastern Roofing Company", customers.get(2259).getCompany());
	}

	@Test
	@DisplayName("Record 2260: Address is 345 N Maple Dr")
	void AddressOfRecord2260() {
		assertEquals("345 N Maple Dr", customers.get(2259).getAddress());
	}

	@Test
	@DisplayName("Record 2260: City is Beverly Hills")
	void CityOfRecord2260() {
		assertEquals("Beverly Hills", customers.get(2259).getCity());
	}

	@Test
	@DisplayName("Record 2260: County is Los Angeles")
	void CountyOfRecord2260() {
		assertEquals("Los Angeles", customers.get(2259).getCounty());
	}

	@Test
	@DisplayName("Record 2260: State is CA")
	void StateOfRecord2260() {
		assertEquals("CA", customers.get(2259).getState());
	}

	@Test
	@DisplayName("Record 2260: ZIP is 90210")
	void ZIPOfRecord2260() {
		assertEquals("90210", customers.get(2259).getZIP());
	}

	@Test
	@DisplayName("Record 2260: Phone is 310-205-1001")
	void PhoneOfRecord2260() {
		assertEquals("310-205-1001", customers.get(2259).getPhone());
	}

	@Test
	@DisplayName("Record 2260: Fax is 310-205-5091")
	void FaxOfRecord2260() {
		assertEquals("310-205-5091", customers.get(2259).getFax());
	}

	@Test
	@DisplayName("Record 2260: Email is edgar@onyeagu.com")
	void EmailOfRecord2260() {
		assertEquals("edgar@onyeagu.com", customers.get(2259).getEmail());
	}

	@Test
	@DisplayName("Record 2260: Web is http://www.edgaronyeagu.com")
	void WebOfRecord2260() {
		assertEquals("http://www.edgaronyeagu.com", customers.get(2259).getWeb());
	}
}
