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

@Tag("37")
class Record_4695 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4695: FirstName is Fredrick")
	void FirstNameOfRecord4695() {
		assertEquals("Fredrick", customers.get(4694).getFirstName());
	}

	@Test
	@DisplayName("Record 4695: LastName is Graen")
	void LastNameOfRecord4695() {
		assertEquals("Graen", customers.get(4694).getLastName());
	}

	@Test
	@DisplayName("Record 4695: Company is Fillipelli, David J Jr")
	void CompanyOfRecord4695() {
		assertEquals("Fillipelli, David J Jr", customers.get(4694).getCompany());
	}

	@Test
	@DisplayName("Record 4695: Address is 46 E")
	void AddressOfRecord4695() {
		assertEquals("46 E", customers.get(4694).getAddress());
	}

	@Test
	@DisplayName("Record 4695: City is Nashville")
	void CityOfRecord4695() {
		assertEquals("Nashville", customers.get(4694).getCity());
	}

	@Test
	@DisplayName("Record 4695: County is Brown")
	void CountyOfRecord4695() {
		assertEquals("Brown", customers.get(4694).getCounty());
	}

	@Test
	@DisplayName("Record 4695: State is IN")
	void StateOfRecord4695() {
		assertEquals("IN", customers.get(4694).getState());
	}

	@Test
	@DisplayName("Record 4695: ZIP is 47448")
	void ZIPOfRecord4695() {
		assertEquals("47448", customers.get(4694).getZIP());
	}

	@Test
	@DisplayName("Record 4695: Phone is 812-988-8109")
	void PhoneOfRecord4695() {
		assertEquals("812-988-8109", customers.get(4694).getPhone());
	}

	@Test
	@DisplayName("Record 4695: Fax is 812-988-6875")
	void FaxOfRecord4695() {
		assertEquals("812-988-6875", customers.get(4694).getFax());
	}

	@Test
	@DisplayName("Record 4695: Email is fredrick@graen.com")
	void EmailOfRecord4695() {
		assertEquals("fredrick@graen.com", customers.get(4694).getEmail());
	}

	@Test
	@DisplayName("Record 4695: Web is http://www.fredrickgraen.com")
	void WebOfRecord4695() {
		assertEquals("http://www.fredrickgraen.com", customers.get(4694).getWeb());
	}
}
