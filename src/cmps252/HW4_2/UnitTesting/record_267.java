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

@Tag("17")
class Record_267 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 267: FirstName is Katina")
	void FirstNameOfRecord267() {
		assertEquals("Katina", customers.get(266).getFirstName());
	}

	@Test
	@DisplayName("Record 267: LastName is Glomb")
	void LastNameOfRecord267() {
		assertEquals("Glomb", customers.get(266).getLastName());
	}

	@Test
	@DisplayName("Record 267: Company is Petillo, Phillip J")
	void CompanyOfRecord267() {
		assertEquals("Petillo, Phillip J", customers.get(266).getCompany());
	}

	@Test
	@DisplayName("Record 267: Address is 6195 Clermont St")
	void AddressOfRecord267() {
		assertEquals("6195 Clermont St", customers.get(266).getAddress());
	}

	@Test
	@DisplayName("Record 267: City is Commerce City")
	void CityOfRecord267() {
		assertEquals("Commerce City", customers.get(266).getCity());
	}

	@Test
	@DisplayName("Record 267: County is Adams")
	void CountyOfRecord267() {
		assertEquals("Adams", customers.get(266).getCounty());
	}

	@Test
	@DisplayName("Record 267: State is CO")
	void StateOfRecord267() {
		assertEquals("CO", customers.get(266).getState());
	}

	@Test
	@DisplayName("Record 267: ZIP is 80022")
	void ZIPOfRecord267() {
		assertEquals("80022", customers.get(266).getZIP());
	}

	@Test
	@DisplayName("Record 267: Phone is 303-287-6975")
	void PhoneOfRecord267() {
		assertEquals("303-287-6975", customers.get(266).getPhone());
	}

	@Test
	@DisplayName("Record 267: Fax is 303-287-5405")
	void FaxOfRecord267() {
		assertEquals("303-287-5405", customers.get(266).getFax());
	}

	@Test
	@DisplayName("Record 267: Email is katina@glomb.com")
	void EmailOfRecord267() {
		assertEquals("katina@glomb.com", customers.get(266).getEmail());
	}

	@Test
	@DisplayName("Record 267: Web is http://www.katinaglomb.com")
	void WebOfRecord267() {
		assertEquals("http://www.katinaglomb.com", customers.get(266).getWeb());
	}
}
