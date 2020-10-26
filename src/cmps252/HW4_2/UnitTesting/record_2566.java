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

@Tag("22")
class Record_2566 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2566: FirstName is Alta")
	void FirstNameOfRecord2566() {
		assertEquals("Alta", customers.get(2565).getFirstName());
	}

	@Test
	@DisplayName("Record 2566: LastName is Prodan")
	void LastNameOfRecord2566() {
		assertEquals("Prodan", customers.get(2565).getLastName());
	}

	@Test
	@DisplayName("Record 2566: Company is Watson & Danna Attys")
	void CompanyOfRecord2566() {
		assertEquals("Watson & Danna Attys", customers.get(2565).getCompany());
	}

	@Test
	@DisplayName("Record 2566: Address is 4 N 4th St  #-200")
	void AddressOfRecord2566() {
		assertEquals("4 N 4th St  #-200", customers.get(2565).getAddress());
	}

	@Test
	@DisplayName("Record 2566: City is Richmond")
	void CityOfRecord2566() {
		assertEquals("Richmond", customers.get(2565).getCity());
	}

	@Test
	@DisplayName("Record 2566: County is Richmond City")
	void CountyOfRecord2566() {
		assertEquals("Richmond City", customers.get(2565).getCounty());
	}

	@Test
	@DisplayName("Record 2566: State is VA")
	void StateOfRecord2566() {
		assertEquals("VA", customers.get(2565).getState());
	}

	@Test
	@DisplayName("Record 2566: ZIP is 23219")
	void ZIPOfRecord2566() {
		assertEquals("23219", customers.get(2565).getZIP());
	}

	@Test
	@DisplayName("Record 2566: Phone is 804-788-8871")
	void PhoneOfRecord2566() {
		assertEquals("804-788-8871", customers.get(2565).getPhone());
	}

	@Test
	@DisplayName("Record 2566: Fax is 804-788-2173")
	void FaxOfRecord2566() {
		assertEquals("804-788-2173", customers.get(2565).getFax());
	}

	@Test
	@DisplayName("Record 2566: Email is alta@prodan.com")
	void EmailOfRecord2566() {
		assertEquals("alta@prodan.com", customers.get(2565).getEmail());
	}

	@Test
	@DisplayName("Record 2566: Web is http://www.altaprodan.com")
	void WebOfRecord2566() {
		assertEquals("http://www.altaprodan.com", customers.get(2565).getWeb());
	}
}
