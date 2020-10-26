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
class Record_2017 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2017: FirstName is Emile")
	void FirstNameOfRecord2017() {
		assertEquals("Emile", customers.get(2016).getFirstName());
	}

	@Test
	@DisplayName("Record 2017: LastName is Carpente")
	void LastNameOfRecord2017() {
		assertEquals("Carpente", customers.get(2016).getLastName());
	}

	@Test
	@DisplayName("Record 2017: Company is Ban Inc")
	void CompanyOfRecord2017() {
		assertEquals("Ban Inc", customers.get(2016).getCompany());
	}

	@Test
	@DisplayName("Record 2017: Address is 40 Beach St  #-105")
	void AddressOfRecord2017() {
		assertEquals("40 Beach St  #-105", customers.get(2016).getAddress());
	}

	@Test
	@DisplayName("Record 2017: City is Manchester")
	void CityOfRecord2017() {
		assertEquals("Manchester", customers.get(2016).getCity());
	}

	@Test
	@DisplayName("Record 2017: County is Essex")
	void CountyOfRecord2017() {
		assertEquals("Essex", customers.get(2016).getCounty());
	}

	@Test
	@DisplayName("Record 2017: State is MA")
	void StateOfRecord2017() {
		assertEquals("MA", customers.get(2016).getState());
	}

	@Test
	@DisplayName("Record 2017: ZIP is 1944")
	void ZIPOfRecord2017() {
		assertEquals("1944", customers.get(2016).getZIP());
	}

	@Test
	@DisplayName("Record 2017: Phone is 978-526-6789")
	void PhoneOfRecord2017() {
		assertEquals("978-526-6789", customers.get(2016).getPhone());
	}

	@Test
	@DisplayName("Record 2017: Fax is 978-526-6846")
	void FaxOfRecord2017() {
		assertEquals("978-526-6846", customers.get(2016).getFax());
	}

	@Test
	@DisplayName("Record 2017: Email is emile@carpente.com")
	void EmailOfRecord2017() {
		assertEquals("emile@carpente.com", customers.get(2016).getEmail());
	}

	@Test
	@DisplayName("Record 2017: Web is http://www.emilecarpente.com")
	void WebOfRecord2017() {
		assertEquals("http://www.emilecarpente.com", customers.get(2016).getWeb());
	}
}
