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

@Tag("1")
class Record_960 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 960: FirstName is Twila")
	void FirstNameOfRecord960() {
		assertEquals("Twila", customers.get(959).getFirstName());
	}

	@Test
	@DisplayName("Record 960: LastName is Bonnet")
	void LastNameOfRecord960() {
		assertEquals("Bonnet", customers.get(959).getLastName());
	}

	@Test
	@DisplayName("Record 960: Company is Bemidji Coop Assn")
	void CompanyOfRecord960() {
		assertEquals("Bemidji Coop Assn", customers.get(959).getCompany());
	}

	@Test
	@DisplayName("Record 960: Address is 350 Veterans Memorial Hwy")
	void AddressOfRecord960() {
		assertEquals("350 Veterans Memorial Hwy", customers.get(959).getAddress());
	}

	@Test
	@DisplayName("Record 960: City is Commack")
	void CityOfRecord960() {
		assertEquals("Commack", customers.get(959).getCity());
	}

	@Test
	@DisplayName("Record 960: County is Suffolk")
	void CountyOfRecord960() {
		assertEquals("Suffolk", customers.get(959).getCounty());
	}

	@Test
	@DisplayName("Record 960: State is NY")
	void StateOfRecord960() {
		assertEquals("NY", customers.get(959).getState());
	}

	@Test
	@DisplayName("Record 960: ZIP is 11725")
	void ZIPOfRecord960() {
		assertEquals("11725", customers.get(959).getZIP());
	}

	@Test
	@DisplayName("Record 960: Phone is 631-543-6620")
	void PhoneOfRecord960() {
		assertEquals("631-543-6620", customers.get(959).getPhone());
	}

	@Test
	@DisplayName("Record 960: Fax is 631-543-0256")
	void FaxOfRecord960() {
		assertEquals("631-543-0256", customers.get(959).getFax());
	}

	@Test
	@DisplayName("Record 960: Email is twila@bonnet.com")
	void EmailOfRecord960() {
		assertEquals("twila@bonnet.com", customers.get(959).getEmail());
	}

	@Test
	@DisplayName("Record 960: Web is http://www.twilabonnet.com")
	void WebOfRecord960() {
		assertEquals("http://www.twilabonnet.com", customers.get(959).getWeb());
	}
}
