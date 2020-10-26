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

@Tag("8")
class Record_1231 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1231: FirstName is Dallas")
	void FirstNameOfRecord1231() {
		assertEquals("Dallas", customers.get(1230).getFirstName());
	}

	@Test
	@DisplayName("Record 1231: LastName is Escutia")
	void LastNameOfRecord1231() {
		assertEquals("Escutia", customers.get(1230).getLastName());
	}

	@Test
	@DisplayName("Record 1231: Company is Robert A Becker Inc")
	void CompanyOfRecord1231() {
		assertEquals("Robert A Becker Inc", customers.get(1230).getCompany());
	}

	@Test
	@DisplayName("Record 1231: Address is 11600 Wilshire Blvd  #-306")
	void AddressOfRecord1231() {
		assertEquals("11600 Wilshire Blvd  #-306", customers.get(1230).getAddress());
	}

	@Test
	@DisplayName("Record 1231: City is Los Angeles")
	void CityOfRecord1231() {
		assertEquals("Los Angeles", customers.get(1230).getCity());
	}

	@Test
	@DisplayName("Record 1231: County is Los Angeles")
	void CountyOfRecord1231() {
		assertEquals("Los Angeles", customers.get(1230).getCounty());
	}

	@Test
	@DisplayName("Record 1231: State is CA")
	void StateOfRecord1231() {
		assertEquals("CA", customers.get(1230).getState());
	}

	@Test
	@DisplayName("Record 1231: ZIP is 90025")
	void ZIPOfRecord1231() {
		assertEquals("90025", customers.get(1230).getZIP());
	}

	@Test
	@DisplayName("Record 1231: Phone is 310-473-7326")
	void PhoneOfRecord1231() {
		assertEquals("310-473-7326", customers.get(1230).getPhone());
	}

	@Test
	@DisplayName("Record 1231: Fax is 310-473-3589")
	void FaxOfRecord1231() {
		assertEquals("310-473-3589", customers.get(1230).getFax());
	}

	@Test
	@DisplayName("Record 1231: Email is dallas@escutia.com")
	void EmailOfRecord1231() {
		assertEquals("dallas@escutia.com", customers.get(1230).getEmail());
	}

	@Test
	@DisplayName("Record 1231: Web is http://www.dallasescutia.com")
	void WebOfRecord1231() {
		assertEquals("http://www.dallasescutia.com", customers.get(1230).getWeb());
	}
}
