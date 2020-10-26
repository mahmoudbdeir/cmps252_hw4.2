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

@Tag("18")
class Record_2140 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2140: FirstName is Leandro")
	void FirstNameOfRecord2140() {
		assertEquals("Leandro", customers.get(2139).getFirstName());
	}

	@Test
	@DisplayName("Record 2140: LastName is Wakeford")
	void LastNameOfRecord2140() {
		assertEquals("Wakeford", customers.get(2139).getLastName());
	}

	@Test
	@DisplayName("Record 2140: Company is H & P Die & Stamping Div")
	void CompanyOfRecord2140() {
		assertEquals("H & P Die & Stamping Div", customers.get(2139).getCompany());
	}

	@Test
	@DisplayName("Record 2140: Address is 3735 New Hope Rd")
	void AddressOfRecord2140() {
		assertEquals("3735 New Hope Rd", customers.get(2139).getAddress());
	}

	@Test
	@DisplayName("Record 2140: City is Grants Pass")
	void CityOfRecord2140() {
		assertEquals("Grants Pass", customers.get(2139).getCity());
	}

	@Test
	@DisplayName("Record 2140: County is Josephine")
	void CountyOfRecord2140() {
		assertEquals("Josephine", customers.get(2139).getCounty());
	}

	@Test
	@DisplayName("Record 2140: State is OR")
	void StateOfRecord2140() {
		assertEquals("OR", customers.get(2139).getState());
	}

	@Test
	@DisplayName("Record 2140: ZIP is 97527")
	void ZIPOfRecord2140() {
		assertEquals("97527", customers.get(2139).getZIP());
	}

	@Test
	@DisplayName("Record 2140: Phone is 541-474-7422")
	void PhoneOfRecord2140() {
		assertEquals("541-474-7422", customers.get(2139).getPhone());
	}

	@Test
	@DisplayName("Record 2140: Fax is 541-474-4317")
	void FaxOfRecord2140() {
		assertEquals("541-474-4317", customers.get(2139).getFax());
	}

	@Test
	@DisplayName("Record 2140: Email is leandro@wakeford.com")
	void EmailOfRecord2140() {
		assertEquals("leandro@wakeford.com", customers.get(2139).getEmail());
	}

	@Test
	@DisplayName("Record 2140: Web is http://www.leandrowakeford.com")
	void WebOfRecord2140() {
		assertEquals("http://www.leandrowakeford.com", customers.get(2139).getWeb());
	}
}
