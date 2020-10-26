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

@Tag("40")
class Record_2149 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2149: FirstName is Marcella")
	void FirstNameOfRecord2149() {
		assertEquals("Marcella", customers.get(2148).getFirstName());
	}

	@Test
	@DisplayName("Record 2149: LastName is Barz")
	void LastNameOfRecord2149() {
		assertEquals("Barz", customers.get(2148).getLastName());
	}

	@Test
	@DisplayName("Record 2149: Company is Barnett Assocs Inc")
	void CompanyOfRecord2149() {
		assertEquals("Barnett Assocs Inc", customers.get(2148).getCompany());
	}

	@Test
	@DisplayName("Record 2149: Address is 1696 Washington Ave")
	void AddressOfRecord2149() {
		assertEquals("1696 Washington Ave", customers.get(2148).getAddress());
	}

	@Test
	@DisplayName("Record 2149: City is San Leandro")
	void CityOfRecord2149() {
		assertEquals("San Leandro", customers.get(2148).getCity());
	}

	@Test
	@DisplayName("Record 2149: County is Alameda")
	void CountyOfRecord2149() {
		assertEquals("Alameda", customers.get(2148).getCounty());
	}

	@Test
	@DisplayName("Record 2149: State is CA")
	void StateOfRecord2149() {
		assertEquals("CA", customers.get(2148).getState());
	}

	@Test
	@DisplayName("Record 2149: ZIP is 94577")
	void ZIPOfRecord2149() {
		assertEquals("94577", customers.get(2148).getZIP());
	}

	@Test
	@DisplayName("Record 2149: Phone is 510-351-2078")
	void PhoneOfRecord2149() {
		assertEquals("510-351-2078", customers.get(2148).getPhone());
	}

	@Test
	@DisplayName("Record 2149: Fax is 510-351-1438")
	void FaxOfRecord2149() {
		assertEquals("510-351-1438", customers.get(2148).getFax());
	}

	@Test
	@DisplayName("Record 2149: Email is marcella@barz.com")
	void EmailOfRecord2149() {
		assertEquals("marcella@barz.com", customers.get(2148).getEmail());
	}

	@Test
	@DisplayName("Record 2149: Web is http://www.marcellabarz.com")
	void WebOfRecord2149() {
		assertEquals("http://www.marcellabarz.com", customers.get(2148).getWeb());
	}
}
