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
class Record_2483 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2483: FirstName is Pam")
	void FirstNameOfRecord2483() {
		assertEquals("Pam", customers.get(2482).getFirstName());
	}

	@Test
	@DisplayName("Record 2483: LastName is Blinebry")
	void LastNameOfRecord2483() {
		assertEquals("Blinebry", customers.get(2482).getLastName());
	}

	@Test
	@DisplayName("Record 2483: Company is International Knife & Saw Inc")
	void CompanyOfRecord2483() {
		assertEquals("International Knife & Saw Inc", customers.get(2482).getCompany());
	}

	@Test
	@DisplayName("Record 2483: Address is 10 N Sandy Spgs Rd")
	void AddressOfRecord2483() {
		assertEquals("10 N Sandy Spgs Rd", customers.get(2482).getAddress());
	}

	@Test
	@DisplayName("Record 2483: City is Zuni")
	void CityOfRecord2483() {
		assertEquals("Zuni", customers.get(2482).getCity());
	}

	@Test
	@DisplayName("Record 2483: County is McKinley")
	void CountyOfRecord2483() {
		assertEquals("McKinley", customers.get(2482).getCounty());
	}

	@Test
	@DisplayName("Record 2483: State is NM")
	void StateOfRecord2483() {
		assertEquals("NM", customers.get(2482).getState());
	}

	@Test
	@DisplayName("Record 2483: ZIP is 87327")
	void ZIPOfRecord2483() {
		assertEquals("87327", customers.get(2482).getZIP());
	}

	@Test
	@DisplayName("Record 2483: Phone is 505-782-3637")
	void PhoneOfRecord2483() {
		assertEquals("505-782-3637", customers.get(2482).getPhone());
	}

	@Test
	@DisplayName("Record 2483: Fax is 505-782-5328")
	void FaxOfRecord2483() {
		assertEquals("505-782-5328", customers.get(2482).getFax());
	}

	@Test
	@DisplayName("Record 2483: Email is pam@blinebry.com")
	void EmailOfRecord2483() {
		assertEquals("pam@blinebry.com", customers.get(2482).getEmail());
	}

	@Test
	@DisplayName("Record 2483: Web is http://www.pamblinebry.com")
	void WebOfRecord2483() {
		assertEquals("http://www.pamblinebry.com", customers.get(2482).getWeb());
	}
}
