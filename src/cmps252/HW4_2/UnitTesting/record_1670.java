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
class Record_1670 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1670: FirstName is Willy")
	void FirstNameOfRecord1670() {
		assertEquals("Willy", customers.get(1669).getFirstName());
	}

	@Test
	@DisplayName("Record 1670: LastName is Godette")
	void LastNameOfRecord1670() {
		assertEquals("Godette", customers.get(1669).getLastName());
	}

	@Test
	@DisplayName("Record 1670: Company is Metro Materials Co")
	void CompanyOfRecord1670() {
		assertEquals("Metro Materials Co", customers.get(1669).getCompany());
	}

	@Test
	@DisplayName("Record 1670: Address is 3 Greentree Ctr")
	void AddressOfRecord1670() {
		assertEquals("3 Greentree Ctr", customers.get(1669).getAddress());
	}

	@Test
	@DisplayName("Record 1670: City is Marlton")
	void CityOfRecord1670() {
		assertEquals("Marlton", customers.get(1669).getCity());
	}

	@Test
	@DisplayName("Record 1670: County is Burlington")
	void CountyOfRecord1670() {
		assertEquals("Burlington", customers.get(1669).getCounty());
	}

	@Test
	@DisplayName("Record 1670: State is NJ")
	void StateOfRecord1670() {
		assertEquals("NJ", customers.get(1669).getState());
	}

	@Test
	@DisplayName("Record 1670: ZIP is 8053")
	void ZIPOfRecord1670() {
		assertEquals("8053", customers.get(1669).getZIP());
	}

	@Test
	@DisplayName("Record 1670: Phone is 856-983-6571")
	void PhoneOfRecord1670() {
		assertEquals("856-983-6571", customers.get(1669).getPhone());
	}

	@Test
	@DisplayName("Record 1670: Fax is 856-983-7291")
	void FaxOfRecord1670() {
		assertEquals("856-983-7291", customers.get(1669).getFax());
	}

	@Test
	@DisplayName("Record 1670: Email is willy@godette.com")
	void EmailOfRecord1670() {
		assertEquals("willy@godette.com", customers.get(1669).getEmail());
	}

	@Test
	@DisplayName("Record 1670: Web is http://www.willygodette.com")
	void WebOfRecord1670() {
		assertEquals("http://www.willygodette.com", customers.get(1669).getWeb());
	}
}
