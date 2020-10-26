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

@Tag("46")
class Record_2983 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2983: FirstName is Velma")
	void FirstNameOfRecord2983() {
		assertEquals("Velma", customers.get(2982).getFirstName());
	}

	@Test
	@DisplayName("Record 2983: LastName is Moznett")
	void LastNameOfRecord2983() {
		assertEquals("Moznett", customers.get(2982).getLastName());
	}

	@Test
	@DisplayName("Record 2983: Company is Dohmen F Co")
	void CompanyOfRecord2983() {
		assertEquals("Dohmen F Co", customers.get(2982).getCompany());
	}

	@Test
	@DisplayName("Record 2983: Address is 759 N Orange Ave")
	void AddressOfRecord2983() {
		assertEquals("759 N Orange Ave", customers.get(2982).getAddress());
	}

	@Test
	@DisplayName("Record 2983: City is Orlando")
	void CityOfRecord2983() {
		assertEquals("Orlando", customers.get(2982).getCity());
	}

	@Test
	@DisplayName("Record 2983: County is Orange")
	void CountyOfRecord2983() {
		assertEquals("Orange", customers.get(2982).getCounty());
	}

	@Test
	@DisplayName("Record 2983: State is FL")
	void StateOfRecord2983() {
		assertEquals("FL", customers.get(2982).getState());
	}

	@Test
	@DisplayName("Record 2983: ZIP is 32801")
	void ZIPOfRecord2983() {
		assertEquals("32801", customers.get(2982).getZIP());
	}

	@Test
	@DisplayName("Record 2983: Phone is 407-839-6768")
	void PhoneOfRecord2983() {
		assertEquals("407-839-6768", customers.get(2982).getPhone());
	}

	@Test
	@DisplayName("Record 2983: Fax is 407-839-0629")
	void FaxOfRecord2983() {
		assertEquals("407-839-0629", customers.get(2982).getFax());
	}

	@Test
	@DisplayName("Record 2983: Email is velma@moznett.com")
	void EmailOfRecord2983() {
		assertEquals("velma@moznett.com", customers.get(2982).getEmail());
	}

	@Test
	@DisplayName("Record 2983: Web is http://www.velmamoznett.com")
	void WebOfRecord2983() {
		assertEquals("http://www.velmamoznett.com", customers.get(2982).getWeb());
	}
}
