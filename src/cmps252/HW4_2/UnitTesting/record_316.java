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

@Tag("34")
class Record_316 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 316: FirstName is Marion")
	void FirstNameOfRecord316() {
		assertEquals("Marion", customers.get(315).getFirstName());
	}

	@Test
	@DisplayName("Record 316: LastName is Kyzer")
	void LastNameOfRecord316() {
		assertEquals("Kyzer", customers.get(315).getLastName());
	}

	@Test
	@DisplayName("Record 316: Company is Industrial Safety Supl Co Inc")
	void CompanyOfRecord316() {
		assertEquals("Industrial Safety Supl Co Inc", customers.get(315).getCompany());
	}

	@Test
	@DisplayName("Record 316: Address is 2726 Gunnison St")
	void AddressOfRecord316() {
		assertEquals("2726 Gunnison St", customers.get(315).getAddress());
	}

	@Test
	@DisplayName("Record 316: City is Colorado Springs")
	void CityOfRecord316() {
		assertEquals("Colorado Springs", customers.get(315).getCity());
	}

	@Test
	@DisplayName("Record 316: County is El Paso")
	void CountyOfRecord316() {
		assertEquals("El Paso", customers.get(315).getCounty());
	}

	@Test
	@DisplayName("Record 316: State is CO")
	void StateOfRecord316() {
		assertEquals("CO", customers.get(315).getState());
	}

	@Test
	@DisplayName("Record 316: ZIP is 80909")
	void ZIPOfRecord316() {
		assertEquals("80909", customers.get(315).getZIP());
	}

	@Test
	@DisplayName("Record 316: Phone is 719-634-2368")
	void PhoneOfRecord316() {
		assertEquals("719-634-2368", customers.get(315).getPhone());
	}

	@Test
	@DisplayName("Record 316: Fax is 719-634-3062")
	void FaxOfRecord316() {
		assertEquals("719-634-3062", customers.get(315).getFax());
	}

	@Test
	@DisplayName("Record 316: Email is marion@kyzer.com")
	void EmailOfRecord316() {
		assertEquals("marion@kyzer.com", customers.get(315).getEmail());
	}

	@Test
	@DisplayName("Record 316: Web is http://www.marionkyzer.com")
	void WebOfRecord316() {
		assertEquals("http://www.marionkyzer.com", customers.get(315).getWeb());
	}
}
