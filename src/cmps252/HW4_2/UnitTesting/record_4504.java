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

@Tag("1")
class Record_4504 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4504: FirstName is Allan")
	void FirstNameOfRecord4504() {
		assertEquals("Allan", customers.get(4503).getFirstName());
	}

	@Test
	@DisplayName("Record 4504: LastName is ysenbysz")
	void LastNameOfRecord4504() {
		assertEquals("ysenbysz", customers.get(4503).getLastName());
	}

	@Test
	@DisplayName("Record 4504: Company is Rosenthal, Gilbert Esq")
	void CompanyOfRecord4504() {
		assertEquals("Rosenthal, Gilbert Esq", customers.get(4503).getCompany());
	}

	@Test
	@DisplayName("Record 4504: Address is 116 N 2nd St")
	void AddressOfRecord4504() {
		assertEquals("116 N 2nd St", customers.get(4503).getAddress());
	}

	@Test
	@DisplayName("Record 4504: City is Greenville")
	void CityOfRecord4504() {
		assertEquals("Greenville", customers.get(4503).getCity());
	}

	@Test
	@DisplayName("Record 4504: County is Bond")
	void CountyOfRecord4504() {
		assertEquals("Bond", customers.get(4503).getCounty());
	}

	@Test
	@DisplayName("Record 4504: State is IL")
	void StateOfRecord4504() {
		assertEquals("IL", customers.get(4503).getState());
	}

	@Test
	@DisplayName("Record 4504: ZIP is 62246")
	void ZIPOfRecord4504() {
		assertEquals("62246", customers.get(4503).getZIP());
	}

	@Test
	@DisplayName("Record 4504: Phone is 618-664-2328")
	void PhoneOfRecord4504() {
		assertEquals("618-664-2328", customers.get(4503).getPhone());
	}

	@Test
	@DisplayName("Record 4504: Fax is 618-664-9729")
	void FaxOfRecord4504() {
		assertEquals("618-664-9729", customers.get(4503).getFax());
	}

	@Test
	@DisplayName("Record 4504: Email is allan@ysenbysz.com")
	void EmailOfRecord4504() {
		assertEquals("allan@ysenbysz.com", customers.get(4503).getEmail());
	}

	@Test
	@DisplayName("Record 4504: Web is http://www.allanysenbysz.com")
	void WebOfRecord4504() {
		assertEquals("http://www.allanysenbysz.com", customers.get(4503).getWeb());
	}
}
