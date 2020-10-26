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

@Tag("6")
class Record_905 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 905: FirstName is Harrison")
	void FirstNameOfRecord905() {
		assertEquals("Harrison", customers.get(904).getFirstName());
	}

	@Test
	@DisplayName("Record 905: LastName is Rhyme")
	void LastNameOfRecord905() {
		assertEquals("Rhyme", customers.get(904).getLastName());
	}

	@Test
	@DisplayName("Record 905: Company is Plumbers & Pipeft Lcl No 763")
	void CompanyOfRecord905() {
		assertEquals("Plumbers & Pipeft Lcl No 763", customers.get(904).getCompany());
	}

	@Test
	@DisplayName("Record 905: Address is Hwy 13 Stoneridge")
	void AddressOfRecord905() {
		assertEquals("Hwy 13 Stoneridge", customers.get(904).getAddress());
	}

	@Test
	@DisplayName("Record 905: City is Kimberling City")
	void CityOfRecord905() {
		assertEquals("Kimberling City", customers.get(904).getCity());
	}

	@Test
	@DisplayName("Record 905: County is Stone")
	void CountyOfRecord905() {
		assertEquals("Stone", customers.get(904).getCounty());
	}

	@Test
	@DisplayName("Record 905: State is MO")
	void StateOfRecord905() {
		assertEquals("MO", customers.get(904).getState());
	}

	@Test
	@DisplayName("Record 905: ZIP is 65686")
	void ZIPOfRecord905() {
		assertEquals("65686", customers.get(904).getZIP());
	}

	@Test
	@DisplayName("Record 905: Phone is 417-739-9738")
	void PhoneOfRecord905() {
		assertEquals("417-739-9738", customers.get(904).getPhone());
	}

	@Test
	@DisplayName("Record 905: Fax is 417-739-7085")
	void FaxOfRecord905() {
		assertEquals("417-739-7085", customers.get(904).getFax());
	}

	@Test
	@DisplayName("Record 905: Email is harrison@rhyme.com")
	void EmailOfRecord905() {
		assertEquals("harrison@rhyme.com", customers.get(904).getEmail());
	}

	@Test
	@DisplayName("Record 905: Web is http://www.harrisonrhyme.com")
	void WebOfRecord905() {
		assertEquals("http://www.harrisonrhyme.com", customers.get(904).getWeb());
	}
}
