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

@Tag("16")
class Record_306 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 306: FirstName is King")
	void FirstNameOfRecord306() {
		assertEquals("King", customers.get(305).getFirstName());
	}

	@Test
	@DisplayName("Record 306: LastName is Pedley")
	void LastNameOfRecord306() {
		assertEquals("Pedley", customers.get(305).getLastName());
	}

	@Test
	@DisplayName("Record 306: Company is Cent Acs Ctr For Appld")
	void CompanyOfRecord306() {
		assertEquals("Cent Acs Ctr For Appld", customers.get(305).getCompany());
	}

	@Test
	@DisplayName("Record 306: Address is 2726 Gunnison St")
	void AddressOfRecord306() {
		assertEquals("2726 Gunnison St", customers.get(305).getAddress());
	}

	@Test
	@DisplayName("Record 306: City is Colorado Springs")
	void CityOfRecord306() {
		assertEquals("Colorado Springs", customers.get(305).getCity());
	}

	@Test
	@DisplayName("Record 306: County is El Paso")
	void CountyOfRecord306() {
		assertEquals("El Paso", customers.get(305).getCounty());
	}

	@Test
	@DisplayName("Record 306: State is CO")
	void StateOfRecord306() {
		assertEquals("CO", customers.get(305).getState());
	}

	@Test
	@DisplayName("Record 306: ZIP is 80909")
	void ZIPOfRecord306() {
		assertEquals("80909", customers.get(305).getZIP());
	}

	@Test
	@DisplayName("Record 306: Phone is 719-634-7241")
	void PhoneOfRecord306() {
		assertEquals("719-634-7241", customers.get(305).getPhone());
	}

	@Test
	@DisplayName("Record 306: Fax is 719-634-0868")
	void FaxOfRecord306() {
		assertEquals("719-634-0868", customers.get(305).getFax());
	}

	@Test
	@DisplayName("Record 306: Email is king@pedley.com")
	void EmailOfRecord306() {
		assertEquals("king@pedley.com", customers.get(305).getEmail());
	}

	@Test
	@DisplayName("Record 306: Web is http://www.kingpedley.com")
	void WebOfRecord306() {
		assertEquals("http://www.kingpedley.com", customers.get(305).getWeb());
	}
}
