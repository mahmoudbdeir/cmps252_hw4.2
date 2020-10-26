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

@Tag("31")
class Record_4664 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4664: FirstName is Laverne")
	void FirstNameOfRecord4664() {
		assertEquals("Laverne", customers.get(4663).getFirstName());
	}

	@Test
	@DisplayName("Record 4664: LastName is Klabunde")
	void LastNameOfRecord4664() {
		assertEquals("Klabunde", customers.get(4663).getLastName());
	}

	@Test
	@DisplayName("Record 4664: Company is Rockys Pizza Ring")
	void CompanyOfRecord4664() {
		assertEquals("Rockys Pizza Ring", customers.get(4663).getCompany());
	}

	@Test
	@DisplayName("Record 4664: Address is 4430 Walden Ave")
	void AddressOfRecord4664() {
		assertEquals("4430 Walden Ave", customers.get(4663).getAddress());
	}

	@Test
	@DisplayName("Record 4664: City is Lancaster")
	void CityOfRecord4664() {
		assertEquals("Lancaster", customers.get(4663).getCity());
	}

	@Test
	@DisplayName("Record 4664: County is Erie")
	void CountyOfRecord4664() {
		assertEquals("Erie", customers.get(4663).getCounty());
	}

	@Test
	@DisplayName("Record 4664: State is NY")
	void StateOfRecord4664() {
		assertEquals("NY", customers.get(4663).getState());
	}

	@Test
	@DisplayName("Record 4664: ZIP is 14086")
	void ZIPOfRecord4664() {
		assertEquals("14086", customers.get(4663).getZIP());
	}

	@Test
	@DisplayName("Record 4664: Phone is 716-681-8947")
	void PhoneOfRecord4664() {
		assertEquals("716-681-8947", customers.get(4663).getPhone());
	}

	@Test
	@DisplayName("Record 4664: Fax is 716-681-6463")
	void FaxOfRecord4664() {
		assertEquals("716-681-6463", customers.get(4663).getFax());
	}

	@Test
	@DisplayName("Record 4664: Email is laverne@klabunde.com")
	void EmailOfRecord4664() {
		assertEquals("laverne@klabunde.com", customers.get(4663).getEmail());
	}

	@Test
	@DisplayName("Record 4664: Web is http://www.laverneklabunde.com")
	void WebOfRecord4664() {
		assertEquals("http://www.laverneklabunde.com", customers.get(4663).getWeb());
	}
}
