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

@Tag("44")
class Record_2604 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2604: FirstName is Carmine")
	void FirstNameOfRecord2604() {
		assertEquals("Carmine", customers.get(2603).getFirstName());
	}

	@Test
	@DisplayName("Record 2604: LastName is Ries")
	void LastNameOfRecord2604() {
		assertEquals("Ries", customers.get(2603).getLastName());
	}

	@Test
	@DisplayName("Record 2604: Company is Coca Cola Bottling Co Ft Smith")
	void CompanyOfRecord2604() {
		assertEquals("Coca Cola Bottling Co Ft Smith", customers.get(2603).getCompany());
	}

	@Test
	@DisplayName("Record 2604: Address is 4520 N Lariat Dr")
	void AddressOfRecord2604() {
		assertEquals("4520 N Lariat Dr", customers.get(2603).getAddress());
	}

	@Test
	@DisplayName("Record 2604: City is Castle Rock")
	void CityOfRecord2604() {
		assertEquals("Castle Rock", customers.get(2603).getCity());
	}

	@Test
	@DisplayName("Record 2604: County is Douglas")
	void CountyOfRecord2604() {
		assertEquals("Douglas", customers.get(2603).getCounty());
	}

	@Test
	@DisplayName("Record 2604: State is CO")
	void StateOfRecord2604() {
		assertEquals("CO", customers.get(2603).getState());
	}

	@Test
	@DisplayName("Record 2604: ZIP is 80104")
	void ZIPOfRecord2604() {
		assertEquals("80104", customers.get(2603).getZIP());
	}

	@Test
	@DisplayName("Record 2604: Phone is 303-761-5770")
	void PhoneOfRecord2604() {
		assertEquals("303-761-5770", customers.get(2603).getPhone());
	}

	@Test
	@DisplayName("Record 2604: Fax is 303-761-5939")
	void FaxOfRecord2604() {
		assertEquals("303-761-5939", customers.get(2603).getFax());
	}

	@Test
	@DisplayName("Record 2604: Email is carmine@ries.com")
	void EmailOfRecord2604() {
		assertEquals("carmine@ries.com", customers.get(2603).getEmail());
	}

	@Test
	@DisplayName("Record 2604: Web is http://www.carmineries.com")
	void WebOfRecord2604() {
		assertEquals("http://www.carmineries.com", customers.get(2603).getWeb());
	}
}
