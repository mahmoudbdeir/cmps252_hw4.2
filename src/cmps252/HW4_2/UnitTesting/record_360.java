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
class Record_360 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 360: FirstName is Blake")
	void FirstNameOfRecord360() {
		assertEquals("Blake", customers.get(359).getFirstName());
	}

	@Test
	@DisplayName("Record 360: LastName is Fralygh")
	void LastNameOfRecord360() {
		assertEquals("Fralygh", customers.get(359).getLastName());
	}

	@Test
	@DisplayName("Record 360: Company is Geddes, Maggie Esq")
	void CompanyOfRecord360() {
		assertEquals("Geddes, Maggie Esq", customers.get(359).getCompany());
	}

	@Test
	@DisplayName("Record 360: Address is 21470 Goddard Rd")
	void AddressOfRecord360() {
		assertEquals("21470 Goddard Rd", customers.get(359).getAddress());
	}

	@Test
	@DisplayName("Record 360: City is Taylor")
	void CityOfRecord360() {
		assertEquals("Taylor", customers.get(359).getCity());
	}

	@Test
	@DisplayName("Record 360: County is Wayne")
	void CountyOfRecord360() {
		assertEquals("Wayne", customers.get(359).getCounty());
	}

	@Test
	@DisplayName("Record 360: State is MI")
	void StateOfRecord360() {
		assertEquals("MI", customers.get(359).getState());
	}

	@Test
	@DisplayName("Record 360: ZIP is 48180")
	void ZIPOfRecord360() {
		assertEquals("48180", customers.get(359).getZIP());
	}

	@Test
	@DisplayName("Record 360: Phone is 313-291-1744")
	void PhoneOfRecord360() {
		assertEquals("313-291-1744", customers.get(359).getPhone());
	}

	@Test
	@DisplayName("Record 360: Fax is 313-291-0735")
	void FaxOfRecord360() {
		assertEquals("313-291-0735", customers.get(359).getFax());
	}

	@Test
	@DisplayName("Record 360: Email is blake@fralygh.com")
	void EmailOfRecord360() {
		assertEquals("blake@fralygh.com", customers.get(359).getEmail());
	}

	@Test
	@DisplayName("Record 360: Web is http://www.blakefralygh.com")
	void WebOfRecord360() {
		assertEquals("http://www.blakefralygh.com", customers.get(359).getWeb());
	}
}
