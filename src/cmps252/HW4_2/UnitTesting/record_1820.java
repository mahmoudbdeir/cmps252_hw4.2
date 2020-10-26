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

@Tag("48")
class Record_1820 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1820: FirstName is Alphonso")
	void FirstNameOfRecord1820() {
		assertEquals("Alphonso", customers.get(1819).getFirstName());
	}

	@Test
	@DisplayName("Record 1820: LastName is Wandrie")
	void LastNameOfRecord1820() {
		assertEquals("Wandrie", customers.get(1819).getLastName());
	}

	@Test
	@DisplayName("Record 1820: Company is Spencer & Stone")
	void CompanyOfRecord1820() {
		assertEquals("Spencer & Stone", customers.get(1819).getCompany());
	}

	@Test
	@DisplayName("Record 1820: Address is 3301 Castlewood Rd")
	void AddressOfRecord1820() {
		assertEquals("3301 Castlewood Rd", customers.get(1819).getAddress());
	}

	@Test
	@DisplayName("Record 1820: City is Richmond")
	void CityOfRecord1820() {
		assertEquals("Richmond", customers.get(1819).getCity());
	}

	@Test
	@DisplayName("Record 1820: County is Chesterfield")
	void CountyOfRecord1820() {
		assertEquals("Chesterfield", customers.get(1819).getCounty());
	}

	@Test
	@DisplayName("Record 1820: State is VA")
	void StateOfRecord1820() {
		assertEquals("VA", customers.get(1819).getState());
	}

	@Test
	@DisplayName("Record 1820: ZIP is 23234")
	void ZIPOfRecord1820() {
		assertEquals("23234", customers.get(1819).getZIP());
	}

	@Test
	@DisplayName("Record 1820: Phone is 804-233-3279")
	void PhoneOfRecord1820() {
		assertEquals("804-233-3279", customers.get(1819).getPhone());
	}

	@Test
	@DisplayName("Record 1820: Fax is 804-233-9597")
	void FaxOfRecord1820() {
		assertEquals("804-233-9597", customers.get(1819).getFax());
	}

	@Test
	@DisplayName("Record 1820: Email is alphonso@wandrie.com")
	void EmailOfRecord1820() {
		assertEquals("alphonso@wandrie.com", customers.get(1819).getEmail());
	}

	@Test
	@DisplayName("Record 1820: Web is http://www.alphonsowandrie.com")
	void WebOfRecord1820() {
		assertEquals("http://www.alphonsowandrie.com", customers.get(1819).getWeb());
	}
}
