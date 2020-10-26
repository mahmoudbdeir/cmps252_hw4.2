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

@Tag("30")
class Record_667 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 667: FirstName is Estela")
	void FirstNameOfRecord667() {
		assertEquals("Estela", customers.get(666).getFirstName());
	}

	@Test
	@DisplayName("Record 667: LastName is Kye")
	void LastNameOfRecord667() {
		assertEquals("Kye", customers.get(666).getLastName());
	}

	@Test
	@DisplayName("Record 667: Company is Gallery Eleven")
	void CompanyOfRecord667() {
		assertEquals("Gallery Eleven", customers.get(666).getCompany());
	}

	@Test
	@DisplayName("Record 667: Address is 15620 Common Rd")
	void AddressOfRecord667() {
		assertEquals("15620 Common Rd", customers.get(666).getAddress());
	}

	@Test
	@DisplayName("Record 667: City is Roseville")
	void CityOfRecord667() {
		assertEquals("Roseville", customers.get(666).getCity());
	}

	@Test
	@DisplayName("Record 667: County is Macomb")
	void CountyOfRecord667() {
		assertEquals("Macomb", customers.get(666).getCounty());
	}

	@Test
	@DisplayName("Record 667: State is MI")
	void StateOfRecord667() {
		assertEquals("MI", customers.get(666).getState());
	}

	@Test
	@DisplayName("Record 667: ZIP is 48066")
	void ZIPOfRecord667() {
		assertEquals("48066", customers.get(666).getZIP());
	}

	@Test
	@DisplayName("Record 667: Phone is 586-777-5853")
	void PhoneOfRecord667() {
		assertEquals("586-777-5853", customers.get(666).getPhone());
	}

	@Test
	@DisplayName("Record 667: Fax is 586-777-0402")
	void FaxOfRecord667() {
		assertEquals("586-777-0402", customers.get(666).getFax());
	}

	@Test
	@DisplayName("Record 667: Email is estela@kye.com")
	void EmailOfRecord667() {
		assertEquals("estela@kye.com", customers.get(666).getEmail());
	}

	@Test
	@DisplayName("Record 667: Web is http://www.estelakye.com")
	void WebOfRecord667() {
		assertEquals("http://www.estelakye.com", customers.get(666).getWeb());
	}
}
