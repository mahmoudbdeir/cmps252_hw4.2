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

@Tag("27")
class Record_3701 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3701: FirstName is Russell")
	void FirstNameOfRecord3701() {
		assertEquals("Russell", customers.get(3700).getFirstName());
	}

	@Test
	@DisplayName("Record 3701: LastName is Walther")
	void LastNameOfRecord3701() {
		assertEquals("Walther", customers.get(3700).getLastName());
	}

	@Test
	@DisplayName("Record 3701: Company is Bell, Daniel C Esq")
	void CompanyOfRecord3701() {
		assertEquals("Bell, Daniel C Esq", customers.get(3700).getCompany());
	}

	@Test
	@DisplayName("Record 3701: Address is 511 W Guadalupe Rd  #-22")
	void AddressOfRecord3701() {
		assertEquals("511 W Guadalupe Rd  #-22", customers.get(3700).getAddress());
	}

	@Test
	@DisplayName("Record 3701: City is Gilbert")
	void CityOfRecord3701() {
		assertEquals("Gilbert", customers.get(3700).getCity());
	}

	@Test
	@DisplayName("Record 3701: County is Maricopa")
	void CountyOfRecord3701() {
		assertEquals("Maricopa", customers.get(3700).getCounty());
	}

	@Test
	@DisplayName("Record 3701: State is AZ")
	void StateOfRecord3701() {
		assertEquals("AZ", customers.get(3700).getState());
	}

	@Test
	@DisplayName("Record 3701: ZIP is 85233")
	void ZIPOfRecord3701() {
		assertEquals("85233", customers.get(3700).getZIP());
	}

	@Test
	@DisplayName("Record 3701: Phone is 480-545-0571")
	void PhoneOfRecord3701() {
		assertEquals("480-545-0571", customers.get(3700).getPhone());
	}

	@Test
	@DisplayName("Record 3701: Fax is 480-545-4113")
	void FaxOfRecord3701() {
		assertEquals("480-545-4113", customers.get(3700).getFax());
	}

	@Test
	@DisplayName("Record 3701: Email is russell@walther.com")
	void EmailOfRecord3701() {
		assertEquals("russell@walther.com", customers.get(3700).getEmail());
	}

	@Test
	@DisplayName("Record 3701: Web is http://www.russellwalther.com")
	void WebOfRecord3701() {
		assertEquals("http://www.russellwalther.com", customers.get(3700).getWeb());
	}
}
