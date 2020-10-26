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

@Tag("16")
class Record_1348 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1348: FirstName is Matt")
	void FirstNameOfRecord1348() {
		assertEquals("Matt", customers.get(1347).getFirstName());
	}

	@Test
	@DisplayName("Record 1348: LastName is Connelley")
	void LastNameOfRecord1348() {
		assertEquals("Connelley", customers.get(1347).getLastName());
	}

	@Test
	@DisplayName("Record 1348: Company is Hamma & Nelson Pc")
	void CompanyOfRecord1348() {
		assertEquals("Hamma & Nelson Pc", customers.get(1347).getCompany());
	}

	@Test
	@DisplayName("Record 1348: Address is 1583 Gateway Blvd")
	void AddressOfRecord1348() {
		assertEquals("1583 Gateway Blvd", customers.get(1347).getAddress());
	}

	@Test
	@DisplayName("Record 1348: City is Deptford")
	void CityOfRecord1348() {
		assertEquals("Deptford", customers.get(1347).getCity());
	}

	@Test
	@DisplayName("Record 1348: County is Gloucester")
	void CountyOfRecord1348() {
		assertEquals("Gloucester", customers.get(1347).getCounty());
	}

	@Test
	@DisplayName("Record 1348: State is NJ")
	void StateOfRecord1348() {
		assertEquals("NJ", customers.get(1347).getState());
	}

	@Test
	@DisplayName("Record 1348: ZIP is 8096")
	void ZIPOfRecord1348() {
		assertEquals("8096", customers.get(1347).getZIP());
	}

	@Test
	@DisplayName("Record 1348: Phone is 856-845-5007")
	void PhoneOfRecord1348() {
		assertEquals("856-845-5007", customers.get(1347).getPhone());
	}

	@Test
	@DisplayName("Record 1348: Fax is 856-845-7579")
	void FaxOfRecord1348() {
		assertEquals("856-845-7579", customers.get(1347).getFax());
	}

	@Test
	@DisplayName("Record 1348: Email is matt@connelley.com")
	void EmailOfRecord1348() {
		assertEquals("matt@connelley.com", customers.get(1347).getEmail());
	}

	@Test
	@DisplayName("Record 1348: Web is http://www.mattconnelley.com")
	void WebOfRecord1348() {
		assertEquals("http://www.mattconnelley.com", customers.get(1347).getWeb());
	}
}
