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
class Record_2647 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2647: FirstName is Dollie")
	void FirstNameOfRecord2647() {
		assertEquals("Dollie", customers.get(2646).getFirstName());
	}

	@Test
	@DisplayName("Record 2647: LastName is Aries")
	void LastNameOfRecord2647() {
		assertEquals("Aries", customers.get(2646).getLastName());
	}

	@Test
	@DisplayName("Record 2647: Company is Schaffer Mcintosh & Efferts")
	void CompanyOfRecord2647() {
		assertEquals("Schaffer Mcintosh & Efferts", customers.get(2646).getCompany());
	}

	@Test
	@DisplayName("Record 2647: Address is 1585 Kapiolani Blvd  #-728")
	void AddressOfRecord2647() {
		assertEquals("1585 Kapiolani Blvd  #-728", customers.get(2646).getAddress());
	}

	@Test
	@DisplayName("Record 2647: City is Honolulu")
	void CityOfRecord2647() {
		assertEquals("Honolulu", customers.get(2646).getCity());
	}

	@Test
	@DisplayName("Record 2647: County is Honolulu")
	void CountyOfRecord2647() {
		assertEquals("Honolulu", customers.get(2646).getCounty());
	}

	@Test
	@DisplayName("Record 2647: State is HI")
	void StateOfRecord2647() {
		assertEquals("HI", customers.get(2646).getState());
	}

	@Test
	@DisplayName("Record 2647: ZIP is 96814")
	void ZIPOfRecord2647() {
		assertEquals("96814", customers.get(2646).getZIP());
	}

	@Test
	@DisplayName("Record 2647: Phone is 808-955-0997")
	void PhoneOfRecord2647() {
		assertEquals("808-955-0997", customers.get(2646).getPhone());
	}

	@Test
	@DisplayName("Record 2647: Fax is 808-955-7422")
	void FaxOfRecord2647() {
		assertEquals("808-955-7422", customers.get(2646).getFax());
	}

	@Test
	@DisplayName("Record 2647: Email is dollie@aries.com")
	void EmailOfRecord2647() {
		assertEquals("dollie@aries.com", customers.get(2646).getEmail());
	}

	@Test
	@DisplayName("Record 2647: Web is http://www.dolliearies.com")
	void WebOfRecord2647() {
		assertEquals("http://www.dolliearies.com", customers.get(2646).getWeb());
	}
}
