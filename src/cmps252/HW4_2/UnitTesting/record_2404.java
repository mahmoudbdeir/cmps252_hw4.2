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

@Tag("49")
class Record_2404 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2404: FirstName is Hillary")
	void FirstNameOfRecord2404() {
		assertEquals("Hillary", customers.get(2403).getFirstName());
	}

	@Test
	@DisplayName("Record 2404: LastName is Zin")
	void LastNameOfRecord2404() {
		assertEquals("Zin", customers.get(2403).getLastName());
	}

	@Test
	@DisplayName("Record 2404: Company is Leb, Arthur S Esq")
	void CompanyOfRecord2404() {
		assertEquals("Leb, Arthur S Esq", customers.get(2403).getCompany());
	}

	@Test
	@DisplayName("Record 2404: Address is 5285 Meadows Rd  #-350")
	void AddressOfRecord2404() {
		assertEquals("5285 Meadows Rd  #-350", customers.get(2403).getAddress());
	}

	@Test
	@DisplayName("Record 2404: City is Lake Oswego")
	void CityOfRecord2404() {
		assertEquals("Lake Oswego", customers.get(2403).getCity());
	}

	@Test
	@DisplayName("Record 2404: County is Clackamas")
	void CountyOfRecord2404() {
		assertEquals("Clackamas", customers.get(2403).getCounty());
	}

	@Test
	@DisplayName("Record 2404: State is OR")
	void StateOfRecord2404() {
		assertEquals("OR", customers.get(2403).getState());
	}

	@Test
	@DisplayName("Record 2404: ZIP is 97035")
	void ZIPOfRecord2404() {
		assertEquals("97035", customers.get(2403).getZIP());
	}

	@Test
	@DisplayName("Record 2404: Phone is 503-598-9332")
	void PhoneOfRecord2404() {
		assertEquals("503-598-9332", customers.get(2403).getPhone());
	}

	@Test
	@DisplayName("Record 2404: Fax is 503-598-6708")
	void FaxOfRecord2404() {
		assertEquals("503-598-6708", customers.get(2403).getFax());
	}

	@Test
	@DisplayName("Record 2404: Email is hillary@zin.com")
	void EmailOfRecord2404() {
		assertEquals("hillary@zin.com", customers.get(2403).getEmail());
	}

	@Test
	@DisplayName("Record 2404: Web is http://www.hillaryzin.com")
	void WebOfRecord2404() {
		assertEquals("http://www.hillaryzin.com", customers.get(2403).getWeb());
	}
}
