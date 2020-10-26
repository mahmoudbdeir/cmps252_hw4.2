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

@Tag("4")
class Record_3887 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3887: FirstName is Elisa")
	void FirstNameOfRecord3887() {
		assertEquals("Elisa", customers.get(3886).getFirstName());
	}

	@Test
	@DisplayName("Record 3887: LastName is Yerty")
	void LastNameOfRecord3887() {
		assertEquals("Yerty", customers.get(3886).getLastName());
	}

	@Test
	@DisplayName("Record 3887: Company is J S Glass")
	void CompanyOfRecord3887() {
		assertEquals("J S Glass", customers.get(3886).getCompany());
	}

	@Test
	@DisplayName("Record 3887: Address is 935 Lucas Creek Rd")
	void AddressOfRecord3887() {
		assertEquals("935 Lucas Creek Rd", customers.get(3886).getAddress());
	}

	@Test
	@DisplayName("Record 3887: City is Newport News")
	void CityOfRecord3887() {
		assertEquals("Newport News", customers.get(3886).getCity());
	}

	@Test
	@DisplayName("Record 3887: County is Newport News City")
	void CountyOfRecord3887() {
		assertEquals("Newport News City", customers.get(3886).getCounty());
	}

	@Test
	@DisplayName("Record 3887: State is VA")
	void StateOfRecord3887() {
		assertEquals("VA", customers.get(3886).getState());
	}

	@Test
	@DisplayName("Record 3887: ZIP is 23608")
	void ZIPOfRecord3887() {
		assertEquals("23608", customers.get(3886).getZIP());
	}

	@Test
	@DisplayName("Record 3887: Phone is 757-877-9782")
	void PhoneOfRecord3887() {
		assertEquals("757-877-9782", customers.get(3886).getPhone());
	}

	@Test
	@DisplayName("Record 3887: Fax is 757-877-9452")
	void FaxOfRecord3887() {
		assertEquals("757-877-9452", customers.get(3886).getFax());
	}

	@Test
	@DisplayName("Record 3887: Email is elisa@yerty.com")
	void EmailOfRecord3887() {
		assertEquals("elisa@yerty.com", customers.get(3886).getEmail());
	}

	@Test
	@DisplayName("Record 3887: Web is http://www.elisayerty.com")
	void WebOfRecord3887() {
		assertEquals("http://www.elisayerty.com", customers.get(3886).getWeb());
	}
}
