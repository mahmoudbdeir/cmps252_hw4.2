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

@Tag("41")
class Record_1910 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1910: FirstName is German")
	void FirstNameOfRecord1910() {
		assertEquals("German", customers.get(1909).getFirstName());
	}

	@Test
	@DisplayName("Record 1910: LastName is Garafano")
	void LastNameOfRecord1910() {
		assertEquals("Garafano", customers.get(1909).getLastName());
	}

	@Test
	@DisplayName("Record 1910: Company is Midwest Carpet")
	void CompanyOfRecord1910() {
		assertEquals("Midwest Carpet", customers.get(1909).getCompany());
	}

	@Test
	@DisplayName("Record 1910: Address is 7900 N Radcliffe St")
	void AddressOfRecord1910() {
		assertEquals("7900 N Radcliffe St", customers.get(1909).getAddress());
	}

	@Test
	@DisplayName("Record 1910: City is Bristol")
	void CityOfRecord1910() {
		assertEquals("Bristol", customers.get(1909).getCity());
	}

	@Test
	@DisplayName("Record 1910: County is Bucks")
	void CountyOfRecord1910() {
		assertEquals("Bucks", customers.get(1909).getCounty());
	}

	@Test
	@DisplayName("Record 1910: State is PA")
	void StateOfRecord1910() {
		assertEquals("PA", customers.get(1909).getState());
	}

	@Test
	@DisplayName("Record 1910: ZIP is 19007")
	void ZIPOfRecord1910() {
		assertEquals("19007", customers.get(1909).getZIP());
	}

	@Test
	@DisplayName("Record 1910: Phone is 215-949-4049")
	void PhoneOfRecord1910() {
		assertEquals("215-949-4049", customers.get(1909).getPhone());
	}

	@Test
	@DisplayName("Record 1910: Fax is 215-949-4748")
	void FaxOfRecord1910() {
		assertEquals("215-949-4748", customers.get(1909).getFax());
	}

	@Test
	@DisplayName("Record 1910: Email is german@garafano.com")
	void EmailOfRecord1910() {
		assertEquals("german@garafano.com", customers.get(1909).getEmail());
	}

	@Test
	@DisplayName("Record 1910: Web is http://www.germangarafano.com")
	void WebOfRecord1910() {
		assertEquals("http://www.germangarafano.com", customers.get(1909).getWeb());
	}
}
