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

@Tag("34")
class Record_1748 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1748: FirstName is Susan")
	void FirstNameOfRecord1748() {
		assertEquals("Susan", customers.get(1747).getFirstName());
	}

	@Test
	@DisplayName("Record 1748: LastName is Verma")
	void LastNameOfRecord1748() {
		assertEquals("Verma", customers.get(1747).getLastName());
	}

	@Test
	@DisplayName("Record 1748: Company is Mccollum, Elliott P Jr")
	void CompanyOfRecord1748() {
		assertEquals("Mccollum, Elliott P Jr", customers.get(1747).getCompany());
	}

	@Test
	@DisplayName("Record 1748: Address is 155 Manchester Pl")
	void AddressOfRecord1748() {
		assertEquals("155 Manchester Pl", customers.get(1747).getAddress());
	}

	@Test
	@DisplayName("Record 1748: City is Newark")
	void CityOfRecord1748() {
		assertEquals("Newark", customers.get(1747).getCity());
	}

	@Test
	@DisplayName("Record 1748: County is Essex")
	void CountyOfRecord1748() {
		assertEquals("Essex", customers.get(1747).getCounty());
	}

	@Test
	@DisplayName("Record 1748: State is NJ")
	void StateOfRecord1748() {
		assertEquals("NJ", customers.get(1747).getState());
	}

	@Test
	@DisplayName("Record 1748: ZIP is 7104")
	void ZIPOfRecord1748() {
		assertEquals("7104", customers.get(1747).getZIP());
	}

	@Test
	@DisplayName("Record 1748: Phone is 973-485-4012")
	void PhoneOfRecord1748() {
		assertEquals("973-485-4012", customers.get(1747).getPhone());
	}

	@Test
	@DisplayName("Record 1748: Fax is 973-485-2452")
	void FaxOfRecord1748() {
		assertEquals("973-485-2452", customers.get(1747).getFax());
	}

	@Test
	@DisplayName("Record 1748: Email is susan@verma.com")
	void EmailOfRecord1748() {
		assertEquals("susan@verma.com", customers.get(1747).getEmail());
	}

	@Test
	@DisplayName("Record 1748: Web is http://www.susanverma.com")
	void WebOfRecord1748() {
		assertEquals("http://www.susanverma.com", customers.get(1747).getWeb());
	}
}
