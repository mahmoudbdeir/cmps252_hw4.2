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
class Record_4729 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4729: FirstName is Jacquelyn")
	void FirstNameOfRecord4729() {
		assertEquals("Jacquelyn", customers.get(4728).getFirstName());
	}

	@Test
	@DisplayName("Record 4729: LastName is Prevatte")
	void LastNameOfRecord4729() {
		assertEquals("Prevatte", customers.get(4728).getLastName());
	}

	@Test
	@DisplayName("Record 4729: Company is Lakeside Charlies")
	void CompanyOfRecord4729() {
		assertEquals("Lakeside Charlies", customers.get(4728).getCompany());
	}

	@Test
	@DisplayName("Record 4729: Address is 137 Vassar St  #-1")
	void AddressOfRecord4729() {
		assertEquals("137 Vassar St  #-1", customers.get(4728).getAddress());
	}

	@Test
	@DisplayName("Record 4729: City is Reno")
	void CityOfRecord4729() {
		assertEquals("Reno", customers.get(4728).getCity());
	}

	@Test
	@DisplayName("Record 4729: County is Washoe")
	void CountyOfRecord4729() {
		assertEquals("Washoe", customers.get(4728).getCounty());
	}

	@Test
	@DisplayName("Record 4729: State is NV")
	void StateOfRecord4729() {
		assertEquals("NV", customers.get(4728).getState());
	}

	@Test
	@DisplayName("Record 4729: ZIP is 89502")
	void ZIPOfRecord4729() {
		assertEquals("89502", customers.get(4728).getZIP());
	}

	@Test
	@DisplayName("Record 4729: Phone is 775-322-8747")
	void PhoneOfRecord4729() {
		assertEquals("775-322-8747", customers.get(4728).getPhone());
	}

	@Test
	@DisplayName("Record 4729: Fax is 775-322-3253")
	void FaxOfRecord4729() {
		assertEquals("775-322-3253", customers.get(4728).getFax());
	}

	@Test
	@DisplayName("Record 4729: Email is jacquelyn@prevatte.com")
	void EmailOfRecord4729() {
		assertEquals("jacquelyn@prevatte.com", customers.get(4728).getEmail());
	}

	@Test
	@DisplayName("Record 4729: Web is http://www.jacquelynprevatte.com")
	void WebOfRecord4729() {
		assertEquals("http://www.jacquelynprevatte.com", customers.get(4728).getWeb());
	}
}
