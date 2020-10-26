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

@Tag("22")
class Record_1916 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1916: FirstName is Zane")
	void FirstNameOfRecord1916() {
		assertEquals("Zane", customers.get(1915).getFirstName());
	}

	@Test
	@DisplayName("Record 1916: LastName is Franze")
	void LastNameOfRecord1916() {
		assertEquals("Franze", customers.get(1915).getLastName());
	}

	@Test
	@DisplayName("Record 1916: Company is Marcello Freezin Stge & Wrhse")
	void CompanyOfRecord1916() {
		assertEquals("Marcello Freezin Stge & Wrhse", customers.get(1915).getCompany());
	}

	@Test
	@DisplayName("Record 1916: Address is 20531 Plummer St")
	void AddressOfRecord1916() {
		assertEquals("20531 Plummer St", customers.get(1915).getAddress());
	}

	@Test
	@DisplayName("Record 1916: City is Chatsworth")
	void CityOfRecord1916() {
		assertEquals("Chatsworth", customers.get(1915).getCity());
	}

	@Test
	@DisplayName("Record 1916: County is Los Angeles")
	void CountyOfRecord1916() {
		assertEquals("Los Angeles", customers.get(1915).getCounty());
	}

	@Test
	@DisplayName("Record 1916: State is CA")
	void StateOfRecord1916() {
		assertEquals("CA", customers.get(1915).getState());
	}

	@Test
	@DisplayName("Record 1916: ZIP is 91311")
	void ZIPOfRecord1916() {
		assertEquals("91311", customers.get(1915).getZIP());
	}

	@Test
	@DisplayName("Record 1916: Phone is 818-998-4115")
	void PhoneOfRecord1916() {
		assertEquals("818-998-4115", customers.get(1915).getPhone());
	}

	@Test
	@DisplayName("Record 1916: Fax is 818-998-9231")
	void FaxOfRecord1916() {
		assertEquals("818-998-9231", customers.get(1915).getFax());
	}

	@Test
	@DisplayName("Record 1916: Email is zane@franze.com")
	void EmailOfRecord1916() {
		assertEquals("zane@franze.com", customers.get(1915).getEmail());
	}

	@Test
	@DisplayName("Record 1916: Web is http://www.zanefranze.com")
	void WebOfRecord1916() {
		assertEquals("http://www.zanefranze.com", customers.get(1915).getWeb());
	}
}
