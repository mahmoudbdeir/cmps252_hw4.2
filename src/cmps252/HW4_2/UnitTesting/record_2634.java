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
class Record_2634 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2634: FirstName is Dena")
	void FirstNameOfRecord2634() {
		assertEquals("Dena", customers.get(2633).getFirstName());
	}

	@Test
	@DisplayName("Record 2634: LastName is Kilcrease")
	void LastNameOfRecord2634() {
		assertEquals("Kilcrease", customers.get(2633).getLastName());
	}

	@Test
	@DisplayName("Record 2634: Company is Louderback, Charles M Esq")
	void CompanyOfRecord2634() {
		assertEquals("Louderback, Charles M Esq", customers.get(2633).getCompany());
	}

	@Test
	@DisplayName("Record 2634: Address is 995 Commercial St Se")
	void AddressOfRecord2634() {
		assertEquals("995 Commercial St Se", customers.get(2633).getAddress());
	}

	@Test
	@DisplayName("Record 2634: City is Salem")
	void CityOfRecord2634() {
		assertEquals("Salem", customers.get(2633).getCity());
	}

	@Test
	@DisplayName("Record 2634: County is Marion")
	void CountyOfRecord2634() {
		assertEquals("Marion", customers.get(2633).getCounty());
	}

	@Test
	@DisplayName("Record 2634: State is OR")
	void StateOfRecord2634() {
		assertEquals("OR", customers.get(2633).getState());
	}

	@Test
	@DisplayName("Record 2634: ZIP is 97302")
	void ZIPOfRecord2634() {
		assertEquals("97302", customers.get(2633).getZIP());
	}

	@Test
	@DisplayName("Record 2634: Phone is 503-362-6307")
	void PhoneOfRecord2634() {
		assertEquals("503-362-6307", customers.get(2633).getPhone());
	}

	@Test
	@DisplayName("Record 2634: Fax is 503-362-5342")
	void FaxOfRecord2634() {
		assertEquals("503-362-5342", customers.get(2633).getFax());
	}

	@Test
	@DisplayName("Record 2634: Email is dena@kilcrease.com")
	void EmailOfRecord2634() {
		assertEquals("dena@kilcrease.com", customers.get(2633).getEmail());
	}

	@Test
	@DisplayName("Record 2634: Web is http://www.denakilcrease.com")
	void WebOfRecord2634() {
		assertEquals("http://www.denakilcrease.com", customers.get(2633).getWeb());
	}
}
