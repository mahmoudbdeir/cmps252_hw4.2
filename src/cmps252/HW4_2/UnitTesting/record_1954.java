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
class Record_1954 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1954: FirstName is Ivory")
	void FirstNameOfRecord1954() {
		assertEquals("Ivory", customers.get(1953).getFirstName());
	}

	@Test
	@DisplayName("Record 1954: LastName is Furby")
	void LastNameOfRecord1954() {
		assertEquals("Furby", customers.get(1953).getLastName());
	}

	@Test
	@DisplayName("Record 1954: Company is Josha Distributing")
	void CompanyOfRecord1954() {
		assertEquals("Josha Distributing", customers.get(1953).getCompany());
	}

	@Test
	@DisplayName("Record 1954: Address is 80 Wolfert Ave")
	void AddressOfRecord1954() {
		assertEquals("80 Wolfert Ave", customers.get(1953).getAddress());
	}

	@Test
	@DisplayName("Record 1954: City is Albany")
	void CityOfRecord1954() {
		assertEquals("Albany", customers.get(1953).getCity());
	}

	@Test
	@DisplayName("Record 1954: County is Albany")
	void CountyOfRecord1954() {
		assertEquals("Albany", customers.get(1953).getCounty());
	}

	@Test
	@DisplayName("Record 1954: State is NY")
	void StateOfRecord1954() {
		assertEquals("NY", customers.get(1953).getState());
	}

	@Test
	@DisplayName("Record 1954: ZIP is 12204")
	void ZIPOfRecord1954() {
		assertEquals("12204", customers.get(1953).getZIP());
	}

	@Test
	@DisplayName("Record 1954: Phone is 518-435-0507")
	void PhoneOfRecord1954() {
		assertEquals("518-435-0507", customers.get(1953).getPhone());
	}

	@Test
	@DisplayName("Record 1954: Fax is 518-435-1208")
	void FaxOfRecord1954() {
		assertEquals("518-435-1208", customers.get(1953).getFax());
	}

	@Test
	@DisplayName("Record 1954: Email is ivory@furby.com")
	void EmailOfRecord1954() {
		assertEquals("ivory@furby.com", customers.get(1953).getEmail());
	}

	@Test
	@DisplayName("Record 1954: Web is http://www.ivoryfurby.com")
	void WebOfRecord1954() {
		assertEquals("http://www.ivoryfurby.com", customers.get(1953).getWeb());
	}
}
