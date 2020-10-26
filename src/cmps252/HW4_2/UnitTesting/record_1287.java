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
class Record_1287 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1287: FirstName is Rodrigo")
	void FirstNameOfRecord1287() {
		assertEquals("Rodrigo", customers.get(1286).getFirstName());
	}

	@Test
	@DisplayName("Record 1287: LastName is Wilcoxson")
	void LastNameOfRecord1287() {
		assertEquals("Wilcoxson", customers.get(1286).getLastName());
	}

	@Test
	@DisplayName("Record 1287: Company is Morgan, Peter Esq")
	void CompanyOfRecord1287() {
		assertEquals("Morgan, Peter Esq", customers.get(1286).getCompany());
	}

	@Test
	@DisplayName("Record 1287: Address is 1515 N Marion St")
	void AddressOfRecord1287() {
		assertEquals("1515 N Marion St", customers.get(1286).getAddress());
	}

	@Test
	@DisplayName("Record 1287: City is Tampa")
	void CityOfRecord1287() {
		assertEquals("Tampa", customers.get(1286).getCity());
	}

	@Test
	@DisplayName("Record 1287: County is Hillsborough")
	void CountyOfRecord1287() {
		assertEquals("Hillsborough", customers.get(1286).getCounty());
	}

	@Test
	@DisplayName("Record 1287: State is FL")
	void StateOfRecord1287() {
		assertEquals("FL", customers.get(1286).getState());
	}

	@Test
	@DisplayName("Record 1287: ZIP is 33602")
	void ZIPOfRecord1287() {
		assertEquals("33602", customers.get(1286).getZIP());
	}

	@Test
	@DisplayName("Record 1287: Phone is 813-228-4722")
	void PhoneOfRecord1287() {
		assertEquals("813-228-4722", customers.get(1286).getPhone());
	}

	@Test
	@DisplayName("Record 1287: Fax is 813-228-6035")
	void FaxOfRecord1287() {
		assertEquals("813-228-6035", customers.get(1286).getFax());
	}

	@Test
	@DisplayName("Record 1287: Email is rodrigo@wilcoxson.com")
	void EmailOfRecord1287() {
		assertEquals("rodrigo@wilcoxson.com", customers.get(1286).getEmail());
	}

	@Test
	@DisplayName("Record 1287: Web is http://www.rodrigowilcoxson.com")
	void WebOfRecord1287() {
		assertEquals("http://www.rodrigowilcoxson.com", customers.get(1286).getWeb());
	}
}
