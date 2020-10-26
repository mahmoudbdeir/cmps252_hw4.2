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

@Tag("33")
class Record_2844 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2844: FirstName is Mai")
	void FirstNameOfRecord2844() {
		assertEquals("Mai", customers.get(2843).getFirstName());
	}

	@Test
	@DisplayName("Record 2844: LastName is Postell")
	void LastNameOfRecord2844() {
		assertEquals("Postell", customers.get(2843).getLastName());
	}

	@Test
	@DisplayName("Record 2844: Company is Treatment Equipment Co")
	void CompanyOfRecord2844() {
		assertEquals("Treatment Equipment Co", customers.get(2843).getCompany());
	}

	@Test
	@DisplayName("Record 2844: Address is 13423 Northern Blvd")
	void AddressOfRecord2844() {
		assertEquals("13423 Northern Blvd", customers.get(2843).getAddress());
	}

	@Test
	@DisplayName("Record 2844: City is Flushing")
	void CityOfRecord2844() {
		assertEquals("Flushing", customers.get(2843).getCity());
	}

	@Test
	@DisplayName("Record 2844: County is Queens")
	void CountyOfRecord2844() {
		assertEquals("Queens", customers.get(2843).getCounty());
	}

	@Test
	@DisplayName("Record 2844: State is NY")
	void StateOfRecord2844() {
		assertEquals("NY", customers.get(2843).getState());
	}

	@Test
	@DisplayName("Record 2844: ZIP is 11354")
	void ZIPOfRecord2844() {
		assertEquals("11354", customers.get(2843).getZIP());
	}

	@Test
	@DisplayName("Record 2844: Phone is 718-445-6911")
	void PhoneOfRecord2844() {
		assertEquals("718-445-6911", customers.get(2843).getPhone());
	}

	@Test
	@DisplayName("Record 2844: Fax is 718-445-6429")
	void FaxOfRecord2844() {
		assertEquals("718-445-6429", customers.get(2843).getFax());
	}

	@Test
	@DisplayName("Record 2844: Email is mai@postell.com")
	void EmailOfRecord2844() {
		assertEquals("mai@postell.com", customers.get(2843).getEmail());
	}

	@Test
	@DisplayName("Record 2844: Web is http://www.maipostell.com")
	void WebOfRecord2844() {
		assertEquals("http://www.maipostell.com", customers.get(2843).getWeb());
	}
}
