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

@Tag("11")
class Record_3494 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3494: FirstName is Werner")
	void FirstNameOfRecord3494() {
		assertEquals("Werner", customers.get(3493).getFirstName());
	}

	@Test
	@DisplayName("Record 3494: LastName is Arbyter")
	void LastNameOfRecord3494() {
		assertEquals("Arbyter", customers.get(3493).getLastName());
	}

	@Test
	@DisplayName("Record 3494: Company is Monitor Sugar Company")
	void CompanyOfRecord3494() {
		assertEquals("Monitor Sugar Company", customers.get(3493).getCompany());
	}

	@Test
	@DisplayName("Record 3494: Address is 7537 E Mcdowell Rd  #-115")
	void AddressOfRecord3494() {
		assertEquals("7537 E Mcdowell Rd  #-115", customers.get(3493).getAddress());
	}

	@Test
	@DisplayName("Record 3494: City is Scottsdale")
	void CityOfRecord3494() {
		assertEquals("Scottsdale", customers.get(3493).getCity());
	}

	@Test
	@DisplayName("Record 3494: County is Maricopa")
	void CountyOfRecord3494() {
		assertEquals("Maricopa", customers.get(3493).getCounty());
	}

	@Test
	@DisplayName("Record 3494: State is AZ")
	void StateOfRecord3494() {
		assertEquals("AZ", customers.get(3493).getState());
	}

	@Test
	@DisplayName("Record 3494: ZIP is 85257")
	void ZIPOfRecord3494() {
		assertEquals("85257", customers.get(3493).getZIP());
	}

	@Test
	@DisplayName("Record 3494: Phone is 480-945-2243")
	void PhoneOfRecord3494() {
		assertEquals("480-945-2243", customers.get(3493).getPhone());
	}

	@Test
	@DisplayName("Record 3494: Fax is 480-945-1225")
	void FaxOfRecord3494() {
		assertEquals("480-945-1225", customers.get(3493).getFax());
	}

	@Test
	@DisplayName("Record 3494: Email is werner@arbyter.com")
	void EmailOfRecord3494() {
		assertEquals("werner@arbyter.com", customers.get(3493).getEmail());
	}

	@Test
	@DisplayName("Record 3494: Web is http://www.wernerarbyter.com")
	void WebOfRecord3494() {
		assertEquals("http://www.wernerarbyter.com", customers.get(3493).getWeb());
	}
}
