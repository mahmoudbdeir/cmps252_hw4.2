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

@Tag("3")
class Record_1462 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1462: FirstName is Chase")
	void FirstNameOfRecord1462() {
		assertEquals("Chase", customers.get(1461).getFirstName());
	}

	@Test
	@DisplayName("Record 1462: LastName is Sweazy")
	void LastNameOfRecord1462() {
		assertEquals("Sweazy", customers.get(1461).getLastName());
	}

	@Test
	@DisplayName("Record 1462: Company is Busby Metals")
	void CompanyOfRecord1462() {
		assertEquals("Busby Metals", customers.get(1461).getCompany());
	}

	@Test
	@DisplayName("Record 1462: Address is 937 Coffee Rd  #-1")
	void AddressOfRecord1462() {
		assertEquals("937 Coffee Rd  #-1", customers.get(1461).getAddress());
	}

	@Test
	@DisplayName("Record 1462: City is Modesto")
	void CityOfRecord1462() {
		assertEquals("Modesto", customers.get(1461).getCity());
	}

	@Test
	@DisplayName("Record 1462: County is Stanislaus")
	void CountyOfRecord1462() {
		assertEquals("Stanislaus", customers.get(1461).getCounty());
	}

	@Test
	@DisplayName("Record 1462: State is CA")
	void StateOfRecord1462() {
		assertEquals("CA", customers.get(1461).getState());
	}

	@Test
	@DisplayName("Record 1462: ZIP is 95355")
	void ZIPOfRecord1462() {
		assertEquals("95355", customers.get(1461).getZIP());
	}

	@Test
	@DisplayName("Record 1462: Phone is 209-529-4943")
	void PhoneOfRecord1462() {
		assertEquals("209-529-4943", customers.get(1461).getPhone());
	}

	@Test
	@DisplayName("Record 1462: Fax is 209-529-0561")
	void FaxOfRecord1462() {
		assertEquals("209-529-0561", customers.get(1461).getFax());
	}

	@Test
	@DisplayName("Record 1462: Email is chase@sweazy.com")
	void EmailOfRecord1462() {
		assertEquals("chase@sweazy.com", customers.get(1461).getEmail());
	}

	@Test
	@DisplayName("Record 1462: Web is http://www.chasesweazy.com")
	void WebOfRecord1462() {
		assertEquals("http://www.chasesweazy.com", customers.get(1461).getWeb());
	}
}
