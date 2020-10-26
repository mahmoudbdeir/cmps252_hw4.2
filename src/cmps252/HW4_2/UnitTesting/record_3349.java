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

@Tag("19")
class Record_3349 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3349: FirstName is Quinton")
	void FirstNameOfRecord3349() {
		assertEquals("Quinton", customers.get(3348).getFirstName());
	}

	@Test
	@DisplayName("Record 3349: LastName is Dassow")
	void LastNameOfRecord3349() {
		assertEquals("Dassow", customers.get(3348).getLastName());
	}

	@Test
	@DisplayName("Record 3349: Company is Robert L Roth Chapter 13 Tr")
	void CompanyOfRecord3349() {
		assertEquals("Robert L Roth Chapter 13 Tr", customers.get(3348).getCompany());
	}

	@Test
	@DisplayName("Record 3349: Address is 601 E St Nw")
	void AddressOfRecord3349() {
		assertEquals("601 E St Nw", customers.get(3348).getAddress());
	}

	@Test
	@DisplayName("Record 3349: City is Washington")
	void CityOfRecord3349() {
		assertEquals("Washington", customers.get(3348).getCity());
	}

	@Test
	@DisplayName("Record 3349: County is District of Columbia")
	void CountyOfRecord3349() {
		assertEquals("District of Columbia", customers.get(3348).getCounty());
	}

	@Test
	@DisplayName("Record 3349: State is DC")
	void StateOfRecord3349() {
		assertEquals("DC", customers.get(3348).getState());
	}

	@Test
	@DisplayName("Record 3349: ZIP is 20049")
	void ZIPOfRecord3349() {
		assertEquals("20049", customers.get(3348).getZIP());
	}

	@Test
	@DisplayName("Record 3349: Phone is 202-434-3685")
	void PhoneOfRecord3349() {
		assertEquals("202-434-3685", customers.get(3348).getPhone());
	}

	@Test
	@DisplayName("Record 3349: Fax is 202-434-7033")
	void FaxOfRecord3349() {
		assertEquals("202-434-7033", customers.get(3348).getFax());
	}

	@Test
	@DisplayName("Record 3349: Email is quinton@dassow.com")
	void EmailOfRecord3349() {
		assertEquals("quinton@dassow.com", customers.get(3348).getEmail());
	}

	@Test
	@DisplayName("Record 3349: Web is http://www.quintondassow.com")
	void WebOfRecord3349() {
		assertEquals("http://www.quintondassow.com", customers.get(3348).getWeb());
	}
}
