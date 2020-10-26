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

@Tag("26")
class Record_3576 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3576: FirstName is Anthony")
	void FirstNameOfRecord3576() {
		assertEquals("Anthony", customers.get(3575).getFirstName());
	}

	@Test
	@DisplayName("Record 3576: LastName is Briney")
	void LastNameOfRecord3576() {
		assertEquals("Briney", customers.get(3575).getLastName());
	}

	@Test
	@DisplayName("Record 3576: Company is Best Western Inn")
	void CompanyOfRecord3576() {
		assertEquals("Best Western Inn", customers.get(3575).getCompany());
	}

	@Test
	@DisplayName("Record 3576: Address is 9525 149th St")
	void AddressOfRecord3576() {
		assertEquals("9525 149th St", customers.get(3575).getAddress());
	}

	@Test
	@DisplayName("Record 3576: City is Jamaica")
	void CityOfRecord3576() {
		assertEquals("Jamaica", customers.get(3575).getCity());
	}

	@Test
	@DisplayName("Record 3576: County is Queens")
	void CountyOfRecord3576() {
		assertEquals("Queens", customers.get(3575).getCounty());
	}

	@Test
	@DisplayName("Record 3576: State is NY")
	void StateOfRecord3576() {
		assertEquals("NY", customers.get(3575).getState());
	}

	@Test
	@DisplayName("Record 3576: ZIP is 11435")
	void ZIPOfRecord3576() {
		assertEquals("11435", customers.get(3575).getZIP());
	}

	@Test
	@DisplayName("Record 3576: Phone is 718-739-6927")
	void PhoneOfRecord3576() {
		assertEquals("718-739-6927", customers.get(3575).getPhone());
	}

	@Test
	@DisplayName("Record 3576: Fax is 718-739-5459")
	void FaxOfRecord3576() {
		assertEquals("718-739-5459", customers.get(3575).getFax());
	}

	@Test
	@DisplayName("Record 3576: Email is anthony@briney.com")
	void EmailOfRecord3576() {
		assertEquals("anthony@briney.com", customers.get(3575).getEmail());
	}

	@Test
	@DisplayName("Record 3576: Web is http://www.anthonybriney.com")
	void WebOfRecord3576() {
		assertEquals("http://www.anthonybriney.com", customers.get(3575).getWeb());
	}
}
