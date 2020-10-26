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

@Tag("27")
class Record_917 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 917: FirstName is Lindsay")
	void FirstNameOfRecord917() {
		assertEquals("Lindsay", customers.get(916).getFirstName());
	}

	@Test
	@DisplayName("Record 917: LastName is Wilkens")
	void LastNameOfRecord917() {
		assertEquals("Wilkens", customers.get(916).getLastName());
	}

	@Test
	@DisplayName("Record 917: Company is Office Mart")
	void CompanyOfRecord917() {
		assertEquals("Office Mart", customers.get(916).getCompany());
	}

	@Test
	@DisplayName("Record 917: Address is 1307 Hartford Ave")
	void AddressOfRecord917() {
		assertEquals("1307 Hartford Ave", customers.get(916).getAddress());
	}

	@Test
	@DisplayName("Record 917: City is Johnston")
	void CityOfRecord917() {
		assertEquals("Johnston", customers.get(916).getCity());
	}

	@Test
	@DisplayName("Record 917: County is Providence")
	void CountyOfRecord917() {
		assertEquals("Providence", customers.get(916).getCounty());
	}

	@Test
	@DisplayName("Record 917: State is RI")
	void StateOfRecord917() {
		assertEquals("RI", customers.get(916).getState());
	}

	@Test
	@DisplayName("Record 917: ZIP is 2919")
	void ZIPOfRecord917() {
		assertEquals("2919", customers.get(916).getZIP());
	}

	@Test
	@DisplayName("Record 917: Phone is 401-331-6318")
	void PhoneOfRecord917() {
		assertEquals("401-331-6318", customers.get(916).getPhone());
	}

	@Test
	@DisplayName("Record 917: Fax is 401-331-5779")
	void FaxOfRecord917() {
		assertEquals("401-331-5779", customers.get(916).getFax());
	}

	@Test
	@DisplayName("Record 917: Email is lindsay@wilkens.com")
	void EmailOfRecord917() {
		assertEquals("lindsay@wilkens.com", customers.get(916).getEmail());
	}

	@Test
	@DisplayName("Record 917: Web is http://www.lindsaywilkens.com")
	void WebOfRecord917() {
		assertEquals("http://www.lindsaywilkens.com", customers.get(916).getWeb());
	}
}
