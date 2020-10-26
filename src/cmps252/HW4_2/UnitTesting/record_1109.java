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

@Tag("18")
class Record_1109 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1109: FirstName is Bart")
	void FirstNameOfRecord1109() {
		assertEquals("Bart", customers.get(1108).getFirstName());
	}

	@Test
	@DisplayName("Record 1109: LastName is Stillabower")
	void LastNameOfRecord1109() {
		assertEquals("Stillabower", customers.get(1108).getLastName());
	}

	@Test
	@DisplayName("Record 1109: Company is Jensen Smith & Gilbert Pc")
	void CompanyOfRecord1109() {
		assertEquals("Jensen Smith & Gilbert Pc", customers.get(1108).getCompany());
	}

	@Test
	@DisplayName("Record 1109: Address is 33 W Union Blvd")
	void AddressOfRecord1109() {
		assertEquals("33 W Union Blvd", customers.get(1108).getAddress());
	}

	@Test
	@DisplayName("Record 1109: City is Bethlehem")
	void CityOfRecord1109() {
		assertEquals("Bethlehem", customers.get(1108).getCity());
	}

	@Test
	@DisplayName("Record 1109: County is Lehigh")
	void CountyOfRecord1109() {
		assertEquals("Lehigh", customers.get(1108).getCounty());
	}

	@Test
	@DisplayName("Record 1109: State is PA")
	void StateOfRecord1109() {
		assertEquals("PA", customers.get(1108).getState());
	}

	@Test
	@DisplayName("Record 1109: ZIP is 18018")
	void ZIPOfRecord1109() {
		assertEquals("18018", customers.get(1108).getZIP());
	}

	@Test
	@DisplayName("Record 1109: Phone is 610-882-1933")
	void PhoneOfRecord1109() {
		assertEquals("610-882-1933", customers.get(1108).getPhone());
	}

	@Test
	@DisplayName("Record 1109: Fax is 610-882-1651")
	void FaxOfRecord1109() {
		assertEquals("610-882-1651", customers.get(1108).getFax());
	}

	@Test
	@DisplayName("Record 1109: Email is bart@stillabower.com")
	void EmailOfRecord1109() {
		assertEquals("bart@stillabower.com", customers.get(1108).getEmail());
	}

	@Test
	@DisplayName("Record 1109: Web is http://www.bartstillabower.com")
	void WebOfRecord1109() {
		assertEquals("http://www.bartstillabower.com", customers.get(1108).getWeb());
	}
}
