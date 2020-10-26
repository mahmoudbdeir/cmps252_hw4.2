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

@Tag("49")
class Record_1209 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1209: FirstName is Palmer")
	void FirstNameOfRecord1209() {
		assertEquals("Palmer", customers.get(1208).getFirstName());
	}

	@Test
	@DisplayName("Record 1209: LastName is Hardgrove")
	void LastNameOfRecord1209() {
		assertEquals("Hardgrove", customers.get(1208).getLastName());
	}

	@Test
	@DisplayName("Record 1209: Company is Boise Cascade Corporation")
	void CompanyOfRecord1209() {
		assertEquals("Boise Cascade Corporation", customers.get(1208).getCompany());
	}

	@Test
	@DisplayName("Record 1209: Address is Grenwd Ave")
	void AddressOfRecord1209() {
		assertEquals("Grenwd Ave", customers.get(1208).getAddress());
	}

	@Test
	@DisplayName("Record 1209: City is Greenwood Lake")
	void CityOfRecord1209() {
		assertEquals("Greenwood Lake", customers.get(1208).getCity());
	}

	@Test
	@DisplayName("Record 1209: County is Orange")
	void CountyOfRecord1209() {
		assertEquals("Orange", customers.get(1208).getCounty());
	}

	@Test
	@DisplayName("Record 1209: State is NY")
	void StateOfRecord1209() {
		assertEquals("NY", customers.get(1208).getState());
	}

	@Test
	@DisplayName("Record 1209: ZIP is 10925")
	void ZIPOfRecord1209() {
		assertEquals("10925", customers.get(1208).getZIP());
	}

	@Test
	@DisplayName("Record 1209: Phone is 845-477-7179")
	void PhoneOfRecord1209() {
		assertEquals("845-477-7179", customers.get(1208).getPhone());
	}

	@Test
	@DisplayName("Record 1209: Fax is 845-477-1054")
	void FaxOfRecord1209() {
		assertEquals("845-477-1054", customers.get(1208).getFax());
	}

	@Test
	@DisplayName("Record 1209: Email is palmer@hardgrove.com")
	void EmailOfRecord1209() {
		assertEquals("palmer@hardgrove.com", customers.get(1208).getEmail());
	}

	@Test
	@DisplayName("Record 1209: Web is http://www.palmerhardgrove.com")
	void WebOfRecord1209() {
		assertEquals("http://www.palmerhardgrove.com", customers.get(1208).getWeb());
	}
}
