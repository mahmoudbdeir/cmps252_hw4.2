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
class Record_3782 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3782: FirstName is Wesley")
	void FirstNameOfRecord3782() {
		assertEquals("Wesley", customers.get(3781).getFirstName());
	}

	@Test
	@DisplayName("Record 3782: LastName is Allvin")
	void LastNameOfRecord3782() {
		assertEquals("Allvin", customers.get(3781).getLastName());
	}

	@Test
	@DisplayName("Record 3782: Company is Hendricks, George F Esq")
	void CompanyOfRecord3782() {
		assertEquals("Hendricks, George F Esq", customers.get(3781).getCompany());
	}

	@Test
	@DisplayName("Record 3782: Address is 2338 W Burnham St")
	void AddressOfRecord3782() {
		assertEquals("2338 W Burnham St", customers.get(3781).getAddress());
	}

	@Test
	@DisplayName("Record 3782: City is Milwaukee")
	void CityOfRecord3782() {
		assertEquals("Milwaukee", customers.get(3781).getCity());
	}

	@Test
	@DisplayName("Record 3782: County is Milwaukee")
	void CountyOfRecord3782() {
		assertEquals("Milwaukee", customers.get(3781).getCounty());
	}

	@Test
	@DisplayName("Record 3782: State is WI")
	void StateOfRecord3782() {
		assertEquals("WI", customers.get(3781).getState());
	}

	@Test
	@DisplayName("Record 3782: ZIP is 53204")
	void ZIPOfRecord3782() {
		assertEquals("53204", customers.get(3781).getZIP());
	}

	@Test
	@DisplayName("Record 3782: Phone is 414-383-9235")
	void PhoneOfRecord3782() {
		assertEquals("414-383-9235", customers.get(3781).getPhone());
	}

	@Test
	@DisplayName("Record 3782: Fax is 414-383-6052")
	void FaxOfRecord3782() {
		assertEquals("414-383-6052", customers.get(3781).getFax());
	}

	@Test
	@DisplayName("Record 3782: Email is wesley@allvin.com")
	void EmailOfRecord3782() {
		assertEquals("wesley@allvin.com", customers.get(3781).getEmail());
	}

	@Test
	@DisplayName("Record 3782: Web is http://www.wesleyallvin.com")
	void WebOfRecord3782() {
		assertEquals("http://www.wesleyallvin.com", customers.get(3781).getWeb());
	}
}
