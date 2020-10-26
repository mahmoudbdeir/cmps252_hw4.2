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

@Tag("48")
class Record_3191 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3191: FirstName is Dale")
	void FirstNameOfRecord3191() {
		assertEquals("Dale", customers.get(3190).getFirstName());
	}

	@Test
	@DisplayName("Record 3191: LastName is Santora")
	void LastNameOfRecord3191() {
		assertEquals("Santora", customers.get(3190).getLastName());
	}

	@Test
	@DisplayName("Record 3191: Company is Baptist Childrens Homes Inc")
	void CompanyOfRecord3191() {
		assertEquals("Baptist Childrens Homes Inc", customers.get(3190).getCompany());
	}

	@Test
	@DisplayName("Record 3191: Address is 29306 Stephenson Hwy")
	void AddressOfRecord3191() {
		assertEquals("29306 Stephenson Hwy", customers.get(3190).getAddress());
	}

	@Test
	@DisplayName("Record 3191: City is Madison Hyghts")
	void CityOfRecord3191() {
		assertEquals("Madison Hyghts", customers.get(3190).getCity());
	}

	@Test
	@DisplayName("Record 3191: County is Oakland")
	void CountyOfRecord3191() {
		assertEquals("Oakland", customers.get(3190).getCounty());
	}

	@Test
	@DisplayName("Record 3191: State is MI")
	void StateOfRecord3191() {
		assertEquals("MI", customers.get(3190).getState());
	}

	@Test
	@DisplayName("Record 3191: ZIP is 48071")
	void ZIPOfRecord3191() {
		assertEquals("48071", customers.get(3190).getZIP());
	}

	@Test
	@DisplayName("Record 3191: Phone is 248-543-9909")
	void PhoneOfRecord3191() {
		assertEquals("248-543-9909", customers.get(3190).getPhone());
	}

	@Test
	@DisplayName("Record 3191: Fax is 248-543-8418")
	void FaxOfRecord3191() {
		assertEquals("248-543-8418", customers.get(3190).getFax());
	}

	@Test
	@DisplayName("Record 3191: Email is dale@santora.com")
	void EmailOfRecord3191() {
		assertEquals("dale@santora.com", customers.get(3190).getEmail());
	}

	@Test
	@DisplayName("Record 3191: Web is http://www.dalesantora.com")
	void WebOfRecord3191() {
		assertEquals("http://www.dalesantora.com", customers.get(3190).getWeb());
	}
}
