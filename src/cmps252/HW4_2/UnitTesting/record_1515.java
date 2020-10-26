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

@Tag("2")
class Record_1515 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1515: FirstName is Wanda")
	void FirstNameOfRecord1515() {
		assertEquals("Wanda", customers.get(1514).getFirstName());
	}

	@Test
	@DisplayName("Record 1515: LastName is Jinkens")
	void LastNameOfRecord1515() {
		assertEquals("Jinkens", customers.get(1514).getLastName());
	}

	@Test
	@DisplayName("Record 1515: Company is Valley Travel Serv Inc")
	void CompanyOfRecord1515() {
		assertEquals("Valley Travel Serv Inc", customers.get(1514).getCompany());
	}

	@Test
	@DisplayName("Record 1515: Address is 7848 Old York Rd")
	void AddressOfRecord1515() {
		assertEquals("7848 Old York Rd", customers.get(1514).getAddress());
	}

	@Test
	@DisplayName("Record 1515: City is Elkins Park")
	void CityOfRecord1515() {
		assertEquals("Elkins Park", customers.get(1514).getCity());
	}

	@Test
	@DisplayName("Record 1515: County is Montgomery")
	void CountyOfRecord1515() {
		assertEquals("Montgomery", customers.get(1514).getCounty());
	}

	@Test
	@DisplayName("Record 1515: State is PA")
	void StateOfRecord1515() {
		assertEquals("PA", customers.get(1514).getState());
	}

	@Test
	@DisplayName("Record 1515: ZIP is 19027")
	void ZIPOfRecord1515() {
		assertEquals("19027", customers.get(1514).getZIP());
	}

	@Test
	@DisplayName("Record 1515: Phone is 215-635-3715")
	void PhoneOfRecord1515() {
		assertEquals("215-635-3715", customers.get(1514).getPhone());
	}

	@Test
	@DisplayName("Record 1515: Fax is 215-635-2743")
	void FaxOfRecord1515() {
		assertEquals("215-635-2743", customers.get(1514).getFax());
	}

	@Test
	@DisplayName("Record 1515: Email is wanda@jinkens.com")
	void EmailOfRecord1515() {
		assertEquals("wanda@jinkens.com", customers.get(1514).getEmail());
	}

	@Test
	@DisplayName("Record 1515: Web is http://www.wandajinkens.com")
	void WebOfRecord1515() {
		assertEquals("http://www.wandajinkens.com", customers.get(1514).getWeb());
	}
}
