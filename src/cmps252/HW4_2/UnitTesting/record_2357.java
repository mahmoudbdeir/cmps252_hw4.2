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

@Tag("11")
class Record_2357 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2357: FirstName is Numbers")
	void FirstNameOfRecord2357() {
		assertEquals("Numbers", customers.get(2356).getFirstName());
	}

	@Test
	@DisplayName("Record 2357: LastName is Sedar")
	void LastNameOfRecord2357() {
		assertEquals("Sedar", customers.get(2356).getLastName());
	}

	@Test
	@DisplayName("Record 2357: Company is Fred Callaghan Cpt & Flrng Ctr")
	void CompanyOfRecord2357() {
		assertEquals("Fred Callaghan Cpt & Flrng Ctr", customers.get(2356).getCompany());
	}

	@Test
	@DisplayName("Record 2357: Address is 3665 S 300 W")
	void AddressOfRecord2357() {
		assertEquals("3665 S 300 W", customers.get(2356).getAddress());
	}

	@Test
	@DisplayName("Record 2357: City is Salt Lake City")
	void CityOfRecord2357() {
		assertEquals("Salt Lake City", customers.get(2356).getCity());
	}

	@Test
	@DisplayName("Record 2357: County is Salt Lake")
	void CountyOfRecord2357() {
		assertEquals("Salt Lake", customers.get(2356).getCounty());
	}

	@Test
	@DisplayName("Record 2357: State is UT")
	void StateOfRecord2357() {
		assertEquals("UT", customers.get(2356).getState());
	}

	@Test
	@DisplayName("Record 2357: ZIP is 84115")
	void ZIPOfRecord2357() {
		assertEquals("84115", customers.get(2356).getZIP());
	}

	@Test
	@DisplayName("Record 2357: Phone is 801-266-4871")
	void PhoneOfRecord2357() {
		assertEquals("801-266-4871", customers.get(2356).getPhone());
	}

	@Test
	@DisplayName("Record 2357: Fax is 801-266-3441")
	void FaxOfRecord2357() {
		assertEquals("801-266-3441", customers.get(2356).getFax());
	}

	@Test
	@DisplayName("Record 2357: Email is numbers@sedar.com")
	void EmailOfRecord2357() {
		assertEquals("numbers@sedar.com", customers.get(2356).getEmail());
	}

	@Test
	@DisplayName("Record 2357: Web is http://www.numberssedar.com")
	void WebOfRecord2357() {
		assertEquals("http://www.numberssedar.com", customers.get(2356).getWeb());
	}
}
