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

@Tag("19")
class Record_1003 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1003: FirstName is Rose")
	void FirstNameOfRecord1003() {
		assertEquals("Rose", customers.get(1002).getFirstName());
	}

	@Test
	@DisplayName("Record 1003: LastName is Kuokkanen")
	void LastNameOfRecord1003() {
		assertEquals("Kuokkanen", customers.get(1002).getLastName());
	}

	@Test
	@DisplayName("Record 1003: Company is Expert Object Corp")
	void CompanyOfRecord1003() {
		assertEquals("Expert Object Corp", customers.get(1002).getCompany());
	}

	@Test
	@DisplayName("Record 1003: Address is 3929 Tennyson St")
	void AddressOfRecord1003() {
		assertEquals("3929 Tennyson St", customers.get(1002).getAddress());
	}

	@Test
	@DisplayName("Record 1003: City is Denver")
	void CityOfRecord1003() {
		assertEquals("Denver", customers.get(1002).getCity());
	}

	@Test
	@DisplayName("Record 1003: County is Denver")
	void CountyOfRecord1003() {
		assertEquals("Denver", customers.get(1002).getCounty());
	}

	@Test
	@DisplayName("Record 1003: State is CO")
	void StateOfRecord1003() {
		assertEquals("CO", customers.get(1002).getState());
	}

	@Test
	@DisplayName("Record 1003: ZIP is 80212")
	void ZIPOfRecord1003() {
		assertEquals("80212", customers.get(1002).getZIP());
	}

	@Test
	@DisplayName("Record 1003: Phone is 303-458-8176")
	void PhoneOfRecord1003() {
		assertEquals("303-458-8176", customers.get(1002).getPhone());
	}

	@Test
	@DisplayName("Record 1003: Fax is 303-458-8696")
	void FaxOfRecord1003() {
		assertEquals("303-458-8696", customers.get(1002).getFax());
	}

	@Test
	@DisplayName("Record 1003: Email is rose@kuokkanen.com")
	void EmailOfRecord1003() {
		assertEquals("rose@kuokkanen.com", customers.get(1002).getEmail());
	}

	@Test
	@DisplayName("Record 1003: Web is http://www.rosekuokkanen.com")
	void WebOfRecord1003() {
		assertEquals("http://www.rosekuokkanen.com", customers.get(1002).getWeb());
	}
}
