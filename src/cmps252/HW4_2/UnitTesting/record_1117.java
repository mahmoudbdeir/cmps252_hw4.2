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

@Tag("21")
class Record_1117 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1117: FirstName is Jacqueline")
	void FirstNameOfRecord1117() {
		assertEquals("Jacqueline", customers.get(1116).getFirstName());
	}

	@Test
	@DisplayName("Record 1117: LastName is Bull")
	void LastNameOfRecord1117() {
		assertEquals("Bull", customers.get(1116).getLastName());
	}

	@Test
	@DisplayName("Record 1117: Company is Mail Boxes Etc")
	void CompanyOfRecord1117() {
		assertEquals("Mail Boxes Etc", customers.get(1116).getCompany());
	}

	@Test
	@DisplayName("Record 1117: Address is 110 Factory Ave")
	void AddressOfRecord1117() {
		assertEquals("110 Factory Ave", customers.get(1116).getAddress());
	}

	@Test
	@DisplayName("Record 1117: City is Syracuse")
	void CityOfRecord1117() {
		assertEquals("Syracuse", customers.get(1116).getCity());
	}

	@Test
	@DisplayName("Record 1117: County is Onondaga")
	void CountyOfRecord1117() {
		assertEquals("Onondaga", customers.get(1116).getCounty());
	}

	@Test
	@DisplayName("Record 1117: State is NY")
	void StateOfRecord1117() {
		assertEquals("NY", customers.get(1116).getState());
	}

	@Test
	@DisplayName("Record 1117: ZIP is 13208")
	void ZIPOfRecord1117() {
		assertEquals("13208", customers.get(1116).getZIP());
	}

	@Test
	@DisplayName("Record 1117: Phone is 315-455-4160")
	void PhoneOfRecord1117() {
		assertEquals("315-455-4160", customers.get(1116).getPhone());
	}

	@Test
	@DisplayName("Record 1117: Fax is 315-455-0116")
	void FaxOfRecord1117() {
		assertEquals("315-455-0116", customers.get(1116).getFax());
	}

	@Test
	@DisplayName("Record 1117: Email is jacqueline@bull.com")
	void EmailOfRecord1117() {
		assertEquals("jacqueline@bull.com", customers.get(1116).getEmail());
	}

	@Test
	@DisplayName("Record 1117: Web is http://www.jacquelinebull.com")
	void WebOfRecord1117() {
		assertEquals("http://www.jacquelinebull.com", customers.get(1116).getWeb());
	}
}
