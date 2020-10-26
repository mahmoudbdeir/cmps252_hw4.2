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

@Tag("18")
class Record_2433 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2433: FirstName is Kelly")
	void FirstNameOfRecord2433() {
		assertEquals("Kelly", customers.get(2432).getFirstName());
	}

	@Test
	@DisplayName("Record 2433: LastName is Mcdilda")
	void LastNameOfRecord2433() {
		assertEquals("Mcdilda", customers.get(2432).getLastName());
	}

	@Test
	@DisplayName("Record 2433: Company is Landmark Manufacturing Inc")
	void CompanyOfRecord2433() {
		assertEquals("Landmark Manufacturing Inc", customers.get(2432).getCompany());
	}

	@Test
	@DisplayName("Record 2433: Address is 2430 E Semoran Blvd")
	void AddressOfRecord2433() {
		assertEquals("2430 E Semoran Blvd", customers.get(2432).getAddress());
	}

	@Test
	@DisplayName("Record 2433: City is Apopka")
	void CityOfRecord2433() {
		assertEquals("Apopka", customers.get(2432).getCity());
	}

	@Test
	@DisplayName("Record 2433: County is Orange")
	void CountyOfRecord2433() {
		assertEquals("Orange", customers.get(2432).getCounty());
	}

	@Test
	@DisplayName("Record 2433: State is FL")
	void StateOfRecord2433() {
		assertEquals("FL", customers.get(2432).getState());
	}

	@Test
	@DisplayName("Record 2433: ZIP is 32703")
	void ZIPOfRecord2433() {
		assertEquals("32703", customers.get(2432).getZIP());
	}

	@Test
	@DisplayName("Record 2433: Phone is 407-886-2489")
	void PhoneOfRecord2433() {
		assertEquals("407-886-2489", customers.get(2432).getPhone());
	}

	@Test
	@DisplayName("Record 2433: Fax is 407-886-9924")
	void FaxOfRecord2433() {
		assertEquals("407-886-9924", customers.get(2432).getFax());
	}

	@Test
	@DisplayName("Record 2433: Email is kelly@mcdilda.com")
	void EmailOfRecord2433() {
		assertEquals("kelly@mcdilda.com", customers.get(2432).getEmail());
	}

	@Test
	@DisplayName("Record 2433: Web is http://www.kellymcdilda.com")
	void WebOfRecord2433() {
		assertEquals("http://www.kellymcdilda.com", customers.get(2432).getWeb());
	}
}
