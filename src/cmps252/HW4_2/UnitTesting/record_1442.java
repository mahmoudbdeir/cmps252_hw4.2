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

@Tag("47")
class Record_1442 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1442: FirstName is Isiah")
	void FirstNameOfRecord1442() {
		assertEquals("Isiah", customers.get(1441).getFirstName());
	}

	@Test
	@DisplayName("Record 1442: LastName is Welp")
	void LastNameOfRecord1442() {
		assertEquals("Welp", customers.get(1441).getLastName());
	}

	@Test
	@DisplayName("Record 1442: Company is Philadelphia Heart Institute")
	void CompanyOfRecord1442() {
		assertEquals("Philadelphia Heart Institute", customers.get(1441).getCompany());
	}

	@Test
	@DisplayName("Record 1442: Address is 195 W Commercial St")
	void AddressOfRecord1442() {
		assertEquals("195 W Commercial St", customers.get(1441).getAddress());
	}

	@Test
	@DisplayName("Record 1442: City is Elko")
	void CityOfRecord1442() {
		assertEquals("Elko", customers.get(1441).getCity());
	}

	@Test
	@DisplayName("Record 1442: County is Elko")
	void CountyOfRecord1442() {
		assertEquals("Elko", customers.get(1441).getCounty());
	}

	@Test
	@DisplayName("Record 1442: State is NV")
	void StateOfRecord1442() {
		assertEquals("NV", customers.get(1441).getState());
	}

	@Test
	@DisplayName("Record 1442: ZIP is 89801")
	void ZIPOfRecord1442() {
		assertEquals("89801", customers.get(1441).getZIP());
	}

	@Test
	@DisplayName("Record 1442: Phone is 775-778-8408")
	void PhoneOfRecord1442() {
		assertEquals("775-778-8408", customers.get(1441).getPhone());
	}

	@Test
	@DisplayName("Record 1442: Fax is 775-778-4252")
	void FaxOfRecord1442() {
		assertEquals("775-778-4252", customers.get(1441).getFax());
	}

	@Test
	@DisplayName("Record 1442: Email is isiah@welp.com")
	void EmailOfRecord1442() {
		assertEquals("isiah@welp.com", customers.get(1441).getEmail());
	}

	@Test
	@DisplayName("Record 1442: Web is http://www.isiahwelp.com")
	void WebOfRecord1442() {
		assertEquals("http://www.isiahwelp.com", customers.get(1441).getWeb());
	}
}
