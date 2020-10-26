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

@Tag("26")
class Record_2016 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2016: FirstName is Kysha")
	void FirstNameOfRecord2016() {
		assertEquals("Kysha", customers.get(2015).getFirstName());
	}

	@Test
	@DisplayName("Record 2016: LastName is Dembowski")
	void LastNameOfRecord2016() {
		assertEquals("Dembowski", customers.get(2015).getLastName());
	}

	@Test
	@DisplayName("Record 2016: Company is Tarantolo Chiroprctc Life Ctr")
	void CompanyOfRecord2016() {
		assertEquals("Tarantolo Chiroprctc Life Ctr", customers.get(2015).getCompany());
	}

	@Test
	@DisplayName("Record 2016: Address is 2311 E Artesia Blvd")
	void AddressOfRecord2016() {
		assertEquals("2311 E Artesia Blvd", customers.get(2015).getAddress());
	}

	@Test
	@DisplayName("Record 2016: City is Long Beach")
	void CityOfRecord2016() {
		assertEquals("Long Beach", customers.get(2015).getCity());
	}

	@Test
	@DisplayName("Record 2016: County is Los Angeles")
	void CountyOfRecord2016() {
		assertEquals("Los Angeles", customers.get(2015).getCounty());
	}

	@Test
	@DisplayName("Record 2016: State is CA")
	void StateOfRecord2016() {
		assertEquals("CA", customers.get(2015).getState());
	}

	@Test
	@DisplayName("Record 2016: ZIP is 90805")
	void ZIPOfRecord2016() {
		assertEquals("90805", customers.get(2015).getZIP());
	}

	@Test
	@DisplayName("Record 2016: Phone is 562-634-8728")
	void PhoneOfRecord2016() {
		assertEquals("562-634-8728", customers.get(2015).getPhone());
	}

	@Test
	@DisplayName("Record 2016: Fax is 562-634-4438")
	void FaxOfRecord2016() {
		assertEquals("562-634-4438", customers.get(2015).getFax());
	}

	@Test
	@DisplayName("Record 2016: Email is kysha@dembowski.com")
	void EmailOfRecord2016() {
		assertEquals("kysha@dembowski.com", customers.get(2015).getEmail());
	}

	@Test
	@DisplayName("Record 2016: Web is http://www.kyshadembowski.com")
	void WebOfRecord2016() {
		assertEquals("http://www.kyshadembowski.com", customers.get(2015).getWeb());
	}
}
