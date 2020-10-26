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

@Tag("28")
class Record_1012 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1012: FirstName is Lonny")
	void FirstNameOfRecord1012() {
		assertEquals("Lonny", customers.get(1011).getFirstName());
	}

	@Test
	@DisplayName("Record 1012: LastName is Sinstack")
	void LastNameOfRecord1012() {
		assertEquals("Sinstack", customers.get(1011).getLastName());
	}

	@Test
	@DisplayName("Record 1012: Company is Kurt Gaum Inc")
	void CompanyOfRecord1012() {
		assertEquals("Kurt Gaum Inc", customers.get(1011).getCompany());
	}

	@Test
	@DisplayName("Record 1012: Address is Madison County")
	void AddressOfRecord1012() {
		assertEquals("Madison County", customers.get(1011).getAddress());
	}

	@Test
	@DisplayName("Record 1012: City is Ridgeland")
	void CityOfRecord1012() {
		assertEquals("Ridgeland", customers.get(1011).getCity());
	}

	@Test
	@DisplayName("Record 1012: County is Madison")
	void CountyOfRecord1012() {
		assertEquals("Madison", customers.get(1011).getCounty());
	}

	@Test
	@DisplayName("Record 1012: State is MS")
	void StateOfRecord1012() {
		assertEquals("MS", customers.get(1011).getState());
	}

	@Test
	@DisplayName("Record 1012: ZIP is 39157")
	void ZIPOfRecord1012() {
		assertEquals("39157", customers.get(1011).getZIP());
	}

	@Test
	@DisplayName("Record 1012: Phone is 601-939-8110")
	void PhoneOfRecord1012() {
		assertEquals("601-939-8110", customers.get(1011).getPhone());
	}

	@Test
	@DisplayName("Record 1012: Fax is 601-939-3832")
	void FaxOfRecord1012() {
		assertEquals("601-939-3832", customers.get(1011).getFax());
	}

	@Test
	@DisplayName("Record 1012: Email is lonny@sinstack.com")
	void EmailOfRecord1012() {
		assertEquals("lonny@sinstack.com", customers.get(1011).getEmail());
	}

	@Test
	@DisplayName("Record 1012: Web is http://www.lonnysinstack.com")
	void WebOfRecord1012() {
		assertEquals("http://www.lonnysinstack.com", customers.get(1011).getWeb());
	}
}
