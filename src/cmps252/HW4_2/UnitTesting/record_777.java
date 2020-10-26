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
class Record_777 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 777: FirstName is Grace")
	void FirstNameOfRecord777() {
		assertEquals("Grace", customers.get(776).getFirstName());
	}

	@Test
	@DisplayName("Record 777: LastName is Kile")
	void LastNameOfRecord777() {
		assertEquals("Kile", customers.get(776).getLastName());
	}

	@Test
	@DisplayName("Record 777: Company is Westbrook Advertising")
	void CompanyOfRecord777() {
		assertEquals("Westbrook Advertising", customers.get(776).getCompany());
	}

	@Test
	@DisplayName("Record 777: Address is 3720 12th St")
	void AddressOfRecord777() {
		assertEquals("3720 12th St", customers.get(776).getAddress());
	}

	@Test
	@DisplayName("Record 777: City is Long Island City")
	void CityOfRecord777() {
		assertEquals("Long Island City", customers.get(776).getCity());
	}

	@Test
	@DisplayName("Record 777: County is Queens")
	void CountyOfRecord777() {
		assertEquals("Queens", customers.get(776).getCounty());
	}

	@Test
	@DisplayName("Record 777: State is NY")
	void StateOfRecord777() {
		assertEquals("NY", customers.get(776).getState());
	}

	@Test
	@DisplayName("Record 777: ZIP is 11101")
	void ZIPOfRecord777() {
		assertEquals("11101", customers.get(776).getZIP());
	}

	@Test
	@DisplayName("Record 777: Phone is 718-482-2129")
	void PhoneOfRecord777() {
		assertEquals("718-482-2129", customers.get(776).getPhone());
	}

	@Test
	@DisplayName("Record 777: Fax is 718-482-4773")
	void FaxOfRecord777() {
		assertEquals("718-482-4773", customers.get(776).getFax());
	}

	@Test
	@DisplayName("Record 777: Email is grace@kile.com")
	void EmailOfRecord777() {
		assertEquals("grace@kile.com", customers.get(776).getEmail());
	}

	@Test
	@DisplayName("Record 777: Web is http://www.gracekile.com")
	void WebOfRecord777() {
		assertEquals("http://www.gracekile.com", customers.get(776).getWeb());
	}
}
