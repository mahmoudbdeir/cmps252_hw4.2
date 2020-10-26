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

@Tag("33")
class Record_156 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 156: FirstName is Nadine")
	void FirstNameOfRecord156() {
		assertEquals("Nadine", customers.get(155).getFirstName());
	}

	@Test
	@DisplayName("Record 156: LastName is Lindline")
	void LastNameOfRecord156() {
		assertEquals("Lindline", customers.get(155).getLastName());
	}

	@Test
	@DisplayName("Record 156: Company is Lepages Inc")
	void CompanyOfRecord156() {
		assertEquals("Lepages Inc", customers.get(155).getCompany());
	}

	@Test
	@DisplayName("Record 156: Address is 75 Lafayette Ave")
	void AddressOfRecord156() {
		assertEquals("75 Lafayette Ave", customers.get(155).getAddress());
	}

	@Test
	@DisplayName("Record 156: City is White Plains")
	void CityOfRecord156() {
		assertEquals("White Plains", customers.get(155).getCity());
	}

	@Test
	@DisplayName("Record 156: County is Westchester")
	void CountyOfRecord156() {
		assertEquals("Westchester", customers.get(155).getCounty());
	}

	@Test
	@DisplayName("Record 156: State is NY")
	void StateOfRecord156() {
		assertEquals("NY", customers.get(155).getState());
	}

	@Test
	@DisplayName("Record 156: ZIP is 10603")
	void ZIPOfRecord156() {
		assertEquals("10603", customers.get(155).getZIP());
	}

	@Test
	@DisplayName("Record 156: Phone is 914-949-3994")
	void PhoneOfRecord156() {
		assertEquals("914-949-3994", customers.get(155).getPhone());
	}

	@Test
	@DisplayName("Record 156: Fax is 914-949-2012")
	void FaxOfRecord156() {
		assertEquals("914-949-2012", customers.get(155).getFax());
	}

	@Test
	@DisplayName("Record 156: Email is nadine@lindline.com")
	void EmailOfRecord156() {
		assertEquals("nadine@lindline.com", customers.get(155).getEmail());
	}

	@Test
	@DisplayName("Record 156: Web is http://www.nadinelindline.com")
	void WebOfRecord156() {
		assertEquals("http://www.nadinelindline.com", customers.get(155).getWeb());
	}
}
