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

@Tag("31")
class Record_2447 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2447: FirstName is Alta")
	void FirstNameOfRecord2447() {
		assertEquals("Alta", customers.get(2446).getFirstName());
	}

	@Test
	@DisplayName("Record 2447: LastName is Mekee")
	void LastNameOfRecord2447() {
		assertEquals("Mekee", customers.get(2446).getLastName());
	}

	@Test
	@DisplayName("Record 2447: Company is Fleet Maintenance Inc")
	void CompanyOfRecord2447() {
		assertEquals("Fleet Maintenance Inc", customers.get(2446).getCompany());
	}

	@Test
	@DisplayName("Record 2447: Address is 5500 Market St")
	void AddressOfRecord2447() {
		assertEquals("5500 Market St", customers.get(2446).getAddress());
	}

	@Test
	@DisplayName("Record 2447: City is Youngstown")
	void CityOfRecord2447() {
		assertEquals("Youngstown", customers.get(2446).getCity());
	}

	@Test
	@DisplayName("Record 2447: County is Mahoning")
	void CountyOfRecord2447() {
		assertEquals("Mahoning", customers.get(2446).getCounty());
	}

	@Test
	@DisplayName("Record 2447: State is OH")
	void StateOfRecord2447() {
		assertEquals("OH", customers.get(2446).getState());
	}

	@Test
	@DisplayName("Record 2447: ZIP is 44512")
	void ZIPOfRecord2447() {
		assertEquals("44512", customers.get(2446).getZIP());
	}

	@Test
	@DisplayName("Record 2447: Phone is 330-788-7421")
	void PhoneOfRecord2447() {
		assertEquals("330-788-7421", customers.get(2446).getPhone());
	}

	@Test
	@DisplayName("Record 2447: Fax is 330-788-0241")
	void FaxOfRecord2447() {
		assertEquals("330-788-0241", customers.get(2446).getFax());
	}

	@Test
	@DisplayName("Record 2447: Email is alta@mekee.com")
	void EmailOfRecord2447() {
		assertEquals("alta@mekee.com", customers.get(2446).getEmail());
	}

	@Test
	@DisplayName("Record 2447: Web is http://www.altamekee.com")
	void WebOfRecord2447() {
		assertEquals("http://www.altamekee.com", customers.get(2446).getWeb());
	}
}
