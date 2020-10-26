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

@Tag("28")
class Record_676 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 676: FirstName is Marilynn")
	void FirstNameOfRecord676() {
		assertEquals("Marilynn", customers.get(675).getFirstName());
	}

	@Test
	@DisplayName("Record 676: LastName is Worthey")
	void LastNameOfRecord676() {
		assertEquals("Worthey", customers.get(675).getLastName());
	}

	@Test
	@DisplayName("Record 676: Company is Mandos Party Mart")
	void CompanyOfRecord676() {
		assertEquals("Mandos Party Mart", customers.get(675).getCompany());
	}

	@Test
	@DisplayName("Record 676: Address is 1134 N 21st St")
	void AddressOfRecord676() {
		assertEquals("1134 N 21st St", customers.get(675).getAddress());
	}

	@Test
	@DisplayName("Record 676: City is Lincoln")
	void CityOfRecord676() {
		assertEquals("Lincoln", customers.get(675).getCity());
	}

	@Test
	@DisplayName("Record 676: County is Lancaster")
	void CountyOfRecord676() {
		assertEquals("Lancaster", customers.get(675).getCounty());
	}

	@Test
	@DisplayName("Record 676: State is NE")
	void StateOfRecord676() {
		assertEquals("NE", customers.get(675).getState());
	}

	@Test
	@DisplayName("Record 676: ZIP is 68503")
	void ZIPOfRecord676() {
		assertEquals("68503", customers.get(675).getZIP());
	}

	@Test
	@DisplayName("Record 676: Phone is 402-476-3387")
	void PhoneOfRecord676() {
		assertEquals("402-476-3387", customers.get(675).getPhone());
	}

	@Test
	@DisplayName("Record 676: Fax is 402-476-4992")
	void FaxOfRecord676() {
		assertEquals("402-476-4992", customers.get(675).getFax());
	}

	@Test
	@DisplayName("Record 676: Email is marilynn@worthey.com")
	void EmailOfRecord676() {
		assertEquals("marilynn@worthey.com", customers.get(675).getEmail());
	}

	@Test
	@DisplayName("Record 676: Web is http://www.marilynnworthey.com")
	void WebOfRecord676() {
		assertEquals("http://www.marilynnworthey.com", customers.get(675).getWeb());
	}
}
