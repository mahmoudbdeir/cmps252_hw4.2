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

@Tag("34")
class Record_2093 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2093: FirstName is Myron")
	void FirstNameOfRecord2093() {
		assertEquals("Myron", customers.get(2092).getFirstName());
	}

	@Test
	@DisplayName("Record 2093: LastName is Cardinalli")
	void LastNameOfRecord2093() {
		assertEquals("Cardinalli", customers.get(2092).getLastName());
	}

	@Test
	@DisplayName("Record 2093: Company is Custer, John S Jr")
	void CompanyOfRecord2093() {
		assertEquals("Custer, John S Jr", customers.get(2092).getCompany());
	}

	@Test
	@DisplayName("Record 2093: Address is 2331 Reading Rd")
	void AddressOfRecord2093() {
		assertEquals("2331 Reading Rd", customers.get(2092).getAddress());
	}

	@Test
	@DisplayName("Record 2093: City is Cincinnati")
	void CityOfRecord2093() {
		assertEquals("Cincinnati", customers.get(2092).getCity());
	}

	@Test
	@DisplayName("Record 2093: County is Hamilton")
	void CountyOfRecord2093() {
		assertEquals("Hamilton", customers.get(2092).getCounty());
	}

	@Test
	@DisplayName("Record 2093: State is OH")
	void StateOfRecord2093() {
		assertEquals("OH", customers.get(2092).getState());
	}

	@Test
	@DisplayName("Record 2093: ZIP is 45202")
	void ZIPOfRecord2093() {
		assertEquals("45202", customers.get(2092).getZIP());
	}

	@Test
	@DisplayName("Record 2093: Phone is 513-381-3992")
	void PhoneOfRecord2093() {
		assertEquals("513-381-3992", customers.get(2092).getPhone());
	}

	@Test
	@DisplayName("Record 2093: Fax is 513-381-4667")
	void FaxOfRecord2093() {
		assertEquals("513-381-4667", customers.get(2092).getFax());
	}

	@Test
	@DisplayName("Record 2093: Email is myron@cardinalli.com")
	void EmailOfRecord2093() {
		assertEquals("myron@cardinalli.com", customers.get(2092).getEmail());
	}

	@Test
	@DisplayName("Record 2093: Web is http://www.myroncardinalli.com")
	void WebOfRecord2093() {
		assertEquals("http://www.myroncardinalli.com", customers.get(2092).getWeb());
	}
}
