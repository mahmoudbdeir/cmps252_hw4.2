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

@Tag("13")
class Record_1406 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1406: FirstName is Robin")
	void FirstNameOfRecord1406() {
		assertEquals("Robin", customers.get(1405).getFirstName());
	}

	@Test
	@DisplayName("Record 1406: LastName is Hairfield")
	void LastNameOfRecord1406() {
		assertEquals("Hairfield", customers.get(1405).getLastName());
	}

	@Test
	@DisplayName("Record 1406: Company is Crawford County District Cor")
	void CompanyOfRecord1406() {
		assertEquals("Crawford County District Cor", customers.get(1405).getCompany());
	}

	@Test
	@DisplayName("Record 1406: Address is 2555 Poplar Ave")
	void AddressOfRecord1406() {
		assertEquals("2555 Poplar Ave", customers.get(1405).getAddress());
	}

	@Test
	@DisplayName("Record 1406: City is Memphis")
	void CityOfRecord1406() {
		assertEquals("Memphis", customers.get(1405).getCity());
	}

	@Test
	@DisplayName("Record 1406: County is Shelby")
	void CountyOfRecord1406() {
		assertEquals("Shelby", customers.get(1405).getCounty());
	}

	@Test
	@DisplayName("Record 1406: State is TN")
	void StateOfRecord1406() {
		assertEquals("TN", customers.get(1405).getState());
	}

	@Test
	@DisplayName("Record 1406: ZIP is 38112")
	void ZIPOfRecord1406() {
		assertEquals("38112", customers.get(1405).getZIP());
	}

	@Test
	@DisplayName("Record 1406: Phone is 901-452-0040")
	void PhoneOfRecord1406() {
		assertEquals("901-452-0040", customers.get(1405).getPhone());
	}

	@Test
	@DisplayName("Record 1406: Fax is 901-452-6926")
	void FaxOfRecord1406() {
		assertEquals("901-452-6926", customers.get(1405).getFax());
	}

	@Test
	@DisplayName("Record 1406: Email is robin@hairfield.com")
	void EmailOfRecord1406() {
		assertEquals("robin@hairfield.com", customers.get(1405).getEmail());
	}

	@Test
	@DisplayName("Record 1406: Web is http://www.robinhairfield.com")
	void WebOfRecord1406() {
		assertEquals("http://www.robinhairfield.com", customers.get(1405).getWeb());
	}
}
