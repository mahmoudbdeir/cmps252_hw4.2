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

@Tag("7")
class Record_404 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 404: FirstName is Jon")
	void FirstNameOfRecord404() {
		assertEquals("Jon", customers.get(403).getFirstName());
	}

	@Test
	@DisplayName("Record 404: LastName is Shahin")
	void LastNameOfRecord404() {
		assertEquals("Shahin", customers.get(403).getLastName());
	}

	@Test
	@DisplayName("Record 404: Company is Bucks County Nut & Coffee Co")
	void CompanyOfRecord404() {
		assertEquals("Bucks County Nut & Coffee Co", customers.get(403).getCompany());
	}

	@Test
	@DisplayName("Record 404: Address is 120 E Ogden Ave")
	void AddressOfRecord404() {
		assertEquals("120 E Ogden Ave", customers.get(403).getAddress());
	}

	@Test
	@DisplayName("Record 404: City is Hinsdale")
	void CityOfRecord404() {
		assertEquals("Hinsdale", customers.get(403).getCity());
	}

	@Test
	@DisplayName("Record 404: County is DuPage")
	void CountyOfRecord404() {
		assertEquals("DuPage", customers.get(403).getCounty());
	}

	@Test
	@DisplayName("Record 404: State is IL")
	void StateOfRecord404() {
		assertEquals("IL", customers.get(403).getState());
	}

	@Test
	@DisplayName("Record 404: ZIP is 60521")
	void ZIPOfRecord404() {
		assertEquals("60521", customers.get(403).getZIP());
	}

	@Test
	@DisplayName("Record 404: Phone is 630-882-9277")
	void PhoneOfRecord404() {
		assertEquals("630-882-9277", customers.get(403).getPhone());
	}

	@Test
	@DisplayName("Record 404: Fax is 630-882-8418")
	void FaxOfRecord404() {
		assertEquals("630-882-8418", customers.get(403).getFax());
	}

	@Test
	@DisplayName("Record 404: Email is jon@shahin.com")
	void EmailOfRecord404() {
		assertEquals("jon@shahin.com", customers.get(403).getEmail());
	}

	@Test
	@DisplayName("Record 404: Web is http://www.jonshahin.com")
	void WebOfRecord404() {
		assertEquals("http://www.jonshahin.com", customers.get(403).getWeb());
	}
}
