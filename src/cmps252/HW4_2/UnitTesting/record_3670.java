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

@Tag("10")
class Record_3670 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3670: FirstName is Landon")
	void FirstNameOfRecord3670() {
		assertEquals("Landon", customers.get(3669).getFirstName());
	}

	@Test
	@DisplayName("Record 3670: LastName is Manquero")
	void LastNameOfRecord3670() {
		assertEquals("Manquero", customers.get(3669).getLastName());
	}

	@Test
	@DisplayName("Record 3670: Company is Days Inn")
	void CompanyOfRecord3670() {
		assertEquals("Days Inn", customers.get(3669).getCompany());
	}

	@Test
	@DisplayName("Record 3670: Address is 3012 Arlington St")
	void AddressOfRecord3670() {
		assertEquals("3012 Arlington St", customers.get(3669).getAddress());
	}

	@Test
	@DisplayName("Record 3670: City is Ada")
	void CityOfRecord3670() {
		assertEquals("Ada", customers.get(3669).getCity());
	}

	@Test
	@DisplayName("Record 3670: County is Pontotoc")
	void CountyOfRecord3670() {
		assertEquals("Pontotoc", customers.get(3669).getCounty());
	}

	@Test
	@DisplayName("Record 3670: State is OK")
	void StateOfRecord3670() {
		assertEquals("OK", customers.get(3669).getState());
	}

	@Test
	@DisplayName("Record 3670: ZIP is 74820")
	void ZIPOfRecord3670() {
		assertEquals("74820", customers.get(3669).getZIP());
	}

	@Test
	@DisplayName("Record 3670: Phone is 580-332-8147")
	void PhoneOfRecord3670() {
		assertEquals("580-332-8147", customers.get(3669).getPhone());
	}

	@Test
	@DisplayName("Record 3670: Fax is 580-332-0582")
	void FaxOfRecord3670() {
		assertEquals("580-332-0582", customers.get(3669).getFax());
	}

	@Test
	@DisplayName("Record 3670: Email is landon@manquero.com")
	void EmailOfRecord3670() {
		assertEquals("landon@manquero.com", customers.get(3669).getEmail());
	}

	@Test
	@DisplayName("Record 3670: Web is http://www.landonmanquero.com")
	void WebOfRecord3670() {
		assertEquals("http://www.landonmanquero.com", customers.get(3669).getWeb());
	}
}
