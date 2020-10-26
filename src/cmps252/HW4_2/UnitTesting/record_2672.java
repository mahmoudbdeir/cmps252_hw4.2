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

@Tag("46")
class Record_2672 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2672: FirstName is Haley")
	void FirstNameOfRecord2672() {
		assertEquals("Haley", customers.get(2671).getFirstName());
	}

	@Test
	@DisplayName("Record 2672: LastName is Lind")
	void LastNameOfRecord2672() {
		assertEquals("Lind", customers.get(2671).getLastName());
	}

	@Test
	@DisplayName("Record 2672: Company is Parks & Recreation Dept Main O")
	void CompanyOfRecord2672() {
		assertEquals("Parks & Recreation Dept Main O", customers.get(2671).getCompany());
	}

	@Test
	@DisplayName("Record 2672: Address is 450 Sansome St  #-1650")
	void AddressOfRecord2672() {
		assertEquals("450 Sansome St  #-1650", customers.get(2671).getAddress());
	}

	@Test
	@DisplayName("Record 2672: City is San Francisco")
	void CityOfRecord2672() {
		assertEquals("San Francisco", customers.get(2671).getCity());
	}

	@Test
	@DisplayName("Record 2672: County is San Francisco")
	void CountyOfRecord2672() {
		assertEquals("San Francisco", customers.get(2671).getCounty());
	}

	@Test
	@DisplayName("Record 2672: State is CA")
	void StateOfRecord2672() {
		assertEquals("CA", customers.get(2671).getState());
	}

	@Test
	@DisplayName("Record 2672: ZIP is 94111")
	void ZIPOfRecord2672() {
		assertEquals("94111", customers.get(2671).getZIP());
	}

	@Test
	@DisplayName("Record 2672: Phone is 415-781-4637")
	void PhoneOfRecord2672() {
		assertEquals("415-781-4637", customers.get(2671).getPhone());
	}

	@Test
	@DisplayName("Record 2672: Fax is 415-781-3232")
	void FaxOfRecord2672() {
		assertEquals("415-781-3232", customers.get(2671).getFax());
	}

	@Test
	@DisplayName("Record 2672: Email is haley@lind.com")
	void EmailOfRecord2672() {
		assertEquals("haley@lind.com", customers.get(2671).getEmail());
	}

	@Test
	@DisplayName("Record 2672: Web is http://www.haleylind.com")
	void WebOfRecord2672() {
		assertEquals("http://www.haleylind.com", customers.get(2671).getWeb());
	}
}
