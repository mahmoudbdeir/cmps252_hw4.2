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

@Tag("43")
class Record_336 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 336: FirstName is Kate")
	void FirstNameOfRecord336() {
		assertEquals("Kate", customers.get(335).getFirstName());
	}

	@Test
	@DisplayName("Record 336: LastName is Hulme")
	void LastNameOfRecord336() {
		assertEquals("Hulme", customers.get(335).getLastName());
	}

	@Test
	@DisplayName("Record 336: Company is Furniture America Inc")
	void CompanyOfRecord336() {
		assertEquals("Furniture America Inc", customers.get(335).getCompany());
	}

	@Test
	@DisplayName("Record 336: Address is 2323 W Schubert Ave")
	void AddressOfRecord336() {
		assertEquals("2323 W Schubert Ave", customers.get(335).getAddress());
	}

	@Test
	@DisplayName("Record 336: City is Chicago")
	void CityOfRecord336() {
		assertEquals("Chicago", customers.get(335).getCity());
	}

	@Test
	@DisplayName("Record 336: County is Cook")
	void CountyOfRecord336() {
		assertEquals("Cook", customers.get(335).getCounty());
	}

	@Test
	@DisplayName("Record 336: State is IL")
	void StateOfRecord336() {
		assertEquals("IL", customers.get(335).getState());
	}

	@Test
	@DisplayName("Record 336: ZIP is 60647")
	void ZIPOfRecord336() {
		assertEquals("60647", customers.get(335).getZIP());
	}

	@Test
	@DisplayName("Record 336: Phone is 773-235-3528")
	void PhoneOfRecord336() {
		assertEquals("773-235-3528", customers.get(335).getPhone());
	}

	@Test
	@DisplayName("Record 336: Fax is 773-235-0463")
	void FaxOfRecord336() {
		assertEquals("773-235-0463", customers.get(335).getFax());
	}

	@Test
	@DisplayName("Record 336: Email is kate@hulme.com")
	void EmailOfRecord336() {
		assertEquals("kate@hulme.com", customers.get(335).getEmail());
	}

	@Test
	@DisplayName("Record 336: Web is http://www.katehulme.com")
	void WebOfRecord336() {
		assertEquals("http://www.katehulme.com", customers.get(335).getWeb());
	}
}
