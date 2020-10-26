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
class Record_1404 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1404: FirstName is John")
	void FirstNameOfRecord1404() {
		assertEquals("John", customers.get(1403).getFirstName());
	}

	@Test
	@DisplayName("Record 1404: LastName is Mants")
	void LastNameOfRecord1404() {
		assertEquals("Mants", customers.get(1403).getLastName());
	}

	@Test
	@DisplayName("Record 1404: Company is Eastern Sierra Publishing Inc")
	void CompanyOfRecord1404() {
		assertEquals("Eastern Sierra Publishing Inc", customers.get(1403).getCompany());
	}

	@Test
	@DisplayName("Record 1404: Address is 131 Tomahawk Dr")
	void AddressOfRecord1404() {
		assertEquals("131 Tomahawk Dr", customers.get(1403).getAddress());
	}

	@Test
	@DisplayName("Record 1404: City is Satellite Beach")
	void CityOfRecord1404() {
		assertEquals("Satellite Beach", customers.get(1403).getCity());
	}

	@Test
	@DisplayName("Record 1404: County is Brevard")
	void CountyOfRecord1404() {
		assertEquals("Brevard", customers.get(1403).getCounty());
	}

	@Test
	@DisplayName("Record 1404: State is FL")
	void StateOfRecord1404() {
		assertEquals("FL", customers.get(1403).getState());
	}

	@Test
	@DisplayName("Record 1404: ZIP is 32937")
	void ZIPOfRecord1404() {
		assertEquals("32937", customers.get(1403).getZIP());
	}

	@Test
	@DisplayName("Record 1404: Phone is 321-777-8355")
	void PhoneOfRecord1404() {
		assertEquals("321-777-8355", customers.get(1403).getPhone());
	}

	@Test
	@DisplayName("Record 1404: Fax is 321-777-4022")
	void FaxOfRecord1404() {
		assertEquals("321-777-4022", customers.get(1403).getFax());
	}

	@Test
	@DisplayName("Record 1404: Email is john@mants.com")
	void EmailOfRecord1404() {
		assertEquals("john@mants.com", customers.get(1403).getEmail());
	}

	@Test
	@DisplayName("Record 1404: Web is http://www.johnmants.com")
	void WebOfRecord1404() {
		assertEquals("http://www.johnmants.com", customers.get(1403).getWeb());
	}
}
