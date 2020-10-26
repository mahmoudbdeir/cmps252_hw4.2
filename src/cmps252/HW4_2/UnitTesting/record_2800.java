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

@Tag("27")
class Record_2800 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2800: FirstName is Lloyd")
	void FirstNameOfRecord2800() {
		assertEquals("Lloyd", customers.get(2799).getFirstName());
	}

	@Test
	@DisplayName("Record 2800: LastName is Kyr")
	void LastNameOfRecord2800() {
		assertEquals("Kyr", customers.get(2799).getLastName());
	}

	@Test
	@DisplayName("Record 2800: Company is Atlas Fitness Equipment Inc")
	void CompanyOfRecord2800() {
		assertEquals("Atlas Fitness Equipment Inc", customers.get(2799).getCompany());
	}

	@Test
	@DisplayName("Record 2800: Address is 3350 Erie Blvd E")
	void AddressOfRecord2800() {
		assertEquals("3350 Erie Blvd E", customers.get(2799).getAddress());
	}

	@Test
	@DisplayName("Record 2800: City is Syracuse")
	void CityOfRecord2800() {
		assertEquals("Syracuse", customers.get(2799).getCity());
	}

	@Test
	@DisplayName("Record 2800: County is Onondaga")
	void CountyOfRecord2800() {
		assertEquals("Onondaga", customers.get(2799).getCounty());
	}

	@Test
	@DisplayName("Record 2800: State is NY")
	void StateOfRecord2800() {
		assertEquals("NY", customers.get(2799).getState());
	}

	@Test
	@DisplayName("Record 2800: ZIP is 13214")
	void ZIPOfRecord2800() {
		assertEquals("13214", customers.get(2799).getZIP());
	}

	@Test
	@DisplayName("Record 2800: Phone is 315-449-9065")
	void PhoneOfRecord2800() {
		assertEquals("315-449-9065", customers.get(2799).getPhone());
	}

	@Test
	@DisplayName("Record 2800: Fax is 315-449-0392")
	void FaxOfRecord2800() {
		assertEquals("315-449-0392", customers.get(2799).getFax());
	}

	@Test
	@DisplayName("Record 2800: Email is lloyd@kyr.com")
	void EmailOfRecord2800() {
		assertEquals("lloyd@kyr.com", customers.get(2799).getEmail());
	}

	@Test
	@DisplayName("Record 2800: Web is http://www.lloydkyr.com")
	void WebOfRecord2800() {
		assertEquals("http://www.lloydkyr.com", customers.get(2799).getWeb());
	}
}
