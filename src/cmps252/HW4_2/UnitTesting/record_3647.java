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

@Tag("44")
class Record_3647 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3647: FirstName is Dolores")
	void FirstNameOfRecord3647() {
		assertEquals("Dolores", customers.get(3646).getFirstName());
	}

	@Test
	@DisplayName("Record 3647: LastName is Canwell")
	void LastNameOfRecord3647() {
		assertEquals("Canwell", customers.get(3646).getLastName());
	}

	@Test
	@DisplayName("Record 3647: Company is Advanced Waste Systems Inc")
	void CompanyOfRecord3647() {
		assertEquals("Advanced Waste Systems Inc", customers.get(3646).getCompany());
	}

	@Test
	@DisplayName("Record 3647: Address is 2368 Eastman Ave  #-13")
	void AddressOfRecord3647() {
		assertEquals("2368 Eastman Ave  #-13", customers.get(3646).getAddress());
	}

	@Test
	@DisplayName("Record 3647: City is Ventura")
	void CityOfRecord3647() {
		assertEquals("Ventura", customers.get(3646).getCity());
	}

	@Test
	@DisplayName("Record 3647: County is Ventura")
	void CountyOfRecord3647() {
		assertEquals("Ventura", customers.get(3646).getCounty());
	}

	@Test
	@DisplayName("Record 3647: State is CA")
	void StateOfRecord3647() {
		assertEquals("CA", customers.get(3646).getState());
	}

	@Test
	@DisplayName("Record 3647: ZIP is 93003")
	void ZIPOfRecord3647() {
		assertEquals("93003", customers.get(3646).getZIP());
	}

	@Test
	@DisplayName("Record 3647: Phone is 805-642-6097")
	void PhoneOfRecord3647() {
		assertEquals("805-642-6097", customers.get(3646).getPhone());
	}

	@Test
	@DisplayName("Record 3647: Fax is 805-642-5045")
	void FaxOfRecord3647() {
		assertEquals("805-642-5045", customers.get(3646).getFax());
	}

	@Test
	@DisplayName("Record 3647: Email is dolores@canwell.com")
	void EmailOfRecord3647() {
		assertEquals("dolores@canwell.com", customers.get(3646).getEmail());
	}

	@Test
	@DisplayName("Record 3647: Web is http://www.dolorescanwell.com")
	void WebOfRecord3647() {
		assertEquals("http://www.dolorescanwell.com", customers.get(3646).getWeb());
	}
}
