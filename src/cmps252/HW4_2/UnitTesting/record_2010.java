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

@Tag("40")
class Record_2010 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2010: FirstName is Lessie")
	void FirstNameOfRecord2010() {
		assertEquals("Lessie", customers.get(2009).getFirstName());
	}

	@Test
	@DisplayName("Record 2010: LastName is Weathersby")
	void LastNameOfRecord2010() {
		assertEquals("Weathersby", customers.get(2009).getLastName());
	}

	@Test
	@DisplayName("Record 2010: Company is Bill Duckworth Tire Co")
	void CompanyOfRecord2010() {
		assertEquals("Bill Duckworth Tire Co", customers.get(2009).getCompany());
	}

	@Test
	@DisplayName("Record 2010: Address is 440 N 4th St  #-208")
	void AddressOfRecord2010() {
		assertEquals("440 N 4th St  #-208", customers.get(2009).getAddress());
	}

	@Test
	@DisplayName("Record 2010: City is Saint Louis")
	void CityOfRecord2010() {
		assertEquals("Saint Louis", customers.get(2009).getCity());
	}

	@Test
	@DisplayName("Record 2010: County is Saint Louis City")
	void CountyOfRecord2010() {
		assertEquals("Saint Louis City", customers.get(2009).getCounty());
	}

	@Test
	@DisplayName("Record 2010: State is MO")
	void StateOfRecord2010() {
		assertEquals("MO", customers.get(2009).getState());
	}

	@Test
	@DisplayName("Record 2010: ZIP is 63102")
	void ZIPOfRecord2010() {
		assertEquals("63102", customers.get(2009).getZIP());
	}

	@Test
	@DisplayName("Record 2010: Phone is 314-231-6014")
	void PhoneOfRecord2010() {
		assertEquals("314-231-6014", customers.get(2009).getPhone());
	}

	@Test
	@DisplayName("Record 2010: Fax is 314-231-1288")
	void FaxOfRecord2010() {
		assertEquals("314-231-1288", customers.get(2009).getFax());
	}

	@Test
	@DisplayName("Record 2010: Email is lessie@weathersby.com")
	void EmailOfRecord2010() {
		assertEquals("lessie@weathersby.com", customers.get(2009).getEmail());
	}

	@Test
	@DisplayName("Record 2010: Web is http://www.lessieweathersby.com")
	void WebOfRecord2010() {
		assertEquals("http://www.lessieweathersby.com", customers.get(2009).getWeb());
	}
}
