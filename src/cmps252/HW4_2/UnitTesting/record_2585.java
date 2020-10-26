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

@Tag("20")
class Record_2585 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2585: FirstName is Danilo")
	void FirstNameOfRecord2585() {
		assertEquals("Danilo", customers.get(2584).getFirstName());
	}

	@Test
	@DisplayName("Record 2585: LastName is Markey")
	void LastNameOfRecord2585() {
		assertEquals("Markey", customers.get(2584).getLastName());
	}

	@Test
	@DisplayName("Record 2585: Company is David Culp & Co Cpas")
	void CompanyOfRecord2585() {
		assertEquals("David Culp & Co Cpas", customers.get(2584).getCompany());
	}

	@Test
	@DisplayName("Record 2585: Address is 1160 Massachusetts Ave")
	void AddressOfRecord2585() {
		assertEquals("1160 Massachusetts Ave", customers.get(2584).getAddress());
	}

	@Test
	@DisplayName("Record 2585: City is Cambridge")
	void CityOfRecord2585() {
		assertEquals("Cambridge", customers.get(2584).getCity());
	}

	@Test
	@DisplayName("Record 2585: County is Middlesex")
	void CountyOfRecord2585() {
		assertEquals("Middlesex", customers.get(2584).getCounty());
	}

	@Test
	@DisplayName("Record 2585: State is MA")
	void StateOfRecord2585() {
		assertEquals("MA", customers.get(2584).getState());
	}

	@Test
	@DisplayName("Record 2585: ZIP is 2138")
	void ZIPOfRecord2585() {
		assertEquals("2138", customers.get(2584).getZIP());
	}

	@Test
	@DisplayName("Record 2585: Phone is 617-864-0375")
	void PhoneOfRecord2585() {
		assertEquals("617-864-0375", customers.get(2584).getPhone());
	}

	@Test
	@DisplayName("Record 2585: Fax is 617-864-9355")
	void FaxOfRecord2585() {
		assertEquals("617-864-9355", customers.get(2584).getFax());
	}

	@Test
	@DisplayName("Record 2585: Email is danilo@markey.com")
	void EmailOfRecord2585() {
		assertEquals("danilo@markey.com", customers.get(2584).getEmail());
	}

	@Test
	@DisplayName("Record 2585: Web is http://www.danilomarkey.com")
	void WebOfRecord2585() {
		assertEquals("http://www.danilomarkey.com", customers.get(2584).getWeb());
	}
}
