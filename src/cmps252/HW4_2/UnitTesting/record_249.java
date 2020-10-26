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

@Tag("37")
class Record_249 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 249: FirstName is Roy")
	void FirstNameOfRecord249() {
		assertEquals("Roy", customers.get(248).getFirstName());
	}

	@Test
	@DisplayName("Record 249: LastName is Harbater")
	void LastNameOfRecord249() {
		assertEquals("Harbater", customers.get(248).getLastName());
	}

	@Test
	@DisplayName("Record 249: Company is Institute For Chrstn Studies")
	void CompanyOfRecord249() {
		assertEquals("Institute For Chrstn Studies", customers.get(248).getCompany());
	}

	@Test
	@DisplayName("Record 249: Address is 954 W Washington Blvd  #-6")
	void AddressOfRecord249() {
		assertEquals("954 W Washington Blvd  #-6", customers.get(248).getAddress());
	}

	@Test
	@DisplayName("Record 249: City is Chicago")
	void CityOfRecord249() {
		assertEquals("Chicago", customers.get(248).getCity());
	}

	@Test
	@DisplayName("Record 249: County is Cook")
	void CountyOfRecord249() {
		assertEquals("Cook", customers.get(248).getCounty());
	}

	@Test
	@DisplayName("Record 249: State is IL")
	void StateOfRecord249() {
		assertEquals("IL", customers.get(248).getState());
	}

	@Test
	@DisplayName("Record 249: ZIP is 60607")
	void ZIPOfRecord249() {
		assertEquals("60607", customers.get(248).getZIP());
	}

	@Test
	@DisplayName("Record 249: Phone is 312-421-1734")
	void PhoneOfRecord249() {
		assertEquals("312-421-1734", customers.get(248).getPhone());
	}

	@Test
	@DisplayName("Record 249: Fax is 312-421-1848")
	void FaxOfRecord249() {
		assertEquals("312-421-1848", customers.get(248).getFax());
	}

	@Test
	@DisplayName("Record 249: Email is roy@harbater.com")
	void EmailOfRecord249() {
		assertEquals("roy@harbater.com", customers.get(248).getEmail());
	}

	@Test
	@DisplayName("Record 249: Web is http://www.royharbater.com")
	void WebOfRecord249() {
		assertEquals("http://www.royharbater.com", customers.get(248).getWeb());
	}
}
