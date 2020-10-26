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

@Tag("35")
class Record_1874 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1874: FirstName is Tom")
	void FirstNameOfRecord1874() {
		assertEquals("Tom", customers.get(1873).getFirstName());
	}

	@Test
	@DisplayName("Record 1874: LastName is Bogacz")
	void LastNameOfRecord1874() {
		assertEquals("Bogacz", customers.get(1873).getLastName());
	}

	@Test
	@DisplayName("Record 1874: Company is Freed Independent Living Ctr")
	void CompanyOfRecord1874() {
		assertEquals("Freed Independent Living Ctr", customers.get(1873).getCompany());
	}

	@Test
	@DisplayName("Record 1874: Address is 1701 S Highland Ave")
	void AddressOfRecord1874() {
		assertEquals("1701 S Highland Ave", customers.get(1873).getAddress());
	}

	@Test
	@DisplayName("Record 1874: City is Baltimore")
	void CityOfRecord1874() {
		assertEquals("Baltimore", customers.get(1873).getCity());
	}

	@Test
	@DisplayName("Record 1874: County is Baltimore City")
	void CountyOfRecord1874() {
		assertEquals("Baltimore City", customers.get(1873).getCounty());
	}

	@Test
	@DisplayName("Record 1874: State is MD")
	void StateOfRecord1874() {
		assertEquals("MD", customers.get(1873).getState());
	}

	@Test
	@DisplayName("Record 1874: ZIP is 21224")
	void ZIPOfRecord1874() {
		assertEquals("21224", customers.get(1873).getZIP());
	}

	@Test
	@DisplayName("Record 1874: Phone is 410-276-4823")
	void PhoneOfRecord1874() {
		assertEquals("410-276-4823", customers.get(1873).getPhone());
	}

	@Test
	@DisplayName("Record 1874: Fax is 410-276-9886")
	void FaxOfRecord1874() {
		assertEquals("410-276-9886", customers.get(1873).getFax());
	}

	@Test
	@DisplayName("Record 1874: Email is tom@bogacz.com")
	void EmailOfRecord1874() {
		assertEquals("tom@bogacz.com", customers.get(1873).getEmail());
	}

	@Test
	@DisplayName("Record 1874: Web is http://www.tombogacz.com")
	void WebOfRecord1874() {
		assertEquals("http://www.tombogacz.com", customers.get(1873).getWeb());
	}
}
