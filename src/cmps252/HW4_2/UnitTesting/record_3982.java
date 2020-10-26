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

@Tag("7")
class Record_3982 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3982: FirstName is Cherry")
	void FirstNameOfRecord3982() {
		assertEquals("Cherry", customers.get(3981).getFirstName());
	}

	@Test
	@DisplayName("Record 3982: LastName is Manton")
	void LastNameOfRecord3982() {
		assertEquals("Manton", customers.get(3981).getLastName());
	}

	@Test
	@DisplayName("Record 3982: Company is Whittle, Joseph A Jr")
	void CompanyOfRecord3982() {
		assertEquals("Whittle, Joseph A Jr", customers.get(3981).getCompany());
	}

	@Test
	@DisplayName("Record 3982: Address is 66 E 1st St")
	void AddressOfRecord3982() {
		assertEquals("66 E 1st St", customers.get(3981).getAddress());
	}

	@Test
	@DisplayName("Record 3982: City is New York")
	void CityOfRecord3982() {
		assertEquals("New York", customers.get(3981).getCity());
	}

	@Test
	@DisplayName("Record 3982: County is New York")
	void CountyOfRecord3982() {
		assertEquals("New York", customers.get(3981).getCounty());
	}

	@Test
	@DisplayName("Record 3982: State is NY")
	void StateOfRecord3982() {
		assertEquals("NY", customers.get(3981).getState());
	}

	@Test
	@DisplayName("Record 3982: ZIP is 10003")
	void ZIPOfRecord3982() {
		assertEquals("10003", customers.get(3981).getZIP());
	}

	@Test
	@DisplayName("Record 3982: Phone is 212-473-7032")
	void PhoneOfRecord3982() {
		assertEquals("212-473-7032", customers.get(3981).getPhone());
	}

	@Test
	@DisplayName("Record 3982: Fax is 212-473-3827")
	void FaxOfRecord3982() {
		assertEquals("212-473-3827", customers.get(3981).getFax());
	}

	@Test
	@DisplayName("Record 3982: Email is cherry@manton.com")
	void EmailOfRecord3982() {
		assertEquals("cherry@manton.com", customers.get(3981).getEmail());
	}

	@Test
	@DisplayName("Record 3982: Web is http://www.cherrymanton.com")
	void WebOfRecord3982() {
		assertEquals("http://www.cherrymanton.com", customers.get(3981).getWeb());
	}
}
