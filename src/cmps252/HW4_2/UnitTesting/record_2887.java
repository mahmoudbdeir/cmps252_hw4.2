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

@Tag("32")
class Record_2887 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2887: FirstName is Hans")
	void FirstNameOfRecord2887() {
		assertEquals("Hans", customers.get(2886).getFirstName());
	}

	@Test
	@DisplayName("Record 2887: LastName is Poynter")
	void LastNameOfRecord2887() {
		assertEquals("Poynter", customers.get(2886).getLastName());
	}

	@Test
	@DisplayName("Record 2887: Company is Lancaster Pump Div C B Tool Co")
	void CompanyOfRecord2887() {
		assertEquals("Lancaster Pump Div C B Tool Co", customers.get(2886).getCompany());
	}

	@Test
	@DisplayName("Record 2887: Address is 1415 Kellum Pl")
	void AddressOfRecord2887() {
		assertEquals("1415 Kellum Pl", customers.get(2886).getAddress());
	}

	@Test
	@DisplayName("Record 2887: City is Garden City")
	void CityOfRecord2887() {
		assertEquals("Garden City", customers.get(2886).getCity());
	}

	@Test
	@DisplayName("Record 2887: County is Nassau")
	void CountyOfRecord2887() {
		assertEquals("Nassau", customers.get(2886).getCounty());
	}

	@Test
	@DisplayName("Record 2887: State is NY")
	void StateOfRecord2887() {
		assertEquals("NY", customers.get(2886).getState());
	}

	@Test
	@DisplayName("Record 2887: ZIP is 11530")
	void ZIPOfRecord2887() {
		assertEquals("11530", customers.get(2886).getZIP());
	}

	@Test
	@DisplayName("Record 2887: Phone is 516-873-0853")
	void PhoneOfRecord2887() {
		assertEquals("516-873-0853", customers.get(2886).getPhone());
	}

	@Test
	@DisplayName("Record 2887: Fax is 516-873-4775")
	void FaxOfRecord2887() {
		assertEquals("516-873-4775", customers.get(2886).getFax());
	}

	@Test
	@DisplayName("Record 2887: Email is hans@poynter.com")
	void EmailOfRecord2887() {
		assertEquals("hans@poynter.com", customers.get(2886).getEmail());
	}

	@Test
	@DisplayName("Record 2887: Web is http://www.hanspoynter.com")
	void WebOfRecord2887() {
		assertEquals("http://www.hanspoynter.com", customers.get(2886).getWeb());
	}
}
